package o7;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class s0 implements Iterable, Serializable {
    public static final s0 c = new s0(t0.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i10 = q0.a;
    }

    public s0(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int r(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(ic.a.j(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a1.g.l(i11, i12, "End index: ", " >= "));
    }

    public static s0 s(int i10, byte[] bArr) {
        r(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new s0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s0) || o() != ((s0) obj).o()) {
            return false;
        }
        if (o() == 0) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return obj.equals(this);
        }
        s0 s0Var = (s0) obj;
        int i10 = this.a;
        int i11 = s0Var.a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int o10 = o();
        if (o10 > s0Var.o()) {
            throw new IllegalArgumentException("Length too large: " + o10 + o());
        }
        if (o10 > s0Var.o()) {
            throw new IllegalArgumentException(a1.g.l(o10, s0Var.o(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = s0Var.b;
        int n10 = n() + o10;
        int n11 = n();
        int n12 = s0Var.n();
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
        byte[] bArr = t0.a;
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
            return t0.a;
        }
        byte[] bArr = new byte[o10];
        p(o10, bArr);
        return bArr;
    }

    public final String toString() {
        s0 r0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int o10 = o();
        if (o() <= 50) {
            concat = a.d(this);
        } else {
            int r6 = r(0, 47, o());
            if (r6 == 0) {
                r0Var = c;
            } else {
                r0Var = new r0(this.b, n(), r6);
            }
            concat = a.d(r0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o10);
        sb2.append(" contents=\"");
        return a1.g.s(sb2, concat, "\">");
    }
}
