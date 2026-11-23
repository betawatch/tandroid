package ai;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f2 b;

    public /* synthetic */ x1(f2 f2Var, int i7) {
        this.a = i7;
        this.b = f2Var;
    }

    public final void a(final float f10) {
        switch (this.a) {
            case 0:
                final f2 f2Var = this.b;
                final int i7 = 0;
                f2Var.f.post(new Runnable() { // from class: ai.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                f2 f2Var2 = f2Var;
                                if (!f2Var2.j) {
                                    f2Var2.d.h(f10);
                                    break;
                                }
                                break;
                            default:
                                f2 f2Var3 = f2Var;
                                if (!f2Var3.j) {
                                    f2Var3.d.h(f10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final f2 f2Var2 = this.b;
                final int i10 = 1;
                f2Var2.f.post(new Runnable() { // from class: ai.w1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                f2 f2Var22 = f2Var2;
                                if (!f2Var22.j) {
                                    f2Var22.d.h(f10);
                                    break;
                                }
                                break;
                            default:
                                f2 f2Var3 = f2Var2;
                                if (!f2Var3.j) {
                                    f2Var3.d.h(f10);
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
