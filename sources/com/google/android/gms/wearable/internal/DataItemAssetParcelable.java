package com.google.android.gms.wearable.internal;

import a1.g;
import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import o6.l;
import p6.a;
import y8.f;
import z8.d;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class DataItemAssetParcelable extends a implements f, ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new d(7);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // y8.f
    public final String a() {
        return this.b;
    }

    @Override // y8.f
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
        return g.s(sb2, this.b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.l(parcel, 2, this.a);
        df.l(parcel, 3, this.b);
        df.r(parcel, q5);
    }

    public DataItemAssetParcelable(f fVar) {
        String id2 = fVar.getId();
        l.h(id2);
        this.a = id2;
        String a2 = fVar.a();
        l.h(a2);
        this.b = a2;
    }
}
