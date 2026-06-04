package com.google.android.gms.wearable.internal;

import android.content.IntentFilter;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class zzd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zze();
    public final zzfa zza;
    public final IntentFilter[] zzb;
    public final String zzc;
    public final String zzd;

    zzd(IBinder iBinder, IntentFilter[] intentFilterArr, String str, String str2) {
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableListener");
            this.zza = queryLocalInterface instanceof zzfa ? (zzfa) queryLocalInterface : new zzey(iBinder);
        } else {
            this.zza = null;
        }
        this.zzb = intentFilterArr;
        this.zzc = str;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        zzfa zzfaVar = this.zza;
        SafeParcelWriter.writeIBinder(parcel, 2, zzfaVar == null ? null : zzfaVar.asBinder(), false);
        SafeParcelWriter.writeTypedArray(parcel, 3, this.zzb, i, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public zzd(zzit zzitVar) {
        this.zza = zzitVar;
        throw null;
    }
}
