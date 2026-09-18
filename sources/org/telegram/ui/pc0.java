package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pc0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ pc0(jd0 jd0Var, boolean z10, int i10) {
        this.a = i10;
        this.b = jd0Var;
        this.c = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                boolean z10 = this.c;
                jd0 jd0Var = this.b;
                if (!z10) {
                    jd0Var.b.setVisibility(8);
                    break;
                } else {
                    jd0Var.getClass();
                    break;
                }
            default:
                this.b.s0(this.c);
                break;
        }
    }
}
