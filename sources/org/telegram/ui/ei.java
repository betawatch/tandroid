package org.telegram.ui;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ei implements org.telegram.ui.Components.gg0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.wj0 b;

    public ei(org.telegram.ui.Components.wj0 wj0Var) {
        this.b = wj0Var;
    }

    @Override // org.telegram.ui.Components.gg0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.wj0 wj0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            wj0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            wj0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
