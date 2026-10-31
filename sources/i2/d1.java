package i2;

import android.util.Pair;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class d1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ u2.c0 d;

    public /* synthetic */ d1(i1 i1Var, Pair pair, u2.c0 c0Var, int i10) {
        this.a = i10;
        this.b = i1Var;
        this.c = pair;
        this.d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.g gVar = this.b.b.h;
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                u2.g0 g0Var = (u2.g0) pair.second;
                g0Var.getClass();
                gVar.n(intValue, g0Var, this.d);
                break;
            default:
                j2.g gVar2 = this.b.b.h;
                Pair pair2 = this.c;
                gVar2.r(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d);
                break;
        }
    }
}
