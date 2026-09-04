package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class pb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ s4.c1 b;
    public final /* synthetic */ qb c;

    public pb(qb qbVar, View view, s4.c1 c1Var) {
        this.c = qbVar;
        this.a = view;
        this.b = c1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ub ubVar = this.c.n;
        int measuredHeight = ubVar.E.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            int heightWithKeyboard = (ubVar.b0.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - ubVar.E.getTop();
            float y3 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.n2) ubVar).actionBar;
            ((org.telegram.ui.Cells.t1) view).b4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y3 + kVar3.getMeasuredHeight()) - ubVar.b0.getBackgroundTranslationY(), ubVar.b0.getMeasuredWidth(), ubVar.b0.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.w0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) ubVar).actionBar;
        if (kVar == null || ubVar.b0 == null) {
            return true;
        }
        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
        float y10 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.n2) ubVar).actionBar;
        w0Var.W((y10 + kVar2.getMeasuredHeight()) - ubVar.b0.getBackgroundTranslationY(), ubVar.b0.getBackgroundSizeY());
        return true;
    }
}
