package i0;

import ab.y;
import android.graphics.Insets;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class c {
    public static final c e = new c(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public c(int i7, int i10, int i11, int i12) {
        this.a = i7;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public static c a(c cVar, c cVar2) {
        return b(Math.max(cVar.a, cVar2.a), Math.max(cVar.b, cVar2.b), Math.max(cVar.c, cVar2.c), Math.max(cVar.d, cVar2.d));
    }

    public static c b(int i7, int i10, int i11, int i12) {
        return (i7 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? e : new c(i7, i10, i11, i12);
    }

    public static c c(Insets insets) {
        int i7;
        int i10;
        int i11;
        int i12;
        i7 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return b(i7, i10, i11, i12);
    }

    public final Insets d() {
        return y.i(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.d == cVar.d && this.a == cVar.a && this.c == cVar.c && this.b == cVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
