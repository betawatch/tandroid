package hd;

import a8.p0;
import c8.b0;
import java.util.RandomAccess;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes.dex */
public final class b extends c implements RandomAccess {
    public final c a;
    public final int b;
    public final int c;

    public b(c cVar, int i7, int i10) {
        this.a = cVar;
        this.b = i7;
        b0.a(i7, i10, cVar.f());
        this.c = i10 - i7;
    }

    @Override // hd.c
    public final int f() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i7) {
        int i10 = this.c;
        if (i7 < 0 || i7 >= i10) {
            throw new IndexOutOfBoundsException(p0.m(i7, i10, "index: ", ", size: "));
        }
        return this.a.get(this.b + i7);
    }
}
