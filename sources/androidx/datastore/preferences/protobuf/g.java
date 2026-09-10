package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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

    public static g i(int i10, int i11, byte[] bArr) {
        byte[] copyOfRange;
        int i12 = i10 + i11;
        int length = bArr.length;
        if (((i12 - i10) | i10 | i12 | (length - i12)) < 0) {
            if (i10 < 0) {
                throw new IndexOutOfBoundsException(hc.b.k(i10, "Beginning index: ", " < 0"));
            }
            if (i12 < i10) {
                throw new IndexOutOfBoundsException(a4.a.l(i10, i12, "Beginning index larger than ending index: ", ", "));
            }
            throw new IndexOutOfBoundsException(a4.a.l(i12, length, "End index: ", " >= "));
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
            StringBuilder m10 = hc.b.m(size, "Ran off end of other: 0, ", ", ");
            m10.append(gVar.size());
            throw new IllegalArgumentException(m10.toString());
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
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int n10 = n();
        int i11 = size;
        for (int i12 = n10; i12 < n10 + size; i12++) {
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
