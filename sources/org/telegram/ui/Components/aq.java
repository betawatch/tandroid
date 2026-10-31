package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class aq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ cq b;

    public /* synthetic */ aq(cq cqVar, int i10) {
        this.a = i10;
        this.b = cqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.a;
        cq cqVar = this.b;
        switch (i10) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.w;
                if (cqVar.K == 1) {
                    cqVar.F.setVisibility(4);
                }
                for (int i11 = 0; i11 < colorPicker$RadioButtonArr.length; i11++) {
                    if (colorPicker$RadioButtonArr[i11].getTag(R.id.index_tag) == null) {
                        colorPicker$RadioButtonArr[i11].setVisibility(4);
                    }
                }
                cqVar.D = null;
                break;
            default:
                if (cqVar.K == cqVar.L) {
                    cqVar.G.setVisibility(4);
                }
                cqVar.D = null;
                break;
        }
    }
}
