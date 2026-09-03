package org.telegram.ui;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ki implements org.telegram.ui.Components.bh0 {
    public boolean a = true;
    public final /* synthetic */ org.telegram.ui.Components.qk0 b;

    public ki(org.telegram.ui.Components.qk0 qk0Var) {
        this.b = qk0Var;
    }

    @Override // org.telegram.ui.Components.bh0
    public final void a(float f10, float f11) {
        org.telegram.ui.Components.qk0 qk0Var = this.b;
        if (f10 == 0.0f && !this.a) {
            qk0Var.r(false);
            this.a = true;
        } else if (f10 == 1.0f && this.a) {
            qk0Var.setAlpha(1.0f - f11);
            if (f11 == 1.0f) {
                this.a = false;
            }
        }
    }
}
