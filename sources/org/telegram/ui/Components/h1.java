package org.telegram.ui.Components;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class h1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a5 b;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 c;
    public final /* synthetic */ org.telegram.ui.ActionBar.g2 d;

    public /* synthetic */ h1(a5 a5Var, org.telegram.ui.ActionBar.t1 t1Var, org.telegram.ui.ActionBar.g2 g2Var, int i7) {
        this.a = i7;
        this.b = a5Var;
        this.c = t1Var;
        this.d = g2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.messenger.g0.g3(new h1(this.b, this.c, this.d, 1));
                break;
            default:
                b5.b0(this.b, this.c, this.d);
                break;
        }
    }
}
