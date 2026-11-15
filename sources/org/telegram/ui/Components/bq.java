package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class bq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ dq b;

    public /* synthetic */ bq(dq dqVar, int i7) {
        this.a = i7;
        this.b = dqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        dq dqVar = this.b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = dqVar.w;
                if (dqVar.L == 1) {
                    dqVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                dqVar.E = null;
                break;
            default:
                if (dqVar.L == dqVar.M) {
                    dqVar.H.setVisibility(4);
                }
                dqVar.E = null;
                break;
        }
    }
}
