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
import org.telegram.ui.Components.c60;
import org.telegram.ui.Components.d50;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.h90;
import org.telegram.ui.j71;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
                q9 q9Var = (q9) this.c;
                z4 z4Var = (z4) this.d;
                f6 f6Var = z4Var.a;
                f6Var.u3 = false;
                f6Var.v3 = 1.0f;
                f6Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f6 f6Var2 = z4Var.a;
                    f6Var2.q3 = true;
                    try {
                        f6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                q9Var.setAllowDrawReaction(true);
                q9Var.r = true;
                ImageReceiver imageReceiver = q9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                f6 f6Var3 = z4Var.a;
                org.telegram.ui.Components.p5 p5Var = f6Var3.o3;
                if (p5Var != null) {
                    p5Var.o(f6Var3);
                    z4Var.a.o3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    nj0 nj0Var = ((org.telegram.ui.ActionBar.f1) view).c;
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
                chatActivityEnterView.E1();
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
                    ((View) this.c).postDelayed((org.telegram.ui.Cells.u6) this.b, 300L);
                    break;
                }
                break;
            case 5:
                yl0 yl0Var = (yl0) this.c;
                s4.s sVar = (s4.s) this.b;
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.M0)) {
                    int L0 = sVar.L0();
                    yl0Var.setTranslationY(0.0f);
                    if (yl0Var == kzVar.D0) {
                        yl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + kzVar.p2);
                    } else if (yl0Var == kzVar.h0) {
                        yl0Var.setPadding(0, kzVar.b1, 0, AndroidUtilities.dp(44.0f) + kzVar.p2);
                    } else if (yl0Var == kzVar.P) {
                        yl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + kzVar.p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    kzVar.M0 = null;
                    break;
                }
                break;
            case 6:
                c60 c60Var = (c60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((d50) this.c).run();
                }
                c60Var.h.setRotationY(0.0f);
                c60Var.r0.setRotationY(0.0f);
                c60Var.J0 = false;
                c60Var.invalidate();
                break;
            case 7:
                w70 w70Var = (w70) this.b;
                w70Var.setProgress(0.0f);
                w70Var.invalidate();
                AndroidUtilities.removeFromParent(w70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                y70 y70Var = (y70) this.d;
                View view2 = y70Var.f;
                viewTreeObserver.removeOnPreDrawListener(y70Var.y);
                if (y70Var.P) {
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

    public y4(com.google.firebase.messaging.m mVar, View view) {
        this.a = 4;
        this.d = mVar;
        this.c = view;
        this.b = new org.telegram.ui.Cells.u6(this, 11);
    }
}
