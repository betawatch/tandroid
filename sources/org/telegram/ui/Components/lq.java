package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class lq extends AnimatorListenerAdapter {
    public final /* synthetic */ nq a;

    public lq(nq nqVar) {
        this.a = nqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nq nqVar = this.a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = nqVar.v;
        if (nqVar.K == 1) {
            nqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        nqVar.y = null;
    }
}
