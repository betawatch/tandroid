package kh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class v1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x1 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ v1(x1 x1Var, boolean z4, int i10) {
        this.a = i10;
        this.b = x1Var;
        this.c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z4 = this.c;
                x1 x1Var = this.b;
                if (!z4) {
                    x1Var.D.setVisibility(8);
                    break;
                } else {
                    x1Var.getClass();
                    break;
                }
            default:
                boolean z10 = this.c;
                x1 x1Var2 = this.b;
                if (!z10) {
                    x1Var2.v.setVisibility(8);
                    break;
                } else {
                    x1Var2.getClass();
                    break;
                }
        }
    }
}
