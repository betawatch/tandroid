package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* loaded from: classes.dex */
public final class zzc implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        UvmEntries uvmEntries = null;
        zzf zzfVar = null;
        AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = null;
        zzh zzhVar = null;
        String str = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            int fieldId = SafeParcelReader.getFieldId(readHeader);
            if (fieldId == 1) {
                uvmEntries = (UvmEntries) SafeParcelReader.createParcelable(parcel, readHeader, UvmEntries.CREATOR);
            } else if (fieldId == 2) {
                zzfVar = (zzf) SafeParcelReader.createParcelable(parcel, readHeader, zzf.CREATOR);
            } else if (fieldId == 3) {
                authenticationExtensionsCredPropsOutputs = (AuthenticationExtensionsCredPropsOutputs) SafeParcelReader.createParcelable(parcel, readHeader, AuthenticationExtensionsCredPropsOutputs.CREATOR);
            } else if (fieldId == 4) {
                zzhVar = (zzh) SafeParcelReader.createParcelable(parcel, readHeader, zzh.CREATOR);
            } else if (fieldId != 5) {
                SafeParcelReader.skipUnknownField(parcel, readHeader);
            } else {
                str = SafeParcelReader.createString(parcel, readHeader);
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new AuthenticationExtensionsClientOutputs(uvmEntries, zzfVar, authenticationExtensionsCredPropsOutputs, zzhVar, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthenticationExtensionsClientOutputs[i];
    }
}
