package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class ow extends yy {
    public final /* synthetic */ mz E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow(mz mzVar, Context context) {
        super(mzVar, context, 2);
        this.E = mzVar;
    }

    @Override // android.view.View
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.E.d0.invalidate();
        }
    }
}
