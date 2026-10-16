package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c10 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ d10 b;

    public /* synthetic */ c10(d10 d10Var, int i10) {
        this.a = i10;
        this.b = d10Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.a();
                break;
            default:
                d10 d10Var = this.b;
                d10Var.b(d10Var.y);
                break;
        }
    }
}
