package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        if (f40Var.Z4 != this) {
            return;
        }
        f40Var.Z4 = null;
        AnimatorSet animatorSet = f40Var.Y4;
        if (animatorSet != null) {
            animatorSet.cancel();
            f40Var.Y4 = null;
        }
        f40Var.S1.X = true;
        f40Var.Y4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(f40Var.Q4, org.telegram.ui.Components.l6.b, 0));
        f40Var.Y4.playTogether(arrayList);
        f40Var.Y4.setDuration(220L);
        f40Var.Y4.addListener(new g30(this, 0));
        f40Var.Y4.start();
    }
}
