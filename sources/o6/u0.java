package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class u0 extends a6.a {
    public static final Parcelable.Creator<u0> CREATOR = new n0(25);
    public final z6.s0 a;
    public final z6.s0 b;

    public u0(z6.s0 s0Var, z6.s0 s0Var2) {
        this.a = s0Var;
        this.b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return z5.l.l(this.a, u0Var.a) && z5.l.l(this.b, u0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        z6.s0 s0Var = this.a;
        com.google.android.gms.internal.cast.o.c(parcel, 1, s0Var == null ? null : s0Var.u());
        z6.s0 s0Var2 = this.b;
        com.google.android.gms.internal.cast.o.c(parcel, 2, s0Var2 != null ? s0Var2.u() : null);
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
