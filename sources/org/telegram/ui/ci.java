package org.telegram.ui;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ci implements org.telegram.ui.Components.eg0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.uj0 b;

    public ci(org.telegram.ui.Components.uj0 uj0Var) {
        this.b = uj0Var;
    }

    @Override // org.telegram.ui.Components.eg0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.uj0 uj0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            uj0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            uj0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
