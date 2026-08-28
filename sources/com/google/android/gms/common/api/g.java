package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import j$.util.Objects;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends y5.a {
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
        return aa.d.o("ApiMetadata(complianceOptions=", String.valueOf(this.a), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(-204102970);
        int q10 = p8.q(parcel, 20293);
        p8.k(parcel, 1, this.a, i9);
        p8.r(parcel, q10);
    }
}
