package com.google.android.gms.internal.cast;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    public static void p(int i10) {
        if (((i10 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(i0.a.k(i10, "End index: 47 >= "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v4) && o() == ((v4) obj).o()) {
            if (o() == 0) {
                return true;
            }
            if (!(obj instanceof v4)) {
                return obj.equals(this);
            }
            v4 v4Var = (v4) obj;
            int i10 = this.a;
            int i11 = v4Var.a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int o10 = o();
                if (o10 > v4Var.o()) {
                    throw new IllegalArgumentException("Length too large: " + o10 + o());
                }
                if (o10 > v4Var.o()) {
                    throw new IllegalArgumentException(a9.p.j(o10, v4Var.o(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = v4Var.b;
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
        Charset charset = j5.a;
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
            concat = g7.t5.a(this);
        } else {
            p(o());
            concat = g7.t5.a(new u4(this.b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o10);
        sb2.append(" contents=\"");
        return a9.p.p(sb2, concat, "\">");
    }
}
