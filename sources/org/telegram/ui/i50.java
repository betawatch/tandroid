package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class i50 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ i60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i50(i60 i60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = i60Var;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        i60 i60Var = this.o;
        if (i60Var.f3 != this) {
            return;
        }
        i60Var.f3 = null;
        AnimatorSet animatorSet = i60Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            i60Var.e3 = null;
        }
        i60Var.Y.X = true;
        i60Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(i60Var.W2, org.telegram.ui.Components.s6.b, 0));
        i60Var.e3.playTogether(arrayList);
        i60Var.e3.setDuration(220L);
        i60Var.e3.addListener(new org.telegram.ui.Components.r81(this, 22));
        i60Var.e3.start();
    }
}
