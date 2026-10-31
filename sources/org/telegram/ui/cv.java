package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cv extends FrameLayout {
    public org.telegram.ui.ActionBar.k2 a;
    public FrameLayout b;
    public org.telegram.ui.ActionBar.l c;
    public org.telegram.ui.Components.tk0 d;
    public ag.b1 e;
    public int f;
    public final /* synthetic */ dv h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cv(dv dvVar, Context context) {
        super(context);
        this.h = dvVar;
    }

    @Override // android.view.View
    public final void setTranslationX(float f7) {
        cv cvVar;
        super.setTranslationX(f7);
        dv dvVar = this.h;
        cv[] cvVarArr = dvVar.f;
        if (dvVar.n && (cvVar = cvVarArr[0]) == this) {
            dvVar.e.i(Math.abs(cvVar.getTranslationX()) / cvVarArr[0].getMeasuredWidth(), cvVarArr[1].f);
        }
    }
}
