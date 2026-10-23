package org.telegram.ui;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.ui.Components.sh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.gl0 b;

    public fi(org.telegram.ui.Components.gl0 gl0Var) {
        this.b = gl0Var;
    }

    @Override // org.telegram.ui.Components.sh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.gl0 gl0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            gl0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            gl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
