package lh;

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
import org.telegram.ui.Components.b50;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.h70;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.s50;
import org.telegram.ui.a01;
import org.telegram.ui.d61;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f3(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                fz fzVar = (fz) this.d;
                if (animator.equals(fzVar.I0)) {
                    fzVar.I0 = null;
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
                g3 g3Var = (g3) this.d;
                d4 d4Var = g3Var.a;
                d4Var.q3 = false;
                d4Var.r3 = 1.0f;
                d4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    d4 d4Var2 = g3Var.a;
                    d4Var2.m3 = true;
                    try {
                        d4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                x6Var.setAllowDrawReaction(true);
                x6Var.r = true;
                ImageReceiver imageReceiver = x6Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().L(0, false, true);
                }
                d4 d4Var3 = g3Var.a;
                org.telegram.ui.Components.p5 p5Var = d4Var3.k3;
                if (p5Var != null) {
                    p5Var.o(d4Var3);
                    g3Var.a.k3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    aj0 aj0Var = ((org.telegram.ui.ActionBar.g1) view).c;
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
                    chatActivityEnterView.h1.removeView(chatActivityEnterView.a1);
                    viewGroup.addView(chatActivityEnterView.a1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.a1.setAlpha(1.0f);
                chatActivityEnterView.d1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.F1();
                ph.z zVar = chatActivityEnterView.h0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
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
                if (((ab.m) this.d).a) {
                    ((View) this.c).postDelayed((m7) this.b, 300L);
                    break;
                }
                break;
            case 5:
                jl0 jl0Var = (jl0) this.c;
                f2.w wVar = (f2.w) this.b;
                fz fzVar = (fz) this.d;
                if (animator.equals(fzVar.I0)) {
                    int L0 = wVar.L0();
                    jl0Var.setTranslationY(0.0f);
                    if (jl0Var == fzVar.z0) {
                        jl0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + fzVar.m2);
                    } else if (jl0Var == fzVar.d0) {
                        jl0Var.setPadding(0, fzVar.X0, 0, AndroidUtilities.dp(44.0f) + fzVar.m2);
                    } else if (jl0Var == fzVar.L) {
                        jl0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + fzVar.m2);
                    }
                    if (L0 != -1) {
                        wVar.h1(L0, 0);
                    }
                    fzVar.I0 = null;
                    break;
                }
                break;
            case 6:
                s50 s50Var = (s50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((b50) this.c).run();
                }
                s50Var.b.setRotationY(0.0f);
                s50Var.i0.setRotationY(0.0f);
                s50Var.A0 = false;
                s50Var.invalidate();
                break;
            case 7:
                h70 h70Var = (h70) this.b;
                h70Var.setProgress(0.0f);
                h70Var.invalidate();
                AndroidUtilities.removeFromParent(h70Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                j70 j70Var = (j70) this.d;
                View view2 = j70Var.f;
                viewTreeObserver.removeOnPreDrawListener(j70Var.y);
                if (j70Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof ih.y1) {
                        ih.y1 y1Var = (ih.y1) view2;
                        FrameLayout frameLayout = y1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(y1Var.e);
                        break;
                    }
                }
                break;
            default:
                d61 d61Var = (d61) this.d;
                d61Var.n1 = null;
                d61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((a01) this.c).run();
                    break;
                }
                break;
        }
    }

    public f3(ab.m mVar, View view) {
        this.a = 4;
        this.d = mVar;
        this.c = view;
        this.b = new m7(this, 20);
    }
}
