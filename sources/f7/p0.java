package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import com.google.android.gms.internal.vision.e2;
import java.util.Arrays;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        return q6.m.l(this.a, p0Var.a) && q6.m.l(this.b, p0Var.b) && q6.m.l(this.c, p0Var.c) && this.d == p0Var.d;
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
        StringBuilder n10 = e2.n("HmacSecretExtension{coseKeyAgreement=", c10, ", saltEnc=", c11, ", saltAuth=");
        n10.append(c12);
        n10.append(", getPinUvAuthProtocol=");
        return a8.p0.n(this.d, "}", n10);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        q7.s0 s0Var = this.a;
        bc.c(parcel, 1, s0Var == null ? null : s0Var.p());
        q7.s0 s0Var2 = this.b;
        bc.c(parcel, 2, s0Var2 == null ? null : s0Var2.p());
        q7.s0 s0Var3 = this.c;
        bc.c(parcel, 3, s0Var3 != null ? s0Var3.p() : null);
        bc.q(parcel, 4, 4);
        parcel.writeInt(this.d);
        bc.s(parcel, r10);
    }
}
