package com.google.android.gms.wearable.internal;

import a1.g;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import n6.l;
import o6.a;
import w7.h0;
import y8.c;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class DataItemAssetParcelable extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new c(7);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(DataItemAssetParcelable dataItemAssetParcelable) {
        String str = dataItemAssetParcelable.a;
        l.g(str);
        this.a = str;
        String str2 = dataItemAssetParcelable.b;
        l.g(str2);
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
        return g.r(sb2, this.b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = h0.q(parcel, 20293);
        h0.l(parcel, 2, this.a);
        h0.l(parcel, 3, this.b);
        h0.r(parcel, q6);
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
