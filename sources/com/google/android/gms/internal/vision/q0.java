package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public class q0 implements Serializable, Iterable {
    public static final q0 c = new q0(j1.b);
    public static final h0 d;
    public int a = 0;
    public final byte[] b;

    static {
        d = m0.a() ? new h0(2) : new h0(1);
    }

    public q0(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static q0 j(int i7, int i10, byte[] bArr) {
        byte[] copyOfRange;
        l(i7, i7 + i10, bArr.length);
        switch (d.a) {
            case 1:
                copyOfRange = Arrays.copyOfRange(bArr, i7, i10 + i7);
                break;
            default:
                copyOfRange = new byte[i10];
                System.arraycopy(bArr, i7, copyOfRange, 0, i10);
                break;
        }
        return new q0(copyOfRange);
    }

    public static int l(int i7, int i10, int i11) {
        int i12 = i10 - i7;
        if ((i7 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i7 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i7);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i10 < i7) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i7);
            sb3.append(", ");
            sb3.append(i10);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("End index: ");
        sb4.append(i10);
        sb4.append(" >= ");
        sb4.append(i11);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0) || i() != ((q0) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return obj.equals(this);
        }
        q0 q0Var = (q0) obj;
        int i7 = this.a;
        int i10 = q0Var.a;
        if (i7 != 0 && i10 != 0 && i7 != i10) {
            return false;
        }
        int i11 = i();
        if (i11 > q0Var.i()) {
            int i12 = i();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(i12);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (i11 > q0Var.i()) {
            int i13 = q0Var.i();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(i13);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = q0Var.b;
        int m10 = m() + i11;
        int m11 = m();
        int m12 = q0Var.m();
        while (m11 < m10) {
            if (this.b[m11] != bArr[m12]) {
                return false;
            }
            m11++;
            m12++;
        }
        return true;
    }

    public byte f(int i7) {
        return this.b[i7];
    }

    public final int hashCode() {
        int i7 = this.a;
        if (i7 != 0) {
            return i7;
        }
        int i10 = i();
        int m10 = m();
        int i11 = i10;
        for (int i12 = m10; i12 < m10 + i10; i12++) {
            i11 = (i11 * 31) + this.b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.a = i11;
        return i11;
    }

    public int i() {
        return this.b.length;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new androidx.datastore.preferences.protobuf.e(this);
    }

    public byte k(int i7) {
        return this.b[i7];
    }

    public int m() {
        return 0;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int i7 = i();
        if (i() <= 50) {
            concat = e1.k(this);
        } else {
            int l10 = l(0, 47, i());
            concat = String.valueOf(e1.k(l10 == 0 ? c : new p0(this.b, m(), l10))).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(i7);
        sb2.append(" contents=\"");
        return a8.p0.s(sb2, concat, "\">");
    }
}
