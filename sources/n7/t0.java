package n7;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    public static int s(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(hc.b.k(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(a4.a.l(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a4.a.l(i11, i12, "End index: ", " >= "));
    }

    public static t0 t(int i10, byte[] bArr) {
        s(0, i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return new t0(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof t0) || p() != ((t0) obj).p()) {
            return false;
        }
        if (p() == 0) {
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
        int p5 = p();
        if (p5 > t0Var.p()) {
            throw new IllegalArgumentException("Length too large: " + p5 + p());
        }
        if (p5 > t0Var.p()) {
            throw new IllegalArgumentException(a4.a.l(p5, t0Var.p(), "Ran off end of other: 0, ", ", "));
        }
        byte[] bArr = t0Var.b;
        int o9 = o() + p5;
        int o10 = o();
        int o11 = t0Var.o();
        while (o10 < o9) {
            if (this.b[o10] != bArr[o11]) {
                return false;
            }
            o10++;
            o11++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int p5 = p();
        int o9 = o();
        byte[] bArr = u0.a;
        int i11 = p5;
        for (int i12 = o9; i12 < o9 + p5; i12++) {
            i11 = (i11 * 31) + this.b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.a = i11;
        return i11;
    }

    public byte i(int i10) {
        return this.b[i10];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte n(int i10) {
        return this.b[i10];
    }

    public int o() {
        return 0;
    }

    public int p() {
        return this.b.length;
    }

    public void q(int i10, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i10);
    }

    public final ByteArrayInputStream r() {
        return new ByteArrayInputStream(this.b, o(), p());
    }

    public final String toString() {
        t0 s0Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int p5 = p();
        if (p() <= 50) {
            concat = a.d(this);
        } else {
            int s10 = s(0, 47, p());
            if (s10 == 0) {
                s0Var = c;
            } else {
                s0Var = new s0(this.b, o(), s10);
            }
            concat = a.d(s0Var).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(p5);
        sb2.append(" contents=\"");
        return a4.a.s(sb2, concat, "\">");
    }

    public final byte[] u() {
        int p5 = p();
        if (p5 == 0) {
            return u0.a;
        }
        byte[] bArr = new byte[p5];
        q(p5, bArr);
        return bArr;
    }
}
