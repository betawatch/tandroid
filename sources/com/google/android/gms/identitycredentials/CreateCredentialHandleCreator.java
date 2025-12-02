package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class CreateCredentialHandleCreator implements Parcelable.Creator {
    static void writeToParcel(CreateCredentialHandle createCredentialHandle, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, createCredentialHandle.getPendingIntent(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, createCredentialHandle.getCreateCredentialResponse(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public CreateCredentialHandle createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        PendingIntent pendingIntent = null;
        CreateCredentialResponse createCredentialResponse = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, readHeader, PendingIntent.CREATOR);
            } else if (fieldId != 2) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                createCredentialResponse = (CreateCredentialResponse) SafeParcelReader.createParcelable(parcel, readHeader, CreateCredentialResponse.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new CreateCredentialHandle(pendingIntent, createCredentialResponse);
    }

    @Override // android.os.Parcelable.Creator
    public CreateCredentialHandle[] newArray(int i) {
        return new CreateCredentialHandle[i];
    }
}
