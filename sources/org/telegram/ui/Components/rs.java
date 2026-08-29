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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rs extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ rs(f2.l lVar, f2.n1 n1Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.e = lVar;
        this.c = n1Var;
        this.b = obj;
        this.d = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                View view = (View) this.b;
                view.setTranslationY(0.0f);
                if (view instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view).getTransitionParams().h = false;
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
        org.telegram.ui.ActionBar.l lVar;
        switch (this.a) {
            case 0:
                ((f2.n1) this.c).a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                us usVar = (us) this.e;
                ss ssVar = (ss) this.b;
                usVar.d(ssVar.a);
                usVar.y.remove(ssVar.a);
                usVar.A();
                usVar.d(ssVar.b);
                usVar.y.remove(ssVar.b);
                usVar.A();
                break;
            case 1:
                ((qu0) this.e).D1 = false;
                View view = (View) this.b;
                if (view.getParent() != null) {
                    ((it0) this.c).removeView(view);
                    ((Bitmap) this.d).recycle();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.r2 r2Var = (org.telegram.ui.Components.voip.r2) this.e;
                TextView[] textViewArr = r2Var.a;
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
                r2Var.f = false;
                CharSequence charSequence = r2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        r2Var.e(true);
                    } else {
                        textViewArr[1].setText(r2Var.e);
                        r2Var.a(textViewArr[0], textViewArr[1], new nh.m6(this, 20));
                    }
                    r2Var.e = null;
                    break;
                }
                break;
            case 3:
                Runnable runnable2 = (Runnable) this.d;
                ProfileActivity profileActivity = (ProfileActivity) this.e;
                org.telegram.ui.ActionBar.l lVar2 = (org.telegram.ui.ActionBar.l) this.b;
                if (lVar2 != null) {
                    lVar2.setSkipDrawChild(false);
                }
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.c;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView != null) {
                    profileActivity.a0.setProgressToExpand(0.0f);
                    profileActivity.a.setLayerType(0, null);
                    if (profileActivity.L0 != null) {
                        lVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
                        org.telegram.ui.ActionBar.a0 n10 = lVar.n();
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
            case 4:
                ((ViewPropertyAnimator) this.b).setListener(null);
                View view4 = (View) this.d;
                view4.setAlpha(1.0f);
                view4.setTranslationX(0.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleX(1.0f);
                view4.setScaleY(1.0f);
                rf.b0 b0Var = (rf.b0) this.e;
                f2.n1 n1Var = (f2.n1) this.c;
                b0Var.d(n1Var);
                b0Var.A.remove(n1Var);
                b0Var.G();
                break;
            default:
                f2.n1 n1Var2 = (f2.n1) this.c;
                uh.m mVar = (uh.m) this.e;
                View view5 = (View) this.b;
                if (view5 instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view5).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (mVar.y.remove(n1Var2)) {
                    mVar.u(n1Var2);
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
                us usVar = (us) this.e;
                ss ssVar = (ss) this.b;
                f2.n1 n1Var = ssVar.a;
                usVar.getClass();
                f2.n1 n1Var2 = ssVar.b;
                usVar.getClass();
                break;
            case 4:
                break;
            case 5:
                ((uh.m) this.e).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ rs(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    private final void a(Animator animator) {
    }
}
