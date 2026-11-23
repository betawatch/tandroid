package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l91 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m91 b;

    public /* synthetic */ l91(m91 m91Var, int i7) {
        this.a = i7;
        this.b = m91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m91 m91Var = this.b;
                m91Var.F = null;
                if (m91Var.G != -1) {
                    m91Var.H.getNotificationCenter().j(m91Var.G);
                    m91Var.G = -1;
                    break;
                }
                break;
            default:
                m91 m91Var2 = this.b;
                m91Var2.F = null;
                if (m91Var2.G != -1) {
                    m91Var2.H.getNotificationCenter().j(m91Var2.G);
                    m91Var2.G = -1;
                    break;
                }
                break;
        }
    }
}
