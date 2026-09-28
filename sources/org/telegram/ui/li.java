package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class li implements org.telegram.ui.Components.gh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.sk0 b;

    public li(org.telegram.ui.Components.sk0 sk0Var) {
        this.b = sk0Var;
    }

    @Override // org.telegram.ui.Components.gh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.sk0 sk0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            sk0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            sk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
