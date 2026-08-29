package o6;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class x0 extends a6.a {
    public static final Parcelable.Creator<x0> CREATOR = new w0(2);
    public final long a;
    public final z6.s0 b;
    public final z6.s0 c;
    public final z6.s0 d;

    public x0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        z5.l.h(bArr);
        z6.s0 t10 = z6.s0.t(bArr.length, bArr);
        z5.l.h(bArr2);
        z6.s0 t11 = z6.s0.t(bArr2.length, bArr2);
        z5.l.h(bArr3);
        z6.s0 t12 = z6.s0.t(bArr3.length, bArr3);
        this.a = j10;
        this.b = t10;
        this.c = t11;
        this.d = t12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return this.a == x0Var.a && z5.l.l(this.b, x0Var.b) && z5.l.l(this.c, x0Var.c) && z5.l.l(this.d, x0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = com.google.android.gms.internal.cast.o.q(parcel, 20293);
        com.google.android.gms.internal.cast.o.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        com.google.android.gms.internal.cast.o.c(parcel, 2, this.b.u());
        com.google.android.gms.internal.cast.o.c(parcel, 3, this.c.u());
        com.google.android.gms.internal.cast.o.c(parcel, 4, this.d.u());
        com.google.android.gms.internal.cast.o.r(parcel, q6);
    }
}
