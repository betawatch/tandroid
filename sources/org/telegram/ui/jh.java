package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class jh extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.i9 c;
    public final /* synthetic */ zm d;
    public final /* synthetic */ org.telegram.ui.ActionBar.j5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pm h;
    public final /* synthetic */ an n;

    public jh(an anVar, boolean z10, boolean z11, org.telegram.ui.Components.i9 i9Var, zm zmVar, org.telegram.ui.ActionBar.j5 j5Var, boolean z12, pm pmVar) {
        this.n = anVar;
        this.a = z10;
        this.b = z11;
        this.c = i9Var;
        this.d = zmVar;
        this.e = j5Var;
        this.f = z12;
        this.h = pmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        an anVar = this.n;
        anVar.W2[1] = null;
        anVar.Q2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.W2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.i9 i9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && i9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.er.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<zm, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.j5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<pm, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (i9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(i9Var, (Property<org.telegram.ui.Components.i9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new org.telegram.ui.Cells.w9(this, 5));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
