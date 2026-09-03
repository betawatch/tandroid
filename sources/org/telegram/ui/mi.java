package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class mi implements org.telegram.ui.Components.ah0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.pk0 b;

    public mi(org.telegram.ui.Components.pk0 pk0Var) {
        this.b = pk0Var;
    }

    @Override // org.telegram.ui.Components.ah0
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
