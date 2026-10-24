package jd;

import java.util.RandomAccess;
import v7.s8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {
    public final c a;
    public final int b;
    public final int c;

    public b(c cVar, int i10, int i11) {
        this.a = cVar;
        this.b = i10;
        s8.a(i10, i11, cVar.h());
        this.c = i11 - i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a1.g.l(i10, i11, "index: ", ", size: "));
        }
        return this.a.get(this.b + i10);
    }

    @Override // jd.c
    public final int h() {
        return this.c;
    }
}
