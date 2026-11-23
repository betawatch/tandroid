package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class hb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ v4.f1 b;
    public final /* synthetic */ ib c;

    public hb(ib ibVar, View view, v4.f1 f1Var) {
        this.c = ibVar;
        this.a = view;
        this.b = f1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        lb lbVar = this.c.n;
        int measuredHeight = lbVar.w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i7 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i7 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.r1) {
            int heightWithKeyboard = (lbVar.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - lbVar.w.getTop();
            float y10 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
            ((org.telegram.ui.Cells.r1) view).C3(i7, measuredHeight2 - i7, heightWithKeyboard, 0.0f, (y10 + kVar3.getMeasuredHeight()) - lbVar.Y.getBackgroundTranslationY(), lbVar.Y.getMeasuredWidth(), lbVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.v0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
        if (kVar == null || lbVar.Y == null) {
            return true;
        }
        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) view;
        float y11 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.g2) lbVar).actionBar;
        v0Var.k0((y11 + kVar2.getMeasuredHeight()) - lbVar.Y.getBackgroundTranslationY(), lbVar.Y.getBackgroundSizeY());
        return true;
    }
}
