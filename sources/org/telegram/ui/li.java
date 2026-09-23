package org.telegram.ui;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class li implements org.telegram.ui.Components.ug0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.gk0 b;

    public li(org.telegram.ui.Components.gk0 gk0Var) {
        this.b = gk0Var;
    }

    @Override // org.telegram.ui.Components.ug0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.gk0 gk0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            gk0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            gk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
