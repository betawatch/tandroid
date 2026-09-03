package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import j7.g5;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g extends c6.a {
    public static final Parcelable.Creator<g> CREATOR = t.b;
    public static final g b = new g(null);
    public final h a;

    public g(h hVar) {
        this.a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return Objects.equals(this.a, ((g) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return android.support.v4.media.a.o("ApiMetadata(complianceOptions=", String.valueOf(this.a), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(-204102970);
        int q10 = g5.q(parcel, 20293);
        g5.k(parcel, 1, this.a, i10);
        g5.r(parcel, q10);
    }
}
