package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import w7.g0;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
        return a4.a.q("ApiMetadata(complianceOptions=", String.valueOf(this.a), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(-204102970);
        int q6 = g0.q(parcel, 20293);
        g0.k(parcel, 1, this.a, i10);
        g0.r(parcel, q6);
    }
}
