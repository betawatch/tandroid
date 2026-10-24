package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public class x4 implements Iterable, Serializable {
    public static final x4 c = new x4(l5.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i10 = v4.a;
    }

    public x4(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void o(int i10) {
        if (((i10 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(i2.o1.k(i10, "End index: 47 >= "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x4) && n() == ((x4) obj).n()) {
            if (n() == 0) {
                return true;
            }
            if (!(obj instanceof x4)) {
                return obj.equals(this);
            }
            x4 x4Var = (x4) obj;
            int i10 = this.a;
            int i11 = x4Var.a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int n10 = n();
                if (n10 > x4Var.n()) {
                    throw new IllegalArgumentException("Length too large: " + n10 + n());
                }
                if (n10 > x4Var.n()) {
                    throw new IllegalArgumentException(a1.g.l(n10, x4Var.n(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = x4Var.b;
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
        Charset charset = l5.a;
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
            concat = v7.u5.a(this);
        } else {
            o(n());
            concat = v7.u5.a(new w4(this.b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(n10);
        sb2.append(" contents=\"");
        return a1.g.s(sb2, concat, "\">");
    }
}
