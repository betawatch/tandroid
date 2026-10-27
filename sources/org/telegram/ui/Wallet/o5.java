package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r5 b;

    public /* synthetic */ o5(r5 r5Var, int i10) {
        this.a = i10;
        this.b = r5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                r5 r5Var = this.b;
                r5Var.h.invalidate();
                r5Var.n.invalidate();
                r5Var.e.invalidate();
                break;
        }
    }
}
