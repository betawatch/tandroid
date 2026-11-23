package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class jx0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lx0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ jx0(lx0 lx0Var, int i7, int i10) {
        this.a = i10;
        this.b = lx0Var;
        this.c = i7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lx0 lx0Var = this.b;
                org.telegram.ui.Components.j71 j71Var = lx0Var.b;
                kx0 kx0Var = lx0Var.d;
                int i7 = this.c;
                j71Var.e(i7, kx0Var.i(i7));
                break;
            default:
                lx0 lx0Var2 = this.b;
                org.telegram.ui.Components.j71 j71Var2 = lx0Var2.b;
                kx0 kx0Var2 = lx0Var2.d;
                int i10 = this.c;
                j71Var2.e(i10, kx0Var2.i(i10));
                break;
        }
    }
}
