package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class e50 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ d60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e50(d60 d60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = d60Var;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        d60 d60Var = this.o;
        if (d60Var.c3 != this) {
            return;
        }
        d60Var.c3 = null;
        AnimatorSet animatorSet = d60Var.b3;
        if (animatorSet != null) {
            animatorSet.cancel();
            d60Var.b3 = null;
        }
        d60Var.V.X = true;
        d60Var.b3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(d60Var.T2, org.telegram.ui.Components.n6.b, 0));
        d60Var.b3.playTogether(arrayList);
        d60Var.b3.setDuration(220L);
        d60Var.b3.addListener(new org.telegram.ui.Components.g91(this, 20));
        d60Var.b3.start();
    }
}
