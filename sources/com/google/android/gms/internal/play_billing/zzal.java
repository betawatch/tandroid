package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzal extends zzaq implements zzan {
    zzal(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final int zza(int i, String str, String str2) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(5, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final int zzc(int i, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(10, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zze(int i, String str, String str2, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(9);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(12, zzu);
        Bundle bundle2 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzf(int i, String str, String str2, String str3, String str4) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        Parcel zzv = zzv(3, zzu);
        Bundle bundle = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzu.writeString(null);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(8, zzu);
        Bundle bundle2 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzi(int i, String str, String str2, String str3) {
        Parcel zzu = zzu();
        zzu.writeInt(3);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        Parcel zzv = zzv(4, zzu);
        Bundle bundle = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzj(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzu.writeString(str3);
        zzas.zzc(zzu, bundle);
        Parcel zzv = zzv(11, zzu);
        Bundle bundle2 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzl(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        zzas.zzc(zzu, bundle);
        zzas.zzc(zzu, bundle2);
        Parcel zzv = zzv(901, zzu);
        Bundle bundle3 = (Bundle) zzas.zza(zzv, Bundle.CREATOR);
        zzv.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final int zzy(int i, String str, String str2) {
        Parcel zzu = zzu();
        zzu.writeInt(i);
        zzu.writeString(str);
        zzu.writeString(str2);
        Parcel zzv = zzv(1, zzu);
        int readInt = zzv.readInt();
        zzv.recycle();
        return readInt;
    }
}
