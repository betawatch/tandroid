package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class xd0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi.oa b;

    public /* synthetic */ xd0(bi.oa oaVar, int i10) {
        this.a = i10;
        this.b = oaVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                bi.oa oaVar = this.b;
                AnimatorSet animatorSet = (AnimatorSet) oaVar.e;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oaVar.e = null;
                    break;
                }
                break;
            case 1:
                bi.oa oaVar2 = this.b;
                AnimatorSet animatorSet2 = (AnimatorSet) oaVar2.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    oaVar2.e = null;
                    break;
                }
                break;
            default:
                bi.oa oaVar3 = this.b;
                AnimatorSet animatorSet3 = (AnimatorSet) oaVar3.e;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    oaVar3.e = null;
                    break;
                }
                break;
        }
    }
}
