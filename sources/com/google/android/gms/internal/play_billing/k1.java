package com.google.android.gms.internal.play_billing;

import h7.r6;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public class k1 implements Iterable, Serializable {
    public static final k1 c = new k1(z1.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i10 = g1.a;
    }

    public k1(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int p(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(j7.l1.l(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(a4.w.k(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(a4.w.k(i11, i12, "End index: ", " >= "));
    }

    public static k1 q(int i10, int i11, byte[] bArr) {
        p(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new k1(bArr2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof k1) && o() == ((k1) obj).o()) {
            if (o() == 0) {
                return true;
            }
            if (!(obj instanceof k1)) {
                return obj.equals(this);
            }
            k1 k1Var = (k1) obj;
            int i10 = this.a;
            int i11 = k1Var.a;
            if (i10 == 0 || i11 == 0 || i10 == i11) {
                int o10 = o();
                if (o10 > k1Var.o()) {
                    throw new IllegalArgumentException("Length too large: " + o10 + o());
                }
                if (o10 > k1Var.o()) {
                    throw new IllegalArgumentException(a4.w.k(o10, k1Var.o(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = k1Var.b;
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
            concat = r6.a(this);
        } else {
            int p10 = p(0, 47, o());
            concat = r6.a(p10 == 0 ? c : new j1(this.b, p10)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o10);
        sb2.append(" contents=\"");
        return a4.w.q(sb2, concat, "\">");
    }
}
