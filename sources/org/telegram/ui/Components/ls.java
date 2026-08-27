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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ls extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ls(f2.l lVar, f2.o1 o1Var, Object obj, Object obj2, int i10) {
        this.a = i10;
        this.e = lVar;
        this.c = o1Var;
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
        org.telegram.ui.ActionBar.k kVar;
        switch (this.a) {
            case 0:
                ((f2.o1) this.c).a.setAlpha(1.0f);
                ((AnimatorSet) this.d).removeAllListeners();
                os osVar = (os) this.e;
                ms msVar = (ms) this.b;
                osVar.d(msVar.a);
                osVar.y.remove(msVar.a);
                osVar.A();
                osVar.d(msVar.b);
                osVar.y.remove(msVar.b);
                osVar.A();
                break;
            case 1:
                ((hu0) this.e).D1 = false;
                View view = (View) this.b;
                if (view.getParent() != null) {
                    ((zs0) this.c).removeView(view);
                    ((Bitmap) this.d).recycle();
                    break;
                }
                break;
            case 2:
                org.telegram.ui.Components.voip.o2 o2Var = (org.telegram.ui.Components.voip.o2) this.e;
                TextView[] textViewArr = o2Var.a;
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
                o2Var.f = false;
                CharSequence charSequence = o2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        o2Var.e(true);
                    } else {
                        textViewArr[1].setText(o2Var.e);
                        o2Var.a(textViewArr[0], textViewArr[1], new nh.f0(this, 17));
                    }
                    o2Var.e = null;
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
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) this.c;
                if (v0Var != null) {
                    v0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView != null) {
                    profileActivity.a0.setProgressToExpand(0.0f);
                    profileActivity.a.setLayerType(0, null);
                    if (profileActivity.L0 != null) {
                        kVar = ((org.telegram.ui.ActionBar.n2) profileActivity).actionBar;
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
            case 4:
                ((ViewPropertyAnimator) this.b).setListener(null);
                View view4 = (View) this.d;
                view4.setAlpha(1.0f);
                view4.setTranslationX(0.0f);
                view4.setTranslationY(0.0f);
                view4.setScaleX(1.0f);
                view4.setScaleY(1.0f);
                pf.a0 a0Var = (pf.a0) this.e;
                f2.o1 o1Var = (f2.o1) this.c;
                a0Var.d(o1Var);
                a0Var.A.remove(o1Var);
                a0Var.G();
                break;
            default:
                f2.o1 o1Var2 = (f2.o1) this.c;
                sh.m mVar = (sh.m) this.e;
                View view5 = (View) this.b;
                if (view5 instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view5).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (mVar.y.remove(o1Var2)) {
                    mVar.u(o1Var2);
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
                os osVar = (os) this.e;
                ms msVar = (ms) this.b;
                f2.o1 o1Var = msVar.a;
                osVar.getClass();
                f2.o1 o1Var2 = msVar.b;
                osVar.getClass();
                break;
            case 4:
                break;
            case 5:
                ((sh.m) this.e).getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ ls(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.c = obj3;
        this.d = obj4;
    }

    private final void a(Animator animator) {
    }
}
