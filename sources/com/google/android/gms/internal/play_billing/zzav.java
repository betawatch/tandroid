package com.google.android.gms.internal.play_billing;

import android.os.Parcel;

/* loaded from: classes.dex */
public abstract class zzav extends zzaq implements zzaw {
    public zzav() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    @Override // com.google.android.gms.internal.play_billing.zzaq
    protected final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        zzar.zzb(parcel);
        zza(readInt);
        return true;
    }
}
