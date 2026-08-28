package m6;

import android.os.Parcel;
import android.os.Parcelable;
import g7.p8;
import java.util.Arrays;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w0 extends y5.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(20);
    public final long a;
    public final x6.s0 b;
    public final x6.s0 c;
    public final x6.s0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        x5.l.h(bArr);
        x6.s0 t10 = x6.s0.t(bArr.length, bArr);
        x5.l.h(bArr2);
        x6.s0 t11 = x6.s0.t(bArr2.length, bArr2);
        x5.l.h(bArr3);
        x6.s0 t12 = x6.s0.t(bArr3.length, bArr3);
        this.a = j10;
        this.b = t10;
        this.c = t11;
        this.d = t12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && x5.l.l(this.b, w0Var.b) && x5.l.l(this.c, w0Var.c) && x5.l.l(this.d, w0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int q10 = p8.q(parcel, 20293);
        p8.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        p8.c(parcel, 2, this.b.u());
        p8.c(parcel, 3, this.c.u());
        p8.c(parcel, 4, this.d.u());
        p8.r(parcel, q10);
    }
}
