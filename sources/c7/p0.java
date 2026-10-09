package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
        return n6.l.l(this.a, p0Var.a) && n6.l.l(this.b, p0Var.b) && n6.l.l(this.c, p0Var.c) && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        n7.s0 s0Var = this.a;
        String c10 = u6.b.c(s0Var == null ? null : s0Var.u());
        n7.s0 s0Var2 = this.b;
        String c11 = u6.b.c(s0Var2 == null ? null : s0Var2.u());
        n7.s0 s0Var3 = this.c;
        String c12 = u6.b.c(s0Var3 != null ? s0Var3.u() : null);
        StringBuilder x10 = a1.g.x("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        x10.append(c12);
        x10.append(", getPinUvAuthProtocol=");
        return a1.g.o(this.d, "}", x10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.d0.q(parcel, 20293);
        n7.s0 s0Var = this.a;
        w7.d0.c(parcel, 1, s0Var == null ? null : s0Var.u());
        n7.s0 s0Var2 = this.b;
        w7.d0.c(parcel, 2, s0Var2 == null ? null : s0Var2.u());
        n7.s0 s0Var3 = this.c;
        w7.d0.c(parcel, 3, s0Var3 != null ? s0Var3.u() : null);
        w7.d0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.d0.r(parcel, q6);
    }
}
