package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class hb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ v4.e1 b;
    public final /* synthetic */ ib c;

    public hb(ib ibVar, View view, v4.e1 e1Var) {
        this.c = ibVar;
        this.a = view;
        this.b = e1Var;
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
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            int heightWithKeyboard = (lbVar.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - lbVar.w.getTop();
            float y10 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.e2) lbVar).actionBar;
            ((org.telegram.ui.Cells.q1) view).B3(i7, measuredHeight2 - i7, heightWithKeyboard, 0.0f, (y10 + kVar3.getMeasuredHeight()) - lbVar.Y.getBackgroundTranslationY(), lbVar.Y.getMeasuredWidth(), lbVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.t0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.e2) lbVar).actionBar;
        if (kVar == null || lbVar.Y == null) {
            return true;
        }
        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
        float y11 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.e2) lbVar).actionBar;
        t0Var.j0((y11 + kVar2.getMeasuredHeight()) - lbVar.Y.getBackgroundTranslationY(), lbVar.Y.getBackgroundSizeY());
        return true;
    }
}
