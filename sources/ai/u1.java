package ai;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class u1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ c2 b;

    public /* synthetic */ u1(c2 c2Var, int i7) {
        this.a = i7;
        this.b = c2Var;
    }

    public final void a(final float f10) {
        switch (this.a) {
            case 0:
                final c2 c2Var = this.b;
                final int i7 = 0;
                c2Var.f.post(new Runnable() { // from class: ai.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                c2 c2Var2 = c2Var;
                                if (!c2Var2.j) {
                                    c2Var2.d.h(f10);
                                    break;
                                }
                                break;
                            default:
                                c2 c2Var3 = c2Var;
                                if (!c2Var3.j) {
                                    c2Var3.d.h(f10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final c2 c2Var2 = this.b;
                final int i10 = 1;
                c2Var2.f.post(new Runnable() { // from class: ai.t1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                c2 c2Var22 = c2Var2;
                                if (!c2Var22.j) {
                                    c2Var22.d.h(f10);
                                    break;
                                }
                                break;
                            default:
                                c2 c2Var3 = c2Var2;
                                if (!c2Var3.j) {
                                    c2Var3.d.h(f10);
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
