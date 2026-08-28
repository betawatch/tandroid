package com.google.android.gms.internal.play_billing;

import f7.f6;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class l1 implements Iterable, Serializable {
    public static final l1 c = new l1(a2.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i9 = g1.a;
    }

    public l1(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int p(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException(j3.r0.m(i9, "Beginning index: ", " < 0"));
        }
        if (i10 < i9) {
            throw new IndexOutOfBoundsException(aa.d.k(i9, i10, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(aa.d.k(i10, i11, "End index: ", " >= "));
    }

    public static l1 q(int i9, int i10, byte[] bArr) {
        p(i9, i9 + i10, bArr.length);
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, i9, bArr2, 0, i10);
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
            int i9 = this.a;
            int i10 = l1Var.a;
            if (i9 == 0 || i10 == 0 || i9 == i10) {
                int o6 = o();
                if (o6 > l1Var.o()) {
                    throw new IllegalArgumentException("Length too large: " + o6 + o());
                }
                if (o6 > l1Var.o()) {
                    throw new IllegalArgumentException(aa.d.k(o6, l1Var.o(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = l1Var.b;
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
            concat = f6.a(this);
        } else {
            int p6 = p(0, 47, o());
            concat = f6.a(p6 == 0 ? c : new k1(this.b, p6)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(o6);
        sb2.append(" contents=\"");
        return aa.d.r(sb2, concat, "\">");
    }
}
