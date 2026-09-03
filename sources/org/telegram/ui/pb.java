package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class pb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ f2.l1 b;
    public final /* synthetic */ qb c;

    public pb(qb qbVar, View view, f2.l1 l1Var) {
        this.c = qbVar;
        this.a = view;
        this.b = l1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ub ubVar = this.c.n;
        int measuredHeight = ubVar.B.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            int heightWithKeyboard = (ubVar.Y.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ubVar.B.getTop();
            float y10 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.p2) ubVar).actionBar;
            ((org.telegram.ui.Cells.s1) view).b4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y10 + kVar3.getMeasuredHeight()) - ubVar.Y.getBackgroundTranslationY(), ubVar.Y.getMeasuredWidth(), ubVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.v0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.p2) ubVar).actionBar;
        if (kVar == null || ubVar.Y == null) {
            return true;
        }
        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
        float y11 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.p2) ubVar).actionBar;
        v0Var.W((y11 + kVar2.getMeasuredHeight()) - ubVar.Y.getBackgroundTranslationY(), ubVar.Y.getBackgroundSizeY());
        return true;
    }
}
