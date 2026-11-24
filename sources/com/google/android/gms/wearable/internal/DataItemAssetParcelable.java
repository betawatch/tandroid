package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class DataItemAssetParcelable extends b4 implements ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new igd(29);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(DataItemAssetParcelable dataItemAssetParcelable) {
        String str = dataItemAssetParcelable.a;
        fre.h(str);
        this.a = str;
        String str2 = dataItemAssetParcelable.b;
        fre.h(str2);
        this.b = str2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        String str = this.a;
        if (str == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(str);
        }
        sb.append(", key=");
        return b00.j(sb, this.b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = jte.r(parcel, 20293);
        jte.l(parcel, 2, this.a);
        jte.l(parcel, 3, this.b);
        jte.s(parcel, r);
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
