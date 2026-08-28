package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ f2.q1 b;
    public final /* synthetic */ lb c;

    public kb(lb lbVar, View view, f2.q1 q1Var) {
        this.c = lbVar;
        this.a = view;
        this.b = q1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        pb pbVar = this.c.n;
        int measuredHeight = pbVar.A.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i9 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i9 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            int heightWithKeyboard = (pbVar.X.getHeightWithKeyboard() - AndroidUtilities.dp(48.0f)) - pbVar.A.getTop();
            float y10 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
            ((org.telegram.ui.Cells.t1) view).b4(i9, measuredHeight2 - i9, heightWithKeyboard, 0.0f, (y10 + kVar3.getMeasuredHeight()) - pbVar.X.getBackgroundTranslationY(), pbVar.X.getMeasuredWidth(), pbVar.X.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.w0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
        if (kVar == null || pbVar.X == null) {
            return true;
        }
        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) view;
        float y11 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.o2) pbVar).actionBar;
        w0Var.V((y11 + kVar2.getMeasuredHeight()) - pbVar.X.getBackgroundTranslationY(), pbVar.X.getBackgroundSizeY());
        return true;
    }
}
