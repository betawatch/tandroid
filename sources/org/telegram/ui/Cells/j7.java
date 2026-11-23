package org.telegram.ui.Cells;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ j7(l7 l7Var, int i7) {
        this.a = i7;
        this.b = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                l7 l7Var = this.b;
                l7Var.post(new j7(l7Var, 1));
                break;
            default:
                l7 l7Var2 = this.b;
                l7Var2.c0.N0 = true;
                l7Var2.I.clear();
                l7Var2.J.clear();
                l7Var2.K.clear();
                l7Var2.invalidate();
                break;
        }
    }
}
