package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class p0 extends y5.a {
    public static final Parcelable.Creator<p0> CREATOR = new h5.h(22);
    public final x6.s0 a;
    public final x6.s0 b;
    public final x6.s0 c;
    public final int d;

    public p0(x6.s0 s0Var, x6.s0 s0Var2, x6.s0 s0Var3, int i9) {
        this.a = s0Var;
        this.b = s0Var2;
        this.c = s0Var3;
        this.d = i9;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return x5.l.l(this.a, p0Var.a) && x5.l.l(this.b, p0Var.b) && x5.l.l(this.c, p0Var.c) && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        x6.s0 s0Var = this.a;
        String c10 = e6.b.c(s0Var == null ? null : s0Var.u());
        x6.s0 s0Var2 = this.b;
        String c11 = e6.b.c(s0Var2 == null ? null : s0Var2.u());
        x6.s0 s0Var3 = this.c;
        String c12 = e6.b.c(s0Var3 != null ? s0Var3.u() : null);
        StringBuilder q10 = j3.r0.q("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        q10.append(c12);
        q10.append(", getPinUvAuthProtocol=");
        return aa.d.l(this.d, "}", q10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        x6.s0 s0Var = this.a;
        p8.c(parcel, 1, s0Var == null ? null : s0Var.u());
        x6.s0 s0Var2 = this.b;
        p8.c(parcel, 2, s0Var2 == null ? null : s0Var2.u());
        x6.s0 s0Var3 = this.c;
        p8.c(parcel, 3, s0Var3 != null ? s0Var3.u() : null);
        p8.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        p8.r(parcel, q10);
    }
}
