package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class fi implements org.telegram.ui.Components.sh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.gl0 b;

    public fi(org.telegram.ui.Components.gl0 gl0Var) {
        this.b = gl0Var;
    }

    @Override // org.telegram.ui.Components.sh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.gl0 gl0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            gl0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            gl0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
