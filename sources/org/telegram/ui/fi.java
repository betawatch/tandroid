package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
