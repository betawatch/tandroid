package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class tp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;

    public /* synthetic */ tp(vp vpVar, int i7) {
        this.a = i7;
        this.b = vpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        vp vpVar = this.b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.w;
                if (vpVar.K == 1) {
                    vpVar.F.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                vpVar.D = null;
                break;
            default:
                if (vpVar.K == vpVar.L) {
                    vpVar.G.setVisibility(4);
                }
                vpVar.D = null;
                break;
        }
    }
}
