package org.telegram.ui.Components;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class in0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mo0 b;

    public /* synthetic */ in0(mo0 mo0Var, int i7) {
        this.a = i7;
        this.b = mo0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mo0 mo0Var = this.b;
                mo0Var.s2 = true;
                r00 r00Var = mo0Var.q2;
                r00Var.r.setText("");
                org.telegram.messenger.g0.K3(r00Var.r);
                break;
            default:
                l10 l10Var = new l10(3);
                mo0 mo0Var2 = this.b;
                if (!mo0Var2.d) {
                    l10Var.run();
                    break;
                } else {
                    r00 r00Var2 = mo0Var2.q2;
                    if (r00Var2 != null) {
                        org.telegram.messenger.g0.v1(r00Var2.r);
                    }
                    org.telegram.messenger.g0.i3(l10Var, 300L);
                    break;
                }
        }
    }
}
