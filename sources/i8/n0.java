package i8;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class n0 extends y5.a implements h8.h {
    public static final Parcelable.Creator<n0> CREATOR = new c(29);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public n0(int i9, String str, String str2, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = i9;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n0) {
            return ((n0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder q10 = j3.r0.q("Node{", this.b, ", id=", this.a, ", hops=");
        q10.append(this.c);
        q10.append(", isNearby=");
        q10.append(this.d);
        q10.append("}");
        return q10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.l(parcel, 2, this.a);
        p8.l(parcel, 3, this.b);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        p8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        p8.r(parcel, q10);
    }
}
