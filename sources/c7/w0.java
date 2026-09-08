package c7;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class w0 extends o6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long a;
    public final n7.s0 b;
    public final n7.s0 c;
    public final n7.s0 d;

    public w0(long j3, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        n6.l.h(bArr);
        n7.s0 t10 = n7.s0.t(bArr.length, bArr);
        n6.l.h(bArr2);
        n7.s0 t11 = n7.s0.t(bArr2.length, bArr2);
        n6.l.h(bArr3);
        n7.s0 t12 = n7.s0.t(bArr3.length, bArr3);
        this.a = j3;
        this.b = t10;
        this.c = t11;
        this.d = t12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && n6.l.l(this.b, w0Var.b) && n6.l.l(this.c, w0Var.c) && n6.l.l(this.d, w0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q6 = w7.e0.q(parcel, 20293);
        w7.e0.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        w7.e0.c(parcel, 2, this.b.u());
        w7.e0.c(parcel, 3, this.c.u());
        w7.e0.c(parcel, 4, this.d.u());
        w7.e0.r(parcel, q6);
    }
}
