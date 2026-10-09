package org.telegram.ui;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class oi implements org.telegram.ui.Components.wh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.kl0 b;

    public oi(org.telegram.ui.Components.kl0 kl0Var) {
        this.b = kl0Var;
    }

    @Override // org.telegram.ui.Components.wh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.kl0 kl0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            kl0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            kl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
