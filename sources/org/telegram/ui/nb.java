package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class nb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ f2.m1 b;
    public final /* synthetic */ ob c;

    public nb(ob obVar, View view, f2.m1 m1Var) {
        this.c = obVar;
        this.a = view;
        this.b = m1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        sb sbVar = this.c.n;
        int measuredHeight = sbVar.B.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            int heightWithKeyboard = (sbVar.Y.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - sbVar.B.getTop();
            float y10 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
            ((org.telegram.ui.Cells.t1) view).b4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y10 + kVar3.getMeasuredHeight()) - sbVar.Y.getBackgroundTranslationY(), sbVar.Y.getMeasuredWidth(), sbVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.v0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
        if (kVar == null || sbVar.Y == null) {
            return true;
        }
        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
        float y11 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.p2) sbVar).actionBar;
        v0Var.W((y11 + kVar2.getMeasuredHeight()) - sbVar.Y.getBackgroundTranslationY(), sbVar.Y.getBackgroundSizeY());
        return true;
    }
}
