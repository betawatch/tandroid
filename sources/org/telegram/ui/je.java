package org.telegram.ui;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.ui.Components.wk0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ je(bn bnVar, org.telegram.ui.Components.wk0 wk0Var, String str, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = wk0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.lc b02;
        int i7;
        int i10 = this.a;
        String str = this.d;
        org.telegram.ui.Components.wk0 wk0Var = this.c;
        bn bnVar = this.b;
        switch (i10) {
            case 0:
                wk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131746140;
                break;
            case 1:
                wk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131742963;
                break;
            case 2:
                wk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131752542;
                break;
            default:
                wk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131743428;
                break;
        }
        org.telegram.messenger.n10.t(null, i7, b02);
    }
}
