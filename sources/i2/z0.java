package i2;

import android.util.Pair;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes.dex */
public final /* synthetic */ class z0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d1 b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ u2.b0 d;

    public /* synthetic */ z0(d1 d1Var, Pair pair, u2.b0 b0Var, int i10) {
        this.a = i10;
        this.b = d1Var;
        this.c = pair;
        this.d = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                j2.f fVar = this.b.b.h;
                Pair pair = this.c;
                int intValue = ((Integer) pair.first).intValue();
                u2.f0 f0Var = (u2.f0) pair.second;
                f0Var.getClass();
                fVar.c(intValue, f0Var, this.d);
                break;
            default:
                j2.f fVar2 = this.b.b.h;
                Pair pair2 = this.c;
                fVar2.d(((Integer) pair2.first).intValue(), (u2.f0) pair2.second, this.d);
                break;
        }
    }
}
