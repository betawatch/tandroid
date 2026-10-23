package org.telegram.ui;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.ui.Components.ph0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.dl0 b;

    public fi(org.telegram.ui.Components.dl0 dl0Var) {
        this.b = dl0Var;
    }

    @Override // org.telegram.ui.Components.ph0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.dl0 dl0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            dl0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            dl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
