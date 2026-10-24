package i2;

import android.util.Pair;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class b1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ u2.d0 d;

    public /* synthetic */ b1(e1 e1Var, Pair pair, u2.d0 d0Var, int i10) {
        this.a = i10;
        this.b = e1Var;
        this.c = pair;
        this.d = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.e eVar = this.b.b.h;
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                u2.h0 h0Var = (u2.h0) pair.second;
                h0Var.getClass();
                eVar.d(intValue, h0Var, this.d);
                break;
            default:
                j2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.e(((Integer) pair2.first).intValue(), (u2.h0) pair2.second, this.d);
                break;
        }
    }
}
