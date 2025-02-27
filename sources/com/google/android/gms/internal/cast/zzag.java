package com.google.android.gms.internal.cast;

import android.app.Service;
import android.content.Context;
import android.os.AsyncTask;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.cast.internal.Logger;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class zzag {
    private static final Logger zza = new Logger("CastDynamiteModule");

    public static com.google.android.gms.cast.framework.zzaj zza(Context context, CastOptions castOptions, zzam zzamVar, Map map) {
        return zzf(context).zzf(ObjectWrapper.wrap(context.getApplicationContext()), castOptions, zzamVar, map);
    }

    public static com.google.android.gms.cast.framework.zzam zzb(Context context, CastOptions castOptions, IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.zzag zzagVar) {
        if (iObjectWrapper == null) {
            return null;
        }
        try {
            return zzf(context).zzg(castOptions, iObjectWrapper, zzagVar);
        } catch (RemoteException | ModuleUnavailableException e) {
            zza.d(e, "Unable to call %s on %s.", "newCastSessionImpl", zzak.class.getSimpleName());
            return null;
        }
    }

    public static com.google.android.gms.cast.framework.zzat zzc(Service service, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        if (iObjectWrapper != null && iObjectWrapper2 != null) {
            try {
                return zzf(service.getApplicationContext()).zzh(ObjectWrapper.wrap(service), iObjectWrapper, iObjectWrapper2);
            } catch (RemoteException | ModuleUnavailableException e) {
                zza.d(e, "Unable to call %s on %s.", "newReconnectionServiceImpl", zzak.class.getSimpleName());
            }
        }
        return null;
    }

    public static com.google.android.gms.cast.framework.zzaw zzd(Context context, String str, String str2, com.google.android.gms.cast.framework.zzbe zzbeVar) {
        try {
            return zzf(context).zzi(str, str2, zzbeVar);
        } catch (RemoteException | ModuleUnavailableException e) {
            zza.d(e, "Unable to call %s on %s.", "newSessionImpl", zzak.class.getSimpleName());
            return null;
        }
    }

    public static com.google.android.gms.cast.framework.media.internal.zzi zze(Context context, AsyncTask asyncTask, com.google.android.gms.cast.framework.media.internal.zzk zzkVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        try {
            zzak zzf = zzf(context.getApplicationContext());
            return zzf.zze() >= 233700000 ? zzf.zzk(ObjectWrapper.wrap(context.getApplicationContext()), ObjectWrapper.wrap(asyncTask), zzkVar, i, i2, false, 2097152L, 5, 333, 10000) : zzf.zzj(ObjectWrapper.wrap(asyncTask), zzkVar, i, i2, false, 2097152L, 5, 333, 10000);
        } catch (RemoteException e) {
            e = e;
            zza.d(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", zzak.class.getSimpleName());
            return null;
        } catch (ModuleUnavailableException e2) {
            e = e2;
            zza.d(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", zzak.class.getSimpleName());
            return null;
        }
    }

    private static zzak zzf(Context context) {
        try {
            IBinder instantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, "com.google.android.gms.cast.framework.dynamite").instantiate("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (instantiate == null) {
                return null;
            }
            IInterface queryLocalInterface = instantiate.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return queryLocalInterface instanceof zzak ? (zzak) queryLocalInterface : new zzaj(instantiate);
        } catch (DynamiteModule.LoadingException e) {
            throw new ModuleUnavailableException(e);
        }
    }
}
