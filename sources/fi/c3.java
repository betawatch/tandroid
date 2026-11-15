package fi;

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
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.r40;
import org.telegram.ui.Components.u30;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.zj;
import org.telegram.ui.Components.zz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cu0;
import org.telegram.ui.n11;
import org.telegram.ui.yw;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class c3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c3(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
                ly lyVar = (ly) this.d;
                if (animator.equals(lyVar.N0)) {
                    lyVar.N0 = null;
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
                x6 x6Var = (x6) this.c;
                d3 d3Var = (d3) this.d;
                b4 b4Var = d3Var.a;
                b4Var.e3 = false;
                b4Var.f3 = 1.0f;
                b4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    b4 b4Var2 = d3Var.a;
                    b4Var2.a3 = true;
                    try {
                        b4Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                x6Var.setAllowDrawReaction(true);
                x6Var.r = true;
                ImageReceiver imageReceiver = x6Var.e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                b4 b4Var3 = d3Var.a;
                org.telegram.ui.Components.g5 g5Var = b4Var3.Y2;
                if (g5Var != null) {
                    g5Var.n(b4Var3);
                    d3Var.a.Y2 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).y.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.z0) {
                    fh0 fh0Var = ((org.telegram.ui.ActionBar.z0) view).c;
                    if (fh0Var.getAnimatedDrawable() != null) {
                        fh0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.d;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.c;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) this.b;
                ViewGroup viewGroup = b3Var.b;
                if (viewGroup == null) {
                    viewGroup = b3Var.c;
                }
                if (viewGroup != null && b3Var.m == null && (i7 = b3Var.g) > 0 && (i10 = b3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.j3.g(viewGroup, -b3Var.i, new li.v(7, b3Var, g3Var));
                        j3Var.b = null;
                        j3Var.invalidate();
                        break;
                    } else {
                        b3Var.m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(b3Var.m);
                        canvas.translate(0.0f, -b3Var.i);
                        viewGroup.draw(canvas);
                    }
                }
                g3Var.d().setDrawingFromOverlay(false);
                g3Var.release();
                j3Var.b = null;
                j3Var.invalidate();
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.U1.removeView(chatActivityEnterView.f1);
                    viewGroup2.addView(chatActivityEnterView.f1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.f1.setAlpha(1.0f);
                chatActivityEnterView.i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.Z1();
                ki.a0 a0Var = chatActivityEnterView.m0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.w2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && np.e1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.w2.i();
                    break;
                }
                break;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).U = false;
                ((View) this.b).setVisibility(4);
                ((ImageView) this.c).sendAccessibilityEvent(8);
                break;
            case 5:
                if (((ab.q) this.d).a) {
                    ((View) this.c).postDelayed((zj) this.b, 300L);
                    break;
                }
                break;
            case 6:
                uj0 uj0Var = (uj0) this.c;
                v4.s sVar = (v4.s) this.b;
                ly lyVar = (ly) this.d;
                if (animator.equals(lyVar.N0)) {
                    int L0 = sVar.L0();
                    uj0Var.setTranslationY(0.0f);
                    if (uj0Var == lyVar.E0) {
                        uj0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + lyVar.r2);
                    } else if (uj0Var == lyVar.i0) {
                        uj0Var.setPadding(0, lyVar.c1, 0, org.telegram.messenger.g0.L(44.0f) + lyVar.r2);
                    } else if (uj0Var == lyVar.Q) {
                        uj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + lyVar.r2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    lyVar.N0 = null;
                    break;
                }
                break;
            case 7:
                r40 r40Var = (r40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((u30) this.c).run();
                }
                r40Var.f.setRotationY(0.0f);
                r40Var.r0.setRotationY(0.0f);
                r40Var.O0 = false;
                r40Var.invalidate();
                break;
            case 8:
                k60 k60Var = (k60) this.b;
                k60Var.setProgress(0.0f);
                k60Var.invalidate();
                org.telegram.messenger.g0.E2(k60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                m60 m60Var = (m60) this.d;
                View view2 = m60Var.f;
                viewTreeObserver.removeOnPreDrawListener(m60Var.y);
                if (m60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof bi.i2) {
                        bi.i2 i2Var = (bi.i2) view2;
                        FrameLayout frameLayout = i2Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(i2Var.e);
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.d;
                l0Var.O0 = null;
                ((org.telegram.ui.Components.voip.z) this.b).F = false;
                org.telegram.ui.Components.voip.z zVar = l0Var.F;
                if (zVar != null) {
                    if (zVar.getParent() != null) {
                        l0Var.removeView(l0Var.F);
                        ((org.telegram.ui.Components.voip.z) this.c).e();
                    }
                    l0Var.F = null;
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.F0 = null;
                launchActivity.y0.invalidate();
                launchActivity.n0.invalidate();
                launchActivity.n0.setImageDrawable(null);
                zz0 zz0Var = launchActivity.n0;
                zz0Var.c = null;
                zz0Var.a.setShader(null);
                zz0Var.n = null;
                zz0Var.r = null;
                launchActivity.n0.setVisibility(8);
                launchActivity.o0.setVisibility(8);
                fh0 fh0Var2 = (fh0) this.b;
                if (fh0Var2 != null) {
                    fh0Var2.setImageDrawable((ch0) this.c);
                }
                ns.e().k(ns.q4, new Object[0]);
                if (fh0Var2 != null) {
                    fh0Var2.setVisibility(0);
                }
                yw.z4 = false;
                break;
            default:
                n11 n11Var = (n11) this.d;
                n11Var.t1 = null;
                n11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((cu0) this.c).run();
                    break;
                }
                break;
        }
    }

    public c3(ab.q qVar, View view) {
        this.a = 5;
        this.d = qVar;
        this.c = view;
        this.b = new zj(this, 4);
    }
}
