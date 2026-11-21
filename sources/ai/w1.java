package ai;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e2 b;

    public /* synthetic */ w1(e2 e2Var, int i7) {
        this.a = i7;
        this.b = e2Var;
    }

    public final void a(final float f10) {
        switch (this.a) {
            case 0:
                final e2 e2Var = this.b;
                final int i7 = 0;
                e2Var.f.post(new Runnable() { // from class: ai.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                e2 e2Var2 = e2Var;
                                if (!e2Var2.j) {
                                    e2Var2.d.h(f10);
                                    break;
                                }
                                break;
                            default:
                                e2 e2Var3 = e2Var;
                                if (!e2Var3.j) {
                                    e2Var3.d.h(f10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final e2 e2Var2 = this.b;
                final int i10 = 1;
                e2Var2.f.post(new Runnable() { // from class: ai.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                e2 e2Var22 = e2Var2;
                                if (!e2Var22.j) {
                                    e2Var22.d.h(f10);
                                    break;
                                }
                                break;
                            default:
                                e2 e2Var3 = e2Var2;
                                if (!e2Var3.j) {
                                    e2Var3.d.h(f10);
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
