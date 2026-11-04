package i0;

import android.graphics.Insets;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b {
    public static final b e = new b(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public b(int i3, int i10, int i11, int i12) {
        this.a = i3;
        this.b = i10;
        this.c = i11;
        this.d = i12;
    }

    public static b a(b bVar, b bVar2) {
        return b(Math.max(bVar.a, bVar2.a), Math.max(bVar.b, bVar2.b), Math.max(bVar.c, bVar2.c), Math.max(bVar.d, bVar2.d));
    }

    public static b b(int i3, int i10, int i11, int i12) {
        return (i3 == 0 && i10 == 0 && i11 == 0 && i12 == 0) ? e : new b(i3, i10, i11, i12);
    }

    public static b c(Insets insets) {
        int i3;
        int i10;
        int i11;
        int i12;
        i3 = insets.left;
        i10 = insets.top;
        i11 = insets.right;
        i12 = insets.bottom;
        return b(i3, i10, i11, i12);
    }

    public final Insets d() {
        return d2.d.i(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.d == bVar.d && this.a == bVar.a && this.c == bVar.c && this.b == bVar.b;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
