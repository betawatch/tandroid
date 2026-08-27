package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class lb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ f2.o1 b;
    public final /* synthetic */ mb c;

    public lb(mb mbVar, View view, f2.o1 o1Var) {
        this.c = mbVar;
        this.a = view;
        this.b = o1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        qb qbVar = this.c.n;
        int measuredHeight = qbVar.A.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            int heightWithKeyboard = (qbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - qbVar.A.getTop();
            float y10 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.n2) qbVar).actionBar;
            ((org.telegram.ui.Cells.s1) view).a4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y10 + kVar3.getMeasuredHeight()) - qbVar.X.getBackgroundTranslationY(), qbVar.X.getMeasuredWidth(), qbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.v0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.n2) qbVar).actionBar;
        if (kVar == null || qbVar.X == null) {
            return true;
        }
        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
        float y11 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.n2) qbVar).actionBar;
        v0Var.W((y11 + kVar2.getMeasuredHeight()) - qbVar.X.getBackgroundTranslationY(), qbVar.X.getBackgroundSizeY());
        return true;
    }
}
