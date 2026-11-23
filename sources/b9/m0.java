package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class m0 extends r6.a {
    public static final Parcelable.Creator<m0> CREATOR = new c(29);
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public m0(int i7, String str, String str2, boolean z10) {
        this.a = str;
        this.b = str2;
        this.c = i7;
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
        StringBuilder n10 = e2.n("Node{", this.b, ", id=", this.a, ", hops=");
        n10.append(this.c);
        n10.append(", isNearby=");
        n10.append(this.d);
        n10.append("}");
        return n10.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        bc.l(parcel, 2, this.a);
        bc.l(parcel, 3, this.b);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.c);
        bc.q(parcel, 5, 4);
        parcel.writeInt(this.d ? 1 : 0);
        bc.s(parcel, r10);
    }
}
