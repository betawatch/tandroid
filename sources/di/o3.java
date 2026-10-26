package di;

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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.o60;
import org.telegram.ui.Components.p50;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c61;
import org.telegram.ui.cy;
import org.telegram.ui.o01;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                sz szVar = (sz) this.d;
                if (animator.equals(szVar.M0)) {
                    szVar.M0 = null;
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
                q4 q4Var = p3Var.a;
                q4Var.j3 = false;
                q4Var.k3 = 1.0f;
                q4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q4 q4Var2 = p3Var.a;
                    q4Var2.f3 = true;
                    try {
                        q4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                m7Var.setAllowDrawReaction(true);
                m7Var.r = true;
                ImageReceiver imageReceiver = m7Var.e;
                if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().N(0, false, true);
                }
                q4 q4Var3 = p3Var.a;
                org.telegram.ui.Components.t5 t5Var = q4Var3.d3;
                if (t5Var != null) {
                    t5Var.o(q4Var3);
                    p3Var.a.d3 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).x.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.g1) {
                    ak0 ak0Var = ((org.telegram.ui.ActionBar.g1) view).c;
                    if (ak0Var.getAnimatedDrawable() != null) {
                        ak0Var.getAnimatedDrawable().start();
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
                hi.i0 i0Var = chatActivityEnterView.l0;
                if (i0Var != null) {
                    i0Var.setAlpha(0.0f);
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
                    ((View) this.c).postDelayed((m.g3) this.b, 300L);
                    break;
                }
                break;
            case 5:
                mm0 mm0Var = (mm0) this.c;
                s4.t tVar = (s4.t) this.b;
                sz szVar = (sz) this.d;
                if (animator.equals(szVar.M0)) {
                    int L0 = tVar.L0();
                    mm0Var.setTranslationY(0.0f);
                    if (mm0Var == szVar.D0) {
                        mm0Var.setPadding(0, AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(44.0f) + szVar.q2);
                    } else if (mm0Var == szVar.h0) {
                        mm0Var.setPadding(0, szVar.b1, 0, AndroidUtilities.dp(44.0f) + szVar.q2);
                    } else if (mm0Var == szVar.P) {
                        mm0Var.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(36.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(44.0f) + szVar.q2);
                    }
                    if (L0 != -1) {
                        tVar.h1(L0, 0);
                    }
                    szVar.M0 = null;
                    break;
                }
                break;
            case 6:
                o60 o60Var = (o60) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((p50) this.c).run();
                }
                o60Var.h.setRotationY(0.0f);
                o60Var.r0.setRotationY(0.0f);
                o60Var.O0 = false;
                o60Var.invalidate();
                break;
            case 7:
                i80 i80Var = (i80) this.b;
                i80Var.setProgress(0.0f);
                i80Var.invalidate();
                AndroidUtilities.removeFromParent(i80Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                k80 k80Var = (k80) this.d;
                View view2 = k80Var.f;
                viewTreeObserver.removeOnPreDrawListener(k80Var.y);
                if (k80Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof zh.g1) {
                        zh.g1 g1Var = (zh.g1) view2;
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
                b31 b31Var = launchActivity.o0;
                b31Var.c = null;
                b31Var.a.setShader(null);
                b31Var.n = null;
                b31Var.r = null;
                launchActivity.o0.setVisibility(8);
                launchActivity.p0.setVisibility(8);
                ak0 ak0Var2 = (ak0) this.b;
                if (ak0Var2 != null) {
                    ak0Var2.setImageDrawable((xj0) this.c);
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.themeAccentListUpdated, new Object[0]);
                if (ak0Var2 != null) {
                    ak0Var2.setVisibility(0);
                }
                cy.y4 = false;
                break;
            default:
                c61 c61Var = (c61) this.d;
                c61Var.s1 = null;
                c61Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((o01) this.c).run();
                    break;
                }
                break;
        }
    }

    public o3(c2.b bVar, View view) {
        this.a = 4;
        this.d = bVar;
        this.c = view;
        this.b = new m.g3(this, 15);
    }
}
