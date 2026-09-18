package i2;

import android.util.Pair;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ z0(c1 c1Var, Pair pair, int i10) {
        this.a = i10;
        this.b = c1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.f fVar = this.b.b.h;
                Pair pair = this.c;
                fVar.k(((Integer) pair.first).intValue(), (u2.f0) pair.second);
                break;
            case 1:
                j2.f fVar2 = this.b.b.h;
                Pair pair2 = this.c;
                fVar2.g(((Integer) pair2.first).intValue(), (u2.f0) pair2.second);
                break;
            default:
                j2.f fVar3 = this.b.b.h;
                Pair pair3 = this.c;
                fVar3.i(((Integer) pair3.first).intValue(), (u2.f0) pair3.second);
                break;
        }
    }
}
