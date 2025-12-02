package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class PendingImportCredentialsHandleCreator implements Parcelable.Creator {
    static void writeToParcel(PendingImportCredentialsHandle pendingImportCredentialsHandle, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, pendingImportCredentialsHandle.getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public PendingImportCredentialsHandle createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            if (SafeParcelReader.getFieldId(readHeader) != 1) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                pendingIntent = (PendingIntent) SafeParcelReader.createParcelable(parcel, readHeader, PendingIntent.CREATOR);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PendingImportCredentialsHandle(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public PendingImportCredentialsHandle[] newArray(int i) {
        return new PendingImportCredentialsHandle[i];
    }
}
