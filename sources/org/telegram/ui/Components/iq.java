package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class iq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ kq b;

    public /* synthetic */ iq(kq kqVar, int i7) {
        this.a = i7;
        this.b = kqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        kq kqVar = this.b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = kqVar.w;
                if (kqVar.L == 1) {
                    kqVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                kqVar.E = null;
                break;
            default:
                if (kqVar.L == kqVar.M) {
                    kqVar.H.setVisibility(4);
                }
                kqVar.E = null;
                break;
        }
    }
}
