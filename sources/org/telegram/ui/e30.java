package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
        if (c40Var.e5 != this) {
            return;
        }
        c40Var.e5 = null;
        AnimatorSet animatorSet = c40Var.d5;
        if (animatorSet != null) {
            animatorSet.cancel();
            c40Var.d5 = null;
        }
        c40Var.T1.X = true;
        c40Var.d5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(c40Var.V4, org.telegram.ui.Components.k6.b, 0));
        c40Var.d5.playTogether(arrayList);
        c40Var.d5.setDuration(220L);
        c40Var.d5.addListener(new xx(this, 1));
        c40Var.d5.start();
    }
}
