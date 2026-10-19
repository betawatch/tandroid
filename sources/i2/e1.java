package i2;

import android.util.Pair;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ e1(f1 f1Var, Pair pair, int i10) {
        this.a = i10;
        this.b = f1Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.f fVar = this.b.b.h;
                Pair pair = this.c;
                fVar.h(((Integer) pair.first).intValue(), (u2.g0) pair.second);
                break;
            default:
                j2.f fVar2 = this.b.b.h;
                Pair pair2 = this.c;
                fVar2.j(((Integer) pair2.first).intValue(), (u2.g0) pair2.second);
                break;
        }
    }
}
