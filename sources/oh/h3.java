package oh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.h50;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.z50;
import org.telegram.ui.r61;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class h3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h3(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                mz mzVar = (mz) this.d;
                if (animator.equals(mzVar.J0)) {
                    mzVar.J0 = null;
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
                y6 y6Var = (y6) this.c;
                i3 i3Var = (i3) this.d;
                f4 f4Var = i3Var.a;
                f4Var.r3 = false;
                f4Var.s3 = 1.0f;
                f4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f4 f4Var2 = i3Var.a;
                    f4Var2.n3 = true;
                    try {
                        f4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                y6Var.setAllowDrawReaction(true);
                y6Var.r = true;
                ImageReceiver imageReceiver = y6Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                f4 f4Var3 = i3Var.a;
                org.telegram.ui.Components.l5 l5Var = f4Var3.l3;
                if (l5Var != null) {
                    l5Var.o(f4Var3);
                    i3Var.a.l3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    lj0 lj0Var = ((org.telegram.ui.ActionBar.g1) view).c;
                    if (lj0Var.getAnimatedDrawable() != null) {
                        lj0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.b;
                if (viewGroup != null) {
                    chatActivityEnterView.i1.removeView(chatActivityEnterView.b1);
                    viewGroup.addView(chatActivityEnterView.b1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.b1.setAlpha(1.0f);
                chatActivityEnterView.e1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.F1();
                sh.z zVar = chatActivityEnterView.i0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    chatActivityEnterView.i0.setScaleX(0.0f);
                    chatActivityEnterView.i0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.K1 != null && chatActivityEnterView.M && !chatActivityEnterView.L && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.K1.b();
                    break;
                }
                break;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).Q = false;
                ((View) this.b).setVisibility(4);
                ((ImageView) this.c).sendAccessibilityEvent(8);
                break;
            case 4:
                if (((cb.m) this.d).a) {
                    ((View) this.c).postDelayed((m2.b) this.b, 300L);
                    break;
                }
                break;
            case 5:
                tl0 tl0Var = (tl0) this.c;
                f2.w wVar = (f2.w) this.b;
                mz mzVar = (mz) this.d;
                if (animator.equals(mzVar.J0)) {
                    int L0 = wVar.L0();
                    tl0Var.setTranslationY(0.0f);
                    if (tl0Var == mzVar.A0) {
                        tl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + mzVar.n2);
                    } else if (tl0Var == mzVar.e0) {
                        tl0Var.setPadding(0, mzVar.Y0, 0, AndroidUtilities.dp(44.0f) + mzVar.n2);
                    } else if (tl0Var == mzVar.M) {
                        tl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + mzVar.n2);
                    }
                    if (L0 != -1) {
                        wVar.h1(L0, 0);
                    }
                    mzVar.J0 = null;
                    break;
                }
                break;
            case 6:
                z50 z50Var = (z50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((h50) this.c).run();
                }
                z50Var.b.setRotationY(0.0f);
                z50Var.j0.setRotationY(0.0f);
                z50Var.B0 = false;
                z50Var.invalidate();
                break;
            case 7:
                o70 o70Var = (o70) this.b;
                o70Var.setProgress(0.0f);
                o70Var.invalidate();
                AndroidUtilities.removeFromParent(o70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                q70 q70Var = (q70) this.d;
                View view2 = q70Var.f;
                viewTreeObserver.removeOnPreDrawListener(q70Var.y);
                if (q70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof lh.x1) {
                        lh.x1 x1Var = (lh.x1) view2;
                        FrameLayout frameLayout = x1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(x1Var.e);
                        break;
                    }
                }
                break;
            default:
                r61 r61Var = (r61) this.d;
                r61Var.o1 = null;
                r61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((ky0) this.c).run();
                    break;
                }
                break;
        }
    }

    public h3(cb.m mVar, View view) {
        this.a = 4;
        this.d = mVar;
        this.c = view;
        this.b = new m2.b(this, 19);
    }
}
