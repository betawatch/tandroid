package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class SignalCredentialStateRequestCreator implements Parcelable.Creator {
    static void writeToParcel(SignalCredentialStateRequest signalCredentialStateRequest, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, signalCredentialStateRequest.getType(), false);
        SafeParcelWriter.writeString(parcel, 2, signalCredentialStateRequest.getOrigin(), false);
        SafeParcelWriter.writeBundle(parcel, 3, signalCredentialStateRequest.getRequestData(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public SignalCredentialStateRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        String str2 = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId == 2) {
                str2 = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 3) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new SignalCredentialStateRequest(str, str2, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public SignalCredentialStateRequest[] newArray(int i) {
        return new SignalCredentialStateRequest[i];
    }
}
