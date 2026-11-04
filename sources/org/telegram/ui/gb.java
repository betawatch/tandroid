package org.telegram.ui;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class gb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ u4.d1 b;
    public final /* synthetic */ hb c;

    public gb(hb hbVar, View view, u4.d1 d1Var) {
        this.c = hbVar;
        this.a = view;
        this.b = d1Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        org.telegram.ui.ActionBar.k kVar3;
        View view = this.a;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        kb kbVar = this.c.n;
        int measuredHeight = kbVar.w.getMeasuredHeight();
        int top = view.getTop();
        view.getBottom();
        int i3 = top >= 0 ? 0 : -top;
        int measuredHeight2 = view.getMeasuredHeight();
        if (measuredHeight2 > measuredHeight) {
            measuredHeight2 = i3 + measuredHeight;
        }
        View view2 = this.b.a;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            int heightWithKeyboard = (kbVar.Y.getHeightWithKeyboard() - org.telegram.messenger.g0.L(48.0f)) - kbVar.w.getTop();
            float y9 = view.getY();
            kVar3 = ((org.telegram.ui.ActionBar.d2) kbVar).actionBar;
            ((org.telegram.ui.Cells.q1) view).y3(i3, measuredHeight2 - i3, heightWithKeyboard, 0.0f, (y9 + kVar3.getMeasuredHeight()) - kbVar.Y.getBackgroundTranslationY(), kbVar.Y.getMeasuredWidth(), kbVar.Y.getBackgroundSizeY(), 0, 0, 0);
            return true;
        }
        if (!(view2 instanceof org.telegram.ui.Cells.t0)) {
            return true;
        }
        kVar = ((org.telegram.ui.ActionBar.d2) kbVar).actionBar;
        if (kVar == null || kbVar.Y == null) {
            return true;
        }
        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) view;
        float y10 = view.getY();
        kVar2 = ((org.telegram.ui.ActionBar.d2) kbVar).actionBar;
        t0Var.h0((y10 + kVar2.getMeasuredHeight()) - kbVar.Y.getBackgroundTranslationY(), kbVar.Y.getBackgroundSizeY());
        return true;
    }
}
