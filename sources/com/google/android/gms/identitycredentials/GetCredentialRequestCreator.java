package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class GetCredentialRequestCreator implements Parcelable.Creator {
    static void writeToParcel(GetCredentialRequest getCredentialRequest, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedList(parcel, 1, getCredentialRequest.getCredentialOptions(), false);
        SafeParcelWriter.writeBundle(parcel, 2, getCredentialRequest.getData(), false);
        SafeParcelWriter.writeString(parcel, 3, getCredentialRequest.getOrigin(), false);
        SafeParcelWriter.writeParcelable(parcel, 4, getCredentialRequest.getResultReceiver(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public GetCredentialRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        String str = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                arrayList = SafeParcelReader.createTypedList(parcel, readHeader, CredentialOption.CREATOR);
            } else if (fieldId == 2) {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            } else if (fieldId == 3) {
                str = SafeParcelReader.createString(parcel, readHeader);
            } else if (fieldId != 4) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                resultReceiver = (ResultReceiver) SafeParcelReader.createParcelable(parcel, readHeader, ResultReceiver.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new GetCredentialRequest(arrayList, bundle, str, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public GetCredentialRequest[] newArray(int i) {
        return new GetCredentialRequest[i];
    }
}
