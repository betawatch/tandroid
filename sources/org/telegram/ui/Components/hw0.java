package org.telegram.ui.Components;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jw0 b;

    public /* synthetic */ hw0(jw0 jw0Var, int i10) {
        this.a = i10;
        this.b = jw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jw0 jw0Var = this.b;
                jw0Var.V0 = false;
                if (!jw0Var.Y0 && jw0Var.W0) {
                    jw0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                jw0 jw0Var2 = this.b;
                jw0Var2.Y0 = false;
                if (!jw0Var2.V0 && jw0Var2.W0) {
                    jw0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
