package ed;

import b8.rb;
import java.util.RandomAccess;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends d implements RandomAccess {
    public final d a;
    public final int b;
    public final int c;

    public c(d dVar, int i3, int i10) {
        this.a = dVar;
        this.b = i3;
        rb.a(i3, i10, dVar.h());
        this.c = i10 - i3;
    }

    @Override // java.util.List
    public final Object get(int i3) {
        int i10 = this.c;
        if (i3 < 0 || i3 >= i10) {
            throw new IndexOutOfBoundsException(a1.g.n(i3, i10, "index: ", ", size: "));
        }
        return this.a.get(this.b + i3);
    }

    @Override // ed.d
    public final int h() {
        return this.c;
    }
}
