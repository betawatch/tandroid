package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class is0 extends ax0 {
    public final /* synthetic */ zu0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(zu0 zu0Var, Context context, u00 u00Var) {
        super(context, u00Var, 1, null);
        this.H = zu0Var;
    }

    @Override // org.telegram.ui.Components.ax0
    public final void a() {
        invalidate();
        this.H.E0();
    }
}
