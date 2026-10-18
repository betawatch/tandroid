package n7;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public class t0 implements Iterable, Serializable {
    public static final t0 c = new t0(u0.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i10 = r0.a;
    }

    public t0(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int r(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(i2.d.k(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a1.g.l(i11, i12, "End index: ", " >= "));
    }

    public static t0 s(int i10, byte[] bArr) {
        r(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new t0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0) || o() != ((t0) obj).o()) {
            return false;
        }
        if (o() == 0) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return obj.equals(this);
        }
        t0 t0Var = (t0) obj;
        int i10 = this.a;
        int i11 = t0Var.a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int o10 = o();
        if (o10 > t0Var.o()) {
            throw new IllegalArgumentException("Length too large: " + o10 + o());
        }
        if (o10 > t0Var.o()) {
            throw new IllegalArgumentException(a1.g.l(o10, t0Var.o(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = t0Var.b;
        int n10 = n() + o10;
        int n11 = n();
        int n12 = t0Var.n();
        while (n11 < n10) {
            if (this.b[n11] != bArr[n12]) {
                return false;
            }
            n11++;
            n12++;
        }
        return true;
    }

    public byte h(int i10) {
        return this.b[i10];
    }

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int o10 = o();
        int n10 = n();
        byte[] bArr = u0.a;
        int i11 = o10;
        for (int i12 = n10; i12 < n10 + o10; i12++) {
            i11 = (i11 * 31) + this.b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte m(int i10) {
        return this.b[i10];
    }

    public int n() {
        return 0;
    }

    public int o() {
        return this.b.length;
    }

    public void p(int i10, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i10);
    }

    public final ByteArrayInputStream q() {
        return new ByteArrayInputStream(this.b, n(), o());
    }

    public final byte[] t() {
        int o10 = o();
        if (o10 == 0) {
            return u0.a;
        }
        byte[] bArr = new byte[o10];
        p(o10, bArr);
        return bArr;
    }

    public final String toString() {
        t0 s0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int o10 = o();
        if (o() <= 50) {
            concat = a.d(this);
        } else {
            int r10 = r(0, 47, o());
            if (r10 == 0) {
                s0Var = c;
            } else {
                s0Var = new s0(this.b, n(), r10);
            }
            concat = a.d(s0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o10);
        sb2.append(" contents=\"");
        return a1.g.s(sb2, concat, "\">");
    }
}
