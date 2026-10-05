package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class nq extends AnimatorListenerAdapter {
    public final /* synthetic */ pq a;

    public nq(pq pqVar) {
        this.a = pqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        pq pqVar = this.a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = pqVar.v;
        if (pqVar.K == 1) {
            pqVar.F.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        pqVar.y = null;
    }
}
