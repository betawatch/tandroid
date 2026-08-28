package of;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import mh.m2;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.ns;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class h0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h0(FrameLayout frameLayout, View view, View view2, Object obj, int i9) {
        this.a = i9;
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
                ((ViewPropertyAnimator) this.c).setListener(null);
                View view = (View) this.d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                i0 i0Var = (i0) this.e;
                f2.q1 q1Var = (f2.q1) this.b;
                i0Var.d(q1Var);
                i0Var.A.remove(q1Var);
                i0Var.G();
                break;
            case 1:
                ((f2.q1) this.b).a.setAlpha(1.0f);
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
                ((eu0) this.e).D1 = false;
                View view2 = (View) this.d;
                if (view2.getParent() != null) {
                    ((xs0) this.b).removeView(view2);
                    ((Bitmap) this.c).recycle();
                    break;
                }
                break;
            case 3:
                o2 o2Var = (o2) this.e;
                TextView[] textViewArr = o2Var.a;
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
                o2Var.f = false;
                CharSequence charSequence = o2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        o2Var.e(true);
                    } else {
                        textViewArr[1].setText(o2Var.e);
                        o2Var.a(textViewArr[0], textViewArr[1], new m2(this, 11));
                    }
                    o2Var.e = null;
                    break;
                }
                break;
            case 4:
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
                    profileActivity.a0.setProgressToExpand(0.0f);
                    profileActivity.a.setLayerType(0, null);
                    if (profileActivity.L0 != null) {
                        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                        org.telegram.ui.ActionBar.z n10 = kVar.n();
                        ArrayList arrayList = n10.e;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        n10.removeAllViews();
                        profileActivity.L0 = null;
                    }
                    runnable2.run();
                    if (profileActivity.F1 == 2) {
                        profileActivity.F1 = 1;
                        profileActivity.a0.setForegroundAlpha(1.0f);
                        profileActivity.U.setVisibility(8);
                        profileActivity.j0.setAlpha(1.0f);
                        profileActivity.j0.L();
                        profileActivity.j0.setVisibility(0);
                    }
                    profileActivity.S4 = null;
                    profileActivity.V.invalidate();
                    profileActivity.c5 = null;
                    profileActivity.fragmentView.invalidate();
                    break;
                } else {
                    runnable2.run();
                    break;
                }
            default:
                f2.q1 q1Var2 = (f2.q1) this.b;
                rh.m mVar = (rh.m) this.e;
                View view5 = (View) this.d;
                if (view5 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view5).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.c).setListener(null);
                if (mVar.y.remove(q1Var2)) {
                    mVar.u(q1Var2);
                    mVar.G();
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
                ps psVar = (ps) this.e;
                ns nsVar = (ns) this.c;
                f2.q1 q1Var = nsVar.a;
                psVar.getClass();
                f2.q1 q1Var2 = nsVar.b;
                psVar.getClass();
                break;
            case 5:
                ((rh.m) this.e).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    public h0(rh.m mVar, f2.q1 q1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 5;
        this.e = mVar;
        this.b = q1Var;
        this.d = view;
        this.c = viewPropertyAnimator;
    }

    public h0(ps psVar, ns nsVar, f2.q1 q1Var, AnimatorSet animatorSet) {
        this.a = 1;
        this.e = psVar;
        this.c = nsVar;
        this.b = q1Var;
        this.d = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
