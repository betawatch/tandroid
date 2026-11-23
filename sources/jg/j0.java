package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.ts;
import org.telegram.ui.Components.voip.k2;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                if (view instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view).getTransitionParams().i = false;
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
                v4.f1 f1Var = (v4.f1) this.b;
                k0Var.d(f1Var);
                k0Var.A.remove(f1Var);
                k0Var.G();
                break;
            case 1:
                ((v4.f1) this.b).a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                ts tsVar = (ts) this.e;
                rs rsVar = (rs) this.c;
                tsVar.d(rsVar.a);
                tsVar.y.remove(rsVar.a);
                tsVar.A();
                tsVar.d(rsVar.b);
                tsVar.y.remove(rsVar.b);
                tsVar.A();
                break;
            case 2:
                ((jt0) this.e).L1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((ds0) this.b).removeView(view2);
                    ((Bitmap) this.c).recycle();
                    break;
                }
                break;
            case 3:
                k2 k2Var = (k2) this.e;
                TextView[] textViewArr = k2Var.a;
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
                k2Var.f = false;
                CharSequence charSequence = k2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        k2Var.e(true);
                    } else {
                        textViewArr[1].setText(k2Var.e);
                        k2Var.a(textViewArr[0], textViewArr[1], new oi.c2(this, 22));
                    }
                    k2Var.e = null;
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
                    profileActivity.a5 = null;
                    profileActivity.b5 = 0.0f;
                    profileActivity.Z.invalidate();
                    profileActivity.m5 = null;
                    profileActivity.l5 = null;
                    profileActivity.fragmentView.invalidate();
                    break;
                } else {
                    runnable2.run();
                    break;
                }
            default:
                v4.f1 f1Var2 = (v4.f1) this.b;
                pi.k kVar2 = (pi.k) this.e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.r1) {
                    ((org.telegram.ui.Cells.r1) view5).getTransitionParams().i = false;
                }
                ((ViewPropertyAnimator) this.c).setListener(null);
                if (kVar2.y.remove(f1Var2)) {
                    kVar2.u(f1Var2);
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
                ts tsVar = (ts) this.e;
                rs rsVar = (rs) this.c;
                v4.f1 f1Var = rsVar.a;
                tsVar.getClass();
                v4.f1 f1Var2 = rsVar.b;
                tsVar.getClass();
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

    public j0(pi.k kVar, v4.f1 f1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 5;
        this.e = kVar;
        this.b = f1Var;
        this.d = view;
        this.c = viewPropertyAnimator;
    }

    public j0(ts tsVar, rs rsVar, v4.f1 f1Var, AnimatorSet animatorSet) {
        this.a = 1;
        this.e = tsVar;
        this.c = rsVar;
        this.b = f1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
