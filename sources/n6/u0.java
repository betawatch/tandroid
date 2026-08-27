package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class u0 extends z5.a {
    public static final Parcelable.Creator<u0> CREATOR = new o0(24);
    public final y6.s0 a;
    public final y6.s0 b;

    public u0(y6.s0 s0Var, y6.s0 s0Var2) {
        this.a = s0Var;
        this.b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return y5.l.l(this.a, u0Var.a) && y5.l.l(this.b, u0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        y6.s0 s0Var = this.a;
        r8.c(parcel, 1, s0Var == null ? null : s0Var.u());
        y6.s0 s0Var2 = this.b;
        r8.c(parcel, 2, s0Var2 != null ? s0Var2.u() : null);
        r8.r(parcel, q6);
    }
}
