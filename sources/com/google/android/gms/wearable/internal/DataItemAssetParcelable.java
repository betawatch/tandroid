package com.google.android.gms.wearable.internal;

import a8.p0;
import android.os.Parcel;
import android.os.Parcelable;
import b9.c;
import c8.xb;
import com.google.android.gms.common.internal.ReflectedParcelable;
import q6.m;
import r6.a;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class DataItemAssetParcelable extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new c(7);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(DataItemAssetParcelable dataItemAssetParcelable) {
        String str = dataItemAssetParcelable.a;
        m.g(str);
        this.a = str;
        String str2 = dataItemAssetParcelable.b;
        m.g(str2);
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DataItemAssetParcelable[@");
        sb2.append(Integer.toHexString(hashCode()));
        String str = this.a;
        if (str == null) {
            sb2.append(",noid");
        } else {
            sb2.append(",");
            sb2.append(str);
        }
        sb2.append(", key=");
        return p0.s(sb2, this.b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        xb.l(parcel, 2, this.a);
        xb.l(parcel, 3, this.b);
        xb.s(parcel, r10);
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
