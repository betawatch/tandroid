package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ org.telegram.ui.Components.kk0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ke(cn cnVar, org.telegram.ui.Components.kk0 kk0Var, String str, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = kk0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.hc a02;
        int i7;
        int i10 = this.a;
        String str = this.d;
        org.telegram.ui.Components.kk0 kk0Var = this.c;
        cn cnVar = this.b;
        switch (i10) {
            case 0:
                kk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(cnVar);
                i7 = 2131746335;
                break;
            case 1:
                kk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(cnVar);
                i7 = 2131743201;
                break;
            case 2:
                kk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(cnVar);
                i7 = 2131752553;
                break;
            default:
                kk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.hc.a0(cnVar);
                i7 = 2131743665;
                break;
        }
        org.telegram.messenger.camera.q.r(null, i7, a02);
    }
}
