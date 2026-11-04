package com.google.android.gms.internal.cast;

import b8.ka;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class v4 implements Iterable, Serializable {
    public static final v4 c = new v4(i5.b);
    public int a = 0;
    public final byte[] b;

    static {
        int i3 = t4.a;
    }

    public v4(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static void k(int i3) {
        if (((i3 - 47) | 47) < 0) {
            throw new IndexOutOfBoundsException(k2.p1.i(i3, "End index: 47 >= "));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof v4) && j() == ((v4) obj).j()) {
            if (j() == 0) {
                return true;
            }
            if (!(obj instanceof v4)) {
                return obj.equals(this);
            }
            v4 v4Var = (v4) obj;
            int i3 = this.a;
            int i10 = v4Var.a;
            if (i3 == 0 || i10 == 0 || i3 == i10) {
                int j10 = j();
                if (j10 > v4Var.j()) {
                    throw new IllegalArgumentException("Length too large: " + j10 + j());
                }
                if (j10 > v4Var.j()) {
                    throw new IllegalArgumentException(a1.g.n(j10, v4Var.j(), "Ran off end of other: 0, ", ", "));
                }
                byte[] bArr = v4Var.b;
                int i11 = 0;
                int i12 = 0;
                while (i11 < j10) {
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

    public byte h(int i3) {
        return this.b[i3];
    }

    public final int hashCode() {
        int i3 = this.a;
        if (i3 != 0) {
            return i3;
        }
        int j10 = j();
        Charset charset = i5.a;
        int i10 = j10;
        for (int i11 = 0; i11 < j10; i11++) {
            i10 = (i10 * 31) + this.b[i11];
        }
        if (i10 == 0) {
            i10 = 1;
        }
        this.a = i10;
        return i10;
    }

    public byte i(int i3) {
        return this.b[i3];
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
        int j10 = j();
        if (j() <= 50) {
            concat = ka.a(this);
        } else {
            k(j());
            concat = ka.a(new u4(this.b)).concat("...");
        }
        StringBuilder sb2 = new StringBuilder("<ByteString@");
        sb2.append(hexString);
        sb2.append(" size=");
        sb2.append(j10);
        sb2.append(" contents=\"");
        return a1.g.s(sb2, concat, "\">");
    }
}
