package kg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.ui.ActionBar.d4;
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g0(FrameLayout frameLayout, View view, View view2, Object obj, int i3) {
        this.a = i3;
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
                h0 h0Var = (h0) this.e;
                u4.d1 d1Var = (u4.d1) this.b;
                h0Var.d(d1Var);
                h0Var.A.remove(d1Var);
                h0Var.G();
                break;
            case 1:
                u4.d1 d1Var2 = (u4.d1) this.b;
                ni.l lVar = (ni.l) this.e;
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
                ((u4.d1) this.b).a.setAlpha(1.0f);
                ((AnimatorSet) this.c).removeAllListeners();
                es esVar = (es) this.e;
                cs csVar = (cs) this.d;
                esVar.d(csVar.a);
                esVar.y.remove(csVar.a);
                esVar.A();
                esVar.d(csVar.b);
                esVar.y.remove(csVar.b);
                esVar.A();
                break;
            case 3:
                ((ws0) this.e).L1 = false;
                View view3 = (View) this.c;
                if (view3.getParent() != null) {
                    ((rr0) this.b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.Components.voip.w1 w1Var = (org.telegram.ui.Components.voip.w1) this.e;
                TextView[] textViewArr = w1Var.a;
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
                w1Var.f = false;
                CharSequence charSequence = w1Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        w1Var.e(true);
                    } else {
                        textViewArr[1].setText(w1Var.e);
                        w1Var.a(textViewArr[0], textViewArr[1], new d4(this, 13));
                    }
                    w1Var.e = null;
                    break;
                }
                break;
            default:
                Runnable runnable2 = (Runnable) this.c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) this.b;
                if (kVar != null) {
                    kVar.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) this.d;
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
                    profileActivity.X4 = null;
                    profileActivity.Z.invalidate();
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
                ((ni.l) this.e).getClass();
                break;
            case 2:
                es esVar = (es) this.e;
                cs csVar = (cs) this.d;
                u4.d1 d1Var = csVar.a;
                esVar.getClass();
                u4.d1 d1Var2 = csVar.b;
                esVar.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ g0(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.e = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    public g0(ni.l lVar, u4.d1 d1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.e = lVar;
        this.b = d1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    public g0(es esVar, cs csVar, u4.d1 d1Var, AnimatorSet animatorSet) {
        this.a = 2;
        this.e = esVar;
        this.d = csVar;
        this.b = d1Var;
        this.c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
