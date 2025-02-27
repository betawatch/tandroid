package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.cast.zzb;

/* loaded from: classes.dex */
public abstract class zzas extends zzb implements zzat {
    public static zzat zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.framework.IReconnectionService");
        return queryLocalInterface instanceof zzat ? (zzat) queryLocalInterface : new zzar(iBinder);
    }
}
