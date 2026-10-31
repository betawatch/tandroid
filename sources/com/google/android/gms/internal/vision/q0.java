package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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

    public static q0 n(int i10, int i11, byte[] bArr) {
        byte[] copyOfRange;
        p(i10, i10 + i11, bArr.length);
        switch (d.a) {
            case 1:
                copyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                copyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, copyOfRange, 0, i11);
                break;
        }
        return new q0(copyOfRange);
    }

    public static int p(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0) || m() != ((q0) obj).m()) {
            return false;
        }
        if (m() == 0) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return obj.equals(this);
        }
        q0 q0Var = (q0) obj;
        int i10 = this.a;
        int i11 = q0Var.a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int m10 = m();
        if (m10 > q0Var.m()) {
            int m11 = m();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(m10);
            sb2.append(m11);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (m10 > q0Var.m()) {
            int m12 = q0Var.m();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(m10);
            sb3.append(", ");
            sb3.append(m12);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = q0Var.b;
        int q6 = q() + m10;
        int q10 = q();
        int q11 = q0Var.q();
        while (q10 < q6) {
            if (this.b[q10] != bArr[q11]) {
                return false;
            }
            q10++;
            q11++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int m10 = m();
        int q6 = q();
        int i11 = m10;
        for (int i12 = q6; i12 < q6 + m10; i12++) {
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

    public int m() {
        return this.b.length;
    }

    public byte o(int i10) {
        return this.b[i10];
    }

    public int q() {
        return 0;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int m10 = m();
        if (m() <= 50) {
            concat = e1.k(this);
        } else {
            int p5 = p(0, 47, m());
            concat = String.valueOf(e1.k(p5 == 0 ? c : new p0(this.b, q(), p5))).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(m10);
        sb2.append(" contents=\"");
        return a1.g.r(sb2, concat, "\">");
    }
}
