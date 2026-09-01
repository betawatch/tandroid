package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class b40 extends View {
    public final /* synthetic */ d60 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(d60 d60Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.a = d60Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        if (getAlpha() != f10) {
            super.setAlpha(f10);
            this.a.S0();
        }
    }
}
