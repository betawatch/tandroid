package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class e30 extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ c40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e30(c40 c40Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = c40Var;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        c40 c40Var = this.o;
        if (c40Var.W4 != this) {
            return;
        }
        c40Var.W4 = null;
        AnimatorSet animatorSet = c40Var.V4;
        if (animatorSet != null) {
            animatorSet.cancel();
            c40Var.V4 = null;
        }
        c40Var.P1.X = true;
        c40Var.V4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(c40Var.N4, org.telegram.ui.Components.m6.b, 0));
        c40Var.V4.playTogether(arrayList);
        c40Var.V4.setDuration(220L);
        c40Var.V4.addListener(new d30(this, 0));
        c40Var.V4.start();
    }
}
