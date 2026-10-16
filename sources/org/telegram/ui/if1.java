package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class if1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kg1 b;

    public /* synthetic */ if1(kg1 kg1Var, int i10) {
        this.a = i10;
        this.b = kg1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kg1 kg1Var = this.b;
                kg1Var.x0();
                kg1Var.B0();
                break;
            case 1:
                this.b.x0();
                break;
            case 2:
                this.b.O0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                kg1 kg1Var2 = this.b;
                kg1Var2.A0 = null;
                kg1Var2.U0(true, false);
                break;
            default:
                kg1 kg1Var3 = this.b;
                kg1Var3.N.postOnAnimation(new if1(kg1Var3, 1));
                break;
        }
    }
}
