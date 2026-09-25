package org.telegram.ui;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
