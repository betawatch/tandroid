package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t60 b;

    public /* synthetic */ j60(t60 t60Var, int i10) {
        this.a = i10;
        this.b = t60Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.finishFragment();
                break;
            case 1:
                t60 t60Var = this.b;
                t60Var.j0();
                t60Var.f0();
                break;
            case 2:
                t60 t60Var2 = this.b;
                t60Var2.getClass();
                t60Var2.presentFragment(new PremiumPreviewFragment(0, "noncontacts"));
                break;
            default:
                t60 t60Var3 = this.b;
                t60Var3.n.postOnAnimation(new j60(t60Var3, 1));
                break;
        }
    }
}
