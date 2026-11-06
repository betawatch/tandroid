package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.xb;
import java.util.Arrays;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class p0 extends r6.a {
    public static final Parcelable.Creator<p0> CREATOR = new db.k(11);
    public final q7.s0 a;
    public final q7.s0 b;
    public final q7.s0 c;
    public final int d;

    public p0(q7.s0 s0Var, q7.s0 s0Var2, q7.s0 s0Var3, int i7) {
        this.a = s0Var;
        this.b = s0Var2;
        this.c = s0Var3;
        this.d = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return q6.m.k(this.a, p0Var.a) && q6.m.k(this.b, p0Var.b) && q6.m.k(this.c, p0Var.c) && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        q7.s0 s0Var = this.a;
        String c10 = x6.b.c(s0Var == null ? null : s0Var.p());
        q7.s0 s0Var2 = this.b;
        String c11 = x6.b.c(s0Var2 == null ? null : s0Var2.p());
        q7.s0 s0Var3 = this.c;
        String c12 = x6.b.c(s0Var3 != null ? s0Var3.p() : null);
        StringBuilder n10 = com.google.android.recaptcha.internal.a.n("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        n10.append(c12);
        n10.append(", getPinUvAuthProtocol=");
        return a8.p0.n(this.d, "}", n10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = xb.r(parcel, 20293);
        q7.s0 s0Var = this.a;
        xb.c(parcel, 1, s0Var == null ? null : s0Var.p());
        q7.s0 s0Var2 = this.b;
        xb.c(parcel, 2, s0Var2 == null ? null : s0Var2.p());
        q7.s0 s0Var3 = this.c;
        xb.c(parcel, 3, s0Var3 != null ? s0Var3.p() : null);
        xb.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        xb.s(parcel, r10);
    }
}
