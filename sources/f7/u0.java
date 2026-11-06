package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.wb;
import java.util.Arrays;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
        return q6.m.k(this.a, u0Var.a) && q6.m.k(this.b, u0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = wb.r(parcel, 20293);
        q7.s0 s0Var = this.a;
        wb.c(parcel, 1, s0Var == null ? null : s0Var.p());
        q7.s0 s0Var2 = this.b;
        wb.c(parcel, 2, s0Var2 != null ? s0Var2.p() : null);
        wb.s(parcel, r10);
    }
}
