package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import org.telegram.ui.th;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q0 extends a6.a {
    public static final Parcelable.Creator<q0> CREATOR = new n0(4);
    public final z6.s0 a;
    public final z6.s0 b;
    public final z6.s0 c;
    public final int d;

    public q0(z6.s0 s0Var, z6.s0 s0Var2, z6.s0 s0Var3, int i10) {
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
        return z5.l.l(this.a, q0Var.a) && z5.l.l(this.b, q0Var.b) && z5.l.l(this.c, q0Var.c) && this.d == q0Var.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        z6.s0 s0Var = this.a;
        String c3 = g6.b.c(s0Var == null ? null : s0Var.u());
        z6.s0 s0Var2 = this.b;
        String c6 = g6.b.c(s0Var2 == null ? null : s0Var2.u());
        z6.s0 s0Var3 = this.c;
        String c10 = g6.b.c(s0Var3 != null ? s0Var3.u() : null);
        StringBuilder k9 = th.k("HmacSecretExtension{coseKeyAgreement=", c3, ", saltEnc=", c6, ", saltAuth=");
        k9.append(c10);
        k9.append(", getPinUvAuthProtocol=");
        return a4.w.l(this.d, "}", k9);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        z6.s0 s0Var = this.a;
        com.google.android.gms.internal.cast.o.c(parcel, 1, s0Var == null ? null : s0Var.u());
        z6.s0 s0Var2 = this.b;
        com.google.android.gms.internal.cast.o.c(parcel, 2, s0Var2 == null ? null : s0Var2.u());
        z6.s0 s0Var3 = this.c;
        com.google.android.gms.internal.cast.o.c(parcel, 3, s0Var3 != null ? s0Var3.u() : null);
        com.google.android.gms.internal.cast.o.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
