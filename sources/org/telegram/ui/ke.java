package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn b;
    public final /* synthetic */ org.telegram.ui.Components.jk0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ke(cn cnVar, org.telegram.ui.Components.jk0 jk0Var, String str, int i7) {
        this.a = i7;
        this.b = cnVar;
        this.c = jk0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.gc a02;
        int i7;
        int i10 = this.a;
        String str = this.d;
        org.telegram.ui.Components.jk0 jk0Var = this.c;
        cn cnVar = this.b;
        switch (i10) {
            case 0:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.gc.a0(cnVar);
                i7 = 2131746335;
                break;
            case 1:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.gc.a0(cnVar);
                i7 = 2131743201;
                break;
            case 2:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.gc.a0(cnVar);
                i7 = 2131752553;
                break;
            default:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.gc.a0(cnVar);
                i7 = 2131743665;
                break;
        }
        org.telegram.messenger.camera.q.r(null, i7, a02);
    }
}
