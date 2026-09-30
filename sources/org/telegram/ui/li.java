package org.telegram.ui;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
