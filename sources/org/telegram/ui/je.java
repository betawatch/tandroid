package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
        org.telegram.ui.Components.lc b02;
        int i7;
        int i10 = this.a;
        String str = this.d;
        org.telegram.ui.Components.yk0 yk0Var = this.c;
        bn bnVar = this.b;
        switch (i10) {
            case 0:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131746139;
                break;
            case 1:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131742957;
                break;
            case 2:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g(str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131752541;
                break;
            default:
                yk0Var.dismiss();
                org.telegram.messenger.g0.g("@" + str);
                b02 = org.telegram.ui.Components.lc.b0(bnVar);
                i7 = 2131743422;
                break;
        }
        org.telegram.messenger.n10.t(null, i7, b02);
    }
}
