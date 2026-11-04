package a9;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class l0 extends q6.a {
    public static final Parcelable.Creator<l0> CREATOR = new c(29);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public l0(int i3, String str, String str2, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = i3;
        this.d = z10;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof l0) {
            return ((l0) obj).a.equals(this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("Node{", this.b, ", id=", this.a, ", hops=");
        n4.append(this.c);
        n4.append(", isNearby=");
        n4.append(this.d);
        n4.append("}");
        return n4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.m(parcel, 2, this.a);
        j8.a.m(parcel, 3, this.b);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.c);
        j8.a.r(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        j8.a.t(parcel, s6);
    }
}
