package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class u0 extends q6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(17);
    public final p7.t0 a;
    public final p7.t0 b;

    public u0(p7.t0 t0Var, p7.t0 t0Var2) {
        this.a = t0Var;
        this.b = t0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return p6.m.k(this.a, u0Var.a) && p6.m.k(this.b, u0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        p7.t0 t0Var = this.a;
        j8.a.d(parcel, 1, t0Var == null ? null : t0Var.p());
        p7.t0 t0Var2 = this.b;
        j8.a.d(parcel, 2, t0Var2 != null ? t0Var2.p() : null);
        j8.a.t(parcel, s6);
    }
}
