package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
        return n6.l.k(this.a, u0Var.a) && n6.l.k(this.b, u0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.h0.q(parcel, 20293);
        n7.s0 s0Var = this.a;
        w7.h0.c(parcel, 1, s0Var == null ? null : s0Var.t());
        n7.s0 s0Var2 = this.b;
        w7.h0.c(parcel, 2, s0Var2 != null ? s0Var2.t() : null);
        w7.h0.r(parcel, q6);
    }
}
