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
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c50;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.f40;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.ik;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.z60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cx;
import org.telegram.ui.s11;
import org.telegram.ui.wt0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
                ty tyVar = (ty) this.d;
                if (animator.equals(tyVar.N0)) {
                    tyVar.N0 = null;
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
                org.telegram.ui.Components.p5 p5Var = z3Var3.Y2;
                if (p5Var != null) {
                    p5Var.n(z3Var3);
                    b3Var.a.Y2 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).y.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.y0) {
                    rh0 rh0Var = ((org.telegram.ui.ActionBar.y0) view).c;
                    if (rh0Var.getAnimatedDrawable() != null) {
                        rh0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.m3 m3Var = (org.telegram.ui.ActionBar.m3) this.d;
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.b;
                ViewGroup viewGroup = e3Var.b;
                if (viewGroup == null) {
                    viewGroup = e3Var.c;
                }
                if (viewGroup != null && e3Var.m == null && (i7 = e3Var.g) > 0 && (i10 = e3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.m3.g(viewGroup, -e3Var.i, new org.telegram.ui.ActionBar.b3(e3Var, j3Var));
                        m3Var.b = null;
                        m3Var.invalidate();
                        break;
                    } else {
                        e3Var.m = Bitmap.createBitmap(i7, i10, Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(e3Var.m);
                        canvas.translate(0.0f, -e3Var.i);
                        viewGroup.draw(canvas);
                    }
                }
                j3Var.d().setDrawingFromOverlay(false);
                j3Var.release();
                m3Var.b = null;
                m3Var.invalidate();
                break;
            case 3:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) this.d;
                ViewGroup viewGroup2 = (ViewGroup) this.b;
                if (viewGroup2 != null) {
                    chatActivityEnterView.c2.removeView(chatActivityEnterView.f1);
                    viewGroup2.addView(chatActivityEnterView.f1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.f1.setAlpha(1.0f);
                chatActivityEnterView.i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.m2();
                ki.y yVar = chatActivityEnterView.m0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.E2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && np.g1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.E2.i();
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
                    ((View) this.c).postDelayed((ik) this.b, 300L);
                    break;
                }
                break;
            case 6:
                ek0 ek0Var = (ek0) this.c;
                v4.t tVar = (v4.t) this.b;
                ty tyVar = (ty) this.d;
                if (animator.equals(tyVar.N0)) {
                    int L0 = tVar.L0();
                    ek0Var.setTranslationY(0.0f);
                    if (ek0Var == tyVar.E0) {
                        ek0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + tyVar.r2);
                    } else if (ek0Var == tyVar.i0) {
                        ek0Var.setPadding(0, tyVar.c1, 0, org.telegram.messenger.g0.L(44.0f) + tyVar.r2);
                    } else if (ek0Var == tyVar.Q) {
                        ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + tyVar.r2);
                    }
                    if (L0 != -1) {
                        tVar.h1(L0, 0);
                    }
                    tyVar.N0 = null;
                    break;
                }
                break;
            case 7:
                c50 c50Var = (c50) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((f40) this.c).run();
                }
                c50Var.f.setRotationY(0.0f);
                c50Var.r0.setRotationY(0.0f);
                c50Var.O0 = false;
                c50Var.invalidate();
                break;
            case 8:
                w60 w60Var = (w60) this.b;
                w60Var.setProgress(0.0f);
                w60Var.invalidate();
                org.telegram.messenger.g0.E2(w60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                a70 a70Var = (a70) this.d;
                View view2 = a70Var.f;
                viewTreeObserver.removeOnPreDrawListener(a70Var.y);
                if (a70Var.S) {
                    if (view2 instanceof z60) {
                        ((z60) view2).setScrimHidden(false);
                    } else {
                        view2.setVisibility(0);
                    }
                    if (view2 instanceof bi.g3) {
                        bi.g3 g3Var = (bi.g3) view2;
                        FrameLayout frameLayout = g3Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(g3Var.e);
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.voip.k0 k0Var = (org.telegram.ui.Components.voip.k0) this.d;
                k0Var.O0 = null;
                ((org.telegram.ui.Components.voip.y) this.b).F = false;
                org.telegram.ui.Components.voip.y yVar2 = k0Var.F;
                if (yVar2 != null) {
                    if (yVar2.getParent() != null) {
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
                i01 i01Var = launchActivity.n0;
                i01Var.c = null;
                i01Var.a.setShader(null);
                i01Var.n = null;
                i01Var.r = null;
                launchActivity.n0.setVisibility(8);
                launchActivity.o0.setVisibility(8);
                rh0 rh0Var2 = (rh0) this.b;
                if (rh0Var2 != null) {
                    rh0Var2.setImageDrawable((oh0) this.c);
                }
                ls.e().k(ls.t4, new Object[0]);
                if (rh0Var2 != null) {
                    rh0Var2.setVisibility(0);
                }
                cx.C4 = false;
                break;
            default:
                s11 s11Var = (s11) this.d;
                s11Var.t1 = null;
                s11Var.invalidate();
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
        this.b = new ik(this, 4);
    }
}
