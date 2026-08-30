package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d50 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ c60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d50(c60 c60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = c60Var;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        c60 c60Var = this.o;
        if (c60Var.c3 != this) {
            return;
        }
        c60Var.c3 = null;
        AnimatorSet animatorSet = c60Var.b3;
        if (animatorSet != null) {
            animatorSet.cancel();
            c60Var.b3 = null;
        }
        c60Var.V.X = true;
        c60Var.b3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(c60Var.T2, org.telegram.ui.Components.n6.b, 0));
        c60Var.b3.playTogether(arrayList);
        c60Var.b3.setDuration(220L);
        c60Var.b3.addListener(new org.telegram.ui.Components.f91(this, 20));
        c60Var.b3.start();
    }
}
