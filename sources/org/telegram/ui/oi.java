package org.telegram.ui;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class oi implements org.telegram.ui.Components.tg0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.fk0 b;

    public oi(org.telegram.ui.Components.fk0 fk0Var) {
        this.b = fk0Var;
    }

    @Override // org.telegram.ui.Components.tg0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.fk0 fk0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            fk0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            fk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
