package e7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w0 extends q6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(24);
    public final long a;
    public final p7.t0 b;
    public final p7.t0 c;
    public final p7.t0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        p6.m.g(bArr);
        p7.t0 o10 = p7.t0.o(bArr.length, bArr);
        p6.m.g(bArr2);
        p7.t0 o11 = p7.t0.o(bArr2.length, bArr2);
        p6.m.g(bArr3);
        p7.t0 o12 = p7.t0.o(bArr3.length, bArr3);
        this.a = j10;
        this.b = o10;
        this.c = o11;
        this.d = o12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && p6.m.k(this.b, w0Var.b) && p6.m.k(this.c, w0Var.c) && p6.m.k(this.d, w0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i3) {
        int s6 = j8.a.s(parcel, 20293);
        j8.a.r(parcel, 1, 8);
        parcel.writeLong(this.a);
        j8.a.d(parcel, 2, this.b.p());
        j8.a.d(parcel, 3, this.c.p());
        j8.a.d(parcel, 4, this.d.p());
        j8.a.t(parcel, s6);
    }
}
