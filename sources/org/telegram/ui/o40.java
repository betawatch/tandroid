package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class o40 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ o50 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o40(o50 o50Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = o50Var;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        o50 o50Var = this.o;
        if (o50Var.b3 != this) {
            return;
        }
        o50Var.b3 = null;
        AnimatorSet animatorSet = o50Var.a3;
        if (animatorSet != null) {
            animatorSet.cancel();
            o50Var.a3 = null;
        }
        o50Var.U.X = true;
        o50Var.a3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(o50Var.S2, org.telegram.ui.Components.m6.b, 0));
        o50Var.a3.playTogether(arrayList);
        o50Var.a3.setDuration(220L);
        o50Var.a3.addListener(new org.telegram.ui.Components.y11(this, 27));
        o50Var.a3.start();
    }
}
