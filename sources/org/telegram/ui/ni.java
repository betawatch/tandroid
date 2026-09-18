package org.telegram.ui;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class ni implements org.telegram.ui.Components.eh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.qk0 b;

    public ni(org.telegram.ui.Components.qk0 qk0Var) {
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
