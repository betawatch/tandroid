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
import org.telegram.ui.sw0;
import org.telegram.ui.t11;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                org.telegram.ui.Components.h5 h5Var = j4Var3.X2;
                if (h5Var != null) {
                    h5Var.n(j4Var3);
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
                org.telegram.ui.ActionBar.l3 l3Var = (org.telegram.ui.ActionBar.l3) this.d;
                org.telegram.ui.ActionBar.i3 i3Var2 = (org.telegram.ui.ActionBar.i3) this.c;
                org.telegram.ui.ActionBar.d3 d3Var = (org.telegram.ui.ActionBar.d3) this.b;
                ViewGroup viewGroup = d3Var.b;
                if (viewGroup == null) {
                    viewGroup = d3Var.c;
                }
                if (viewGroup != null && d3Var.m == null && (i7 = d3Var.g) > 0 && (i10 = d3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.l3.g(viewGroup, -d3Var.i, new org.telegram.messenger.voip.k(2, d3Var, i3Var2));
                        l3Var.b = null;
                        l3Var.invalidate();
                        break;
                    } else {
                        d3Var.m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(d3Var.m);
                        canvas.translate(0.0f, -d3Var.i);
                        viewGroup.draw(canvas);
                    }
                }
                i3Var2.d().setDrawingFromOverlay(false);
                i3Var2.release();
                l3Var.b = null;
                l3Var.invalidate();
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
                zw.y4 = false;
                break;
            default:
                t11 t11Var = (t11) this.d;
                t11Var.s1 = null;
                t11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((sw0) this.c).run();
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
