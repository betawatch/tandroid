package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class zzan implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        PublicKeyCredentialRpEntity publicKeyCredentialRpEntity = null;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = null;
        byte[] bArr = null;
        ArrayList arrayList = null;
        Double d = null;
        ArrayList arrayList2 = null;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = null;
        Integer num = null;
        TokenBinding tokenBinding = null;
        String str = null;
        AuthenticationExtensions authenticationExtensions = null;
        String str2 = null;
        ResultReceiver resultReceiver = null;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    publicKeyCredentialRpEntity = (PublicKeyCredentialRpEntity) SafeParcelReader.createParcelable(parcel, readHeader, PublicKeyCredentialRpEntity.CREATOR);
                    break;
                case 3:
                    publicKeyCredentialUserEntity = (PublicKeyCredentialUserEntity) SafeParcelReader.createParcelable(parcel, readHeader, PublicKeyCredentialUserEntity.CREATOR);
                    break;
                case 4:
                    bArr = SafeParcelReader.createByteArray(parcel, readHeader);
                    break;
                case 5:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, PublicKeyCredentialParameters.CREATOR);
                    break;
                case 6:
                    d = SafeParcelReader.readDoubleObject(parcel, readHeader);
                    break;
                case 7:
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, PublicKeyCredentialDescriptor.CREATOR);
                    break;
                case 8:
                    authenticatorSelectionCriteria = (AuthenticatorSelectionCriteria) SafeParcelReader.createParcelable(parcel, readHeader, AuthenticatorSelectionCriteria.CREATOR);
                    break;
                case 9:
                    num = SafeParcelReader.readIntegerObject(parcel, readHeader);
                    break;
                case 10:
                    tokenBinding = (TokenBinding) SafeParcelReader.createParcelable(parcel, readHeader, TokenBinding.CREATOR);
                    break;
                case 11:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 12:
                    authenticationExtensions = (AuthenticationExtensions) SafeParcelReader.createParcelable(parcel, readHeader, AuthenticationExtensions.CREATOR);
                    break;
                case 13:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 14:
                    resultReceiver = (ResultReceiver) SafeParcelReader.createParcelable(parcel, readHeader, ResultReceiver.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new PublicKeyCredentialCreationOptions(publicKeyCredentialRpEntity, publicKeyCredentialUserEntity, bArr, arrayList, d, arrayList2, authenticatorSelectionCriteria, num, tokenBinding, str, authenticationExtensions, str2, resultReceiver);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublicKeyCredentialCreationOptions[i];
    }
}
