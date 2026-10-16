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
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.p60;
import org.telegram.ui.Components.r50;
import org.telegram.ui.Components.wz;
import org.telegram.ui.l90;
import org.telegram.ui.r71;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class m4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m4(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                wz wzVar = (wz) this.d;
                if (animator.equals(wzVar.M0)) {
                    wzVar.M0 = null;
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
                c9 c9Var = (c9) this.c;
                n4 n4Var = (n4) this.d;
                q5 q5Var = n4Var.a;
                q5Var.u3 = false;
                q5Var.v3 = 1.0f;
                q5Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q5 q5Var2 = n4Var.a;
                    q5Var2.q3 = true;
                    try {
                        q5Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                c9Var.setAllowDrawReaction(true);
                c9Var.r = true;
                ImageReceiver imageReceiver = c9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                q5 q5Var3 = n4Var.a;
                org.telegram.ui.Components.s5 s5Var = q5Var3.o3;
                if (s5Var != null) {
                    s5Var.o(q5Var3);
                    n4Var.a.o3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.e1) {
                    bk0 bk0Var = ((org.telegram.ui.ActionBar.e1) view).c;
                    if (bk0Var.getAnimatedDrawable() != null) {
                        bk0Var.getAnimatedDrawable().start();
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
                chatActivityEnterView.C1();
                fi.b0 b0Var = chatActivityEnterView.l0;
                if (b0Var != null) {
                    b0Var.setAlpha(0.0f);
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
                if (((c2.b) this.d).a) {
                    ((View) this.c).postDelayed((org.telegram.ui.Cells.l7) this.b, 300L);
                    break;
                }
                break;
            case 5:
                mm0 mm0Var = (mm0) this.c;
                s4.s sVar = (s4.s) this.b;
                wz wzVar = (wz) this.d;
                if (animator.equals(wzVar.M0)) {
                    int L0 = sVar.L0();
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == wzVar.D0) {
                        mm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + wzVar.p2);
                    } else if (mm0Var == wzVar.h0) {
                        mm0Var.setPadding(0, wzVar.b1, 0, AndroidUtilities.dp(44.0f) + wzVar.p2);
                    } else if (mm0Var == wzVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + wzVar.p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    wzVar.M0 = null;
                    break;
                }
                break;
            case 6:
                p60 p60Var = (p60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((r50) this.c).run();
                }
                p60Var.h.setRotationY(0.0f);
                p60Var.r0.setRotationY(0.0f);
                p60Var.O0 = false;
                p60Var.invalidate();
                break;
            case 7:
                j80 j80Var = (j80) this.b;
                j80Var.setProgress(0.0f);
                j80Var.invalidate();
                AndroidUtilities.removeFromParent(j80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                l80 l80Var = (l80) this.d;
                View view2 = l80Var.f;
                viewTreeObserver.removeOnPreDrawListener(l80Var.y);
                if (l80Var.P) {
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
                r71 r71Var = (r71) this.d;
                r71Var.r1 = null;
                r71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((l90) this.c).run();
                    break;
                }
                break;
        }
    }

    public m4(c2.b bVar, View view) {
        this.a = 4;
        this.d = bVar;
        this.c = view;
        this.b = new org.telegram.ui.Cells.l7(this, 9);
    }
}
