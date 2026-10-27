package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ji implements org.telegram.ui.Components.sh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.gl0 b;

    public ji(org.telegram.ui.Components.gl0 gl0Var) {
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
