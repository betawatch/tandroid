package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tp extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp b;

    public /* synthetic */ tp(vp vpVar, int i3) {
        this.a = i3;
        this.b = vpVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i3 = this.a;
        vp vpVar = this.b;
        switch (i3) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = vpVar.w;
                if (vpVar.L == 1) {
                    vpVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                vpVar.E = null;
                break;
            default:
                if (vpVar.L == vpVar.M) {
                    vpVar.H.setVisibility(4);
                }
                vpVar.E = null;
                break;
        }
    }
}
