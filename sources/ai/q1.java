package ai;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w1 b;

    public /* synthetic */ q1(w1 w1Var, int i7) {
        this.a = i7;
        this.b = w1Var;
    }

    public final void a(final float f10) {
        switch (this.a) {
            case 0:
                final w1 w1Var = this.b;
                final int i7 = 0;
                w1Var.e.post(new Runnable() { // from class: ai.p1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                w1 w1Var2 = w1Var;
                                if (!w1Var2.h) {
                                    w1Var2.c.f(f10);
                                    break;
                                }
                                break;
                            default:
                                w1 w1Var3 = w1Var;
                                if (!w1Var3.h) {
                                    w1Var3.c.f(f10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final w1 w1Var2 = this.b;
                final int i10 = 1;
                w1Var2.e.post(new Runnable() { // from class: ai.p1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                w1 w1Var22 = w1Var2;
                                if (!w1Var22.h) {
                                    w1Var22.c.f(f10);
                                    break;
                                }
                                break;
                            default:
                                w1 w1Var3 = w1Var2;
                                if (!w1Var3.h) {
                                    w1Var3.c.f(f10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
