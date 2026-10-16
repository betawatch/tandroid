package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ p80 b;

    public /* synthetic */ i80(p80 p80Var, int i10) {
        this.a = i10;
        this.b = p80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                p80 p80Var = this.b;
                p80Var.h.postOnAnimation(new i80(p80Var, 1));
                break;
            default:
                this.b.Y();
                break;
        }
    }
}
