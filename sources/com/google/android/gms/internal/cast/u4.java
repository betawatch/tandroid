package com.google.android.gms.internal.cast;

import a8.na;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public class u4 implements Iterable, Serializable {
    public static final u4 c = new u4(i5.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i10 = s4.a;
    }

    public u4(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void o(int i10) {
        if (((i10 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(ic.a.i(i10, "End index: 47 >= "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u4) && n() == ((u4) obj).n()) {
            if (n() == 0) {
                return true;
            }
            if (!(obj instanceof u4)) {
                return obj.equals(this);
            }
            u4 u4Var = (u4) obj;
            int i10 = this.a;
            int i11 = u4Var.a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int n10 = n();
                if (n10 > u4Var.n()) {
                    throw new IllegalArgumentException("Length too large: " + n10 + n());
                }
                if (n10 > u4Var.n()) {
                    throw new IllegalArgumentException(a1.g.l(n10, u4Var.n(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = u4Var.b;
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
        Charset charset = i5.a;
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
            concat = na.a(this);
        } else {
            o(n());
            concat = na.a(new t4(this.b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(n10);
        sb2.append(" contents=\"");
        return a1.g.s(sb2, concat, "\">");
    }
}
