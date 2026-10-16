package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class gi extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.z9 c;
    public final /* synthetic */ eo d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ bi.f4 h;
    public final /* synthetic */ fo n;

    public gi(fo foVar, boolean z10, boolean z11, org.telegram.ui.Components.z9 z9Var, eo eoVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, bi.f4 f4Var) {
        this.n = foVar;
        this.a = z10;
        this.b = z11;
        this.c = z9Var;
        this.d = eoVar;
        this.e = h5Var;
        this.f = z12;
        this.h = f4Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        fo foVar = this.n;
        foVar.H2[1] = null;
        foVar.B2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.H2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.z9 z9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && z9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.es.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<eo, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.h5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<bi.f4, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(z9Var, (Property<org.telegram.ui.Components.z9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new u0(this, 21));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
