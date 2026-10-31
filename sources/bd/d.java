package bd;

import java.util.RandomAccess;
import v7.f0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d extends e implements RandomAccess {
    public final e a;
    public final int b;
    public final int c;

    public d(e eVar, int i10, int i11) {
        this.a = eVar;
        this.b = i10;
        f0.a(i10, i11, eVar.l());
        this.c = i11 - i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        int i11 = this.c;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(a1.g.j(i10, i11, "index: ", ", size: "));
        }
        return this.a.get(this.b + i10);
    }

    @Override // bd.e
    public final int l() {
        return this.c;
    }
}
