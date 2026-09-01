package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ki implements org.telegram.ui.Components.bh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.rk0 b;

    public ki(org.telegram.ui.Components.rk0 rk0Var) {
        this.b = rk0Var;
    }

    @Override // org.telegram.ui.Components.bh0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.rk0 rk0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            rk0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            rk0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
