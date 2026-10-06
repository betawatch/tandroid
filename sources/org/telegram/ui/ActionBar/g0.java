package org.telegram.ui.ActionBar;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ v0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ g0(v0 v0Var, int i10, int i11) {
        this.a = i11;
        this.b = v0Var;
        this.c = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                v0 v0Var = this.b;
                if (v0Var.b.getSwipeBack() != null) {
                    v0Var.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
            default:
                v0 v0Var2 = this.b;
                if (v0Var2.b.getSwipeBack() != null) {
                    v0Var2.b.getSwipeBack().e(this.c);
                    break;
                }
                break;
        }
    }
}
