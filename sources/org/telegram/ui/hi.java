package org.telegram.ui;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class hi implements org.telegram.ui.Components.oh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.cl0 b;

    public hi(org.telegram.ui.Components.cl0 cl0Var) {
        this.b = cl0Var;
    }

    @Override // org.telegram.ui.Components.oh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.cl0 cl0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            cl0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            cl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
