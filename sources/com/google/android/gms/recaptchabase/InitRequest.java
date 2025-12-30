package com.google.android.gms.recaptchabase;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class InitRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InitRequest> CREATOR = new zzf();

    public static final class Builder {
        private final InitRequest zza = new InitRequest();

        public InitRequest build() {
            return this.zza;
        }
    }

    InitRequest() {
    }

    public boolean equals(Object obj) {
        return this == obj || (obj instanceof InitRequest);
    }

    public int hashCode() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
    }
}
