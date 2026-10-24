package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
import v7.g6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class l1 implements Iterable, Serializable {
    public static final l1 c = new l1(a2.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i10 = g1.a;
    }

    public l1(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int o(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(i2.o1.l(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a1.g.l(i11, i12, "End index: ", " >= "));
    }

    public static l1 p(int i10, int i11, byte[] bArr) {
        o(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new l1(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof l1) && n() == ((l1) obj).n()) {
            if (n() == 0) {
                return true;
            }
            if (!(obj instanceof l1)) {
                return obj.equals(this);
            }
            l1 l1Var = (l1) obj;
            int i10 = this.a;
            int i11 = l1Var.a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int n10 = n();
                if (n10 > l1Var.n()) {
                    throw new IllegalArgumentException("Length too large: " + n10 + n());
                }
                if (n10 > l1Var.n()) {
                    throw new IllegalArgumentException(a1.g.l(n10, l1Var.n(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = l1Var.b;
                int i12 = 0;
                int i13 = 0;
                while (i12 < n10) {
                    if (this.b[i12] == bArr[i13]) {
                        i12++;
                        i13++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public byte h(int i10) {
        return this.b[i10];
    }

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int n10 = n();
        int i11 = n10;
        for (int i12 = 0; i12 < n10; i12++) {
            i11 = (i11 * 31) + this.b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte m(int i10) {
        return this.b[i10];
    }

    public int n() {
        return this.b.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int n10 = n();
        if (n() <= 50) {
            concat = g6.a(this);
        } else {
            int o10 = o(0, 47, n());
            concat = g6.a(o10 == 0 ? c : new k1(this.b, o10)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(n10);
        sb2.append(" contents=\"");
        return a1.g.s(sb2, concat, "\">");
    }
}
