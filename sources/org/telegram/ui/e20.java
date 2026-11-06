package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e20 extends View {
    public final /* synthetic */ c40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e20(c40 c40Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = c40Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.U0();
        }
    }
}
