package com.google.android.gms.internal.play_billing;

import a8.j9;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class l1 implements Iterable, Serializable {
    public static final l1 c = new l1(a2.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i7 = g1.a;
    }

    public l1(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int k(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            throw new IndexOutOfBoundsException(jg.g.k(i7, "Beginning index: ", " < 0"));
        }
        if (i10 < i7) {
            throw new IndexOutOfBoundsException(a8.p0.m(i7, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a8.p0.m(i10, i11, "End index: ", " >= "));
    }

    public static l1 l(int i7, int i10, byte[] bArr) {
        k(i7, i7 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i7, bArr2, 0, i10);
        return new l1(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof l1) && j() == ((l1) obj).j()) {
            if (j() == 0) {
                return true;
            }
            if (!(obj instanceof l1)) {
                return obj.equals(this);
            }
            l1 l1Var = (l1) obj;
            int i7 = this.a;
            int i10 = l1Var.a;
            if (i7 == 0 || i10 == 0 || i7 == i10) {
                int j3 = j();
                if (j3 > l1Var.j()) {
                    throw new IllegalArgumentException("Length too large: " + j3 + j());
                }
                if (j3 > l1Var.j()) {
                    throw new IllegalArgumentException(a8.p0.m(j3, l1Var.j(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = l1Var.b;
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
            concat = j9.a(this);
        } else {
            int k10 = k(0, 47, j());
            concat = j9.a(k10 == 0 ? c : new k1(this.b, k10)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(j3);
        sb2.append(" contents=\"");
        return a8.p0.s(sb2, concat, "\">");
    }
}
