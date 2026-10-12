package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class n50 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ n60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n50(n60 n60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = n60Var;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        n60 n60Var = this.o;
        if (n60Var.f3 != this) {
            return;
        }
        n60Var.f3 = null;
        AnimatorSet animatorSet = n60Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            n60Var.e3 = null;
        }
        n60Var.Y.X = true;
        n60Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(n60Var.W2, org.telegram.ui.Components.v6.b, 0));
        n60Var.e3.playTogether(arrayList);
        n60Var.e3.setDuration(220L);
        n60Var.e3.addListener(new org.telegram.ui.Components.u61(this, 25));
        n60Var.e3.start();
    }
}
