package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ol extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ org.telegram.ui.Components.o9 c;
    public final /* synthetic */ pn d;
    public final /* synthetic */ org.telegram.ui.ActionBar.h5 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ bg.t h;
    public final /* synthetic */ qn n;

    public ol(qn qnVar, boolean z10, boolean z11, org.telegram.ui.Components.o9 o9Var, pn pnVar, org.telegram.ui.ActionBar.h5 h5Var, boolean z12, bg.t tVar) {
        this.n = qnVar;
        this.a = z10;
        this.b = z11;
        this.c = o9Var;
        this.d = pnVar;
        this.e = h5Var;
        this.f = z12;
        this.h = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        qn qnVar = this.n;
        qnVar.D2[1] = null;
        qnVar.x2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.D2;
        if (animator.equals(animatorSetArr[1])) {
            org.telegram.ui.Components.o9 o9Var = this.c;
            boolean z10 = this.b;
            boolean z11 = this.a;
            if (!z11 && !z10 && o9Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(org.telegram.ui.Components.gr.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z11) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<pn, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z10) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<org.telegram.ui.ActionBar.h5, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<bg.t, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (o9Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(o9Var, (Property<org.telegram.ui.Components.o9, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new mh.x(this, 26));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
