package i2;

import android.util.Pair;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class x0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ u2.c0 d;

    public /* synthetic */ x0(b1 b1Var, Pair pair, u2.c0 c0Var, int i10) {
        this.a = i10;
        this.b = b1Var;
        this.c = pair;
        this.d = c0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.e eVar = this.b.b.h;
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                u2.g0 g0Var = (u2.g0) pair.second;
                g0Var.getClass();
                eVar.c(intValue, g0Var, this.d);
                break;
            default:
                j2.e eVar2 = this.b.b.h;
                Pair pair2 = this.c;
                eVar2.d(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, this.d);
                break;
        }
    }
}
