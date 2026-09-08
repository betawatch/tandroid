package n6;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class d extends o6.a {
    public static final Parcelable.Creator<d> CREATOR = new m8.h(12);
    public final int a;
    public final String b;

    public d(int i10, String str) {
        this.a = i10;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.a == this.a && l.l(dVar.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.a + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        w7.e0.l(parcel, 2, this.b);
        w7.e0.r(parcel, q6);
    }
}
