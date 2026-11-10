package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.voip.h2;
import org.telegram.ui.Components.ys0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
        this.c = view;
        this.b = view2;
        this.d = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                View view = (View) this.c;
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
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.e;
                v4.d1 d1Var = (v4.d1) this.b;
                k0Var.d(d1Var);
                k0Var.A.remove(d1Var);
                k0Var.G();
                break;
            case 1:
                v4.d1 d1Var2 = (v4.d1) this.b;
                mi.l lVar = (mi.l) this.e;
                View view2 = (View) this.c;
                if (view2 instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) view2).getTransitionParams().i = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (lVar.y.remove(d1Var2)) {
                    lVar.u(d1Var2);
                    lVar.G();
                    break;
                }
                break;
            case 2:
                ((v4.d1) this.b).a.setAlpha(1.0f);
                ((AnimatorSet) this.c).removeAllListeners();
                ds dsVar = (ds) this.e;
                bs bsVar = (bs) this.d;
                dsVar.d(bsVar.a);
                dsVar.y.remove(bsVar.a);
                dsVar.A();
                dsVar.d(bsVar.b);
                dsVar.y.remove(bsVar.b);
                dsVar.A();
                break;
            case 3:
                ((ys0) this.e).K1 = false;
                View view3 = (View) this.c;
                if (view3.getParent() != null) {
                    ((tr0) this.b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    break;
                }
                break;
            case 4:
                h2 h2Var = (h2) this.e;
                TextView[] textViewArr = h2Var.a;
                View view4 = (View) this.c;
                view4.setVisibility(8);
                view4.setAlpha(1.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleY(1.0f);
                view4.setScaleX(1.0f);
                View view5 = (View) this.b;
                view5.setAlpha(1.0f);
                view5.setTranslationY(0.0f);
                view5.setVisibility(0);
                view5.setScaleY(1.0f);
                view5.setScaleX(1.0f);
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                h2Var.f = false;
                CharSequence charSequence = h2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        h2Var.e(true);
                    } else {
                        textViewArr[1].setText(h2Var.e);
                        h2Var.a(textViewArr[0], textViewArr[1], new p5(this, 6));
                    }
                    h2Var.e = null;
                    break;
                }
                break;
            default:
                Runnable runnable2 = (Runnable) this.c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) this.b;
                if (lVar2 != null) {
                    lVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) this.d;
                if (r0Var != null) {
                    r0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView != null) {
                    profileActivity.e0.setProgressToExpand(0.0f);
                    profileActivity.a.setLayerType(0, null);
                    runnable2.run();
                    if (profileActivity.I1 == 2) {
                        profileActivity.I1 = 1;
                        profileActivity.e0.setForegroundAlpha(1.0f);
                        profileActivity.X.setVisibility(8);
                        profileActivity.n0.setAlpha(1.0f);
                        profileActivity.n0.L();
                        profileActivity.n0.setVisibility(0);
                    }
                    profileActivity.W4 = null;
                    profileActivity.X4 = 0.0f;
                    profileActivity.Y.invalidate();
                    profileActivity.i5 = null;
                    profileActivity.h5 = null;
                    profileActivity.fragmentView.invalidate();
                    break;
                } else {
                    runnable2.run();
                    break;
                }
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                break;
            case 1:
                ((mi.l) this.e).getClass();
                break;
            case 2:
                ds dsVar = (ds) this.e;
                bs bsVar = (bs) this.d;
                v4.d1 d1Var = bsVar.a;
                dsVar.getClass();
                v4.d1 d1Var2 = bsVar.b;
                dsVar.getClass();
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
        this.d = obj3;
        this.c = obj4;
    }

    public j0(mi.l lVar, v4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.e = lVar;
        this.b = d1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    public j0(ds dsVar, bs bsVar, v4.d1 d1Var, AnimatorSet animatorSet) {
        this.a = 2;
        this.e = dsVar;
        this.d = bsVar;
        this.b = d1Var;
        this.c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
