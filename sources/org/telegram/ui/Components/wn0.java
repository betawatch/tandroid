package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zo0 b;

    public /* synthetic */ wn0(zo0 zo0Var, int i7) {
        this.a = i7;
        this.b = zo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zo0 zo0Var = this.b;
                zo0Var.w2 = true;
                c10 c10Var = zo0Var.u2;
                c10Var.r.setText("");
                org.telegram.messenger.g0.I3(c10Var.r);
                break;
            default:
                ne neVar = new ne(11);
                zo0 zo0Var2 = this.b;
                if (!zo0Var2.d) {
                    neVar.run();
                    break;
                } else {
                    c10 c10Var2 = zo0Var2.u2;
                    if (c10Var2 != null) {
                        org.telegram.messenger.g0.v1(c10Var2.r);
                    }
                    org.telegram.messenger.g0.h3(neVar, 300L);
                    break;
                }
        }
    }
}
