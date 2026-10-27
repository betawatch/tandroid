package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public class g implements Iterable, Serializable {
    public static final g c = new g(z.b);
    public static final f d;
    public int a = 0;
    public final byte[] b;

    static {
        d = c.a() ? new f(1) : new f(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static g h(int i10, int i11, byte[] bArr) {
        byte[] copyOfRange;
        int i12 = i10 + i11;
        int length = bArr.length;
        if (((i12 - i10) | i10 | i12 | (length - i12)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException(ic.a.j(i10, "Beginning index: ", " < 0"));
            }
            if (i12 < i10) {
                throw new IndexOutOfBoundsException(a1.g.l(i10, i12, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(a1.g.l(i12, length, "End index: ", " >= "));
        }
        switch (d.a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                copyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, copyOfRange, 0, i11);
                break;
        }
        return new g(copyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i10 = this.a;
        int i11 = gVar.a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder k10 = ic.a.k(size, "Ran off end of other: 0, ", ", ");
            k10.append(gVar.size());
            throw new IllegalArgumentException(k10.toString());
        }
        byte[] bArr = gVar.b;
        int m10 = m() + size;
        int m11 = m();
        int m12 = gVar.m();
        while (m11 < m10) {
            if (this.b[m11] != bArr[m12]) {
                return false;
            }
            m11++;
            m12++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int m10 = m();
        int i11 = size;
        for (int i12 = m10; i12 < m10 + size; i12++) {
            i11 = (i11 * 31) + this.b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    public int m() {
        return 0;
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
