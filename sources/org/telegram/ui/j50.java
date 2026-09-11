package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ j60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(j60 j60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = j60Var;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        j60 j60Var = this.o;
        if (j60Var.f3 != this) {
            return;
        }
        j60Var.f3 = null;
        AnimatorSet animatorSet = j60Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            j60Var.e3 = null;
        }
        j60Var.Y.X = true;
        j60Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(j60Var.W2, org.telegram.ui.Components.t6.b, 0));
        j60Var.e3.playTogether(arrayList);
        j60Var.e3.setDuration(220L);
        j60Var.e3.addListener(new org.telegram.ui.Components.k61(this, 24));
        j60Var.e3.start();
    }
}
