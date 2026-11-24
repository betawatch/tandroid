// default package

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class efd implements Serializable, Iterable {
    public static final efd c = new efd(gld.b);
    public static final red d;
    public int a = 0;
    public final byte[] b;

    static {
        d = lcd.a() ? new lfd() : new ied();
    }

    public efd(byte[] bArr) {
        this.b = bArr;
    }

    public static efd i(int i, int i2, byte[] bArr) {
        return new efd(d.c(i, i2, bArr));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof efd) || size() != ((efd) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof efd)) {
            return obj.equals(this);
        }
        efd efdVar = (efd) obj;
        int i = this.a;
        int i2 = efdVar.a;
        if (i != 0 && i2 != 0 && i != i2) {
            return false;
        }
        int size = size();
        if (size > efdVar.size()) {
            int size2 = size();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(size);
            sb.append(size2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (size > efdVar.size()) {
            int size3 = efdVar.size();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(size);
            sb2.append(", ");
            sb2.append(size3);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = efdVar.b;
        int h = h() + size;
        int h2 = h();
        int h3 = efdVar.h();
        while (h2 < h) {
            if (this.b[h2] != bArr[h3]) {
                return false;
            }
            h2++;
            h3++;
        }
        return true;
    }

    public final int h() {
        return 0;
    }

    public final int hashCode() {
        int i = this.a;
        if (i != 0) {
            return i;
        }
        int size = size();
        int h = h();
        int i2 = size;
        for (int i3 = h; i3 < h + size; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new j61(this);
    }

    public final byte j(int i) {
        return this.b[i];
    }

    public final int size() {
        return this.b.length;
    }

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }
}
