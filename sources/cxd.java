// default package

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class cxd implements Iterable, Serializable {
    public static final cxd c = new cxd(k5e.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i = hud.a;
    }

    public cxd(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int k(int i, int i2, int i3) {
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

    public static cxd l(int i, int i2, byte[] bArr) {
        k(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new cxd(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof cxd) && j() == ((cxd) obj).j()) {
            if (j() == 0) {
                return true;
            }
            if (!(obj instanceof cxd)) {
                return obj.equals(this);
            }
            cxd cxdVar = (cxd) obj;
            int i = this.a;
            int i2 = cxdVar.a;
            if (i == 0 || i2 == 0 || i == i2) {
                int j = j();
                if (j > cxdVar.j()) {
                    i2d.b(j, j());
                    return false;
                }
                if (j > cxdVar.j()) {
                    u36.j(b10.g(j, cxdVar.j(), "Ran off end of other: 0, ", ", "));
                    return false;
                }
                byte[] bArr = cxdVar.b;
                int i3 = 0;
                int i4 = 0;
                while (i3 < j) {
                    if (this.b[i3] == bArr[i4]) {
                        i3++;
                        i4++;
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
        int j = j();
        int i2 = j;
        for (int i3 = 0; i3 < j; i3++) {
            i2 = (i2 * 31) + this.b[i3];
        }
        if (i2 == 0) {
            i2 = 1;
        }
        this.a = i2;
        return i2;
    }

    public byte i(int i) {
        return this.b[i];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new j61(this);
    }

    public int j() {
        return this.b.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int j = j();
        if (j() <= 50) {
            concat = h4f.a(this);
        } else {
            int k = k(0, 47, j());
            concat = h4f.a(k == 0 ? c : new hwd(k, this.b)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(j);
        sb.append(" contents=\"");
        return b10.j(sb, concat, "\">");
    }
}
