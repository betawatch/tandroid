package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class jb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ f2.n1 b;
    public final /* synthetic */ kb c;

    public jb(kb kbVar, View view, f2.n1 n1Var) {
        this.c = kbVar;
        this.a = view;
        this.b = n1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.l lVar;
        org.telegram.ui.ActionBar.l lVar2;
        org.telegram.ui.ActionBar.l lVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ob obVar = this.c.n;
        int measuredHeight = obVar.A.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i10 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i10 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            int heightWithKeyboard = (obVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - obVar.A.getTop();
            float y8 = view.getY();
            lVar3 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
            ((org.telegram.ui.Cells.s1) view).b4(i10, measuredHeight2 - i10, heightWithKeyboard, 0.0f, (y8 + lVar3.getMeasuredHeight()) - obVar.X.getBackgroundTranslationY(), obVar.X.getMeasuredWidth(), obVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.v0)) {
            return true;
        }
        lVar = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
        if (lVar == null || obVar.X == null) {
            return true;
        }
        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
        float y10 = view.getY();
        lVar2 = ((org.telegram.ui.ActionBar.o2) obVar).actionBar;
        v0Var.W((y10 + lVar2.getMeasuredHeight()) - obVar.X.getBackgroundTranslationY(), obVar.X.getBackgroundSizeY());
        return true;
    }
}
