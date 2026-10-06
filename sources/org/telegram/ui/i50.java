package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class i50 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ h60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i50(h60 h60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = h60Var;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        h60 h60Var = this.o;
        if (h60Var.f3 != this) {
            return;
        }
        h60Var.f3 = null;
        AnimatorSet animatorSet = h60Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            h60Var.e3 = null;
        }
        h60Var.Y.X = true;
        h60Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(h60Var.W2, org.telegram.ui.Components.s6.b, 0));
        h60Var.e3.playTogether(arrayList);
        h60Var.e3.setDuration(220L);
        h60Var.e3.addListener(new org.telegram.ui.Components.b91(this, 22));
        h60Var.e3.start();
    }
}
