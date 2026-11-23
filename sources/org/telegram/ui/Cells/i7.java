package org.telegram.ui.Cells;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ k7 b;

    public /* synthetic */ i7(k7 k7Var, int i7) {
        this.a = i7;
        this.b = k7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                k7 k7Var = this.b;
                k7Var.post(new i7(k7Var, 1));
                break;
            default:
                k7 k7Var2 = this.b;
                k7Var2.c0.N0 = true;
                k7Var2.I.clear();
                k7Var2.J.clear();
                k7Var2.K.clear();
                k7Var2.invalidate();
                break;
        }
    }
}
