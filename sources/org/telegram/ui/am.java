package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class am extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.x9 c;
    public final /* synthetic */ bo d;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ bi.c4 h;
    public final /* synthetic */ co n;

    public am(co coVar, boolean z10, boolean z11, org.telegram.ui.Components.x9 x9Var, bo boVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, bi.c4 c4Var) {
        this.n = coVar;
        this.a = z10;
        this.b = z11;
        this.c = x9Var;
        this.d = boVar;
        this.e = j5Var;
        this.f = z12;
        this.h = c4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        co coVar = this.n;
        coVar.H2[1] = null;
        coVar.B2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.H2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.x9 x9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && x9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.pr.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<bo, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.j5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<bi.c4, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (x9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(x9Var, (Property<org.telegram.ui.Components.x9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new s0(this, 23));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
