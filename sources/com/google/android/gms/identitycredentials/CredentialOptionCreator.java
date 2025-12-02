package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class CredentialOptionCreator implements Parcelable.Creator {
    static void writeToParcel(CredentialOption credentialOption, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, credentialOption.getType(), false);
        SafeParcelWriter.writeBundle(parcel, 2, credentialOption.getCredentialRetrievalData(), false);
        SafeParcelWriter.writeBundle(parcel, 3, credentialOption.getCandidateQueryData(), false);
        SafeParcelWriter.writeString(parcel, 4, credentialOption.getRequestMatcher(), false);
        SafeParcelWriter.writeString(parcel, 5, credentialOption.getRequestType(), false);
        SafeParcelWriter.writeString(parcel, 6, credentialOption.getProtocolType(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public CredentialOption createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str4 = null;
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
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CredentialOption(str, bundle, bundle2, str4, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public CredentialOption[] newArray(int i) {
        return new CredentialOption[i];
    }
}
