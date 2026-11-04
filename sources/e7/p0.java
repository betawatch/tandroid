package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p0 extends q6.a {
    public static final Parcelable.Creator<p0> CREATOR = new w.a(26);
    public final p7.t0 a;
    public final p7.t0 b;
    public final p7.t0 c;
    public final int d;

    public p0(p7.t0 t0Var, p7.t0 t0Var2, p7.t0 t0Var3, int i3) {
        this.a = t0Var;
        this.b = t0Var2;
        this.c = t0Var3;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return p6.m.k(this.a, p0Var.a) && p6.m.k(this.b, p0Var.b) && p6.m.k(this.c, p0Var.c) && this.d == p0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        p7.t0 t0Var = this.a;
        String c2 = w6.b.c(t0Var == null ? null : t0Var.p());
        p7.t0 t0Var2 = this.b;
        String c10 = w6.b.c(t0Var2 == null ? null : t0Var2.p());
        p7.t0 t0Var3 = this.c;
        String c11 = w6.b.c(t0Var3 != null ? t0Var3.p() : null);
        StringBuilder n4 = com.google.android.recaptcha.internal.a.n("HmacSecretExtension{coseKeyAgreement=", c2, ", saltEnc=", c10, ", saltAuth=");
        n4.append(c11);
        n4.append(", getPinUvAuthProtocol=");
        return a1.g.o(this.d, "}", n4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        p7.t0 t0Var = this.a;
        j8.a.d(parcel, 1, t0Var == null ? null : t0Var.p());
        p7.t0 t0Var2 = this.b;
        j8.a.d(parcel, 2, t0Var2 == null ? null : t0Var2.p());
        p7.t0 t0Var3 = this.c;
        j8.a.d(parcel, 3, t0Var3 != null ? t0Var3.p() : null);
        j8.a.r(parcel, 4, 4);
        parcel.writeInt(this.d);
        j8.a.t(parcel, s6);
    }
}
