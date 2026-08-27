package jh;

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
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.k50;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.s40;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.a01;
import org.telegram.ui.a61;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                yy yyVar = (yy) this.d;
                if (animator.equals(yyVar.I0)) {
                    yyVar.I0 = null;
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
                x6 x6Var = (x6) this.c;
                i3 i3Var = (i3) this.d;
                e4 e4Var = i3Var.a;
                e4Var.q3 = false;
                e4Var.r3 = 1.0f;
                e4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    e4 e4Var2 = i3Var.a;
                    e4Var2.m3 = true;
                    try {
                        e4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                x6Var.setAllowDrawReaction(true);
                x6Var.r = true;
                ImageReceiver imageReceiver = x6Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                e4 e4Var3 = i3Var.a;
                org.telegram.ui.Components.k5 k5Var = e4Var3.k3;
                if (k5Var != null) {
                    k5Var.o(e4Var3);
                    i3Var.a.k3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    ri0 ri0Var = ((org.telegram.ui.ActionBar.f1) view).c;
                    if (ri0Var.getAnimatedDrawable() != null) {
                        ri0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 2:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup = (ViewGroup) this.b;
                if (viewGroup != null) {
                    chatActivityEnterView.h1.removeView(chatActivityEnterView.a1);
                    viewGroup.addView(chatActivityEnterView.a1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.a1.setAlpha(1.0f);
                chatActivityEnterView.d1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.E1();
                nh.a0 a0Var = chatActivityEnterView.h0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    chatActivityEnterView.h0.setScaleX(0.0f);
                    chatActivityEnterView.h0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.J1 != null && chatActivityEnterView.L && !chatActivityEnterView.K && MessagesController.getGlobalMainSettings().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.J1.b();
                    break;
                }
                break;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).P = false;
                ((View) this.b).setVisibility(4);
                ((ImageView) this.c).sendAccessibilityEvent(8);
                break;
            case 4:
                if (((com.google.firebase.messaging.l) this.d).a) {
                    ((View) this.c).postDelayed((m.i3) this.b, 300L);
                    break;
                }
                break;
            case 5:
                zk0 zk0Var = (zk0) this.c;
                f2.x xVar = (f2.x) this.b;
                yy yyVar = (yy) this.d;
                if (animator.equals(yyVar.I0)) {
                    int L0 = xVar.L0();
                    zk0Var.setTranslationY(0.0f);
                    if (zk0Var == yyVar.z0) {
                        zk0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + yyVar.m2);
                    } else if (zk0Var == yyVar.d0) {
                        zk0Var.setPadding(0, yyVar.X0, 0, AndroidUtilities.dp(44.0f) + yyVar.m2);
                    } else if (zk0Var == yyVar.L) {
                        zk0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + yyVar.m2);
                    }
                    if (L0 != -1) {
                        xVar.h1(L0, 0);
                    }
                    yyVar.I0 = null;
                    break;
                }
                break;
            case 6:
                k50 k50Var = (k50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((s40) this.c).run();
                }
                k50Var.b.setRotationY(0.0f);
                k50Var.i0.setRotationY(0.0f);
                k50Var.A0 = false;
                k50Var.invalidate();
                break;
            case 7:
                z60 z60Var = (z60) this.b;
                z60Var.setProgress(0.0f);
                z60Var.invalidate();
                AndroidUtilities.removeFromParent(z60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                b70 b70Var = (b70) this.d;
                View view2 = b70Var.f;
                viewTreeObserver.removeOnPreDrawListener(b70Var.y);
                if (b70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof gh.b2) {
                        gh.b2 b2Var = (gh.b2) view2;
                        FrameLayout frameLayout = b2Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(b2Var.e);
                        break;
                    }
                }
                break;
            default:
                a61 a61Var = (a61) this.d;
                a61Var.n1 = null;
                a61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((a01) this.c).run();
                    break;
                }
                break;
        }
    }

    public h3(com.google.firebase.messaging.l lVar, View view) {
        this.a = 4;
        this.d = lVar;
        this.c = view;
        this.b = new m.i3(this, 17);
    }
}
