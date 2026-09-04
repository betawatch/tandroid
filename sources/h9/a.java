package h9;

import java.io.Serializable;
import v7.t6;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class a implements Serializable {
    public static final /* synthetic */ int c = 0;
    public final int[] a;
    public final int b;

    static {
        new a(new int[0]);
    }

    public a(int[] iArr) {
        int length = iArr.length;
        this.a = iArr;
        this.b = length;
    }

    public final boolean equals(Object obj) {
        a aVar;
        int i10;
        int i11;
        if (obj == this) {
            return true;
        }
        if ((obj instanceof a) && (i11 = this.b) == (i10 = (aVar = (a) obj).b)) {
            for (int i12 = 0; i12 < i11; i12++) {
                t6.c(i12, i11);
                int i13 = this.a[i12];
                t6.c(i12, i10);
                if (i13 == aVar.a[i12]) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.b; i11++) {
            i10 = (i10 * 31) + this.a[i11];
        }
        return i10;
    }

    public final String toString() {
        int i10 = this.b;
        if (i10 == 0) {
            return "[]";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 5);
        sb2.append('[');
        int[] iArr = this.a;
        sb2.append(iArr[0]);
        for (int i11 = 1; i11 < i10; i11++) {
            sb2.append(", ");
            sb2.append(iArr[i11]);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
