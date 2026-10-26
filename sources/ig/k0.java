package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.tu0;
import org.telegram.ui.Components.voip.q2;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                ((ViewPropertyAnimator) this.d).setListener(null);
                View view = (View) this.c;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                l0 l0Var = (l0) this.e;
                s4.e1 e1Var = (s4.e1) this.b;
                l0Var.d(e1Var);
                l0Var.A.remove(e1Var);
                l0Var.G();
                break;
            case 1:
                s4.e1 e1Var2 = (s4.e1) this.b;
                mi.m mVar = (mi.m) this.e;
                View view2 = (View) this.c;
                if (view2 instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) view2).getTransitionParams().h = false;
                }
                ((ViewPropertyAnimator) this.d).setListener(null);
                if (mVar.y.remove(e1Var2)) {
                    mVar.u(e1Var2);
                    mVar.G();
                    break;
                }
                break;
            case 2:
                ((s4.e1) this.b).a.setAlpha(1.0f);
                ((AnimatorSet) this.c).removeAllListeners();
                mt mtVar = (mt) this.e;
                kt ktVar = (kt) this.d;
                mtVar.d(ktVar.a);
                mtVar.y.remove(ktVar.a);
                mtVar.A();
                mtVar.d(ktVar.b);
                mtVar.y.remove(ktVar.b);
                mtVar.A();
                break;
            case 3:
                ((aw0) this.e).K1 = false;
                View view3 = (View) this.c;
                if (view3.getParent() != null) {
                    ((tu0) this.b).removeView(view3);
                    ((Bitmap) this.d).recycle();
                    break;
                }
                break;
            case 4:
                q2 q2Var = (q2) this.e;
                TextView[] textViewArr = q2Var.a;
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
                q2Var.f = false;
                CharSequence charSequence = q2Var.e;
                if (charSequence != null) {
                    if (charSequence.equals("timer")) {
                        q2Var.e(true);
                    } else {
                        textViewArr[1].setText(q2Var.e);
                        q2Var.a(textViewArr[0], textViewArr[1], new k2.c(this, 22));
                    }
                    q2Var.e = null;
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
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) this.d;
                if (w0Var != null) {
                    w0Var.setAlpha(1.0f);
                }
                if (profileActivity.fragmentView != null) {
                    profileActivity.e0.setProgressToExpand(0.0f);
                    profileActivity.a.setLayerType(0, null);
                    if (profileActivity.P0 != null) {
                        kVar = ((r2) profileActivity).actionBar;
                        org.telegram.ui.ActionBar.z l4 = kVar.l();
                        ArrayList arrayList = l4.e;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                        l4.removeAllViews();
                        profileActivity.P0 = null;
                    }
                    runnable2.run();
                    if (profileActivity.J1 == 2) {
                        profileActivity.J1 = 1;
                        profileActivity.e0.setForegroundAlpha(1.0f);
                        profileActivity.X.setVisibility(8);
                        profileActivity.n0.setAlpha(1.0f);
                        profileActivity.n0.L();
                        profileActivity.n0.setVisibility(0);
                    }
                    profileActivity.c5 = null;
                    profileActivity.Y.invalidate();
                    profileActivity.m5 = null;
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
                ((mi.m) this.e).getClass();
                break;
            case 2:
                mt mtVar = (mt) this.e;
                kt ktVar = (kt) this.d;
                s4.e1 e1Var = ktVar.a;
                mtVar.getClass();
                s4.e1 e1Var2 = ktVar.b;
                mtVar.getClass();
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

    public k0(mi.m mVar, s4.e1 e1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.a = 1;
        this.e = mVar;
        this.b = e1Var;
        this.c = view;
        this.d = viewPropertyAnimator;
    }

    public k0(mt mtVar, kt ktVar, s4.e1 e1Var, AnimatorSet animatorSet) {
        this.a = 2;
        this.e = mtVar;
        this.d = ktVar;
        this.b = e1Var;
        this.c = animatorSet;
    }

    private final void a(Animator animator) {
    }
}
