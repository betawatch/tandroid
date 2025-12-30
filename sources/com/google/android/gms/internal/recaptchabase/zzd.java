package com.google.android.gms.internal.recaptchabase;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.recaptchabase.ExecuteResult;
import com.google.android.gms.recaptchabase.InitResult;

/* loaded from: classes.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseCallbacks");
    }

    @Override // com.google.android.gms.internal.recaptchabase.zzb
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Status status = (Status) zzc.zza(parcel, Status.CREATOR);
            InitResult initResult = (InitResult) zzc.zza(parcel, InitResult.CREATOR);
            zzc.zzb(parcel);
            zzc(status, initResult);
        } else {
            if (i != 2) {
                return false;
            }
            Status status2 = (Status) zzc.zza(parcel, Status.CREATOR);
            ExecuteResult executeResult = (ExecuteResult) zzc.zza(parcel, ExecuteResult.CREATOR);
            zzc.zzb(parcel);
            zzb(status2, executeResult);
        }
        return true;
    }
}
