package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(13);
    public final n7.t0 a;
    public final n7.t0 b;

    public u0(n7.t0 t0Var, n7.t0 t0Var2) {
        this.a = t0Var;
        this.b = t0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return n6.l.l(this.a, u0Var.a) && n6.l.l(this.b, u0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.f0.q(parcel, 20293);
        n7.t0 t0Var = this.a;
        w7.f0.c(parcel, 1, t0Var == null ? null : t0Var.t());
        n7.t0 t0Var2 = this.b;
        w7.f0.c(parcel, 2, t0Var2 != null ? t0Var2.t() : null);
        w7.f0.r(parcel, q6);
    }
}
