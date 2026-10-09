package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class g50 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ g60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(g60 g60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = g60Var;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        g60 g60Var = this.o;
        if (g60Var.f3 != this) {
            return;
        }
        g60Var.f3 = null;
        AnimatorSet animatorSet = g60Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            g60Var.e3 = null;
        }
        g60Var.Y.X = true;
        g60Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(g60Var.W2, org.telegram.ui.Components.u6.b, 0));
        g60Var.e3.playTogether(arrayList);
        g60Var.e3.setDuration(220L);
        g60Var.e3.addListener(new org.telegram.ui.Components.i91(this, 22));
        g60Var.e3.start();
    }
}
