package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class f50 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ f60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f50(f60 f60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = f60Var;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        f60 f60Var = this.o;
        if (f60Var.f3 != this) {
            return;
        }
        f60Var.f3 = null;
        AnimatorSet animatorSet = f60Var.e3;
        if (animatorSet != null) {
            animatorSet.cancel();
            f60Var.e3 = null;
        }
        f60Var.Y.X = true;
        f60Var.e3 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(f60Var.W2, org.telegram.ui.Components.s6.b, 0));
        f60Var.e3.playTogether(arrayList);
        f60Var.e3.setDuration(220L);
        f60Var.e3.addListener(new org.telegram.ui.Components.u81(this, 21));
        f60Var.e3.start();
    }
}
