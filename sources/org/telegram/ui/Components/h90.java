package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class h90 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i90 b;
    public final /* synthetic */ m90 c;

    public /* synthetic */ h90(i90 i90Var, m90 m90Var, int i10) {
        this.a = i10;
        this.b = i90Var;
        this.c = m90Var;
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
