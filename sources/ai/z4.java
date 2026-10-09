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
import org.telegram.ui.Components.a00;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.v50;
import org.telegram.ui.g90;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class z4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ z4(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                a00 a00Var = (a00) this.d;
                if (animator.equals(a00Var.M0)) {
                    a00Var.M0 = null;
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
                r9 r9Var = (r9) this.c;
                a5 a5Var = (a5) this.d;
                f6 f6Var = a5Var.a;
                f6Var.u3 = false;
                f6Var.v3 = 1.0f;
                f6Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    f6 f6Var2 = a5Var.a;
                    f6Var2.q3 = true;
                    try {
                        f6Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                r9Var.setAllowDrawReaction(true);
                r9Var.r = true;
                ImageReceiver imageReceiver = r9Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                f6 f6Var3 = a5Var.a;
                org.telegram.ui.Components.s5 s5Var = f6Var3.o3;
                if (s5Var != null) {
                    s5Var.o(f6Var3);
                    a5Var.a.o3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.f1) {
                    fk0 fk0Var = ((org.telegram.ui.ActionBar.f1) view).c;
                    if (fk0Var.getAnimatedDrawable() != null) {
                        fk0Var.getAnimatedDrawable().start();
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
                chatActivityEnterView.D1();
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
                qm0 qm0Var = (qm0) this.c;
                s4.s sVar = (s4.s) this.b;
                a00 a00Var = (a00) this.d;
                if (animator.equals(a00Var.M0)) {
                    int L0 = sVar.L0();
                    qm0Var.setTranslationY(0.0f);
                    if (qm0Var == a00Var.D0) {
                        qm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + a00Var.p2);
                    } else if (qm0Var == a00Var.h0) {
                        qm0Var.setPadding(0, a00Var.b1, 0, AndroidUtilities.dp(44.0f) + a00Var.p2);
                    } else if (qm0Var == a00Var.P) {
                        qm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + a00Var.p2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    a00Var.M0 = null;
                    break;
                }
                break;
            case 6:
                t60 t60Var = (t60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((v50) this.c).run();
                }
                t60Var.h.setRotationY(0.0f);
                t60Var.r0.setRotationY(0.0f);
                t60Var.O0 = false;
                t60Var.invalidate();
                break;
            case 7:
                n80 n80Var = (n80) this.b;
                n80Var.setProgress(0.0f);
                n80Var.invalidate();
                AndroidUtilities.removeFromParent(n80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                p80 p80Var = (p80) this.d;
                View view2 = p80Var.f;
                viewTreeObserver.removeOnPreDrawListener(p80Var.y);
                if (p80Var.P) {
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
                k71 k71Var = (k71) this.d;
                k71Var.r1 = null;
                k71Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((g90) this.c).run();
                    break;
                }
                break;
        }
    }

    public z4(com.google.firebase.messaging.m mVar, View view) {
        this.a = 4;
        this.d = mVar;
        this.c = view;
        this.b = new org.telegram.ui.Cells.t6(this, 10);
    }
}
