package org.telegram.ui;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class je implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bn b;
    public final /* synthetic */ org.telegram.ui.Components.yk0 c;
    public final /* synthetic */ String d;

    public /* synthetic */ je(bn bnVar, org.telegram.ui.Components.yk0 yk0Var, String str, int i7) {
        this.a = i7;
        this.b = bnVar;
        this.c = yk0Var;
        this.d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.kc b02;
        int i7;
        int i10 = this.a;
        String str = this.d;
        org.telegram.ui.Components.yk0 yk0Var = this.c;
        bn bnVar = this.b;
        switch (i10) {
            case 0:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.kc.b0(bnVar);
                i7 = 2131746139;
                break;
            case 1:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.kc.b0(bnVar);
                i7 = 2131742950;
                break;
            case 2:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.kc.b0(bnVar);
                i7 = 2131752541;
                break;
            default:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                b02 = org.telegram.ui.Components.kc.b0(bnVar);
                i7 = 2131743418;
                break;
        }
        org.telegram.messenger.m10.t(null, i7, b02);
    }
}
