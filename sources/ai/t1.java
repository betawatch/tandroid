package ai;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class t1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2 b;

    public /* synthetic */ t1(b2 b2Var, int i7) {
        this.a = i7;
        this.b = b2Var;
    }

    public final void a(final float f10) {
        switch (this.a) {
            case 0:
                final b2 b2Var = this.b;
                final int i7 = 0;
                b2Var.f.post(new Runnable() { // from class: ai.s1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                b2 b2Var2 = b2Var;
                                if (!b2Var2.j) {
                                    b2Var2.d.h(f10);
                                    break;
                                }
                                break;
                            default:
                                b2 b2Var3 = b2Var;
                                if (!b2Var3.j) {
                                    b2Var3.d.h(f10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final b2 b2Var2 = this.b;
                final int i10 = 1;
                b2Var2.f.post(new Runnable() { // from class: ai.s1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                b2 b2Var22 = b2Var2;
                                if (!b2Var22.j) {
                                    b2Var22.d.h(f10);
                                    break;
                                }
                                break;
                            default:
                                b2 b2Var3 = b2Var2;
                                if (!b2Var3.j) {
                                    b2Var3.d.h(f10);
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
