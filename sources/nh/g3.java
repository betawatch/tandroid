package nh;

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
import org.telegram.ui.Components.f50;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.jy0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.m70;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.x50;
import org.telegram.ui.q61;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class g3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g3(Object obj, Object obj2, Object obj3, int i10) {
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
                if (animator.equals(kzVar.J0)) {
                    kzVar.J0 = null;
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
                h3 h3Var = (h3) this.d;
                d4 d4Var = h3Var.a;
                d4Var.r3 = false;
                d4Var.s3 = 1.0f;
                d4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d4 d4Var2 = h3Var.a;
                    d4Var2.n3 = true;
                    try {
                        d4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                y6Var.setAllowDrawReaction(true);
                y6Var.r = true;
                ImageReceiver imageReceiver = y6Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                d4 d4Var3 = h3Var.a;
                org.telegram.ui.Components.l5 l5Var = d4Var3.l3;
                if (l5Var != null) {
                    l5Var.o(d4Var3);
                    h3Var.a.l3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    jj0 jj0Var = ((org.telegram.ui.ActionBar.g1) view).c;
                    if (jj0Var.getAnimatedDrawable() != null) {
                        jj0Var.getAnimatedDrawable().start();
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
                rh.a0 a0Var = chatActivityEnterView.i0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
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
                sl0 sl0Var = (sl0) this.c;
                f2.w wVar = (f2.w) this.b;
                kz kzVar = (kz) this.d;
                if (animator.equals(kzVar.J0)) {
                    int L0 = wVar.L0();
                    sl0Var.setTranslationY(0.0f);
                    if (sl0Var == kzVar.A0) {
                        sl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + kzVar.n2);
                    } else if (sl0Var == kzVar.e0) {
                        sl0Var.setPadding(0, kzVar.Y0, 0, AndroidUtilities.dp(44.0f) + kzVar.n2);
                    } else if (sl0Var == kzVar.M) {
                        sl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + kzVar.n2);
                    }
                    if (L0 != -1) {
                        wVar.h1(L0, 0);
                    }
                    kzVar.J0 = null;
                    break;
                }
                break;
            case 6:
                x50 x50Var = (x50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((f50) this.c).run();
                }
                x50Var.b.setRotationY(0.0f);
                x50Var.j0.setRotationY(0.0f);
                x50Var.B0 = false;
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
                    if (view2 instanceof kh.x1) {
                        kh.x1 x1Var = (kh.x1) view2;
                        FrameLayout frameLayout = x1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(x1Var.e);
                        break;
                    }
                }
                break;
            default:
                q61 q61Var = (q61) this.d;
                q61Var.o1 = null;
                q61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((jy0) this.c).run();
                    break;
                }
                break;
        }
    }

    public g3(cb.m mVar, View view) {
        this.a = 4;
        this.d = mVar;
        this.c = view;
        this.b = new m2.b(this, 19);
    }
}
