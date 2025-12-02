package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class CreateCredentialRequestCreator implements Parcelable.Creator {
    static void writeToParcel(CreateCredentialRequest createCredentialRequest, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, createCredentialRequest.getType(), false);
        SafeParcelWriter.writeBundle(parcel, 2, createCredentialRequest.getCredentialData(), false);
        SafeParcelWriter.writeBundle(parcel, 3, createCredentialRequest.getCandidateQueryData(), false);
        SafeParcelWriter.writeString(parcel, 4, createCredentialRequest.getOrigin(), false);
        SafeParcelWriter.writeString(parcel, 5, createCredentialRequest.getRequestJson(), false);
        SafeParcelWriter.writeParcelable(parcel, 6, createCredentialRequest.getResultReceiver(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public CreateCredentialRequest createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = null;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str2 = null;
        String str3 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 1:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 2:
                    bundle = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 3:
                    bundle2 = SafeParcelReader.createBundle(parcel, readHeader);
                    break;
                case 4:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    resultReceiver = (ResultReceiver) SafeParcelReader.createParcelable(parcel, readHeader, ResultReceiver.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CreateCredentialRequest(str, bundle, bundle2, str2, str3, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public CreateCredentialRequest[] newArray(int i) {
        return new CreateCredentialRequest[i];
    }
}
