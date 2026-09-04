package i2;

import android.util.Pair;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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
