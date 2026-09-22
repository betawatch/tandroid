package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class i50 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ i60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i50(i60 i60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = i60Var;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        i60 i60Var = this.o;
        if (i60Var.f3 != this) {
            return;
        }
        i60Var.f3 = null;
        AnimatorSet animatorSet = i60Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            i60Var.e3 = null;
        }
        i60Var.Y.X = true;
        i60Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(i60Var.W2, org.telegram.ui.Components.r6.b, 0));
        i60Var.e3.playTogether(arrayList);
        i60Var.e3.setDuration(220L);
        i60Var.e3.addListener(new org.telegram.ui.Components.t81(this, 22));
        i60Var.e3.start();
    }
}
