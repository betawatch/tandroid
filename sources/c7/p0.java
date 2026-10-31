package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(22);
    public final n7.s0 a;
    public final n7.s0 b;
    public final n7.s0 c;
    public final int d;

    public p0(n7.s0 s0Var, n7.s0 s0Var2, n7.s0 s0Var3, int i10) {
        this.a = s0Var;
        this.b = s0Var2;
        this.c = s0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return n6.l.k(this.a, p0Var.a) && n6.l.k(this.b, p0Var.b) && n6.l.k(this.c, p0Var.c) && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        n7.s0 s0Var = this.a;
        String c10 = u6.b.c(s0Var == null ? null : s0Var.t());
        n7.s0 s0Var2 = this.b;
        String c11 = u6.b.c(s0Var2 == null ? null : s0Var2.t());
        n7.s0 s0Var3 = this.c;
        String c12 = u6.b.c(s0Var3 != null ? s0Var3.t() : null);
        StringBuilder v = a1.g.v("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        v.append(c12);
        v.append(", getPinUvAuthProtocol=");
        return a1.g.p(v, this.d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        n7.s0 s0Var = this.a;
        w7.h0.c(parcel, 1, s0Var == null ? null : s0Var.t());
        n7.s0 s0Var2 = this.b;
        w7.h0.c(parcel, 2, s0Var2 == null ? null : s0Var2.t());
        n7.s0 s0Var3 = this.c;
        w7.h0.c(parcel, 3, s0Var3 != null ? s0Var3.t() : null);
        w7.h0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.h0.r(parcel, q6);
    }
}
