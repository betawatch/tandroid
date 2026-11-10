package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class ib implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ v4.d1 b;
    public final /* synthetic */ jb c;

    public ib(jb jbVar, View view, v4.d1 d1Var) {
        this.c = jbVar;
        this.a = view;
        this.b = d1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        mb mbVar = this.c.n;
        int measuredHeight = mbVar.w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i7 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i7 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            int heightWithKeyboard = (mbVar.X.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - mbVar.w.getTop();
            float y10 = view.getY();
            lVar3 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
            ((org.telegram.ui.Cells.q1) view).A3(i7, measuredHeight2 - i7, heightWithKeyboard, 0.0f, (y10 + lVar3.getMeasuredHeight()) - mbVar.X.getBackgroundTranslationY(), mbVar.X.getMeasuredWidth(), mbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.t0)) {
            return true;
        }
        lVar = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
        if (lVar == null || mbVar.X == null) {
            return true;
        }
        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
        float y11 = view.getY();
        lVar2 = ((org.telegram.ui.ActionBar.f2) mbVar).actionBar;
        t0Var.i0((y11 + lVar2.getMeasuredHeight()) - mbVar.X.getBackgroundTranslationY(), mbVar.X.getBackgroundSizeY());
        return true;
    }
}
