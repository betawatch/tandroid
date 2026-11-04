package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n81 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m91 b;

    public /* synthetic */ n81(m91 m91Var, int i3) {
        this.a = i3;
        this.b = m91Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                m91 m91Var = this.b;
                m91Var.B0();
                m91Var.F0();
                break;
            case 1:
                this.b.B0();
                break;
            case 2:
                this.b.S0(true);
                break;
            case 3:
                this.b.finishPreviewFragment();
                break;
            case 4:
                m91 m91Var2 = this.b;
                m91Var2.B0 = null;
                m91Var2.Z0(true, false);
                break;
            default:
                m91 m91Var3 = this.b;
                m91Var3.O.postOnAnimation(new n81(m91Var3, 1));
                break;
        }
    }
}
