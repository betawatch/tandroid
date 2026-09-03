package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ e60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f50(e60 e60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = e60Var;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        e60 e60Var = this.o;
        if (e60Var.c3 != this) {
            return;
        }
        e60Var.c3 = null;
        AnimatorSet animatorSet = e60Var.b3;
        if (animatorSet != null) {
            animatorSet.cancel();
            e60Var.b3 = null;
        }
        e60Var.V.X = true;
        e60Var.b3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(e60Var.T2, org.telegram.ui.Components.n6.b, 0));
        e60Var.b3.playTogether(arrayList);
        e60Var.b3.setDuration(220L);
        e60Var.b3.addListener(new org.telegram.ui.Components.f91(this, 20));
        e60Var.b3.start();
    }
}
