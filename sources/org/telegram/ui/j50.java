package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class j50 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ j60 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(j60 j60Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = j60Var;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
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
        arrayList.add(ObjectAnimator.ofInt(j60Var.W2, org.telegram.ui.Components.r6.b, 0));
        j60Var.e3.playTogether(arrayList);
        j60Var.e3.setDuration(220L);
        j60Var.e3.addListener(new org.telegram.ui.Components.voip.v2(this, 11));
        j60Var.e3.start();
    }
}
