package oi;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ f1 b;

    public /* synthetic */ y0(f1 f1Var, int i7) {
        this.a = i7;
        this.b = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                f1 f1Var = this.b;
                i4 i4Var = f1Var.L2;
                if (i4Var != null && f1Var.f2 != null) {
                    f1Var.M2 = true;
                    i4Var.b().a.n(false);
                    try {
                        f1Var.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    ((s2) f1Var.f2).a(f1Var, f1Var.L2, true);
                    break;
                }
                break;
            case 1:
                this.b.K();
                break;
            default:
                this.b.P();
                break;
        }
    }
}
