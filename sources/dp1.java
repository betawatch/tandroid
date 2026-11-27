// default package

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class dp1 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ de0 c;
    public final /* synthetic */ yu1 d;
    public final /* synthetic */ ema e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ nu1 h;
    public final /* synthetic */ zu1 n;

    public dp1(zu1 zu1Var, boolean z, boolean z2, de0 de0Var, yu1 yu1Var, ema emaVar, boolean z3, nu1 nu1Var) {
        this.n = zu1Var;
        this.a = z;
        this.b = z2;
        this.c = de0Var;
        this.d = yu1Var;
        this.e = emaVar;
        this.f = z3;
        this.h = nu1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        zu1 zu1Var = this.n;
        zu1Var.W2[1] = null;
        zu1Var.Q2[1].setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnimatorSet[] animatorSetArr = this.n.W2;
        if (animator.equals(animatorSetArr[1])) {
            de0 de0Var = this.c;
            boolean z = this.b;
            boolean z2 = this.a;
            if (!z2 && !z && de0Var == null) {
                animatorSetArr[1] = null;
                return;
            }
            animatorSetArr[1] = new AnimatorSet();
            animatorSetArr[1].setInterpolator(k43.h);
            animatorSetArr[1].setDuration(360L);
            ArrayList arrayList = new ArrayList();
            if (z2) {
                arrayList.add(ObjectAnimator.ofFloat(this.d, (Property<yu1, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (z) {
                arrayList.add(ObjectAnimator.ofFloat(this.e, (Property<ema, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (this.f) {
                arrayList.add(ObjectAnimator.ofFloat(this.h, (Property<nu1, Float>) View.TRANSLATION_Y, 0.0f));
            }
            if (de0Var != null) {
                arrayList.add(ObjectAnimator.ofFloat(de0Var, (Property<de0, Float>) View.TRANSLATION_Y, 0.0f));
            }
            animatorSetArr[1].addListener(new jb1((Object) this, (byte) 5));
            animatorSetArr[1].playTogether(arrayList);
            animatorSetArr[1].start();
        }
    }
}
