package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import b6.m;
import c6.a;
import com.google.android.gms.common.internal.ReflectedParcelable;
import j7.g5;
import l8.f;
import m8.c;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public class DataItemAssetParcelable extends a implements f, ReflectedParcelable {
    public static final Parcelable.Creator<DataItemAssetParcelable> CREATOR = new c(7);
    public final String a;
    public final String b;

    public DataItemAssetParcelable(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // l8.f
    public final String a() {
        return this.b;
    }

    @Override // l8.f
    public final String getId() {
        return this.a;
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
        return android.support.v4.media.a.r(sb, this.b, "]");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q10 = g5.q(parcel, 20293);
        g5.l(parcel, 2, this.a);
        g5.l(parcel, 3, this.b);
        g5.r(parcel, q10);
    }

    public DataItemAssetParcelable(f fVar) {
        String id2 = fVar.getId();
        m.h(id2);
        this.a = id2;
        String a2 = fVar.a();
        m.h(a2);
        this.b = a2;
    }
}
