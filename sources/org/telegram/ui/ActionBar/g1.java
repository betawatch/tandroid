package org.telegram.ui.ActionBar;

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
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.bi0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.j40;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ay;
import org.telegram.ui.i31;
import org.telegram.ui.m90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g1 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g1(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 5:
                vy vyVar = (vy) this.d;
                if (animator.equals(vyVar.M0)) {
                    vyVar.M0 = null;
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
        int i10;
        int i11;
        switch (this.a) {
            case 0:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).y.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof b1) {
                    ei0 ei0Var = ((b1) view).c;
                    if (ei0Var.getAnimatedDrawable() != null) {
                        ei0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 1:
                q3 q3Var = (q3) this.d;
                n3 n3Var = (n3) this.c;
                h3 h3Var = (h3) this.b;
                ViewGroup viewGroup = h3Var.b;
                if (viewGroup == null) {
                    viewGroup = h3Var.c;
                }
                if (viewGroup != null && h3Var.m == null && (i10 = h3Var.g) > 0 && (i11 = h3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        q3.g(viewGroup, -h3Var.i, new ag.e0(9, h3Var, n3Var));
                        q3Var.b = null;
                        q3Var.invalidate();
                        break;
                    } else {
                        h3Var.m = Bitmap.createBitmap(i10, i11, Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(h3Var.m);
                        canvas.translate(0.0f, -h3Var.i);
                        viewGroup.draw(canvas);
                    }
                }
                n3Var.d().setDrawingFromOverlay(false);
                n3Var.release();
                q3Var.b = null;
                q3Var.invalidate();
                break;
            case 2:
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
                chatActivityEnterView.E1();
                xh.w wVar = chatActivityEnterView.l0;
                if (wVar != null) {
                    wVar.setAlpha(0.0f);
                    chatActivityEnterView.l0.setScaleX(0.0f);
                    chatActivityEnterView.l0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.O1 != null && chatActivityEnterView.P && !chatActivityEnterView.O && vp.d1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.O1.b();
                    break;
                }
                break;
            case 3:
                ((ChatAttachAlertPhotoLayout) this.d).T = false;
                ((View) this.c).setVisibility(4);
                ((ImageView) this.b).sendAccessibilityEvent(8);
                break;
            case 4:
                if (((ac.a) this.d).a) {
                    ((View) this.c).postDelayed((mg.c2) this.b, 300L);
                    break;
                }
                break;
            case 5:
                tk0 tk0Var = (tk0) this.c;
                s4.r rVar = (s4.r) this.b;
                vy vyVar = (vy) this.d;
                if (animator.equals(vyVar.M0)) {
                    int L0 = rVar.L0();
                    tk0Var.setTranslationY(0.0f);
                    if (tk0Var == vyVar.D0) {
                        tk0Var.setPadding(0, org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(44.0f) + vyVar.q2);
                    } else if (tk0Var == vyVar.h0) {
                        tk0Var.setPadding(0, vyVar.b1, 0, org.telegram.messenger.i0.L(44.0f) + vyVar.q2);
                    } else if (tk0Var == vyVar.P) {
                        tk0Var.setPadding(org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(5.0f), org.telegram.messenger.i0.L(44.0f) + vyVar.q2);
                    }
                    if (L0 != -1) {
                        rVar.h1(L0, 0);
                    }
                    vyVar.M0 = null;
                    break;
                }
                break;
            case 6:
                e50 e50Var = (e50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((j40) this.c).run();
                }
                e50Var.f.setRotationY(0.0f);
                e50Var.q0.setRotationY(0.0f);
                e50Var.N0 = false;
                e50Var.invalidate();
                break;
            case 7:
                x60 x60Var = (x60) this.b;
                x60Var.setProgress(0.0f);
                x60Var.invalidate();
                org.telegram.messenger.i0.E2(x60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                z60 z60Var = (z60) this.d;
                View view2 = z60Var.f;
                viewTreeObserver.removeOnPreDrawListener(z60Var.y);
                if (z60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof ph.c1) {
                        ph.c1 c1Var = (ph.c1) view2;
                        FrameLayout frameLayout = c1Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(c1Var.e);
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.Components.voip.w wVar2 = (org.telegram.ui.Components.voip.w) this.d;
                wVar2.N0 = null;
                ((org.telegram.ui.Components.voip.r) this.b).E = false;
                org.telegram.ui.Components.voip.r rVar2 = wVar2.E;
                if (rVar2 != null) {
                    if (rVar2.getParent() != null) {
                        wVar2.removeView(wVar2.E);
                        ((org.telegram.ui.Components.voip.r) this.c).e();
                    }
                    wVar2.E = null;
                    break;
                }
                break;
            case 9:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.G0 = null;
                launchActivity.z0.invalidate();
                launchActivity.o0.invalidate();
                launchActivity.o0.setImageDrawable(null);
                b11 b11Var = launchActivity.o0;
                b11Var.c = null;
                b11Var.a.setShader(null);
                b11Var.n = null;
                b11Var.r = null;
                launchActivity.o0.setVisibility(8);
                launchActivity.p0.setVisibility(8);
                ei0 ei0Var2 = (ei0) this.b;
                if (ei0Var2 != null) {
                    ei0Var2.setImageDrawable((bi0) this.c);
                }
                zs.e().k(zs.q4, new Object[0]);
                if (ei0Var2 != null) {
                    ei0Var2.setVisibility(0);
                }
                ay.x4 = false;
                break;
            case 10:
                i31 i31Var = (i31) this.d;
                i31Var.s1 = null;
                i31Var.invalidate();
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((m90) this.c).run();
                    break;
                }
                break;
            default:
                th.j5 j5Var = (th.j5) this.c;
                th.f2 f2Var = (th.f2) this.d;
                th.z2 z2Var = f2Var.a;
                z2Var.d3 = false;
                z2Var.e3 = 1.0f;
                z2Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    th.z2 z2Var2 = f2Var.a;
                    z2Var2.Z2 = true;
                    try {
                        z2Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                j5Var.setAllowDrawReaction(true);
                j5Var.r = true;
                ImageReceiver imageReceiver = j5Var.e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                th.z2 z2Var3 = f2Var.a;
                org.telegram.ui.Components.f5 f5Var = z2Var3.X2;
                if (f5Var != null) {
                    f5Var.n(z2Var3);
                    f2Var.a.X2 = null;
                    break;
                }
                break;
        }
    }

    public g1(ac.a aVar, View view) {
        this.a = 4;
        this.d = aVar;
        this.c = view;
        this.b = new mg.c2(this, 29);
    }

    public g1(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout, View view, ImageView imageView) {
        this.a = 3;
        this.d = chatAttachAlertPhotoLayout;
        this.c = view;
        this.b = imageView;
    }
}
