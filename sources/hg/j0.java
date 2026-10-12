package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.voip.m2;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class j0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ j0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
        this.a = i10;
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
                if (view instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view).getTransitionParams().h = false;
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
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                k0 k0Var = (k0) this.e;
                s4.b1 b1Var = (s4.b1) this.b;
                k0Var.d(b1Var);
                k0Var.A.remove(b1Var);
                k0Var.G();
                break;
            case 1:
                s4.b1 b1Var2 = (s4.b1) this.b;
                ki.n nVar = (ki.n) this.e;
                View view2 = (View) this.c;
                if (view2 instanceof org.telegram.ui.Cells.u1) {
                    ((org.telegram.ui.Cells.u1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.y.remove(b1Var2)) {
                    nVar.u(b1Var2);
                    nVar.G();
                    break;
                }
                break;
            case 2:
                ((s4.b1) this.b).a.setAlpha(1.0f);
                ((AnimatorSet) this.c).removeAllListeners();
                ot otVar = (ot) this.e;
                mt mtVar = (mt) this.d;
                otVar.d(mtVar.a);
                otVar.y.remove(mtVar.a);
                otVar.A();
                otVar.d(mtVar.b);
                otVar.y.remove(mtVar.b);
                otVar.A();
                break;
            case 3:
                ((xv0) this.e).H1 = false;
                View view3 = (View) this.c;
                if (view3.getParent() != null) {
                    ((qu0) this.b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    break;
                }
                break;
            case 4:
                o2 o2Var = (o2) this.e;
                TextView[] textViewArr = o2Var.a;
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
                o2Var.f = false;
                CharSequence charSequence = o2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        o2Var.e(true);
                    } else {
                        textViewArr[1].setText(o2Var.e);
                        o2Var.a(textViewArr[0], textViewArr[1], new m2(this, 0));
                    }
                    o2Var.e = null;
                    break;
                }
                break;
            default:
                Runnable runnable2 = (Runnable) this.c;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) this.b;
                if (kVar2 != null) {
                    kVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) this.d;
                if (u0Var != null) {
                    u0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView != null) {
                    profileActivity.e0.setProgressToExpand(0.0f);
                    profileActivity.a.setLayerType(0, null);
                    if (profileActivity.P0 != null) {
                        kVar = ((org.telegram.ui.ActionBar.m2) profileActivity).actionBar;
                        org.telegram.ui.ActionBar.y n10 = kVar.n();
                        ArrayList arrayList = n10.e;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        n10.removeAllViews();
                        profileActivity.P0 = null;
                    }
                    runnable2.run();
                    if (profileActivity.J1 == 2) {
                        profileActivity.J1 = 1;
                        profileActivity.e0.setForegroundAlpha(1.0f);
                        profileActivity.Y.setVisibility(8);
                        profileActivity.n0.setAlpha(1.0f);
                        profileActivity.n0.L();
                        profileActivity.n0.setVisibility(0);
                    }
                    profileActivity.W4 = null;
                    profileActivity.Z.invalidate();
                    profileActivity.g5 = null;
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
                ((ki.n) this.e).getClass();
                break;
            case 2:
                ot otVar = (ot) this.e;
                mt mtVar = (mt) this.d;
                s4.b1 b1Var = mtVar.a;
                otVar.getClass();
                s4.b1 b1Var2 = mtVar.b;
                otVar.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    public j0(ki.n nVar, s4.b1 b1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.e = nVar;
        this.b = b1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    public j0(ot otVar, mt mtVar, s4.b1 b1Var, AnimatorSet animatorSet) {
        this.a = 2;
        this.e = otVar;
        this.d = mtVar;
        this.b = b1Var;
        this.c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
