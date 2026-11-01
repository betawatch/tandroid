package i2;

import android.util.Pair;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ f1(i1 i1Var, Pair pair, int i10) {
        this.a = i10;
        this.b = i1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.g gVar = this.b.b.h;
                Pair pair = this.c;
                gVar.E(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                break;
            default:
                j2.g gVar2 = this.b.b.h;
                Pair pair2 = this.c;
                gVar2.J(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                break;
        }
    }
}
