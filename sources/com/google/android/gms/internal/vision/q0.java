package com.google.android.gms.internal.vision;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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

    public static q0 o(int i10, int i11, byte[] bArr) {
        byte[] copyOfRange;
        q(i10, i10 + i11, bArr.length);
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

    public static int q(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Beginning index: ");
            sb.append(i10);
            sb.append(" < 0");
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (i11 < i10) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Beginning index larger than ending index: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(37);
        sb3.append("End index: ");
        sb3.append(i11);
        sb3.append(" >= ");
        sb3.append(i12);
        throw new IndexOutOfBoundsException(sb3.toString());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q0) || n() != ((q0) obj).n()) {
            return false;
        }
        if (n() == 0) {
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
        int n10 = n();
        if (n10 > q0Var.n()) {
            int n11 = n();
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(n10);
            sb.append(n11);
            throw new IllegalArgumentException(sb.toString());
        }
        if (n10 > q0Var.n()) {
            int n12 = q0Var.n();
            StringBuilder sb2 = new StringBuilder(59);
            sb2.append("Ran off end of other: 0, ");
            sb2.append(n10);
            sb2.append(", ");
            sb2.append(n12);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = q0Var.b;
        int r10 = r() + n10;
        int r11 = r();
        int r12 = q0Var.r();
        while (r11 < r10) {
            if (this.b[r11] != bArr[r12]) {
                return false;
            }
            r11++;
            r12++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.a;
        if (i10 != 0) {
            return i10;
        }
        int n10 = n();
        int r10 = r();
        int i11 = n10;
        for (int i12 = r10; i12 < r10 + n10; i12++) {
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

    public int n() {
        return this.b.length;
    }

    public byte p(int i10) {
        return this.b[i10];
    }

    public int r() {
        return 0;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int n10 = n();
        if (n() <= 50) {
            concat = e1.k(this);
        } else {
            int q10 = q(0, 47, n());
            concat = String.valueOf(e1.k(q10 == 0 ? c : new p0(this.b, r(), q10))).concat("...");
        }
        StringBuilder sb = new StringBuilder("<ByteString@");
        sb.append(hexString);
        sb.append(" size=");
        sb.append(n10);
        sb.append(" contents=\"");
        return android.support.v4.media.a.r(sb, concat, "\">");
    }
}
