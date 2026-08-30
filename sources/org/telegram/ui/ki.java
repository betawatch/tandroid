package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class ki implements org.telegram.ui.Components.zg0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.pk0 b;

    public ki(org.telegram.ui.Components.pk0 pk0Var) {
        this.b = pk0Var;
    }

    @Override // org.telegram.ui.Components.zg0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.pk0 pk0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            pk0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            pk0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
