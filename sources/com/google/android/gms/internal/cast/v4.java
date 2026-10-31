package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class v4 implements Iterable, Serializable {
    public static final v4 c = new v4(j5.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i10 = t4.a;
    }

    public v4(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void o(int i10) {
        if (((i10 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(i0.a.i(i10, "End index: 47 >= "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v4) && n() == ((v4) obj).n()) {
            if (n() == 0) {
                return true;
            }
            if (!(obj instanceof v4)) {
                return obj.equals(this);
            }
            v4 v4Var = (v4) obj;
            int i10 = this.a;
            int i11 = v4Var.a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int n10 = n();
                if (n10 > v4Var.n()) {
                    throw new IllegalArgumentException("Length too large: " + n10 + n());
                }
                if (n10 > v4Var.n()) {
                    throw new IllegalArgumentException(a1.g.j(n10, v4Var.n(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = v4Var.b;
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

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int n10 = n();
        Charset charset = j5.a;
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

    public byte l(int i10) {
        return this.b[i10];
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
            concat = v7.v5.a(this);
        } else {
            o(n());
            concat = v7.v5.a(new u4(this.b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(n10);
        sb2.append(" contents=\"");
        return a1.g.r(sb2, concat, "\">");
    }
}
