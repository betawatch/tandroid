package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class p0 extends p6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(23);
    public final o7.s0 a;
    public final o7.s0 b;
    public final o7.s0 c;
    public final int d;

    public p0(o7.s0 s0Var, o7.s0 s0Var2, o7.s0 s0Var3, int i10) {
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
        return o6.l.l(this.a, p0Var.a) && o6.l.l(this.b, p0Var.b) && o6.l.l(this.c, p0Var.c) && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        o7.s0 s0Var = this.a;
        String c10 = v6.b.c(s0Var == null ? null : s0Var.t());
        o7.s0 s0Var2 = this.b;
        String c11 = v6.b.c(s0Var2 == null ? null : s0Var2.t());
        o7.s0 s0Var3 = this.c;
        String c12 = v6.b.c(s0Var3 != null ? s0Var3.t() : null);
        StringBuilder w10 = a1.g.w("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        w10.append(c12);
        w10.append(", getPinUvAuthProtocol=");
        return a1.g.n(this.d, "}", w10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        o7.s0 s0Var = this.a;
        df.c(parcel, 1, s0Var == null ? null : s0Var.t());
        o7.s0 s0Var2 = this.b;
        df.c(parcel, 2, s0Var2 == null ? null : s0Var2.t());
        o7.s0 s0Var3 = this.c;
        df.c(parcel, 3, s0Var3 != null ? s0Var3.t() : null);
        df.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        df.r(parcel, q5);
    }
}
