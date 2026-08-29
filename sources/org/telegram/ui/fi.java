package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.ui.Components.pg0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.fk0 b;

    public fi(org.telegram.ui.Components.fk0 fk0Var) {
        this.b = fk0Var;
    }

    @Override // org.telegram.ui.Components.pg0
    public final void a(float f9, float f10) {
        org.telegram.ui.Components.fk0 fk0Var = this.b;
        if (f9 == 0.0f && !this.a) {
            fk0Var.r(false);
            this.a = true;
        } else if (f9 == 1.0f && this.a) {
            fk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
