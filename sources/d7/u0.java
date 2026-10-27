package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class u0 extends p6.a {
    public static final Parcelable.Creator<u0> CREATOR = new r0(14);
    public final o7.s0 a;
    public final o7.s0 b;

    public u0(o7.s0 s0Var, o7.s0 s0Var2) {
        this.a = s0Var;
        this.b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return o6.l.l(this.a, u0Var.a) && o6.l.l(this.b, u0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        o7.s0 s0Var = this.a;
        df.c(parcel, 1, s0Var == null ? null : s0Var.t());
        o7.s0 s0Var2 = this.b;
        df.c(parcel, 2, s0Var2 != null ? s0Var2.t() : null);
        df.r(parcel, q5);
    }
}
