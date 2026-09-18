package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class ni implements org.telegram.ui.Components.eh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.qk0 b;

    public ni(org.telegram.ui.Components.qk0 qk0Var) {
        this.b = qk0Var;
    }

    @Override // org.telegram.ui.Components.eh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.qk0 qk0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            qk0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            qk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
