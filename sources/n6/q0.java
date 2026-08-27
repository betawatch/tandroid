package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class q0 extends z5.a {
    public static final Parcelable.Creator<q0> CREATOR = new o0(3);
    public final y6.s0 a;
    public final y6.s0 b;
    public final y6.s0 c;
    public final int d;

    public q0(y6.s0 s0Var, y6.s0 s0Var2, y6.s0 s0Var3, int i10) {
        this.a = s0Var;
        this.b = s0Var2;
        this.c = s0Var3;
        this.d = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return y5.l.l(this.a, q0Var.a) && y5.l.l(this.b, q0Var.b) && y5.l.l(this.c, q0Var.c) && this.d == q0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        y6.s0 s0Var = this.a;
        String c10 = f6.b.c(s0Var == null ? null : s0Var.u());
        y6.s0 s0Var2 = this.b;
        String c11 = f6.b.c(s0Var2 == null ? null : s0Var2.u());
        y6.s0 s0Var3 = this.c;
        String c12 = f6.b.c(s0Var3 != null ? s0Var3.u() : null);
        StringBuilder p6 = i0.a.p("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        p6.append(c12);
        p6.append(", getPinUvAuthProtocol=");
        return a9.p.k(this.d, "}", p6);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        y6.s0 s0Var = this.a;
        r8.c(parcel, 1, s0Var == null ? null : s0Var.u());
        y6.s0 s0Var2 = this.b;
        r8.c(parcel, 2, s0Var2 == null ? null : s0Var2.u());
        y6.s0 s0Var3 = this.c;
        r8.c(parcel, 3, s0Var3 != null ? s0Var3.u() : null);
        r8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        r8.r(parcel, q6);
    }
}
