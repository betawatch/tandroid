// default package

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class m61 implements Iterable, Serializable {
    public static final m61 c = new m61(mr5.b);
    public static final l61 d;
    public int a = 0;
    public final byte[] b;

    static {
        d = wk.a() ? new fgf((byte) 14) : new q7f((byte) 14);
    }

    public m61(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int i(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            wa3.i(td4.o(i, "Beginning index: ", " < 0"));
            return 0;
        }
        if (i2 < i) {
            wa3.i(b10.g(i, i2, "Beginning index larger than ending index: ", ", "));
            return 0;
        }
        wa3.i(b10.g(i2, i3, "End index: ", " >= "));
        return 0;
    }

    public static m61 j(int i, int i2, byte[] bArr) {
        i(i, i + i2, bArr.length);
        return new m61(d.j(i, i2, bArr));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof m61) && size() == ((m61) obj).size()) {
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof m61)) {
                return obj.equals(this);
            }
            m61 m61Var = (m61) obj;
            int i = this.a;
            int i2 = m61Var.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int size = size();
                if (size > m61Var.size()) {
                    i2d.b(size, size());
                    return false;
                }
                if (size > m61Var.size()) {
                    gxc.c(m61Var.size(), hg9.l(size, "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = m61Var.b;
                int l = l() + size;
                int l2 = l();
                int l3 = m61Var.l();
                while (l2 < l) {
                    if (this.b[l2] == bArr[l3]) {
                        l2++;
                        l3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte h(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int l = l();
        int i2 = size;
        for (int i3 = l; i3 < l + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new j61(this);
    }

    public void k(int i, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public int l() {
        return 0;
    }

    public byte m(int i) {
        return this.b[i];
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = ixe.a(this);
        } else {
            int i = i(0, 47, size());
            concat = ixe.a(i == 0 ? c : new k61(this.b, l(), i)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(size);
        sb.append(" contents=\"");
        return b10.j(sb, concat, "\">");
    }
}
