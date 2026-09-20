package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class ni implements org.telegram.ui.Components.dh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.pk0 b;

    public ni(org.telegram.ui.Components.pk0 pk0Var) {
        this.b = pk0Var;
    }

    @Override // org.telegram.ui.Components.dh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.pk0 pk0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            pk0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            pk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
