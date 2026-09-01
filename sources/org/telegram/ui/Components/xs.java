package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class xs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xs(f2.l lVar, f2.m1 m1Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.e = lVar;
        this.c = m1Var;
        this.b = obj;
        this.d = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                View view = (View) this.b;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view).getTransitionParams().h = false;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                ((f2.m1) this.c).a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                at atVar = (at) this.e;
                ys ysVar = (ys) this.b;
                atVar.d(ysVar.a);
                atVar.y.remove(ysVar.a);
                atVar.A();
                atVar.d(ysVar.b);
                atVar.y.remove(ysVar.b);
                atVar.A();
                break;
            case 1:
                ((zu0) this.e).E1 = false;
                View view = (View) this.b;
                if (view.getParent() != null) {
                    ((rt0) this.c).removeView(view);
                    ((Bitmap) this.d).recycle();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.q2 q2Var = (org.telegram.ui.Components.voip.q2) this.e;
                TextView[] textViewArr = q2Var.a;
                View view2 = (View) this.b;
                view2.setVisibility(8);
                view2.setAlpha(1.0f);
                view2.setTranslationY(0.0f);
                view2.setScaleY(1.0f);
                view2.setScaleX(1.0f);
                View view3 = (View) this.c;
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setVisibility(0);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                q2Var.f = false;
                CharSequence charSequence = q2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        q2Var.e(true);
                    } else {
                        textViewArr[1].setText(q2Var.e);
                        q2Var.a(textViewArr[0], textViewArr[1], new oh.t3(this, 24));
                    }
                    q2Var.e = null;
                    break;
                }
                break;
            case 3:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.b;
                if (kVar2 != null) {
                    kVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.c;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView != null) {
                    profileActivity.b0.setProgressToExpand(0.0f);
                    profileActivity.a.setLayerType(0, null);
                    if (profileActivity.M0 != null) {
                        kVar = ((org.telegram.ui.ActionBar.p2) profileActivity).actionBar;
                        org.telegram.ui.ActionBar.z n10 = kVar.n();
                        ArrayList arrayList = n10.e;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        n10.removeAllViews();
                        profileActivity.M0 = null;
                    }
                    runnable2.run();
                    if (profileActivity.G1 == 2) {
                        profileActivity.G1 = 1;
                        profileActivity.b0.setForegroundAlpha(1.0f);
                        profileActivity.V.setVisibility(8);
                        profileActivity.k0.setAlpha(1.0f);
                        profileActivity.k0.L();
                        profileActivity.k0.setVisibility(0);
                    }
                    profileActivity.T4 = null;
                    profileActivity.W.invalidate();
                    profileActivity.d5 = null;
                    profileActivity.fragmentView.invalidate();
                    break;
                } else {
                    runnable2.run();
                    break;
                }
            case 4:
                ((ViewPropertyAnimator) this.b).setListener(null);
                View view4 = (View) this.d;
                view4.setAlpha(1.0f);
                view4.setTranslationX(0.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleX(1.0f);
                view4.setScaleY(1.0f);
                uf.a0 a0Var = (uf.a0) this.e;
                f2.m1 m1Var = (f2.m1) this.c;
                a0Var.d(m1Var);
                a0Var.A.remove(m1Var);
                a0Var.G();
                break;
            default:
                f2.m1 m1Var2 = (f2.m1) this.c;
                xh.n nVar = (xh.n) this.e;
                View view5 = (View) this.b;
                if (view5 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view5).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.y.remove(m1Var2)) {
                    nVar.u(m1Var2);
                    nVar.G();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                at atVar = (at) this.e;
                ys ysVar = (ys) this.b;
                f2.m1 m1Var = ysVar.a;
                atVar.getClass();
                f2.m1 m1Var2 = ysVar.b;
                atVar.getClass();
                break;
            case 4:
                break;
            case 5:
                ((xh.n) this.e).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ xs(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    private final void a(Animator animator) {
    }
}
