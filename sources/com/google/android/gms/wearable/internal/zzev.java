package com.google.android.gms.wearable.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.wearable.zzc;

/* loaded from: classes.dex */
public final class zzev extends com.google.android.gms.internal.wearable.zza implements IInterface {
    zzev(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.wearable.internal.IRpcResponseCallback");
    }

    public final void zzd(boolean z, byte[] bArr) {
        Parcel zza = zza();
        zzc.zzc(zza, z);
        zza.writeByteArray(bArr);
        zzK(1, zza);
    }
}
