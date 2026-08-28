package com.google.android.gms.wearable.internal;

import aa.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.p8;
import h8.f;
import i8.c;
import x5.l;
import y5.a;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class DataItemAssetParcelable extends a implements f, ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new c(7);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(f fVar) {
        String id2 = fVar.getId();
        l.h(id2);
        this.a = id2;
        String a2 = fVar.a();
        l.h(a2);
        this.b = a2;
    }

    @Override // h8.f
    public final String a() {
        return this.b;
    }

    @Override // h8.f
    public final String getId() {
        return this.a;
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
        return d.r(sb2, this.b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.r(parcel, q10);
    }

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }
}
