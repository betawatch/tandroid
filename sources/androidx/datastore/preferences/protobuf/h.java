package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class h implements Iterable, Serializable {
    public static final h c = new h(c0.b);
    public static final f d;
    public int a = 0;
    public final byte[] b;

    static {
        d = c.a() ? new f(1) : new f(0);
    }

    public h(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int i(int i3, int i10, int i11) {
        int i12 = i10 - i3;
        if ((i3 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i3 < 0) {
            throw new IndexOutOfBoundsException(k2.p1.j(i3, "Beginning index: ", " < 0"));
        }
        if (i10 < i3) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a1.g.n(i10, i11, "End index: ", " >= "));
    }

    public static h j(int i3, int i10, byte[] bArr) {
        byte[] copyOfRange;
        i(i3, i3 + i10, bArr.length);
        switch (d.a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i3, i10 + i3);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i3, copyOfRange, 0, i10);
                break;
        }
        return new h(copyOfRange);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h) || size() != ((h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof h)) {
            return obj.equals(this);
        }
        h hVar = (h) obj;
        int i3 = this.a;
        int i10 = hVar.a;
        if (i3 != 0 && i10 != 0 && i3 != i10) {
            return false;
        }
        int size = size();
        if (size > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > hVar.size()) {
            StringBuilder m10 = k2.p1.m(size, "Ran off end of other: 0, ", ", ");
            m10.append(hVar.size());
            throw new IllegalArgumentException(m10.toString());
        }
        byte[] bArr = hVar.b;
        int l10 = l() + size;
        int l11 = l();
        int l12 = hVar.l();
        while (l11 < l10) {
            if (this.b[l11] != bArr[l12]) {
                return false;
            }
            l11++;
            l12++;
        }
        return true;
    }

    public byte h(int i3) {
        return this.b[i3];
    }

    public final int hashCode() {
        int i3 = this.a;
        if (i3 != 0) {
            return i3;
        }
        int size = size();
        int l10 = l();
        int i10 = size;
        for (int i11 = l10; i11 < l10 + size; i11++) {
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

    public void k(int i3, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i3);
    }

    public int l() {
        return 0;
    }

    public byte m(int i3) {
        return this.b[i3];
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        String sb2;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            sb2 = b8.t0.a(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            int i3 = i(0, 47, size());
            sb3.append(b8.t0.a(i3 == 0 ? c : new g(this.b, l(), i3)));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder("<ByteString@");
        sb4.append(hexString);
        sb4.append(" size=");
        sb4.append(size);
        sb4.append(" contents=\"");
        return a1.g.s(sb4, sb2, "\">");
    }
}
