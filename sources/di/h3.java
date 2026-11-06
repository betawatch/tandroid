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
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.o40;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.xz0;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c01;
import org.telegram.ui.q11;
import org.telegram.ui.ww;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
                gy gyVar = (gy) this.d;
                if (animator.equals(gyVar.M0)) {
                    gyVar.M0 = null;
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
                d7 d7Var = (d7) this.c;
                i3 i3Var = (i3) this.d;
                i4 i4Var = i3Var.a;
                i4Var.d3 = false;
                i4Var.e3 = 1.0f;
                i4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    i4 i4Var2 = i3Var.a;
                    i4Var2.Z2 = true;
                    try {
                        i4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                d7Var.setAllowDrawReaction(true);
                d7Var.r = true;
                ImageReceiver imageReceiver = d7Var.e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                i4 i4Var3 = i3Var.a;
                org.telegram.ui.Components.i5 i5Var = i4Var3.X2;
                if (i5Var != null) {
                    i5Var.n(i4Var3);
                    i3Var.a.X2 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).y.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.z0) {
                    ch0 ch0Var = ((org.telegram.ui.ActionBar.z0) view).c;
                    if (ch0Var.getAnimatedDrawable() != null) {
                        ch0Var.getAnimatedDrawable().start();
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
                    ((View) this.c).postDelayed((dt) this.b, 300L);
                    break;
                }
                break;
            case 6:
                pj0 pj0Var = (pj0) this.c;
                v4.s sVar = (v4.s) this.b;
                gy gyVar = (gy) this.d;
                if (animator.equals(gyVar.M0)) {
                    int L0 = sVar.L0();
                    pj0Var.setTranslationY(0.0f);
                    if (pj0Var == gyVar.D0) {
                        pj0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + gyVar.q2);
                    } else if (pj0Var == gyVar.h0) {
                        pj0Var.setPadding(0, gyVar.b1, 0, org.telegram.messenger.g0.L(44.0f) + gyVar.q2);
                    } else if (pj0Var == gyVar.P) {
                        pj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + gyVar.q2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    gyVar.M0 = null;
                    break;
                }
                break;
            case 7:
                o40 o40Var = (o40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((r30) this.c).run();
                }
                o40Var.f.setRotationY(0.0f);
                o40Var.q0.setRotationY(0.0f);
                o40Var.N0 = false;
                o40Var.invalidate();
                break;
            case 8:
                i60 i60Var = (i60) this.b;
                i60Var.setProgress(0.0f);
                i60Var.invalidate();
                org.telegram.messenger.g0.E2(i60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                k60 k60Var = (k60) this.d;
                View view2 = k60Var.f;
                viewTreeObserver.removeOnPreDrawListener(k60Var.y);
                if (k60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof zh.z0) {
                        zh.z0 z0Var = (zh.z0) view2;
                        FrameLayout frameLayout = z0Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(z0Var.e);
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
                xz0 xz0Var = launchActivity.m0;
                xz0Var.c = null;
                xz0Var.a.setShader(null);
                xz0Var.n = null;
                xz0Var.r = null;
                launchActivity.m0.setVisibility(8);
                launchActivity.n0.setVisibility(8);
                ch0 ch0Var2 = (ch0) this.b;
                if (ch0Var2 != null) {
                    ch0Var2.setImageDrawable((zg0) this.c);
                }
                qs.e().k(qs.q4, new Object[0]);
                if (ch0Var2 != null) {
                    ch0Var2.setVisibility(0);
                }
                ww.x4 = false;
                break;
            default:
                q11 q11Var = (q11) this.d;
                q11Var.s1 = null;
                q11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((c01) this.c).run();
                    break;
                }
                break;
        }
    }

    public h3(ab.q qVar, View view) {
        this.a = 5;
        this.d = qVar;
        this.c = view;
        this.b = new dt(this, 1);
    }
}
