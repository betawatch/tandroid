package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class c40 extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ b50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c40(b50 b50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = b50Var;
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        b50 b50Var = this.o;
        if (b50Var.W4 != this) {
            return;
        }
        b50Var.W4 = null;
        AnimatorSet animatorSet = b50Var.V4;
        if (animatorSet != null) {
            animatorSet.cancel();
            b50Var.V4 = null;
        }
        b50Var.P1.X = true;
        b50Var.V4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(b50Var.N4, org.telegram.ui.Components.i6.b, 0));
        b50Var.V4.playTogether(arrayList);
        b50Var.V4.setDuration(220L);
        b50Var.V4.addListener(new org.telegram.ui.Components.voip.h2(this, 11));
        b50Var.V4.start();
    }
}
