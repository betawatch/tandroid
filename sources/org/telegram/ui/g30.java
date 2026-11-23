package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class g30 extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ e40 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(e40 e40Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = e40Var;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        e40 e40Var = this.o;
        if (e40Var.e5 != this) {
            return;
        }
        e40Var.e5 = null;
        AnimatorSet animatorSet = e40Var.d5;
        if (animatorSet != null) {
            animatorSet.cancel();
            e40Var.d5 = null;
        }
        e40Var.T1.X = true;
        e40Var.d5 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(e40Var.V4, org.telegram.ui.Components.q6.b, 0));
        e40Var.d5.playTogether(arrayList);
        e40Var.d5.setDuration(220L);
        e40Var.d5.addListener(new zx(this, 1));
        e40Var.d5.start();
    }
}
