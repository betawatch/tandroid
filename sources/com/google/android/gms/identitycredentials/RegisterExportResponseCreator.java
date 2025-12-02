package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class RegisterExportResponseCreator implements Parcelable.Creator {
    static void writeToParcel(RegisterExportResponse registerExportResponse, Parcel parcel, int i) {
        SafeParcelWriter.finishObjectHeader(parcel, SafeParcelWriter.beginObjectHeader(parcel));
    }

    @Override // android.os.Parcelable.Creator
    public RegisterExportResponse createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            SafeParcelReader.getFieldId(readHeader);
            SafeParcelReader.skipUnknownField(parcel, readHeader);
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new RegisterExportResponse();
    }

    @Override // android.os.Parcelable.Creator
    public RegisterExportResponse[] newArray(int i) {
        return new RegisterExportResponse[i];
    }
}
