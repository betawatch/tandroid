package fg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.voip.o2;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ k0(FrameLayout frameLayout, View view, View view2, Object obj, int i10) {
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
        org.telegram.ui.ActionBar.l lVar;
        switch (this.a) {
            case 0:
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.e;
                s4.c1 c1Var = (s4.c1) this.b;
                l0Var.d(c1Var);
                l0Var.A.remove(c1Var);
                l0Var.G();
                break;
            case 1:
                s4.c1 c1Var2 = (s4.c1) this.b;
                ii.n nVar = (ii.n) this.e;
                View view2 = (View) this.c;
                if (view2 instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (nVar.y.remove(c1Var2)) {
                    nVar.u(c1Var2);
                    nVar.G();
                    break;
                }
                break;
            case 2:
                ((s4.c1) this.b).a.setAlpha(1.0f);
                ((AnimatorSet) this.c).removeAllListeners();
                gt gtVar = (gt) this.e;
                et etVar = (et) this.d;
                gtVar.d(etVar.a);
                gtVar.y.remove(etVar.a);
                gtVar.A();
                gtVar.d(etVar.b);
                gtVar.y.remove(etVar.b);
                gtVar.A();
                break;
            case 3:
                ((iv0) this.e).H1 = false;
                View view3 = (View) this.c;
                if (view3.getParent() != null) {
                    ((au0) this.b).removeView(view3);
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
                        o2Var.a(textViewArr[0], textViewArr[1], new org.telegram.ui.Components.voip.x(this, 6));
                    }
                    o2Var.e = null;
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
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.d;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView != null) {
                    profileActivity.e0.setProgressToExpand(0.0f);
                    profileActivity.a.setLayerType(0, null);
                    if (profileActivity.P0 != null) {
                        lVar = ((p2) profileActivity).actionBar;
                        org.telegram.ui.ActionBar.z n10 = lVar.n();
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
                ((ii.n) this.e).getClass();
                break;
            case 2:
                gt gtVar = (gt) this.e;
                et etVar = (et) this.d;
                s4.c1 c1Var = etVar.a;
                gtVar.getClass();
                s4.c1 c1Var2 = etVar.b;
                gtVar.getClass();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.e = obj;
        this.b = obj2;
        this.d = obj3;
        this.c = obj4;
    }

    public k0(ii.n nVar, s4.c1 c1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.e = nVar;
        this.b = c1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(gt gtVar, et etVar, s4.c1 c1Var, AnimatorSet animatorSet) {
        this.a = 2;
        this.e = gtVar;
        this.d = etVar;
        this.b = c1Var;
        this.c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
