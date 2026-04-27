package com.google.android.gms.internal.cast;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.zzas;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.Map;
import org.telegram.messenger.NotificationCenter;

/* loaded from: classes.dex */
public final class zzaj extends zza implements zzak {
    zzaj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
    }

    @Override // com.google.android.gms.internal.cast.zzak
    public final int zze() {
        Parcel zzb = zzb(8, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.cast.zzak
    public final com.google.android.gms.cast.framework.zzaj zzf(IObjectWrapper iObjectWrapper, CastOptions castOptions, zzam zzamVar, Map map) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zzc.zzc(zza, castOptions);
        zzc.zze(zza, zzamVar);
        zza.writeMap(map);
        Parcel zzb = zzb(1, zza);
        com.google.android.gms.cast.framework.zzaj zzb2 = com.google.android.gms.cast.framework.zzai.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.cast.zzak
    public final com.google.android.gms.cast.framework.zzam zzg(CastOptions castOptions, IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.zzag zzagVar) {
        Parcel zza = zza();
        zzc.zzc(zza, castOptions);
        zzc.zze(zza, iObjectWrapper);
        zzc.zze(zza, zzagVar);
        Parcel zzb = zzb(3, zza);
        com.google.android.gms.cast.framework.zzam zzb2 = com.google.android.gms.cast.framework.zzal.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.cast.zzak
    public final com.google.android.gms.cast.framework.zzat zzh(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, IObjectWrapper iObjectWrapper3) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zzc.zze(zza, iObjectWrapper2);
        zzc.zze(zza, iObjectWrapper3);
        Parcel zzb = zzb(5, zza);
        com.google.android.gms.cast.framework.zzat zzb2 = zzas.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.cast.zzak
    public final com.google.android.gms.cast.framework.zzaw zzi(String str, String str2, com.google.android.gms.cast.framework.zzbe zzbeVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzc.zze(zza, zzbeVar);
        Parcel zzb = zzb(2, zza);
        com.google.android.gms.cast.framework.zzaw zzb2 = com.google.android.gms.cast.framework.zzav.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.cast.zzak
    public final com.google.android.gms.cast.framework.media.internal.zzi zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.cast.framework.media.internal.zzk zzkVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zzc.zze(zza, zzkVar);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(0);
        zza.writeLong(2097152L);
        zza.writeInt(5);
        zza.writeInt(NotificationCenter.translationModelDownloading);
        zza.writeInt(10000);
        Parcel zzb = zzb(6, zza);
        com.google.android.gms.cast.framework.media.internal.zzi zzb2 = com.google.android.gms.cast.framework.media.internal.zzh.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }

    @Override // com.google.android.gms.internal.cast.zzak
    public final com.google.android.gms.cast.framework.media.internal.zzi zzk(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, com.google.android.gms.cast.framework.media.internal.zzk zzkVar, int i, int i2, boolean z, long j, int i3, int i4, int i5) {
        Parcel zza = zza();
        zzc.zze(zza, iObjectWrapper);
        zzc.zze(zza, iObjectWrapper2);
        zzc.zze(zza, zzkVar);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(0);
        zza.writeLong(2097152L);
        zza.writeInt(5);
        zza.writeInt(NotificationCenter.translationModelDownloading);
        zza.writeInt(10000);
        Parcel zzb = zzb(7, zza);
        com.google.android.gms.cast.framework.media.internal.zzi zzb2 = com.google.android.gms.cast.framework.media.internal.zzh.zzb(zzb.readStrongBinder());
        zzb.recycle();
        return zzb2;
    }
}
