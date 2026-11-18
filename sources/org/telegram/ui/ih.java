package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class ih extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.q9 c;
    public final /* synthetic */ an d;
    public final /* synthetic */ org.telegram.ui.ActionBar.n5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qm h;
    public final /* synthetic */ bn n;

    public ih(bn bnVar, boolean z10, boolean z11, org.telegram.ui.Components.q9 q9Var, an anVar, org.telegram.ui.ActionBar.n5 n5Var, boolean z12, qm qmVar) {
        this.n = bnVar;
        this.a = z10;
        this.b = z11;
        this.c = q9Var;
        this.d = anVar;
        this.e = n5Var;
        this.f = z12;
        this.h = qmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        bn bnVar = this.n;
        bnVar.W2[1] = null;
        bnVar.Q2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.W2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.q9 q9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && q9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.lr.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<an, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.n5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<qm, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (q9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(q9Var, (Property<org.telegram.ui.Components.q9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new org.telegram.ui.Cells.x9(this, 5));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
