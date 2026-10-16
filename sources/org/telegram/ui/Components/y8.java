package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class y8 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ int a;
    public final /* synthetic */ h9 b;

    public /* synthetic */ y8(h9 h9Var, int i10) {
        this.a = i10;
        this.b = h9Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == -1) {
                    h9.U(this.b);
                    break;
                }
                break;
            default:
                h9 h9Var = this.b;
                if (i10 == -1) {
                    h9.U(h9Var);
                }
                if (i10 == 1) {
                    h9Var.f0();
                    break;
                }
                break;
        }
    }
}
