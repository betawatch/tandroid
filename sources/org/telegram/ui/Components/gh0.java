package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jh0 b;

    public /* synthetic */ gh0(jh0 jh0Var, int i10) {
        this.a = i10;
        this.b = jh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a(true);
                break;
            default:
                this.b.d();
                break;
        }
    }
}
