package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ an b;
    public final /* synthetic */ org.telegram.ui.Components.jk0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ ke(an anVar, org.telegram.ui.Components.jk0 jk0Var, String str, int i7) {
        this.a = i7;
        this.b = anVar;
        this.c = jk0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.hc a02;
        int i7;
        int i10 = this.a;
        String str = this.d;
        org.telegram.ui.Components.jk0 jk0Var = this.c;
        an anVar = this.b;
        switch (i10) {
            case 0:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(anVar);
                i7 = 2131746336;
                break;
            case 1:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(anVar);
                i7 = 2131743204;
                break;
            case 2:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                a02 = org.telegram.ui.Components.hc.a0(anVar);
                i7 = 2131752553;
                break;
            default:
                jk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                a02 = org.telegram.ui.Components.hc.a0(anVar);
                i7 = 2131743668;
                break;
        }
        org.telegram.messenger.camera.q.r(null, i7, a02);
    }
}
