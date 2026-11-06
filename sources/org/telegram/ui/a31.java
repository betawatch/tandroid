package org.telegram.ui;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a31 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m31 b;

    public /* synthetic */ a31(m31 m31Var, int i7) {
        this.a = i7;
        this.b = m31Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        m31 m31Var = this.b;
        switch (i7) {
            case 0:
                org.telegram.messenger.qp.s1(m31Var.currentAccount).l0(null);
                break;
            case 1:
                vf.c.t(m31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131752154, null));
                break;
            default:
                m31Var.c.f3.O(true);
                break;
        }
    }
}
