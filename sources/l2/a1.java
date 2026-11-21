package l2;

import android.util.Pair;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ x2.u d;
    public final /* synthetic */ x2.c0 e;

    public /* synthetic */ a1(c1 c1Var, Pair pair, x2.u uVar, x2.c0 c0Var, int i7) {
        this.a = i7;
        this.b = c1Var;
        this.c = pair;
        this.d = uVar;
        this.e = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m2.d dVar = this.b.b.h;
                Pair pair = this.c;
                dVar.A(((Integer) pair.first).intValue(), (x2.g0) pair.second, this.d, this.e);
                break;
            default:
                m2.d dVar2 = this.b.b.h;
                Pair pair2 = this.c;
                dVar2.G(((Integer) pair2.first).intValue(), (x2.g0) pair2.second, this.d, this.e);
                break;
        }
    }
}
