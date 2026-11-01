package bd;

import java.util.RandomAccess;
import v7.f0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
