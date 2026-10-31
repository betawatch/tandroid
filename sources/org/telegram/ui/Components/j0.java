package org.telegram.ui.Components;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.y2 b;

    public /* synthetic */ j0(org.telegram.ui.ActionBar.y2 y2Var, int i10) {
        this.a = i10;
        this.b = y2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidateSelf();
                break;
            default:
                org.telegram.ui.ActionBar.y2 y2Var = this.b;
                ((t5) y2Var.d).e(true, 0.0f);
                y2Var.invalidateSelf();
                break;
        }
    }
}
