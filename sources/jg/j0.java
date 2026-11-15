package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.voip.l2;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j0(FrameLayout frameLayout, View view, View view2, Object obj, int i7) {
        this.a = i7;
        this.e = frameLayout;
        this.d = view;
        this.b = view2;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                View view = (View) this.d;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view).getTransitionParams().i = false;
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
        switch (this.a) {
            case 0:
                ((ViewPropertyAnimator) this.c).setListener(null);
                View view = (View) this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.e;
                v4.e1 e1Var = (v4.e1) this.b;
                k0Var.d(e1Var);
                k0Var.A.remove(e1Var);
                k0Var.G();
                break;
            case 1:
                ((v4.e1) this.b).a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                ks ksVar = (ks) this.e;
                is isVar = (is) this.c;
                ksVar.d(isVar.a);
                ksVar.y.remove(isVar.a);
                ksVar.A();
                ksVar.d(isVar.b);
                ksVar.y.remove(isVar.b);
                ksVar.A();
                break;
            case 2:
                ((ys0) this.e).L1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((tr0) this.b).removeView(view2);
                    ((Bitmap) this.c).recycle();
                    break;
                }
                break;
            case 3:
                l2 l2Var = (l2) this.e;
                TextView[] textViewArr = l2Var.a;
                View view3 = (View) this.d;
                view3.setVisibility(8);
                view3.setAlpha(1.0f);
                view3.setTranslationY(0.0f);
                view3.setScaleY(1.0f);
                view3.setScaleX(1.0f);
                View view4 = (View) this.b;
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setVisibility(0);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.c;
                if (runnable != null) {
                    runnable.run();
                }
                l2Var.f = false;
                CharSequence charSequence = l2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        l2Var.e(true);
                    } else {
                        textViewArr[1].setText(l2Var.e);
                        l2Var.a(textViewArr[0], textViewArr[1], new org.telegram.ui.ActionBar.r0(this, 19));
                    }
                    l2Var.e = null;
                    break;
                }
                break;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.c;
                if (q0Var != null) {
                    q0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView != null) {
                    profileActivity.f0.setProgressToExpand(0.0f);
                    profileActivity.a.setLayerType(0, null);
                    runnable2.run();
                    if (profileActivity.J1 == 2) {
                        profileActivity.J1 = 1;
                        profileActivity.f0.setForegroundAlpha(1.0f);
                        profileActivity.Y.setVisibility(8);
                        profileActivity.o0.setAlpha(1.0f);
                        profileActivity.o0.L();
                        profileActivity.o0.setVisibility(0);
                    }
                    profileActivity.Y4 = null;
                    profileActivity.Z4 = 0.0f;
                    profileActivity.Z.invalidate();
                    profileActivity.k5 = null;
                    profileActivity.j5 = null;
                    profileActivity.fragmentView.invalidate();
                    break;
                } else {
                    runnable2.run();
                    break;
                }
            default:
                v4.e1 e1Var2 = (v4.e1) this.b;
                pi.k kVar2 = (pi.k) this.e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view5).getTransitionParams().i = false;
                }
                ((ViewPropertyAnimator) this.c).setListener(null);
                if (kVar2.y.remove(e1Var2)) {
                    kVar2.u(e1Var2);
                    kVar2.G();
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ks ksVar = (ks) this.e;
                is isVar = (is) this.c;
                v4.e1 e1Var = isVar.a;
                ksVar.getClass();
                v4.e1 e1Var2 = isVar.b;
                ksVar.getClass();
                break;
            case 5:
                ((pi.k) this.e).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public j0(pi.k kVar, v4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 5;
        this.e = kVar;
        this.b = e1Var;
        this.d = view;
        this.c = viewPropertyAnimator;
    }

    public j0(ks ksVar, is isVar, v4.e1 e1Var, AnimatorSet animatorSet) {
        this.a = 1;
        this.e = ksVar;
        this.c = isVar;
        this.b = e1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
