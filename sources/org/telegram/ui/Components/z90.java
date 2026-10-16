package org.telegram.ui.Components;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aa0 b;
    public final /* synthetic */ ea0 c;

    public /* synthetic */ z90(aa0 aa0Var, ea0 ea0Var, int i10) {
        this.a = i10;
        this.b = aa0Var;
        this.c = ea0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.k(this.c, false);
                break;
            default:
                this.b.k(this.c, false);
                break;
        }
    }
}
