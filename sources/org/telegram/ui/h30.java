package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class h30 extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ f40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h30(f40 f40Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = f40Var;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        f40 f40Var = this.o;
        if (f40Var.e5 != this) {
            return;
        }
        f40Var.e5 = null;
        AnimatorSet animatorSet = f40Var.d5;
        if (animatorSet != null) {
            animatorSet.cancel();
            f40Var.d5 = null;
        }
        f40Var.T1.X = true;
        f40Var.d5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(f40Var.V4, org.telegram.ui.Components.r6.b, 0));
        f40Var.d5.playTogether(arrayList);
        f40Var.d5.setDuration(220L);
        f40Var.d5.addListener(new ay(this, 1));
        f40Var.d5.start();
    }
}
