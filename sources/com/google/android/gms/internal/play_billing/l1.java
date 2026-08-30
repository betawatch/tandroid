package com.google.android.gms.internal.play_billing;

import j7.v6;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public static int p(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(kh.a2.k(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(android.support.v4.media.a.k(i11, i12, "End index: ", " >= "));
    }

    public static l1 q(int i10, int i11, byte[] bArr) {
        p(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new l1(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof l1) && o() == ((l1) obj).o()) {
            if (o() == 0) {
                return true;
            }
            if (!(obj instanceof l1)) {
                return obj.equals(this);
            }
            l1 l1Var = (l1) obj;
            int i10 = this.a;
            int i11 = l1Var.a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int o10 = o();
                if (o10 > l1Var.o()) {
                    throw new IllegalArgumentException("Length too large: " + o10 + o());
                }
                if (o10 > l1Var.o()) {
                    throw new IllegalArgumentException(android.support.v4.media.a.k(o10, l1Var.o(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = l1Var.b;
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
            concat = v6.a(this);
        } else {
            int p10 = p(0, 47, o());
            concat = v6.a(p10 == 0 ? c : new k1(this.b, p10)).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(o10);
        sb.append(" contents=\"");
        return android.support.v4.media.a.r(sb, concat, "\">");
    }
}
