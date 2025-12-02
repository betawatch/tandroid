package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class ImportCredentialsForDeviceSetupResponseCreator implements Parcelable.Creator {
    static void writeToParcel(ImportCredentialsForDeviceSetupResponse importCredentialsForDeviceSetupResponse, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, importCredentialsForDeviceSetupResponse.getResponseBundle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public ImportCredentialsForDeviceSetupResponse createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 1) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                bundle = SafeParcelReader.createBundle(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new ImportCredentialsForDeviceSetupResponse(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public ImportCredentialsForDeviceSetupResponse[] newArray(int i) {
        return new ImportCredentialsForDeviceSetupResponse[i];
    }
}
