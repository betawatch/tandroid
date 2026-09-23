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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.x50;
import org.telegram.ui.d90;
import org.telegram.ui.z61;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
                lz lzVar = (lz) this.d;
                if (animator.equals(lzVar.M0)) {
                    lzVar.M0 = null;
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
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    bj0 bj0Var = ((org.telegram.ui.ActionBar.f1) view).c;
                    if (bj0Var.getAnimatedDrawable() != null) {
                        bj0Var.getAnimatedDrawable().start();
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
                chatActivityEnterView.G1();
                ei.c0 c0Var = chatActivityEnterView.l0;
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
                ml0 ml0Var = (ml0) this.c;
                s4.s sVar = (s4.s) this.b;
                lz lzVar = (lz) this.d;
                if (animator.equals(lzVar.M0)) {
                    int L0 = sVar.L0();
                    ml0Var.setTranslationY(0.0f);
                    if (ml0Var == lzVar.D0) {
                        ml0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + lzVar.p2);
                    } else if (ml0Var == lzVar.h0) {
                        ml0Var.setPadding(0, lzVar.b1, 0, AndroidUtilities.dp(44.0f) + lzVar.p2);
                    } else if (ml0Var == lzVar.P) {
                        ml0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + lzVar.p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    lzVar.M0 = null;
                    break;
                }
                break;
            case 6:
                x50 x50Var = (x50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((e50) this.c).run();
                }
                x50Var.b.setRotationY(0.0f);
                x50Var.m0.setRotationY(0.0f);
                x50Var.E0 = false;
                x50Var.invalidate();
                break;
            case 7:
                m70 m70Var = (m70) this.b;
                m70Var.setProgress(0.0f);
                m70Var.invalidate();
                AndroidUtilities.removeFromParent(m70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                o70 o70Var = (o70) this.d;
                View view2 = o70Var.f;
                viewTreeObserver.removeOnPreDrawListener(o70Var.y);
                if (o70Var.P) {
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
                z61 z61Var = (z61) this.d;
                z61Var.r1 = null;
                z61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((d90) this.c).run();
                    break;
                }
                break;
        }
    }

    public y4(com.google.firebase.messaging.m mVar, View view) {
        this.a = 4;
        this.d = mVar;
        this.c = view;
        this.b = new org.telegram.ui.Cells.l7(this, 10);
    }
}
