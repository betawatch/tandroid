package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import w7.e0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g extends o6.a {
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
        return a4.a.p("ApiMetadata(complianceOptions=", String.valueOf(this.a), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(-204102970);
        int q6 = e0.q(parcel, 20293);
        e0.k(parcel, 1, this.a, i10);
        e0.r(parcel, q6);
    }
}
