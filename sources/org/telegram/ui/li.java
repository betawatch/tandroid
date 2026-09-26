package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class li implements org.telegram.ui.Components.eh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.qk0 b;

    public li(org.telegram.ui.Components.qk0 qk0Var) {
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
