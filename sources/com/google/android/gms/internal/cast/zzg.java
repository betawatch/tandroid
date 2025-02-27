package com.google.android.gms.internal.cast;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.cct.CCTDestination;
import com.google.android.datatransport.runtime.TransportRuntime;
import com.google.android.gms.cast.framework.CastSession;
import com.google.android.gms.cast.framework.SessionManager;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class zzg {
    Transport zzb;
    private final Context zzd;
    private final com.google.android.gms.cast.internal.zzn zze;
    private final SessionManager zzf;
    private final zzbn zzg;
    private final zzaf zzh;
    private Long zzj;
    private final ExecutorService zzk;
    private static final Logger zzc = new Logger("ClientCastAnalytics");
    public static final boolean zza = true;
    private int zzl = 1;
    private final String zzi = UUID.randomUUID().toString();

    private zzg(Context context, com.google.android.gms.cast.internal.zzn zznVar, SessionManager sessionManager, zzbn zzbnVar, zzaf zzafVar) {
        this.zzd = context;
        this.zze = zznVar;
        this.zzf = sessionManager;
        this.zzg = zzbnVar;
        this.zzh = zzafVar;
        zzec.zza();
        this.zzk = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
    }

    public static zzg zza(Context context, com.google.android.gms.cast.internal.zzn zznVar, SessionManager sessionManager, zzbn zzbnVar, zzaf zzafVar) {
        return new zzg(context, zznVar, sessionManager, zzbnVar, zzafVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final /* synthetic */ void zzb(String str, int i, SharedPreferences sharedPreferences, Bundle bundle) {
        Preconditions.checkNotNull(this.zzf);
        zzbn zzbnVar = this.zzg;
        SessionManager sessionManager = this.zzf;
        if (i != 3) {
            if (i == 2) {
                i = 2;
            }
            if (i != 1 || i == 2) {
                zzk zzkVar = new zzk(sharedPreferences, this, this.zzh, bundle, str);
                sessionManager.addSessionManagerListener(new zzi(zzkVar), CastSession.class);
                if (zzbnVar == null) {
                    zzbnVar.zzm(new zzj(zzkVar));
                    return;
                }
                return;
            }
            return;
        }
        zzv zzvVar = new zzv(this, this.zzh, str);
        sessionManager.addSessionManagerListener(new zzt(zzvVar), CastSession.class);
        if (zzbnVar != null) {
            zzbnVar.zzm(new zzu(zzvVar));
        }
        if (i != 1) {
        }
        zzk zzkVar2 = new zzk(sharedPreferences, this, this.zzh, bundle, str);
        sessionManager.addSessionManagerListener(new zzi(zzkVar2), CastSession.class);
        if (zzbnVar == null) {
        }
    }

    public final void zzc(Bundle bundle) {
        final int i = bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE") ? bundle.getInt("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", 0) : (bundle.containsKey("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED") && bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", false)) ? 1 : 0;
        boolean z = bundle.getBoolean("com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED", false);
        if (i == 0) {
            if (!z) {
                return;
            }
            i = 0;
            z = true;
        }
        final String packageName = this.zzd.getPackageName();
        String format = String.format(Locale.ROOT, "%s.%s", packageName, "client_cast_analytics_data");
        this.zzl = bundle.getLong("com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE") == 0 ? 1 : 2;
        TransportRuntime.initialize(this.zzd);
        this.zzb = TransportRuntime.getInstance().newFactory(CCTDestination.INSTANCE).getTransport("CAST_SENDER_SDK", zzno.class, Encoding.of("proto"), new Transformer() { // from class: com.google.android.gms.internal.cast.zze
            @Override // com.google.android.datatransport.Transformer
            public final Object apply(Object obj) {
                zzno zznoVar = (zzno) obj;
                try {
                    int zzu = zznoVar.zzu();
                    byte[] bArr = new byte[zzu];
                    zztc zzz = zztc.zzz(bArr, 0, zzu);
                    zznoVar.zzJ(zzz);
                    zzz.zzA();
                    return bArr;
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + zznoVar.getClass().getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            }
        });
        if (bundle.containsKey("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE")) {
            this.zzj = Long.valueOf(bundle.getLong("com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE"));
        }
        final SharedPreferences sharedPreferences = this.zzd.getApplicationContext().getSharedPreferences(format, 0);
        if (i != 0) {
            final com.google.android.gms.cast.internal.zzn zznVar = this.zze;
            final String[] strArr = {"com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_ERROR", "com.google.android.gms.cast.DICTIONARY_CAST_STATUS_CODES_TO_APP_SESSION_CHANGE_REASON"};
            zznVar.doRead(TaskApiCall.builder().run(new RemoteCall() { // from class: com.google.android.gms.cast.internal.zze
                @Override // com.google.android.gms.common.api.internal.RemoteCall
                public final void accept(Object obj, Object obj2) {
                    ((zzaj) ((zzo) obj).getService()).zzh(new zzl(zzn.this, (TaskCompletionSource) obj2), strArr);
                }
            }).setFeatures(com.google.android.gms.cast.zzax.zzg).setAutoResolveMissingFeatures(false).setMethodKey(8426).build()).addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.gms.internal.cast.zzd
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    zzg.this.zzb(packageName, i, sharedPreferences, (Bundle) obj);
                }
            });
        }
        if (z) {
            Preconditions.checkNotNull(sharedPreferences);
            zzo.zza(sharedPreferences, this, packageName).zze();
            zzo.zzd(zzml.zzf);
        }
    }

    final /* synthetic */ void zzd(zzno zznoVar, int i) {
        zznn zzd = zzno.zzd(zznoVar);
        zzd.zzk(this.zzi);
        zzd.zzf(this.zzi);
        Long l = this.zzj;
        if (l != null) {
            zzd.zzi((int) l.longValue());
        }
        zzno zznoVar2 = (zzno) zzd.zzq();
        int i2 = this.zzl;
        int i3 = i2 - 1;
        Event event = null;
        if (i2 == 0) {
            throw null;
        }
        if (i3 == 0) {
            event = Event.ofTelemetry(i - 1, zznoVar2);
        } else if (i3 == 1) {
            event = Event.ofData(i - 1, zznoVar2);
        }
        zzc.d("analytics event: %s", event);
        Preconditions.checkNotNull(event);
        Transport transport = this.zzb;
        if (transport != null) {
            transport.send(event);
        }
    }

    public final void zze(final zzno zznoVar, final int i) {
        this.zzk.execute(new Runnable() { // from class: com.google.android.gms.internal.cast.zzf
            @Override // java.lang.Runnable
            public final void run() {
                zzg.this.zzd(zznoVar, i);
            }
        });
    }
}
