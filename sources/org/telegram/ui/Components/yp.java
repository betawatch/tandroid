package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class yp extends AnimatorListenerAdapter {
    public final /* synthetic */ aq a;

    public yp(aq aqVar) {
        this.a = aqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        aq aqVar = this.a;
        ColorPicker$RadioButton[] colorPicker$RadioButtonArr = aqVar.v;
        if (aqVar.G == 1) {
            aqVar.B.setVisibility(4);
        }
        for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
            if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                colorPicker$RadioButtonArr[i10].setVisibility(4);
            }
        }
        aqVar.y = null;
    }
}
