package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class p0 extends o6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(22);
    public final n7.t0 a;
    public final n7.t0 b;
    public final n7.t0 c;
    public final int d;

    public p0(n7.t0 t0Var, n7.t0 t0Var2, n7.t0 t0Var3, int i10) {
        this.a = t0Var;
        this.b = t0Var2;
        this.c = t0Var3;
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
        n7.t0 t0Var = this.a;
        String c10 = u6.b.c(t0Var == null ? null : t0Var.t());
        n7.t0 t0Var2 = this.b;
        String c11 = u6.b.c(t0Var2 == null ? null : t0Var2.t());
        n7.t0 t0Var3 = this.c;
        String c12 = u6.b.c(t0Var3 != null ? t0Var3.t() : null);
        StringBuilder w9 = a1.g.w("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        w9.append(c12);
        w9.append(", getPinUvAuthProtocol=");
        return a1.g.n(this.d, "}", w9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        n7.t0 t0Var = this.a;
        w7.f0.c(parcel, 1, t0Var == null ? null : t0Var.t());
        n7.t0 t0Var2 = this.b;
        w7.f0.c(parcel, 2, t0Var2 == null ? null : t0Var2.t());
        n7.t0 t0Var3 = this.c;
        w7.f0.c(parcel, 3, t0Var3 != null ? t0Var3.t() : null);
        w7.f0.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        w7.f0.r(parcel, q6);
    }
}
