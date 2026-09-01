package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class l50 extends t50 {
    public final /* synthetic */ z50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l50(z50 z50Var, Context context) {
        super(z50Var, context);
        this.d = z50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f10) {
        super.setRotationY(f10);
        this.d.invalidate();
    }
}
