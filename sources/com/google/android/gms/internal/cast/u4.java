package com.google.android.gms.internal.cast;

import a8.z8;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public class u4 implements Iterable, Serializable {
    public static final u4 c = new u4(h5.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i7 = s4.a;
    }

    public u4(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void k(int i7) {
        if (((i7 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(jg.g.j(i7, "End index: 47 >= "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof u4) && j() == ((u4) obj).j()) {
            if (j() == 0) {
                return true;
            }
            if (!(obj instanceof u4)) {
                return obj.equals(this);
            }
            u4 u4Var = (u4) obj;
            int i7 = this.a;
            int i10 = u4Var.a;
            if (i7 == 0 || i10 == 0 || i7 == i10) {
                int j3 = j();
                if (j3 > u4Var.j()) {
                    throw new IllegalArgumentException("Length too large: " + j3 + j());
                }
                if (j3 > u4Var.j()) {
                    throw new IllegalArgumentException(a8.p0.m(j3, u4Var.j(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = u4Var.b;
                int i11 = 0;
                int i12 = 0;
                while (i11 < j3) {
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

    public byte f(int i7) {
        return this.b[i7];
    }

    public final int hashCode() {
        int i7 = this.a;
        if (i7 != 0) {
            return i7;
        }
        int j3 = j();
        Charset charset = h5.a;
        int i10 = j3;
        for (int i11 = 0; i11 < j3; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.a = i10;
        return i10;
    }

    public byte i(int i7) {
        return this.b[i7];
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public int j() {
        return this.b.length;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int j3 = j();
        if (j() <= 50) {
            concat = z8.a(this);
        } else {
            k(j());
            concat = z8.a(new t4(this.b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(j3);
        sb2.append(" contents=\"");
        return a8.p0.s(sb2, concat, "\">");
    }
}
