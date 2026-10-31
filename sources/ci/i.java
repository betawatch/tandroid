package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import org.telegram.ui.ActionBar.t0;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ns;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.voip.v1;
import org.telegram.ui.Components.zt0;
import org.telegram.ui.ProfileActivity;
import s4.c1;
import zf.a0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class i extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ i(Object obj, Object obj2, View view, Object obj3, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = view;
        this.d = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                View view = (View) this.c;
                view.setTranslationY(0.0f);
                if (view instanceof q1) {
                    ((q1) view).getTransitionParams().i = false;
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
                c1 c1Var = (c1) this.b;
                o oVar = (o) this.e;
                View view = (View) this.c;
                if (view instanceof q1) {
                    ((q1) view).getTransitionParams().i = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (oVar.y.remove(c1Var)) {
                    oVar.u(c1Var);
                    oVar.G();
                    break;
                }
                break;
            case 1:
                ((c1) this.b).a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                ps psVar = (ps) this.e;
                ns nsVar = (ns) this.c;
                psVar.d(nsVar.a);
                psVar.y.remove(nsVar.a);
                psVar.A();
                psVar.d(nsVar.b);
                psVar.y.remove(nsVar.b);
                psVar.A();
                break;
            case 2:
                ((zt0) this.e).K1 = false;
                View view2 = (View) this.c;
                if (view2.getParent() != null) {
                    ((ss0) this.b).removeView(view2);
                    ((Bitmap) this.d).recycle();
                    break;
                }
                break;
            case 3:
                v1 v1Var = (v1) this.e;
                TextView[] textViewArr = v1Var.a;
                View view3 = (View) this.c;
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
                Runnable runnable = (Runnable) this.d;
                if (runnable != null) {
                    runnable.run();
                }
                v1Var.f = false;
                CharSequence charSequence = v1Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        v1Var.e(true);
                    } else {
                        textViewArr[1].setText(v1Var.e);
                        v1Var.a(textViewArr[0], textViewArr[1], new w5(this, 9));
                    }
                    v1Var.e = null;
                    break;
                }
                break;
            case 4:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.l lVar = (org.telegram.ui.ActionBar.l) this.b;
                if (lVar != null) {
                    lVar.setSkipDrawChild(false);
                }
                t0 t0Var = (t0) this.c;
                if (t0Var != null) {
                    t0Var.setAlpha(1.0f);
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
                    profileActivity.Y.invalidate();
                    profileActivity.g5 = null;
                    profileActivity.fragmentView.invalidate();
                    break;
                } else {
                    runnable2.run();
                    break;
                }
            default:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view5 = (View) this.c;
                view5.setAlpha(1.0f);
                view5.setTranslationX(0.0f);
                view5.setTranslationY(0.0f);
                view5.setScaleX(1.0f);
                view5.setScaleY(1.0f);
                a0 a0Var = (a0) this.e;
                c1 c1Var2 = (c1) this.b;
                a0Var.d(c1Var2);
                a0Var.A.remove(c1Var2);
                a0Var.G();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((o) this.e).getClass();
                break;
            case 1:
                ps psVar = (ps) this.e;
                ns nsVar = (ns) this.c;
                c1 c1Var = nsVar.a;
                psVar.getClass();
                c1 c1Var2 = nsVar.b;
                psVar.getClass();
                break;
            case 5:
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ i(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.e = obj;
        this.c = obj2;
        this.b = obj3;
        this.d = obj4;
    }

    public i(a0 a0Var, c1 c1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.a = 5;
        this.e = a0Var;
        this.b = c1Var;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    private final void a(Animator animator) {
    }
}
