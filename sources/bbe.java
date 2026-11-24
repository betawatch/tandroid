// default package

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class bbe extends b4 {
    public static final Parcelable.Creator<bbe> CREATOR = new t0e((byte) 13);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public bbe(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bbe) {
            return ((bbe) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder m = mlb.m("Node{", this.b, ", id=", this.a, ", hops=");
        m.append(this.c);
        m.append(", isNearby=");
        m.append(this.d);
        m.append("}");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int r = mve.r(parcel, 20293);
        mve.l(parcel, 2, this.a);
        mve.l(parcel, 3, this.b);
        mve.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        mve.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        mve.s(parcel, r);
    }
}
