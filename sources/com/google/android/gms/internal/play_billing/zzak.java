package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzak extends zzap implements zzam {
    zzak(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final int zza(int i, String str, String str2) {
        Parcel zzs = zzs();
        zzs.writeInt(3);
        zzs.writeString(str);
        zzs.writeString(str2);
        Parcel zzt = zzt(5, zzs);
        int readInt = zzt.readInt();
        zzt.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final int zzc(int i, String str, String str2, Bundle bundle) {
        Parcel zzs = zzs();
        zzs.writeInt(i);
        zzs.writeString(str);
        zzs.writeString(str2);
        zzar.zzc(zzs, bundle);
        Parcel zzt = zzt(10, zzs);
        int readInt = zzt.readInt();
        zzt.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle zze(int i, String str, String str2, Bundle bundle) {
        Parcel zzs = zzs();
        zzs.writeInt(9);
        zzs.writeString(str);
        zzs.writeString(str2);
        zzar.zzc(zzs, bundle);
        Parcel zzt = zzt(12, zzs);
        Bundle bundle2 = (Bundle) zzar.zza(zzt, Bundle.CREATOR);
        zzt.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle zzf(int i, String str, String str2, String str3, String str4) {
        Parcel zzs = zzs();
        zzs.writeInt(3);
        zzs.writeString(str);
        zzs.writeString(str2);
        zzs.writeString(str3);
        zzs.writeString(null);
        Parcel zzt = zzt(3, zzs);
        Bundle bundle = (Bundle) zzar.zza(zzt, Bundle.CREATOR);
        zzt.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle zzg(int i, String str, String str2, String str3, String str4, Bundle bundle) {
        Parcel zzs = zzs();
        zzs.writeInt(i);
        zzs.writeString(str);
        zzs.writeString(str2);
        zzs.writeString(str3);
        zzs.writeString(null);
        zzar.zzc(zzs, bundle);
        Parcel zzt = zzt(8, zzs);
        Bundle bundle2 = (Bundle) zzar.zza(zzt, Bundle.CREATOR);
        zzt.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle zzh(int i, String str, String str2, String str3) {
        Parcel zzs = zzs();
        zzs.writeInt(3);
        zzs.writeString(str);
        zzs.writeString(str2);
        zzs.writeString(str3);
        Parcel zzt = zzt(4, zzs);
        Bundle bundle = (Bundle) zzar.zza(zzt, Bundle.CREATOR);
        zzt.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle zzi(int i, String str, String str2, String str3, Bundle bundle) {
        Parcel zzs = zzs();
        zzs.writeInt(i);
        zzs.writeString(str);
        zzs.writeString(str2);
        zzs.writeString(str3);
        zzar.zzc(zzs, bundle);
        Parcel zzt = zzt(11, zzs);
        Bundle bundle2 = (Bundle) zzar.zza(zzt, Bundle.CREATOR);
        zzt.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final Bundle zzj(int i, String str, String str2, Bundle bundle, Bundle bundle2) {
        Parcel zzs = zzs();
        zzs.writeInt(i);
        zzs.writeString(str);
        zzs.writeString(str2);
        zzar.zzc(zzs, bundle);
        zzar.zzc(zzs, bundle2);
        Parcel zzt = zzt(901, zzs);
        Bundle bundle3 = (Bundle) zzar.zza(zzt, Bundle.CREATOR);
        zzt.recycle();
        return bundle3;
    }

    @Override // com.google.android.gms.internal.play_billing.zzam
    public final int zzw(int i, String str, String str2) {
        Parcel zzs = zzs();
        zzs.writeInt(i);
        zzs.writeString(str);
        zzs.writeString(str2);
        Parcel zzt = zzt(1, zzs);
        int readInt = zzt.readInt();
        zzt.recycle();
        return readInt;
    }
}
