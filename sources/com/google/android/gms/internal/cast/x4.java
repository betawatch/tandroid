package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    public static void p(int i10) {
        if (((i10 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(j7.l1.k(i10, "End index: 47 >= "));
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
            int i10 = this.a;
            int i11 = x4Var.a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int o10 = o();
                if (o10 > x4Var.o()) {
                    throw new IllegalArgumentException("Length too large: " + o10 + o());
                }
                if (o10 > x4Var.o()) {
                    throw new IllegalArgumentException(a4.w.k(o10, x4Var.o(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = x4Var.b;
                int i12 = 0;
                int i13 = 0;
                while (i12 < o10) {
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

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int o10 = o();
        Charset charset = l5.a;
        int i11 = o10;
        for (int i12 = 0; i12 < o10; i12++) {
            i11 = (i11 * 31) + this.b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.a = i11;
        return i11;
    }

    public byte i(int i10) {
        return this.b[i10];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte n(int i10) {
        return this.b[i10];
    }

    public int o() {
        return this.b.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int o10 = o();
        if (o() <= 50) {
            concat = h7.b6.a(this);
        } else {
            p(o());
            concat = h7.b6.a(new w4(this.b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o10);
        sb2.append(" contents=\"");
        return a4.w.q(sb2, concat, "\">");
    }
}
