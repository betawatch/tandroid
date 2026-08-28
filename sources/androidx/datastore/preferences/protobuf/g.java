package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class g implements Iterable, Serializable {
    public static final g c = new g(a0.b);
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

    public static g i(int i9, int i10, byte[] bArr) {
        byte[] copyOfRange;
        int i11 = i9 + i10;
        int length = bArr.length;
        if (((i11 - i9) | i9 | i11 | (length - i11)) < 0) {
            if (i9 < 0) {
                throw new IndexOutOfBoundsException(j3.r0.m(i9, "Beginning index: ", " < 0"));
            }
            if (i11 < i9) {
                throw new IndexOutOfBoundsException(aa.d.k(i9, i11, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(aa.d.k(i11, length, "End index: ", " >= "));
        }
        switch (d.a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i9, i10 + i9);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i9, copyOfRange, 0, i10);
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
        int i9 = this.a;
        int i10 = gVar.a;
        if (i9 != 0 && i10 != 0 && i9 != i10) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder p6 = j3.r0.p(size, "Ran off end of other: 0, ", ", ");
            p6.append(gVar.size());
            throw new IllegalArgumentException(p6.toString());
        }
        byte[] bArr = gVar.b;
        int n10 = n() + size;
        int n11 = n();
        int n12 = gVar.n();
        while (n11 < n10) {
            if (this.b[n11] != bArr[n12]) {
                return false;
            }
            n11++;
            n12++;
        }
        return true;
    }

    public final int hashCode() {
        int i9 = this.a;
        if (i9 != 0) {
            return i9;
        }
        int size = size();
        int n10 = n();
        int i10 = size;
        for (int i11 = n10; i11 < n10 + size; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.a = i10;
        return i10;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    public int n() {
        return 0;
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
