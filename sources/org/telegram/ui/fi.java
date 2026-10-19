package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.ui.Components.oh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.cl0 b;

    public fi(org.telegram.ui.Components.cl0 cl0Var) {
        this.b = cl0Var;
    }

    @Override // org.telegram.ui.Components.oh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.cl0 cl0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            cl0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            cl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
