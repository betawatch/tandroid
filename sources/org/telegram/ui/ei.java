package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ei extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.g9 c;
    public final /* synthetic */ tn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.u5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ jn h;
    public final /* synthetic */ un n;

    public ei(un unVar, boolean z10, boolean z11, org.telegram.ui.Components.g9 g9Var, tn tnVar, org.telegram.ui.ActionBar.u5 u5Var, boolean z12, jn jnVar) {
        this.n = unVar;
        this.a = z10;
        this.b = z11;
        this.c = g9Var;
        this.d = tnVar;
        this.e = u5Var;
        this.f = z12;
        this.h = jnVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        un unVar = this.n;
        unVar.V2[1] = null;
        unVar.P2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.V2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.g9 g9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && g9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.gr.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<tn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.u5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<jn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (g9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(g9Var, (Property<org.telegram.ui.Components.g9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new s9(this, 15));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
