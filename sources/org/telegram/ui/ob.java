package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ob implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ pb c;

    public ob(pb pbVar, View view, s4.c1 c1Var) {
        this.c = pbVar;
        this.a = view;
        this.b = c1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        sb sbVar = this.c.n;
        int measuredHeight = sbVar.w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            int heightWithKeyboard = (sbVar.X.getHeightWithKeyboard() - org.telegram.messenger.i0.L(48.0f)) - sbVar.w.getTop();
            float y3 = view.getY();
            lVar3 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
            ((org.telegram.ui.Cells.q1) view).w3(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y3 + lVar3.getMeasuredHeight()) - sbVar.X.getBackgroundTranslationY(), sbVar.X.getMeasuredWidth(), sbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.s0)) {
            return true;
        }
        lVar = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
        if (lVar == null || sbVar.X == null) {
            return true;
        }
        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) view;
        float y10 = view.getY();
        lVar2 = ((org.telegram.ui.ActionBar.k2) sbVar).actionBar;
        s0Var.g0((y10 + lVar2.getMeasuredHeight()) - sbVar.X.getBackgroundTranslationY(), sbVar.X.getBackgroundSizeY());
        return true;
    }
}
