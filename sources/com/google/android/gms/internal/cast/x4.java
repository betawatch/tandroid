package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class x4 implements Iterable, Serializable {
    public static final x4 c = new x4(l5.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i9 = v4.a;
    }

    public x4(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void p(int i9) {
        if (((i9 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(j3.r0.l(i9, "End index: 47 >= "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x4) && o() == ((x4) obj).o()) {
            if (o() == 0) {
                return true;
            }
            if (!(obj instanceof x4)) {
                return obj.equals(this);
            }
            x4 x4Var = (x4) obj;
            int i9 = this.a;
            int i10 = x4Var.a;
            if (i9 == 0 || i10 == 0 || i9 == i10) {
                int o6 = o();
                if (o6 > x4Var.o()) {
                    throw new IllegalArgumentException("Length too large: " + o6 + o());
                }
                if (o6 > x4Var.o()) {
                    throw new IllegalArgumentException(aa.d.k(o6, x4Var.o(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = x4Var.b;
                int i11 = 0;
                int i12 = 0;
                while (i11 < o6) {
                    if (this.b[i11] == bArr[i12]) {
                        i11++;
                        i12++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9 = this.a;
        if (i9 != 0) {
            return i9;
        }
        int o6 = o();
        Charset charset = l5.a;
        int i10 = o6;
        for (int i11 = 0; i11 < o6; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.a = i10;
        return i10;
    }

    public byte i(int i9) {
        return this.b[i9];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte n(int i9) {
        return this.b[i9];
    }

    public int o() {
        return this.b.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int o6 = o();
        if (o() <= 50) {
            concat = f7.u5.a(this);
        } else {
            p(o());
            concat = f7.u5.a(new w4(this.b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o6);
        sb2.append(" contents=\"");
        return aa.d.r(sb2, concat, "\">");
    }
}
