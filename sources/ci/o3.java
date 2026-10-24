package ci;

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
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.n50;
import org.telegram.ui.Components.n60;
import org.telegram.ui.Components.t21;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.b61;
import org.telegram.ui.ey;
import org.telegram.ui.k01;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class o3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o3(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                tz tzVar = (tz) this.d;
                if (animator.equals(tzVar.M0)) {
                    tzVar.M0 = null;
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
                m7 m7Var = (m7) this.c;
                p3 p3Var = (p3) this.d;
                p4 p4Var = p3Var.a;
                p4Var.u3 = false;
                p4Var.v3 = 1.0f;
                p4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    p4 p4Var2 = p3Var.a;
                    p4Var2.q3 = true;
                    try {
                        p4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                m7Var.setAllowDrawReaction(true);
                m7Var.r = true;
                ImageReceiver imageReceiver = m7Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                p4 p4Var3 = p3Var.a;
                org.telegram.ui.Components.r5 r5Var = p4Var3.o3;
                if (r5Var != null) {
                    r5Var.o(p4Var3);
                    p3Var.a.o3 = null;
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
                gi.b0 b0Var = chatActivityEnterView.l0;
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
                    ((View) this.c).postDelayed((org.telegram.ui.Cells.u5) this.b, 300L);
                    break;
                }
                break;
            case 5:
                mm0 mm0Var = (mm0) this.c;
                s4.s sVar = (s4.s) this.b;
                tz tzVar = (tz) this.d;
                if (animator.equals(tzVar.M0)) {
                    int L0 = sVar.L0();
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == tzVar.D0) {
                        mm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + tzVar.q2);
                    } else if (mm0Var == tzVar.h0) {
                        mm0Var.setPadding(0, tzVar.b1, 0, AndroidUtilities.dp(44.0f) + tzVar.q2);
                    } else if (mm0Var == tzVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + tzVar.q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    tzVar.M0 = null;
                    break;
                }
                break;
            case 6:
                n60 n60Var = (n60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((n50) this.c).run();
                }
                n60Var.h.setRotationY(0.0f);
                n60Var.r0.setRotationY(0.0f);
                n60Var.O0 = false;
                n60Var.invalidate();
                break;
            case 7:
                h80 h80Var = (h80) this.b;
                h80Var.setProgress(0.0f);
                h80Var.invalidate();
                AndroidUtilities.removeFromParent(h80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                j80 j80Var = (j80) this.d;
                View view2 = j80Var.f;
                viewTreeObserver.removeOnPreDrawListener(j80Var.y);
                if (j80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof yh.g1) {
                        yh.g1 g1Var = (yh.g1) view2;
                        FrameLayout frameLayout = g1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(g1Var.e);
                        break;
                    }
                }
                break;
            case 8:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.G0 = null;
                launchActivity.z0.invalidate();
                launchActivity.o0.invalidate();
                launchActivity.o0.setImageDrawable(null);
                t21 t21Var = launchActivity.o0;
                t21Var.c = null;
                t21Var.a.setShader(null);
                t21Var.n = null;
                t21Var.r = null;
                launchActivity.o0.setVisibility(8);
                launchActivity.p0.setVisibility(8);
                bk0 bk0Var2 = (bk0) this.b;
                if (bk0Var2 != null) {
                    bk0Var2.setImageDrawable((yj0) this.c);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                if (bk0Var2 != null) {
                    bk0Var2.setVisibility(0);
                }
                ey.z4 = false;
                break;
            default:
                b61 b61Var = (b61) this.d;
                b61Var.s1 = null;
                b61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((k01) this.c).run();
                    break;
                }
                break;
        }
    }

    public o3(c2.b bVar, View view) {
        this.a = 4;
        this.d = bVar;
        this.c = view;
        this.b = new org.telegram.ui.Cells.u5(this, 11);
    }
}
