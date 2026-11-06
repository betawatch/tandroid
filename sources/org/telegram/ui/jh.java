package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class jh extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.l9 c;
    public final /* synthetic */ zm d;
    public final /* synthetic */ org.telegram.ui.ActionBar.k5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ pm h;
    public final /* synthetic */ an n;

    public jh(an anVar, boolean z9, boolean z10, org.telegram.ui.Components.l9 l9Var, zm zmVar, org.telegram.ui.ActionBar.k5 k5Var, boolean z11, pm pmVar) {
        this.n = anVar;
        this.a = z9;
        this.b = z10;
        this.c = l9Var;
        this.d = zmVar;
        this.e = k5Var;
        this.f = z11;
        this.h = pmVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        an anVar = this.n;
        anVar.V2[1] = null;
        anVar.P2[1].setTranslationY(0.0f);
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
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<zm, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z9) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.k5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<pm, Float>) View.TRANSLATION_Y, 0.0f));
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
