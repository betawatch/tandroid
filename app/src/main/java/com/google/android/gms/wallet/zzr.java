package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.wallet.wobs.LabelValueRow;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TextModuleData;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;
import java.util.ArrayList;
import org.telegram.messenger.R;
/* compiled from: com.google.android.gms:play-services-wallet@@18.1.3 */
/* loaded from: classes.dex */
public final class zzr implements Parcelable.Creator<LoyaltyWalletObject> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LoyaltyWalletObject createFromParcel(Parcel parcel) {
        int validateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        ArrayList newArrayList = ArrayUtils.newArrayList();
        ArrayList newArrayList2 = ArrayUtils.newArrayList();
        ArrayList newArrayList3 = ArrayUtils.newArrayList();
        ArrayList arrayList = newArrayList;
        ArrayList arrayList2 = newArrayList2;
        ArrayList arrayList3 = newArrayList3;
        ArrayList newArrayList4 = ArrayUtils.newArrayList();
        ArrayList newArrayList5 = ArrayUtils.newArrayList();
        ArrayList newArrayList6 = ArrayUtils.newArrayList();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        TimeInterval timeInterval = null;
        String str11 = null;
        String str12 = null;
        LoyaltyPoints loyaltyPoints = null;
        int i = 0;
        boolean z = false;
        while (parcel.dataPosition() < validateObjectHeader) {
            int readHeader = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(readHeader)) {
                case 2:
                    str = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 3:
                    str2 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 4:
                    str3 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 5:
                    str4 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 6:
                    str5 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 7:
                    str6 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 8:
                    str7 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 9:
                    str8 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 10:
                    str9 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 11:
                    str10 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 12:
                    i = SafeParcelReader.readInt(parcel, readHeader);
                    break;
                case 13:
                    arrayList = SafeParcelReader.createTypedList(parcel, readHeader, WalletObjectMessage.CREATOR);
                    break;
                case 14:
                    timeInterval = (TimeInterval) SafeParcelReader.createParcelable(parcel, readHeader, TimeInterval.CREATOR);
                    break;
                case 15:
                    arrayList2 = SafeParcelReader.createTypedList(parcel, readHeader, LatLng.CREATOR);
                    break;
                case 16:
                    str11 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 17:
                    str12 = SafeParcelReader.createString(parcel, readHeader);
                    break;
                case 18:
                    arrayList3 = SafeParcelReader.createTypedList(parcel, readHeader, LabelValueRow.CREATOR);
                    break;
                case R.styleable.MapAttrs_uiTiltGestures /* 19 */:
                    z = SafeParcelReader.readBoolean(parcel, readHeader);
                    break;
                case R.styleable.MapAttrs_uiZoomControls /* 20 */:
                    newArrayList4 = SafeParcelReader.createTypedList(parcel, readHeader, UriData.CREATOR);
                    break;
                case R.styleable.MapAttrs_uiZoomGestures /* 21 */:
                    newArrayList5 = SafeParcelReader.createTypedList(parcel, readHeader, TextModuleData.CREATOR);
                    break;
                case R.styleable.MapAttrs_useViewLifecycle /* 22 */:
                    newArrayList6 = SafeParcelReader.createTypedList(parcel, readHeader, UriData.CREATOR);
                    break;
                case R.styleable.MapAttrs_zOrderOnTop /* 23 */:
                    loyaltyPoints = (LoyaltyPoints) SafeParcelReader.createParcelable(parcel, readHeader, LoyaltyPoints.CREATOR);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, readHeader);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, validateObjectHeader);
        return new LoyaltyWalletObject(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, i, arrayList, timeInterval, arrayList2, str11, str12, arrayList3, z, newArrayList4, newArrayList5, newArrayList6, loyaltyPoints);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LoyaltyWalletObject[] newArray(int i) {
        return new LoyaltyWalletObject[i];
    }
}
