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
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.gk;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.u60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.r11;
import org.telegram.ui.wt0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class a3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a3(Object obj, Object obj2, Object obj3, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
                ry ryVar = (ry) this.d;
                if (animator.equals(ryVar.N0)) {
                    ryVar.N0 = null;
                    break;
                }
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i7;
        int i10;
        switch (this.a) {
            case 0:
                u6 u6Var = (u6) this.c;
                b3 b3Var = (b3) this.d;
                z3 z3Var = b3Var.a;
                z3Var.e3 = false;
                z3Var.f3 = 1.0f;
                z3Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    z3 z3Var2 = b3Var.a;
                    z3Var2.a3 = true;
                    try {
                        z3Var2.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                u6Var.setAllowDrawReaction(true);
                u6Var.r = true;
                ImageReceiver imageReceiver = u6Var.e;
                if (imageReceiver.B() != null) {
                    imageReceiver.B().N(0, false, true);
                }
                z3 z3Var3 = b3Var.a;
                org.telegram.ui.Components.o5 o5Var = z3Var3.Y2;
                if (o5Var != null) {
                    o5Var.n(z3Var3);
                    b3Var.a.Y2 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).y.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.z0) {
                    ph0 ph0Var = ((org.telegram.ui.ActionBar.z0) view).c;
                    if (ph0Var.getAnimatedDrawable() != null) {
                        ph0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.n3 n3Var = (org.telegram.ui.ActionBar.n3) this.d;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.b;
                ViewGroup viewGroup = f3Var.b;
                if (viewGroup == null) {
                    viewGroup = f3Var.c;
                }
                if (viewGroup != null && f3Var.m == null && (i7 = f3Var.g) > 0 && (i10 = f3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.n3.g(viewGroup, -f3Var.i, new org.telegram.ui.ActionBar.c3(f3Var, k3Var));
                        n3Var.b = null;
                        n3Var.invalidate();
                        break;
                    } else {
                        f3Var.m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(f3Var.m);
                        canvas.translate(0.0f, -f3Var.i);
                        viewGroup.draw(canvas);
                    }
                }
                k3Var.d().setDrawingFromOverlay(false);
                k3Var.release();
                n3Var.b = null;
                n3Var.invalidate();
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.a2.removeView(chatActivityEnterView.f1);
                    viewGroup2.addView(chatActivityEnterView.f1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.f1.setAlpha(1.0f);
                chatActivityEnterView.i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.i2();
                ki.z zVar = chatActivityEnterView.m0;
                if (zVar != null) {
                    zVar.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.C2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && mp.g1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.C2.i();
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
                    ((View) this.c).postDelayed((gk) this.b, 300L);
                    break;
                }
                break;
            case 6:
                ck0 ck0Var = (ck0) this.c;
                v4.t tVar = (v4.t) this.b;
                ry ryVar = (ry) this.d;
                if (animator.equals(ryVar.N0)) {
                    int L0 = tVar.L0();
                    ck0Var.setTranslationY(0.0f);
                    if (ck0Var == ryVar.E0) {
                        ck0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + ryVar.r2);
                    } else if (ck0Var == ryVar.i0) {
                        ck0Var.setPadding(0, ryVar.c1, 0, org.telegram.messenger.g0.L(44.0f) + ryVar.r2);
                    } else if (ck0Var == ryVar.Q) {
                        ck0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + ryVar.r2);
                    }
                    if (L0 != -1) {
                        tVar.h1(L0, 0);
                    }
                    ryVar.N0 = null;
                    break;
                }
                break;
            case 7:
                z40 z40Var = (z40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((c40) this.c).run();
                }
                z40Var.f.setRotationY(0.0f);
                z40Var.r0.setRotationY(0.0f);
                z40Var.O0 = false;
                z40Var.invalidate();
                break;
            case 8:
                u60 u60Var = (u60) this.b;
                u60Var.setProgress(0.0f);
                u60Var.invalidate();
                org.telegram.messenger.g0.E2(u60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                y60 y60Var = (y60) this.d;
                View view2 = y60Var.f;
                viewTreeObserver.removeOnPreDrawListener(y60Var.y);
                if (y60Var.S) {
                    if (view2 instanceof x60) {
                        ((x60) view2).setScrimHidden(false);
                    } else {
                        view2.setVisibility(0);
                    }
                    if (view2 instanceof bi.c3) {
                        bi.c3 c3Var = (bi.c3) view2;
                        FrameLayout frameLayout = c3Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(c3Var.e);
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.d;
                k0Var.O0 = null;
                ((org.telegram.ui.Components.voip.y) this.b).F = false;
                org.telegram.ui.Components.voip.y yVar = k0Var.F;
                if (yVar != null) {
                    if (yVar.getParent() != null) {
                        k0Var.removeView(k0Var.F);
                        ((org.telegram.ui.Components.voip.y) this.c).e();
                    }
                    k0Var.F = null;
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.F0 = null;
                launchActivity.y0.invalidate();
                launchActivity.n0.invalidate();
                launchActivity.n0.setImageDrawable(null);
                g01 g01Var = launchActivity.n0;
                g01Var.c = null;
                g01Var.a.setShader(null);
                g01Var.n = null;
                g01Var.r = null;
                launchActivity.n0.setVisibility(8);
                launchActivity.o0.setVisibility(8);
                ph0 ph0Var2 = (ph0) this.b;
                if (ph0Var2 != null) {
                    ph0Var2.setImageDrawable((mh0) this.c);
                }
                ks.e().k(ks.t4, new Object[0]);
                if (ph0Var2 != null) {
                    ph0Var2.setVisibility(0);
                }
                cx.C4 = false;
                break;
            default:
                r11 r11Var = (r11) this.d;
                r11Var.t1 = null;
                r11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((wt0) this.c).run();
                    break;
                }
                break;
        }
    }

    public a3(ab.q qVar, View view) {
        this.a = 5;
        this.d = qVar;
        this.c = view;
        this.b = new gk(this, 4);
    }
}
