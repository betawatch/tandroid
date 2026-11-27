// default package

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public class jne implements Serializable, Iterable {
    public static final jne c = new jne(xse.b);
    public static final fme d;
    public int a = 0;
    public final byte[] b;

    static {
        d = aje.a() ? new yad((byte) 3) : new xad();
    }

    public jne(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static jne j(int i, int i2, byte[] bArr) {
        l(i, i + i2, bArr.length);
        return new jne(d.a(i, i2, bArr));
    }

    public static int l(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i2 < i) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(i2);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i2);
        sb3.append(" >= ");
        sb3.append(i3);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jne) || i() != ((jne) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (!(obj instanceof jne)) {
            return obj.equals(this);
        }
        jne jneVar = (jne) obj;
        int i = this.a;
        int i2 = jneVar.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int i3 = i();
        if (i3 > jneVar.i()) {
            int i4 = i();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i3);
            sb.append(i4);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i3 > jneVar.i()) {
            int i5 = jneVar.i();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i3);
            sb2.append(", ");
            sb2.append(i5);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = jneVar.b;
        int m = m() + i3;
        int m2 = m();
        int m3 = jneVar.m();
        while (m2 < m) {
            if (this.b[m2] != bArr[m3]) {
                return false;
            }
            m2++;
            m3++;
        }
        return true;
    }

    public byte h(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int i2 = i();
        int m = m();
        int i3 = i2;
        for (int i4 = m; i4 < m + i2; i4++) {
            i3 = (i3 * 31) + this.b[i4];
        }
        if (i3 == 0) {
            i3 = 1;
        }
        this.a = i3;
        return i3;
    }

    public int i() {
        return this.b.length;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new k51(this);
    }

    public byte k(int i) {
        return this.b[i];
    }

    public int m() {
        return 0;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i = i();
        if (i() <= 50) {
            concat = w7f.a(this);
        } else {
            int l = l(0, 47, i());
            concat = w7f.a(l == 0 ? c : new qle(this.b, m(), l)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(i);
        sb.append(" contents=\"");
        return c00.k(sb, concat, "\">");
    }
}
