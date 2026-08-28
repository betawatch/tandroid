package ih;

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
import org.telegram.ui.Components.n40;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.v60;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.b61;
import org.telegram.ui.rx0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class j3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j3(Object obj, Object obj2, Object obj3, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                wy wyVar = (wy) this.d;
                if (animator.equals(wyVar.I0)) {
                    wyVar.I0 = null;
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
                a7 a7Var = (a7) this.c;
                k3 k3Var = (k3) this.d;
                i4 i4Var = k3Var.a;
                i4Var.q3 = false;
                i4Var.r3 = 1.0f;
                i4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    i4 i4Var2 = k3Var.a;
                    i4Var2.m3 = true;
                    try {
                        i4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                a7Var.setAllowDrawReaction(true);
                a7Var.r = true;
                ImageReceiver imageReceiver = a7Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                i4 i4Var3 = k3Var.a;
                org.telegram.ui.Components.k5 k5Var = i4Var3.k3;
                if (k5Var != null) {
                    k5Var.o(i4Var3);
                    k3Var.a.k3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    pi0 pi0Var = ((org.telegram.ui.ActionBar.g1) view).c;
                    if (pi0Var.getAnimatedDrawable() != null) {
                        pi0Var.getAnimatedDrawable().start();
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
                chatActivityEnterView.F1();
                mh.c0 c0Var = chatActivityEnterView.h0;
                if (c0Var != null) {
                    c0Var.setAlpha(0.0f);
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
                wk0 wk0Var = (wk0) this.c;
                f2.y yVar = (f2.y) this.b;
                wy wyVar = (wy) this.d;
                if (animator.equals(wyVar.I0)) {
                    int L0 = yVar.L0();
                    wk0Var.setTranslationY(0.0f);
                    if (wk0Var == wyVar.z0) {
                        wk0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + wyVar.m2);
                    } else if (wk0Var == wyVar.d0) {
                        wk0Var.setPadding(0, wyVar.X0, 0, AndroidUtilities.dp(44.0f) + wyVar.m2);
                    } else if (wk0Var == wyVar.L) {
                        wk0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + wyVar.m2);
                    }
                    if (L0 != -1) {
                        yVar.h1(L0, 0);
                    }
                    wyVar.I0 = null;
                    break;
                }
                break;
            case 6:
                f50 f50Var = (f50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((n40) this.c).run();
                }
                f50Var.b.setRotationY(0.0f);
                f50Var.i0.setRotationY(0.0f);
                f50Var.A0 = false;
                f50Var.invalidate();
                break;
            case 7:
                v60 v60Var = (v60) this.b;
                v60Var.setProgress(0.0f);
                v60Var.invalidate();
                AndroidUtilities.removeFromParent(v60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                x60 x60Var = (x60) this.d;
                View view2 = x60Var.f;
                viewTreeObserver.removeOnPreDrawListener(x60Var.y);
                if (x60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof fh.f2) {
                        fh.f2 f2Var = (fh.f2) view2;
                        FrameLayout frameLayout = f2Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(f2Var.e);
                        break;
                    }
                }
                break;
            default:
                b61 b61Var = (b61) this.d;
                b61Var.n1 = null;
                b61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((rx0) this.c).run();
                    break;
                }
                break;
        }
    }

    public j3(com.google.firebase.messaging.l lVar, View view) {
        this.a = 4;
        this.d = lVar;
        this.c = view;
        this.b = new m.i3(this, 17);
    }
}
