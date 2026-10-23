package i2;

import android.util.Pair;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class c1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ u2.v d;
    public final /* synthetic */ u2.d0 e;

    public /* synthetic */ c1(e1 e1Var, Pair pair, u2.v vVar, u2.d0 d0Var, int i10) {
        this.a = i10;
        this.b = e1Var;
        this.c = pair;
        this.d = vVar;
        this.e = d0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.e eVar = this.b.b.h;
                Pair pair = this.c;
                eVar.k(((Integer) pair.first).intValue(), (u2.h0) pair.second, this.d, this.e);
                break;
            default:
                j2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.f(((Integer) pair2.first).intValue(), (u2.h0) pair2.second, this.d, this.e);
                break;
        }
    }
}
