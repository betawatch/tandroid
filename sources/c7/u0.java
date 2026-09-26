package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class u0 extends o6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(13);
    public final n7.s0 a;
    public final n7.s0 b;

    public u0(n7.s0 s0Var, n7.s0 s0Var2) {
        this.a = s0Var;
        this.b = s0Var2;
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
        n7.s0 s0Var = this.a;
        w7.f0.c(parcel, 1, s0Var == null ? null : s0Var.u());
        n7.s0 s0Var2 = this.b;
        w7.f0.c(parcel, 2, s0Var2 != null ? s0Var2.u() : null);
        w7.f0.r(parcel, q6);
    }
}
