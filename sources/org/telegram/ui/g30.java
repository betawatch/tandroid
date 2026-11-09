package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g30 extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ e40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(e40 e40Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = e40Var;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        e40 e40Var = this.o;
        if (e40Var.W4 != this) {
            return;
        }
        e40Var.W4 = null;
        AnimatorSet animatorSet = e40Var.V4;
        if (animatorSet != null) {
            animatorSet.cancel();
            e40Var.V4 = null;
        }
        e40Var.P1.X = true;
        e40Var.V4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(e40Var.N4, org.telegram.ui.Components.m6.b, 0));
        e40Var.V4.playTogether(arrayList);
        e40Var.V4.setDuration(220L);
        e40Var.V4.addListener(new f30(this, 0));
        e40Var.V4.start();
    }
}
