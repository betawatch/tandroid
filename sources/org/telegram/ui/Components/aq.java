package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class aq extends AnimatorListenerAdapter {
    public final /* synthetic */ cq a;

    public aq(cq cqVar) {
        this.a = cqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        cq cqVar = this.a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = cqVar.v;
        if (cqVar.G == 1) {
            cqVar.B.setVisibility(4);
        }
        for (int i9 = 0; i9 < colorPicker$RadioButtonArr.length; i9++) {
            if (colorPicker$RadioButtonArr[i9].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i9].setVisibility(4);
            }
        }
        cqVar.y = null;
    }
}
