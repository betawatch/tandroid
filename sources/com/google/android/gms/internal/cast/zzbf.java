package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.mediarouter.media.MediaRouteSelector;
import androidx.mediarouter.media.MediaRouter;
import androidx.mediarouter.media.MediaRouterParams;
import androidx.mediarouter.media.MediaTransferReceiver;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzbf extends zzal {
    private static final Logger zza = new Logger("MediaRouterProxy");
    private final MediaRouter zzb;
    private final CastOptions zzc;
    private final Map zzd = new HashMap();
    private zzbn zze;
    private boolean zzf;

    public zzbf(Context context, MediaRouter mediaRouter, final CastOptions castOptions, com.google.android.gms.cast.internal.zzn zznVar) {
        this.zzb = mediaRouter;
        this.zzc = castOptions;
        if (Build.VERSION.SDK_INT <= 32) {
            zza.i("Don't need to set MediaRouterParams for Android S v2 or below", new Object[0]);
            return;
        }
        zza.d("Set up MediaRouterParams based on module flag and CastOptions for Android T or above", new Object[0]);
        this.zze = new zzbn(castOptions);
        Intent intent = new Intent(context, (Class<?>) MediaTransferReceiver.class);
        intent.setPackage(context.getPackageName());
        boolean isEmpty = context.getPackageManager().queryBroadcastReceivers(intent, 0).isEmpty();
        this.zzf = !isEmpty;
        if (!isEmpty) {
            zzo.zzd(zzml.zzJ);
        }
        zznVar.zza(new String[]{"com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED"}).addOnCompleteListener(new OnCompleteListener() { // from class: com.google.android.gms.internal.cast.zzbc
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                zzbf.this.zzp(castOptions, task);
            }
        });
    }

    private final void zzt(MediaRouteSelector mediaRouteSelector, int i) {
        Set set = (Set) this.zzd.get(mediaRouteSelector);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.zzb.addCallback(mediaRouteSelector, (MediaRouter.Callback) it.next(), i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final void zzq(MediaRouteSelector mediaRouteSelector) {
        Set set = (Set) this.zzd.get(mediaRouteSelector);
        if (set == null) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            this.zzb.removeCallback((MediaRouter.Callback) it.next());
        }
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final Bundle zzb(String str) {
        for (MediaRouter.RouteInfo routeInfo : this.zzb.getRoutes()) {
            if (routeInfo.getId().equals(str)) {
                return routeInfo.getExtras();
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final String zzc() {
        return this.zzb.getSelectedRoute().getId();
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzd(Bundle bundle, final int i) {
        final MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzt(fromBundle, i);
        } else {
            new zzed(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbe
                @Override // java.lang.Runnable
                public final void run() {
                    zzbf.this.zzo(fromBundle, i);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zze(Bundle bundle, zzao zzaoVar) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle == null) {
            return;
        }
        if (!this.zzd.containsKey(fromBundle)) {
            this.zzd.put(fromBundle, new HashSet());
        }
        ((Set) this.zzd.get(fromBundle)).add(new zzat(zzaoVar));
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzf() {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            Iterator it2 = ((Set) it.next()).iterator();
            while (it2.hasNext()) {
                this.zzb.removeCallback((MediaRouter.Callback) it2.next());
            }
        }
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzg(Bundle bundle) {
        final MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle == null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzq(fromBundle);
        } else {
            new zzed(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.gms.internal.cast.zzbd
                @Override // java.lang.Runnable
                public final void run() {
                    zzbf.this.zzq(fromBundle);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzh() {
        MediaRouter mediaRouter = this.zzb;
        mediaRouter.selectRoute(mediaRouter.getDefaultRoute());
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzi(String str) {
        zza.d("select route with routeId = %s", str);
        for (MediaRouter.RouteInfo routeInfo : this.zzb.getRoutes()) {
            if (routeInfo.getId().equals(str)) {
                zza.d("media route is found and selected", new Object[0]);
                this.zzb.selectRoute(routeInfo);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final void zzj(int i) {
        this.zzb.unselect(i);
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final boolean zzk() {
        MediaRouter.RouteInfo bluetoothRoute = this.zzb.getBluetoothRoute();
        return bluetoothRoute != null && this.zzb.getSelectedRoute().getId().equals(bluetoothRoute.getId());
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final boolean zzl() {
        MediaRouter.RouteInfo defaultRoute = this.zzb.getDefaultRoute();
        return defaultRoute != null && this.zzb.getSelectedRoute().getId().equals(defaultRoute.getId());
    }

    @Override // com.google.android.gms.internal.cast.zzam
    public final boolean zzm(Bundle bundle, int i) {
        MediaRouteSelector fromBundle = MediaRouteSelector.fromBundle(bundle);
        if (fromBundle == null) {
            return false;
        }
        return this.zzb.isRouteAvailable(fromBundle, i);
    }

    public final zzbn zzn() {
        return this.zze;
    }

    final /* synthetic */ void zzo(MediaRouteSelector mediaRouteSelector, int i) {
        synchronized (this.zzd) {
            zzt(mediaRouteSelector, i);
        }
    }

    final /* synthetic */ void zzp(CastOptions castOptions, Task task) {
        boolean z;
        MediaRouter mediaRouter;
        CastOptions castOptions2;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            boolean z2 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
            zza.d("The module-to-client output switcher flag %s", true != z2 ? "not existed" : "existed");
            if (z2) {
                z = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Logger logger = zza;
                logger.i("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(castOptions.zzh()));
                boolean z3 = !z && castOptions.zzh();
                mediaRouter = this.zzb;
                if (mediaRouter != null || (castOptions2 = this.zzc) == null) {
                }
                boolean zzf = castOptions2.zzf();
                boolean zze = castOptions2.zze();
                mediaRouter.setRouterParams(new MediaRouterParams.Builder().setMediaTransferReceiverEnabled(z3).setTransferToLocalEnabled(zzf).setOutputSwitcherEnabled(zze).build());
                logger.i("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(this.zzf), Boolean.valueOf(z3), Boolean.valueOf(zzf), Boolean.valueOf(zze));
                if (zzf) {
                    this.zzb.setOnPrepareTransferListener(new zzbb((zzbn) Preconditions.checkNotNull(this.zze)));
                    zzo.zzd(zzml.zzK);
                    return;
                }
                return;
            }
        }
        z = true;
        Logger logger2 = zza;
        logger2.i("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z), Boolean.valueOf(castOptions.zzh()));
        if (z) {
        }
        mediaRouter = this.zzb;
        if (mediaRouter != null) {
        }
    }

    public final void zzr(MediaSessionCompat mediaSessionCompat) {
        this.zzb.setMediaSessionCompat(mediaSessionCompat);
    }

    public final boolean zzs() {
        return this.zzf;
    }
}
