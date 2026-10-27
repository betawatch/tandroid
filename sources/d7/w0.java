package d7;

import a8.df;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class w0 extends p6.a {
    public static final Parcelable.Creator<w0> CREATOR = new r0(21);
    public final long a;
    public final o7.s0 b;
    public final o7.s0 c;
    public final o7.s0 d;

    public w0(long j10, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        o6.l.h(bArr);
        o7.s0 s10 = o7.s0.s(bArr.length, bArr);
        o6.l.h(bArr2);
        o7.s0 s11 = o7.s0.s(bArr2.length, bArr2);
        o6.l.h(bArr3);
        o7.s0 s12 = o7.s0.s(bArr3.length, bArr3);
        this.a = j10;
        this.b = s10;
        this.c = s11;
        this.d = s12;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return this.a == w0Var.a && o6.l.l(this.b, w0Var.b) && o6.l.l(this.c, w0Var.c) && o6.l.l(this.d, w0Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int q5 = df.q(parcel, 20293);
        df.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        df.c(parcel, 2, this.b.t());
        df.c(parcel, 3, this.c.t());
        df.c(parcel, 4, this.d.t());
        df.r(parcel, q5);
    }
}
