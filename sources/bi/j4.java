package bi;

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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l70;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.w50;
import org.telegram.ui.h90;
import org.telegram.ui.j71;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class j4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j4(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.M0)) {
                    kzVar.M0 = null;
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
                z8 z8Var = (z8) this.c;
                k4 k4Var = (k4) this.d;
                o5 o5Var = k4Var.a;
                o5Var.u3 = false;
                o5Var.v3 = 1.0f;
                o5Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    o5 o5Var2 = k4Var.a;
                    o5Var2.q3 = true;
                    try {
                        o5Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                z8Var.setAllowDrawReaction(true);
                z8Var.r = true;
                ImageReceiver imageReceiver = z8Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                o5 o5Var3 = k4Var.a;
                org.telegram.ui.Components.q5 q5Var = o5Var3.o3;
                if (q5Var != null) {
                    q5Var.o(o5Var3);
                    k4Var.a.o3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    aj0 aj0Var = ((org.telegram.ui.ActionBar.f1) view).c;
                    if (aj0Var.getAnimatedDrawable() != null) {
                        aj0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.b;
                if (viewGroup != null) {
                    chatActivityEnterView.l1.removeView(chatActivityEnterView.e1);
                    viewGroup.addView(chatActivityEnterView.e1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.e1.setAlpha(1.0f);
                chatActivityEnterView.h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.F1();
                fi.c0 c0Var = chatActivityEnterView.l0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
                    chatActivityEnterView.l0.setScaleX(0.0f);
                    chatActivityEnterView.l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.N1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.N1.b();
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
                    ((View) this.c).postDelayed((org.telegram.ui.Cells.l7) this.b, 300L);
                    break;
                }
                break;
            case 5:
                ll0 ll0Var = (ll0) this.c;
                s4.s sVar = (s4.s) this.b;
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.M0)) {
                    int L0 = sVar.L0();
                    ll0Var.setTranslationY(0.0f);
                    if (ll0Var == kzVar.D0) {
                        ll0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + kzVar.q2);
                    } else if (ll0Var == kzVar.h0) {
                        ll0Var.setPadding(0, kzVar.b1, 0, AndroidUtilities.dp(44.0f) + kzVar.q2);
                    } else if (ll0Var == kzVar.P) {
                        ll0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + kzVar.q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    kzVar.M0 = null;
                    break;
                }
                break;
            case 6:
                w50 w50Var = (w50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((d50) this.c).run();
                }
                w50Var.b.setRotationY(0.0f);
                w50Var.m0.setRotationY(0.0f);
                w50Var.E0 = false;
                w50Var.invalidate();
                break;
            case 7:
                l70 l70Var = (l70) this.b;
                l70Var.setProgress(0.0f);
                l70Var.invalidate();
                AndroidUtilities.removeFromParent(l70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                n70 n70Var = (n70) this.d;
                View view2 = n70Var.f;
                viewTreeObserver.removeOnPreDrawListener(n70Var.y);
                if (n70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof yh.h1) {
                        yh.h1 h1Var = (yh.h1) view2;
                        FrameLayout frameLayout = h1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(h1Var.e);
                        break;
                    }
                }
                break;
            default:
                j71 j71Var = (j71) this.d;
                j71Var.r1 = null;
                j71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((h90) this.c).run();
                    break;
                }
                break;
        }
    }

    public j4(com.google.firebase.messaging.m mVar, View view) {
        this.a = 4;
        this.d = mVar;
        this.c = view;
        this.b = new org.telegram.ui.Cells.l7(this, 10);
    }
}
