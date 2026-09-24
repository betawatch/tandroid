package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class d50 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ d60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(d60 d60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = d60Var;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        d60 d60Var = this.o;
        if (d60Var.f3 != this) {
            return;
        }
        d60Var.f3 = null;
        AnimatorSet animatorSet = d60Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            d60Var.e3 = null;
        }
        d60Var.Y.X = true;
        d60Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(d60Var.W2, org.telegram.ui.Components.s6.b, 0));
        d60Var.e3.playTogether(arrayList);
        d60Var.e3.setDuration(220L);
        d60Var.e3.addListener(new org.telegram.ui.Components.q81(this, 22));
        d60Var.e3.start();
    }
}
