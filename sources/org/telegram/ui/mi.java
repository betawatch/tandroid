package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class mi implements org.telegram.ui.Components.gh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.sk0 b;

    public mi(org.telegram.ui.Components.sk0 sk0Var) {
        this.b = sk0Var;
    }

    @Override // org.telegram.ui.Components.gh0
    public final void a(float f7, float f10) {
        org.telegram.ui.Components.sk0 sk0Var = this.b;
        if (f7 == 0.0f && !this.a) {
            sk0Var.r(false);
            this.a = true;
        } else if (f7 == 1.0f && this.a) {
            sk0Var.setAlpha(1.0f - f10);
            if (f10 == 1.0f) {
                this.a = false;
            }
        }
    }
}
