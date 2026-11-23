package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class hq extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ jq b;

    public /* synthetic */ hq(jq jqVar, int i7) {
        this.a = i7;
        this.b = jqVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7 = this.a;
        jq jqVar = this.b;
        switch (i7) {
            case 0:
                ColorPicker$RadioButton[] colorPicker$RadioButtonArr = jqVar.w;
                if (jqVar.L == 1) {
                    jqVar.G.setVisibility(4);
                }
                for (int i10 = 0; i10 < colorPicker$RadioButtonArr.length; i10++) {
                    if (colorPicker$RadioButtonArr[i10].getTag(R.id.index_tag) == null) {
                        colorPicker$RadioButtonArr[i10].setVisibility(4);
                    }
                }
                jqVar.E = null;
                break;
            default:
                if (jqVar.L == jqVar.M) {
                    jqVar.H.setVisibility(4);
                }
                jqVar.E = null;
                break;
        }
    }
}
