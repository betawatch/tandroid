package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class g extends r6.a {
    public static final Parcelable.Creator<g> CREATOR = u.b;
    public static final g d;
    public final h a;
    public final boolean b;
    public boolean c;

    static {
        g gVar = new g(null, false);
        gVar.c = false;
        d = gVar;
    }

    public g(h hVar, boolean z10) {
        this.a = hVar;
        this.b = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return q6.m.l(this.a, gVar.a) && this.c == gVar.c && this.b == gVar.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.c), Boolean.valueOf(this.b)});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        return p5.c.m("ApiMetadata(complianceOptions=", valueOf, ")", new StringBuilder(valueOf.length() + 31));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        if (this.c) {
            parcel.setDataPosition(parcel.dataPosition() - 4);
            parcel.setDataSize(parcel.dataSize() - 4);
            return;
        }
        parcel.writeInt(-204102970);
        int r10 = bc.r(parcel, 20293);
        bc.k(parcel, 1, this.a, i7);
        bc.q(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        bc.s(parcel, r10);
    }
}
