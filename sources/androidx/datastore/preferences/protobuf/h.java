package androidx.datastore.preferences.protobuf;

import a8.q6;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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

    public static int i(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(jg.g.k(i7, "Beginning index: ", " < 0"));
        }
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(a8.p0.m(i7, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a8.p0.m(i10, i11, "End index: ", " >= "));
    }

    public static h j(int i7, int i10, byte[] bArr) {
        byte[] copyOfRange;
        i(i7, i7 + i10, bArr.length);
        switch (d.a) {
            case 0:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i10 + i7);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i7, copyOfRange, 0, i10);
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
        int i7 = this.a;
        int i10 = hVar.a;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int size = size();
        if (size > hVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > hVar.size()) {
            StringBuilder n10 = jg.g.n(size, "Ran off end of other: 0, ", ", ");
            n10.append(hVar.size());
            throw new IllegalArgumentException(n10.toString());
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

    public byte f(int i7) {
        return this.b[i7];
    }

    public final int hashCode() {
        int i7 = this.a;
        if (i7 != 0) {
            return i7;
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

    public void k(int i7, byte[] bArr) {
        System.arraycopy(this.b, 0, bArr, 0, i7);
    }

    public int l() {
        return 0;
    }

    public byte m(int i7) {
        return this.b[i7];
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
            sb2 = q6.a(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            int i7 = i(0, 47, size());
            sb3.append(q6.a(i7 == 0 ? c : new g(this.b, l(), i7)));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder("<ByteString@");
        sb4.append(hexString);
        sb4.append(" size=");
        sb4.append(size);
        sb4.append(" contents=\"");
        return a8.p0.s(sb4, sb2, "\">");
    }
}
