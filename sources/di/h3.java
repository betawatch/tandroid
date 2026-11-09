package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.j60;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.s30;
import org.telegram.ui.Components.yz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qw0;
import org.telegram.ui.s11;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h3(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
                hy hyVar = (hy) this.d;
                if (animator.equals(hyVar.M0)) {
                    hyVar.M0 = null;
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
        int i7;
        int i10;
        switch (this.a) {
            case 0:
                e7 e7Var = (e7) this.c;
                i3 i3Var = (i3) this.d;
                j4 j4Var = i3Var.a;
                j4Var.d3 = false;
                j4Var.e3 = 1.0f;
                j4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    j4 j4Var2 = i3Var.a;
                    j4Var2.Z2 = true;
                    try {
                        j4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                e7Var.setAllowDrawReaction(true);
                e7Var.r = true;
                ImageReceiver imageReceiver = e7Var.e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                j4 j4Var3 = i3Var.a;
                org.telegram.ui.Components.i5 i5Var = j4Var3.X2;
                if (i5Var != null) {
                    i5Var.n(j4Var3);
                    i3Var.a.X2 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).y.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.z0) {
                    dh0 dh0Var = ((org.telegram.ui.ActionBar.z0) view).c;
                    if (dh0Var.getAnimatedDrawable() != null) {
                        dh0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.c;
                org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) this.b;
                ViewGroup viewGroup = c3Var.b;
                if (viewGroup == null) {
                    viewGroup = c3Var.c;
                }
                if (viewGroup != null && c3Var.m == null && (i7 = c3Var.g) > 0 && (i10 = c3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.k3.g(viewGroup, -c3Var.i, new org.telegram.messenger.voip.k(2, c3Var, h3Var));
                        k3Var.b = null;
                        k3Var.invalidate();
                        break;
                    } else {
                        c3Var.m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(c3Var.m);
                        canvas.translate(0.0f, -c3Var.i);
                        viewGroup.draw(canvas);
                    }
                }
                h3Var.d().setDrawingFromOverlay(false);
                h3Var.release();
                k3Var.b = null;
                k3Var.invalidate();
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.m1.removeView(chatActivityEnterView.e1);
                    viewGroup2.addView(chatActivityEnterView.e1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.e1.setAlpha(1.0f);
                chatActivityEnterView.h1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.H1();
                hi.y yVar = chatActivityEnterView.l0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    chatActivityEnterView.l0.setScaleX(0.0f);
                    chatActivityEnterView.l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && qp.e1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    break;
                }
                break;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.b).setVisibility(4);
                ((ImageView) this.c).sendAccessibilityEvent(8);
                break;
            case 5:
                if (((ab.q) this.d).a) {
                    ((View) this.c).postDelayed((et) this.b, 300L);
                    break;
                }
                break;
            case 6:
                qj0 qj0Var = (qj0) this.c;
                v4.s sVar = (v4.s) this.b;
                hy hyVar = (hy) this.d;
                if (animator.equals(hyVar.M0)) {
                    int L0 = sVar.L0();
                    qj0Var.setTranslationY(0.0f);
                    if (qj0Var == hyVar.D0) {
                        qj0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + hyVar.q2);
                    } else if (qj0Var == hyVar.h0) {
                        qj0Var.setPadding(0, hyVar.b1, 0, org.telegram.messenger.g0.L(44.0f) + hyVar.q2);
                    } else if (qj0Var == hyVar.P) {
                        qj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + hyVar.q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    hyVar.M0 = null;
                    break;
                }
                break;
            case 7:
                p40 p40Var = (p40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((s30) this.c).run();
                }
                p40Var.f.setRotationY(0.0f);
                p40Var.q0.setRotationY(0.0f);
                p40Var.N0 = false;
                p40Var.invalidate();
                break;
            case 8:
                j60 j60Var = (j60) this.b;
                j60Var.setProgress(0.0f);
                j60Var.invalidate();
                org.telegram.messenger.g0.E2(j60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                l60 l60Var = (l60) this.d;
                View view2 = l60Var.f;
                viewTreeObserver.removeOnPreDrawListener(l60Var.y);
                if (l60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof zh.y0) {
                        zh.y0 y0Var = (zh.y0) view2;
                        FrameLayout frameLayout = y0Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(y0Var.e);
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.d;
                k0Var.N0 = null;
                ((org.telegram.ui.Components.voip.y) this.b).E = false;
                org.telegram.ui.Components.voip.y yVar2 = k0Var.E;
                if (yVar2 != null) {
                    if (yVar2.getParent() != null) {
                        k0Var.removeView(k0Var.E);
                        ((org.telegram.ui.Components.voip.y) this.c).e();
                    }
                    k0Var.E = null;
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.E0 = null;
                launchActivity.x0.invalidate();
                launchActivity.m0.invalidate();
                launchActivity.m0.setImageDrawable(null);
                yz0 yz0Var = launchActivity.m0;
                yz0Var.c = null;
                yz0Var.a.setShader(null);
                yz0Var.n = null;
                yz0Var.r = null;
                launchActivity.m0.setVisibility(8);
                launchActivity.n0.setVisibility(8);
                dh0 dh0Var2 = (dh0) this.b;
                if (dh0Var2 != null) {
                    dh0Var2.setImageDrawable((ah0) this.c);
                }
                qs.e().k(qs.q4, new Object[0]);
                if (dh0Var2 != null) {
                    dh0Var2.setVisibility(0);
                }
                yw.y4 = false;
                break;
            default:
                s11 s11Var = (s11) this.d;
                s11Var.s1 = null;
                s11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((qw0) this.c).run();
                    break;
                }
                break;
        }
    }

    public h3(ab.q qVar, View view) {
        this.a = 5;
        this.d = qVar;
        this.c = view;
        this.b = new et(this, 1);
    }
}
