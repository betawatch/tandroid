package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class kq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ mq b;

    public /* synthetic */ kq(mq mqVar, int i7) {
        this.a = i7;
        this.b = mqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        mq mqVar = this.b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = mqVar.w;
                if (mqVar.L == 1) {
                    mqVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                mqVar.E = null;
                break;
            default:
                if (mqVar.L == mqVar.M) {
                    mqVar.H.setVisibility(4);
                }
                mqVar.E = null;
                break;
        }
    }
}
