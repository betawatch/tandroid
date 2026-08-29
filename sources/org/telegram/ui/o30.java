package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class o30 extends View {
    public final /* synthetic */ r50 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o30(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = r50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f9) {
        if (getAlpha() != f9) {
            super.setAlpha(f9);
            this.a.S0();
        }
    }
}
