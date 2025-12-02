package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* loaded from: classes.dex */
public final class PendingGetCredentialHandleCreator implements Parcelable.Creator {
    static void writeToParcel(PendingGetCredentialHandle pendingGetCredentialHandle, Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, pendingGetCredentialHandle.getPendingIntent(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public PendingGetCredentialHandle createFromParcel(Parcel parcel) {
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
        return new PendingGetCredentialHandle(pendingIntent);
    }

    @Override // android.os.Parcelable.Creator
    public PendingGetCredentialHandle[] newArray(int i) {
        return new PendingGetCredentialHandle[i];
    }
}
