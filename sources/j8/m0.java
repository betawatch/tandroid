package j8;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class m0 extends z5.a implements i8.h {
    public static final Parcelable.Creator<m0> CREATOR = new c(29);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public m0(int i10, String str, String str2, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = i10;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m0) {
            return ((m0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder p6 = i0.a.p("Node{", this.b, ", id=", this.a, ", hops=");
        p6.append(this.c);
        p6.append(", isNearby=");
        p6.append(this.d);
        p6.append("}");
        return p6.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.l(parcel, 2, this.a);
        r8.l(parcel, 3, this.b);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        r8.s(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        r8.r(parcel, q6);
    }
}
