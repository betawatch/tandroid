package i2;

import android.util.Pair;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ f1(g1 g1Var, Pair pair, int i10) {
        this.a = i10;
        this.b = g1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.e eVar = this.b.b.h;
                Pair pair = this.c;
                eVar.g(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                break;
            default:
                j2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.i(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                break;
        }
    }
}
