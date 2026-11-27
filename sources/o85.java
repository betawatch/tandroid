// default package

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class o85 extends n8 {
    public final /* synthetic */ j95 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o85(j95 j95Var, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        super(actionBarPopupWindow$ActionBarPopupWindowLayout, -2, -2);
        this.o = j95Var;
    }

    @Override // n8, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        j95 j95Var = this.o;
        if (j95Var.U4 != this) {
            return;
        }
        j95Var.U4 = null;
        AnimatorSet animatorSet = j95Var.T4;
        if (animatorSet != null) {
            animatorSet.cancel();
            j95Var.T4 = null;
        }
        j95Var.R1.X = true;
        j95Var.T4 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofInt(j95Var.L4, sn.b, 0));
        j95Var.T4.playTogether(arrayList);
        j95Var.T4.setDuration(220L);
        j95Var.T4.addListener(new cn2(this, (byte) 26));
        j95Var.T4.start();
    }
}
