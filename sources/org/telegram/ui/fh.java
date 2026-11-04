package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fh extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.k9 c;
    public final /* synthetic */ vm d;
    public final /* synthetic */ org.telegram.ui.ActionBar.k5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ lm h;
    public final /* synthetic */ wm n;

    public fh(wm wmVar, boolean z10, boolean z11, org.telegram.ui.Components.k9 k9Var, vm vmVar, org.telegram.ui.ActionBar.k5 k5Var, boolean z12, lm lmVar) {
        this.n = wmVar;
        this.a = z10;
        this.b = z11;
        this.c = k9Var;
        this.d = vmVar;
        this.e = k5Var;
        this.f = z12;
        this.h = lmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        wm wmVar = this.n;
        wmVar.W2[1] = null;
        wmVar.Q2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.W2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.k9 k9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && k9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.xq.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<vm, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.k5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<lm, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (k9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(k9Var, (Property<org.telegram.ui.Components.k9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new org.telegram.ui.Cells.w9(this, 5));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
