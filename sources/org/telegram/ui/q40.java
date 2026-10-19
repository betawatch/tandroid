package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class q40 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ q50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q40(q50 q50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = q50Var;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        q50 q50Var = this.o;
        if (q50Var.f3 != this) {
            return;
        }
        q50Var.f3 = null;
        AnimatorSet animatorSet = q50Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            q50Var.e3 = null;
        }
        q50Var.Y.X = true;
        q50Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(q50Var.W2, org.telegram.ui.Components.t6.b, 0));
        q50Var.e3.playTogether(arrayList);
        q50Var.e3.setDuration(220L);
        q50Var.e3.addListener(new org.telegram.ui.Components.o31(this, 27));
        q50Var.e3.start();
    }
}
