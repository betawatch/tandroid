package n6;

import android.os.Parcel;
import android.os.Parcelable;
import h7.r8;
import java.util.Arrays;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class x0 extends z5.a {
    public static final Parcelable.Creator<x0> CREATOR = new w0(1);
    public final long a;
    public final y6.s0 b;
    public final y6.s0 c;
    public final y6.s0 d;

    public x0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        y5.l.h(bArr);
        y6.s0 t10 = y6.s0.t(bArr.length, bArr);
        y5.l.h(bArr2);
        y6.s0 t11 = y6.s0.t(bArr2.length, bArr2);
        y5.l.h(bArr3);
        y6.s0 t12 = y6.s0.t(bArr3.length, bArr3);
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
        return this.a == x0Var.a && y5.l.l(this.b, x0Var.b) && y5.l.l(this.c, x0Var.c) && y5.l.l(this.d, x0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = r8.q(parcel, 20293);
        r8.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        r8.c(parcel, 2, this.b.u());
        r8.c(parcel, 3, this.c.u());
        r8.c(parcel, 4, this.d.u());
        r8.r(parcel, q6);
    }
}
