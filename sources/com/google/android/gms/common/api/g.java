package com.google.android.gms.common.api;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g extends p6.a {
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
        return a1.g.p("ApiMetadata(complianceOptions=", String.valueOf(this.a), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(-204102970);
        int q5 = df.q(parcel, 20293);
        df.k(parcel, 1, this.a, i10);
        df.r(parcel, q5);
    }
}
