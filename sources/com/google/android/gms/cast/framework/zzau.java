package com.google.android.gms.cast.framework;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.cast.zza;
import com.google.android.gms.internal.cast.zzc;

/* loaded from: classes.dex */
public final class zzau extends zza implements zzaw {
    zzau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final int zze() {
        Parcel zzb = zzb(17, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final int zzf() {
        Parcel zzb = zzb(18, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final IObjectWrapper zzg() {
        Parcel zzb = zzb(1, zza());
        IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(zzb.readStrongBinder());
        zzb.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final String zzi() {
        Parcel zzb = zzb(3, zza());
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void zzj(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void zzk(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final void zzl(int i) {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final boolean zzp() {
        Parcel zzb = zzb(5, zza());
        boolean zzf = zzc.zzf(zzb);
        zzb.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.cast.framework.zzaw
    public final boolean zzt() {
        Parcel zzb = zzb(9, zza());
        boolean zzf = zzc.zzf(zzb);
        zzb.recycle();
        return zzf;
    }
}
