package ai;

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
import org.telegram.ui.Components.a80;
import org.telegram.ui.Components.e60;
import org.telegram.ui.Components.g50;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.a71;
import org.telegram.ui.c90;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class y4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y4(Object obj, Object obj2, Object obj3, int i10) {
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
                if (animator.equals(mzVar.M0)) {
                    mzVar.M0 = null;
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
                q9 q9Var = (q9) this.c;
                z4 z4Var = (z4) this.d;
                e6 e6Var = z4Var.a;
                e6Var.u3 = false;
                e6Var.v3 = 1.0f;
                e6Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    e6 e6Var2 = z4Var.a;
                    e6Var2.q3 = true;
                    try {
                        e6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                q9Var.setAllowDrawReaction(true);
                q9Var.r = true;
                ImageReceiver imageReceiver = q9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                e6 e6Var3 = z4Var.a;
                org.telegram.ui.Components.q5 q5Var = e6Var3.o3;
                if (q5Var != null) {
                    q5Var.o(e6Var3);
                    z4Var.a.o3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    nj0 nj0Var = ((org.telegram.ui.ActionBar.e1) view).c;
                    if (nj0Var.getAnimatedDrawable() != null) {
                        nj0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.b;
                if (viewGroup != null) {
                    chatActivityEnterView.m1.removeView(chatActivityEnterView.e1);
                    viewGroup.addView(chatActivityEnterView.e1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.e1.setAlpha(1.0f);
                chatActivityEnterView.h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.F1();
                ei.c0 c0Var = chatActivityEnterView.l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.l0.setScaleX(0.0f);
                    chatActivityEnterView.l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    break;
                }
                break;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.b).setVisibility(4);
                ((ImageView) this.c).sendAccessibilityEvent(8);
                break;
            case 4:
                if (((com.google.firebase.messaging.m) this.d).a) {
                    ((View) this.c).postDelayed((org.telegram.ui.Cells.t6) this.b, 300L);
                    break;
                }
                break;
            case 5:
                yl0 yl0Var = (yl0) this.c;
                s4.s sVar = (s4.s) this.b;
                mz mzVar = (mz) this.d;
                if (animator.equals(mzVar.M0)) {
                    int L0 = sVar.L0();
                    yl0Var.setTranslationY(0.0f);
                    if (yl0Var == mzVar.D0) {
                        yl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + mzVar.p2);
                    } else if (yl0Var == mzVar.h0) {
                        yl0Var.setPadding(0, mzVar.b1, 0, AndroidUtilities.dp(44.0f) + mzVar.p2);
                    } else if (yl0Var == mzVar.P) {
                        yl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + mzVar.p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    mzVar.M0 = null;
                    break;
                }
                break;
            case 6:
                e60 e60Var = (e60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((g50) this.c).run();
                }
                e60Var.h.setRotationY(0.0f);
                e60Var.r0.setRotationY(0.0f);
                e60Var.J0 = false;
                e60Var.invalidate();
                break;
            case 7:
                y70 y70Var = (y70) this.b;
                y70Var.setProgress(0.0f);
                y70Var.invalidate();
                AndroidUtilities.removeFromParent(y70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                a80 a80Var = (a80) this.d;
                View view2 = a80Var.f;
                viewTreeObserver.removeOnPreDrawListener(a80Var.y);
                if (a80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof xh.j1) {
                        xh.j1 j1Var = (xh.j1) view2;
                        FrameLayout frameLayout = j1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(j1Var.e);
                        break;
                    }
                }
                break;
            default:
                a71 a71Var = (a71) this.d;
                a71Var.r1 = null;
                a71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((c90) this.c).run();
                    break;
                }
                break;
        }
    }

    public y4(com.google.firebase.messaging.m mVar, View view) {
        this.a = 4;
        this.d = mVar;
        this.c = view;
        this.b = new org.telegram.ui.Cells.t6(this, 11);
    }
}
