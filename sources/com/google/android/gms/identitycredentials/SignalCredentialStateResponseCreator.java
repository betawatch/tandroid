package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class SignalCredentialStateResponseCreator implements Parcelable.Creator {
    static void writeToParcel(SignalCredentialStateResponse signalCredentialStateResponse, Parcel parcel, int i) {
        SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public SignalCredentialStateResponse createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            SafeParcelReader.getFieldId(readHeader);
            SafeParcelReader.skipUnknownField(parcel, readHeader);
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new SignalCredentialStateResponse();
    }

    @Override // android.os.Parcelable.Creator
    public SignalCredentialStateResponse[] newArray(int i) {
        return new SignalCredentialStateResponse[i];
    }
}
