package c4;

import h5.w;
import r3.l;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class e {
    public final int a;
    public final long b;

    public /* synthetic */ e(int i10, long j10, boolean z4) {
        this.a = i10;
        this.b = j10;
    }

    public static e b(l lVar, w wVar) {
        lVar.c(0, 8, wVar.a);
        wVar.F(0);
        return new e(wVar.g(), wVar.l(), false);
    }

    public boolean a() {
        int i10 = this.a;
        return i10 == 0 || i10 == 1;
    }

    public e(int i10, long j10) {
        h5.a.f(j10 >= 0);
        this.a = i10;
        this.b = j10;
    }
}
