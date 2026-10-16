package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jn0 implements org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on0 b;

    public /* synthetic */ jn0(on0 on0Var, int i10) {
        this.a = i10;
        this.b = on0Var;
    }

    @Override // org.telegram.ui.ActionBar.z1
    public final void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 0:
                on0 on0Var = this.b;
                on0Var.c(true);
                on0Var.Q.finishFragment();
                break;
            default:
                on0 on0Var2 = this.b;
                on0Var2.c(true);
                on0Var2.Q.J1(null, 0, true);
                break;
        }
    }
}
