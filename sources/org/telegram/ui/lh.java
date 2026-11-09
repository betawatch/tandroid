package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class lh extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.l9 c;
    public final /* synthetic */ bn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.l5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ rm h;
    public final /* synthetic */ cn n;

    public lh(cn cnVar, boolean z9, boolean z10, org.telegram.ui.Components.l9 l9Var, bn bnVar, org.telegram.ui.ActionBar.l5 l5Var, boolean z11, rm rmVar) {
        this.n = cnVar;
        this.a = z9;
        this.b = z10;
        this.c = l9Var;
        this.d = bnVar;
        this.e = l5Var;
        this.f = z11;
        this.h = rmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        cn cnVar = this.n;
        cnVar.V2[1] = null;
        cnVar.P2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.V2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.l9 l9Var = this.c;
            boolean z9 = this.b;
            boolean z10 = this.a;
            if (!z10 && !z9 && l9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.xq.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<bn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z9) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.l5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<rm, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (l9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(l9Var, (Property<org.telegram.ui.Components.l9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new va(this, 4));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
