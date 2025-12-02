package com.google.android.gms.identitycredentials;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class ExportCredentialsToDeviceSetupResponseCreator implements Parcelable.Creator {
    static void writeToParcel(ExportCredentialsToDeviceSetupResponse exportCredentialsToDeviceSetupResponse, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, exportCredentialsToDeviceSetupResponse.getResponseBundle(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public ExportCredentialsToDeviceSetupResponse createFromParcel(Parcel parcel) {
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
        return new ExportCredentialsToDeviceSetupResponse(bundle);
    }

    @Override // android.os.Parcelable.Creator
    public ExportCredentialsToDeviceSetupResponse[] newArray(int i) {
        return new ExportCredentialsToDeviceSetupResponse[i];
    }
}
