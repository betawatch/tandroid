package org.telegram.ui.Components;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap0 b;

    public /* synthetic */ xn0(ap0 ap0Var, int i7) {
        this.a = i7;
        this.b = ap0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ap0 ap0Var = this.b;
                ap0Var.w2 = true;
                e10 e10Var = ap0Var.u2;
                e10Var.r.setText("");
                org.telegram.messenger.g0.I3(e10Var.r);
                break;
            default:
                me meVar = new me(11);
                ap0 ap0Var2 = this.b;
                if (!ap0Var2.d) {
                    meVar.run();
                    break;
                } else {
                    e10 e10Var2 = ap0Var2.u2;
                    if (e10Var2 != null) {
                        org.telegram.messenger.g0.v1(e10Var2.r);
                    }
                    org.telegram.messenger.g0.h3(meVar, 300L);
                    break;
                }
        }
    }
}
