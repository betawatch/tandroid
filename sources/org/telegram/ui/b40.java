package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class b40 extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ a50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(a50 a50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = a50Var;
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        a50 a50Var = this.o;
        if (a50Var.W4 != this) {
            return;
        }
        a50Var.W4 = null;
        AnimatorSet animatorSet = a50Var.V4;
        if (animatorSet != null) {
            animatorSet.cancel();
            a50Var.V4 = null;
        }
        a50Var.P1.X = true;
        a50Var.V4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(a50Var.N4, org.telegram.ui.Components.i6.b, 0));
        a50Var.V4.playTogether(arrayList);
        a50Var.V4.setDuration(220L);
        a50Var.V4.addListener(new org.telegram.ui.Components.voip.i2(this, 11));
        a50Var.V4.start();
    }
}
