package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public class z4 implements Iterable, Serializable {
    public static final z4 c = new z4(n5.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i10 = x4.a;
    }

    public z4(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void p(int i10) {
        if (((i10 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(i2.g.i(i10, "End index: 47 >= "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof z4) && o() == ((z4) obj).o()) {
            if (o() == 0) {
                return true;
            }
            if (!(obj instanceof z4)) {
                return obj.equals(this);
            }
            z4 z4Var = (z4) obj;
            int i10 = this.a;
            int i11 = z4Var.a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int o9 = o();
                if (o9 > z4Var.o()) {
                    throw new IllegalArgumentException("Length too large: " + o9 + o());
                }
                if (o9 > z4Var.o()) {
                    throw new IllegalArgumentException(a4.a.l(o9, z4Var.o(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = z4Var.b;
                int i12 = 0;
                int i13 = 0;
                while (i12 < o9) {
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
        int o9 = o();
        Charset charset = n5.a;
        int i11 = o9;
        for (int i12 = 0; i12 < o9; i12++) {
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
        int o9 = o();
        if (o() <= 50) {
            concat = v7.s5.a(this);
        } else {
            p(o());
            concat = v7.s5.a(new y4(this.b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o9);
        sb2.append(" contents=\"");
        return a4.a.s(sb2, concat, "\">");
    }
}
