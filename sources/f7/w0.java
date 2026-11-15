package f7;

import android.os.Parcel;
import android.os.Parcelable;
import c8.yb;
import java.util.Arrays;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class w0 extends r6.a {
    public static final Parcelable.Creator<w0> CREATOR = new t0(9);
    public final long a;
    public final q7.s0 b;
    public final q7.s0 c;
    public final q7.s0 d;

    public w0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        q6.m.g(bArr);
        q7.s0 o4 = q7.s0.o(bArr.length, bArr);
        q6.m.g(bArr2);
        q7.s0 o10 = q7.s0.o(bArr2.length, bArr2);
        q6.m.g(bArr3);
        q7.s0 o11 = q7.s0.o(bArr3.length, bArr3);
        this.a = j3;
        this.b = o4;
        this.c = o10;
        this.d = o11;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && q6.m.k(this.b, w0Var.b) && q6.m.k(this.c, w0Var.c) && q6.m.k(this.d, w0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int r10 = yb.r(parcel, 20293);
        yb.q(parcel, 1, 8);
        parcel.writeLong(this.a);
        yb.c(parcel, 2, this.b.p());
        yb.c(parcel, 3, this.c.p());
        yb.c(parcel, 4, this.d.p());
        yb.s(parcel, r10);
    }
}
