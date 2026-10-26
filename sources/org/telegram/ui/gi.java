package org.telegram.ui;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class gi implements org.telegram.ui.Components.rh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.fl0 b;

    public gi(org.telegram.ui.Components.fl0 fl0Var) {
        this.b = fl0Var;
    }

    @Override // org.telegram.ui.Components.rh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.fl0 fl0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            fl0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            fl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
