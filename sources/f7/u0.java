package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.bc;
import java.util.Arrays;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class u0 extends r6.a {
    public static final Parcelable.Creator<u0> CREATOR = new t0(2);
    public final q7.s0 a;
    public final q7.s0 b;

    public u0(q7.s0 s0Var, q7.s0 s0Var2) {
        this.a = s0Var;
        this.b = s0Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return q6.m.l(this.a, u0Var.a) && q6.m.l(this.b, u0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = bc.r(parcel, 20293);
        q7.s0 s0Var = this.a;
        bc.c(parcel, 1, s0Var == null ? null : s0Var.p());
        q7.s0 s0Var2 = this.b;
        bc.c(parcel, 2, s0Var2 != null ? s0Var2.p() : null);
        bc.s(parcel, r10);
    }
}
