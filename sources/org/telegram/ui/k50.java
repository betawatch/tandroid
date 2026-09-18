package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class k50 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ k60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(k60 k60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = k60Var;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        k60 k60Var = this.o;
        if (k60Var.f3 != this) {
            return;
        }
        k60Var.f3 = null;
        AnimatorSet animatorSet = k60Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            k60Var.e3 = null;
        }
        k60Var.Y.X = true;
        k60Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(k60Var.W2, org.telegram.ui.Components.q6.b, 0));
        k60Var.e3.playTogether(arrayList);
        k60Var.e3.setDuration(220L);
        k60Var.e3.addListener(new org.telegram.ui.Components.w81(this, 21));
        k60Var.e3.start();
    }
}
