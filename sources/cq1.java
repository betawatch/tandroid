// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class cq1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ bf0 c;
    public final /* synthetic */ xv1 d;
    public final /* synthetic */ lka e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ mv1 h;
    public final /* synthetic */ yv1 n;

    public cq1(yv1 yv1Var, boolean z, boolean z2, bf0 bf0Var, xv1 xv1Var, lka lkaVar, boolean z3, mv1 mv1Var) {
        this.n = yv1Var;
        this.a = z;
        this.b = z2;
        this.c = bf0Var;
        this.d = xv1Var;
        this.e = lkaVar;
        this.f = z3;
        this.h = mv1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        yv1 yv1Var = this.n;
        yv1Var.W2[1] = null;
        yv1Var.Q2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.W2;
        if (animator.equals(animatorSetArr[1])) {
            bf0 bf0Var = this.c;
            boolean z = this.b;
            boolean z2 = this.a;
            if (!z2 && !z && bf0Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(d53.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<xv1, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<lka, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<mv1, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (bf0Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(bf0Var, (Property<bf0, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new b91((Object) this, (byte) 7));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
