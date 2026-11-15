package b9;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new o0(8);
    public final byte a;
    public final byte b;
    public final String c;

    public w0(byte b10, byte b11, String str) {
        this.a = b10;
        this.b = b11;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w0.class != obj.getClass()) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && this.b == w0Var.b && this.c.equals(w0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((((this.a + 31) * 31) + this.b) * 31);
    }

    public final String toString() {
        return a8.p0.s(i5.c.n("AmsEntityUpdateParcelable{, mEntityId=", this.a, ", mAttributeId=", this.b, ", mValue='"), this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 2, 4);
        parcel.writeInt(this.a);
        yb.q(parcel, 3, 4);
        parcel.writeInt(this.b);
        yb.l(parcel, 4, this.c);
        yb.s(parcel, r10);
    }
}
