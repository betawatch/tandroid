package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class f40 extends View {
    public final /* synthetic */ i60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(i60 i60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = i60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        if (getAlpha() != f7) {
            super.setAlpha(f7);
            this.a.S0();
        }
    }
}
