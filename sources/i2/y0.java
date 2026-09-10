package i2;

import android.util.Pair;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ y0(b1 b1Var, Pair pair, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.e eVar = this.b.b.h;
                Pair pair = this.c;
                eVar.k(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                break;
            case 1:
                j2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.g(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                break;
            default:
                j2.e eVar3 = this.b.b.h;
                Pair pair3 = this.c;
                eVar3.i(((Integer) pair3.first).intValue(), (u2.g0) pair3.second);
                break;
        }
    }
}
