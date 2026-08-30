package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class a40 extends View {
    public final /* synthetic */ c60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a40(c60 c60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = c60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.S0();
        }
    }
}
