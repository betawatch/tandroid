package ei;

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
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.k40;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.n30;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.wz0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.g11;
import org.telegram.ui.uw;
import org.telegram.ui.xt0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class k3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k3(Object obj, Object obj2, Object obj3, int i3) {
        this.a = i3;
        this.d = obj;
        this.b = obj2;
        this.c = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
                ey eyVar = (ey) this.d;
                if (animator.equals(eyVar.N0)) {
                    eyVar.N0 = null;
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
        int i3;
        int i10;
        switch (this.a) {
            case 0:
                e7 e7Var = (e7) this.c;
                l3 l3Var = (l3) this.d;
                j4 j4Var = l3Var.a;
                j4Var.e3 = false;
                j4Var.f3 = 1.0f;
                j4Var.invalidate();
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    j4 j4Var2 = l3Var.a;
                    j4Var2.a3 = true;
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
                j4 j4Var3 = l3Var.a;
                org.telegram.ui.Components.g5 g5Var = j4Var3.Y2;
                if (g5Var != null) {
                    g5Var.n(j4Var3);
                    l3Var.a.Y2 = null;
                    break;
                }
                break;
            case 1:
                ((ActionBarPopupWindow$ActionBarPopupWindowLayout) this.d).y.remove((AnimatorSet) this.b);
                View view = (View) this.c;
                if (view instanceof org.telegram.ui.ActionBar.y0) {
                    fh0 fh0Var = ((org.telegram.ui.ActionBar.y0) view).c;
                    if (fh0Var.getAnimatedDrawable() != null) {
                        fh0Var.getAnimatedDrawable().start();
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.ActionBar.j3 j3Var = (org.telegram.ui.ActionBar.j3) this.d;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.c;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.b;
                ViewGroup viewGroup = a3Var.b;
                if (viewGroup == null) {
                    viewGroup = a3Var.c;
                }
                if (viewGroup != null && a3Var.m == null && (i3 = a3Var.g) > 0 && (i10 = a3Var.h) > 0) {
                    if (Build.VERSION.SDK_INT >= 26) {
                        org.telegram.ui.ActionBar.j3.g(viewGroup, -a3Var.i, new mi.f(6, a3Var, g3Var));
                        j3Var.b = null;
                        j3Var.invalidate();
                        break;
                    } else {
                        a3Var.m = Bitmap.createBitmap(i3, i10, Bitmap.Config.RGB_565);
                        Canvas canvas = new Canvas(a3Var.m);
                        canvas.translate(0.0f, -a3Var.i);
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
                    chatActivityEnterView.n1.removeView(chatActivityEnterView.f1);
                    viewGroup2.addView(chatActivityEnterView.f1, (ViewGroup.LayoutParams) this.c);
                }
                chatActivityEnterView.f1.setAlpha(1.0f);
                chatActivityEnterView.i1.setAlpha(1.0f);
                chatActivityEnterView.h = 0.0f;
                chatActivityEnterView.n = 0.0f;
                chatActivityEnterView.G1();
                ii.a0 a0Var = chatActivityEnterView.m0;
                if (a0Var != null) {
                    a0Var.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.P1 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && hp.e1().getInt("voiceoncehint", 0) < 3) {
                    chatActivityEnterView.P1.b();
                    break;
                }
                break;
            case 4:
                ((ChatAttachAlertPhotoLayout) this.d).U = false;
                ((View) this.b).setVisibility(4);
                ((ImageView) this.c).sendAccessibilityEvent(8);
                break;
            case 5:
                if (((b4.n) this.d).a) {
                    ((View) this.c).postDelayed((lt) this.b, 300L);
                    break;
                }
                break;
            case 6:
                tj0 tj0Var = (tj0) this.c;
                u4.s sVar = (u4.s) this.b;
                ey eyVar = (ey) this.d;
                if (animator.equals(eyVar.N0)) {
                    int L0 = sVar.L0();
                    tj0Var.setTranslationY(0.0f);
                    if (tj0Var == eyVar.E0) {
                        tj0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + eyVar.r2);
                    } else if (tj0Var == eyVar.i0) {
                        tj0Var.setPadding(0, eyVar.c1, 0, org.telegram.messenger.g0.L(44.0f) + eyVar.r2);
                    } else if (tj0Var == eyVar.Q) {
                        tj0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + eyVar.r2);
                    }
                    if (L0 != -1) {
                        sVar.h1(L0, 0);
                    }
                    eyVar.N0 = null;
                    break;
                }
                break;
            case 7:
                k40 k40Var = (k40) this.d;
                super.onAnimationEnd(animator);
                boolean[] zArr2 = (boolean[]) this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    ((n30) this.c).run();
                }
                k40Var.f.setRotationY(0.0f);
                k40Var.r0.setRotationY(0.0f);
                k40Var.O0 = false;
                k40Var.invalidate();
                break;
            case 8:
                d60 d60Var = (d60) this.b;
                d60Var.setProgress(0.0f);
                d60Var.invalidate();
                org.telegram.messenger.g0.E2(d60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                f60 f60Var = (f60) this.d;
                View view2 = f60Var.f;
                viewTreeObserver.removeOnPreDrawListener(f60Var.y);
                if (f60Var.P) {
                    view2.setVisibility(0);
                    if (view2 instanceof ai.q2) {
                        ai.q2 q2Var = (ai.q2) view2;
                        FrameLayout frameLayout = q2Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(q2Var.e);
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.voip.x xVar = (org.telegram.ui.Components.voip.x) this.d;
                xVar.O0 = null;
                ((org.telegram.ui.Components.voip.r) this.b).F = false;
                org.telegram.ui.Components.voip.r rVar = xVar.F;
                if (rVar != null) {
                    if (rVar.getParent() != null) {
                        xVar.removeView(xVar.F);
                        ((org.telegram.ui.Components.voip.r) this.c).e();
                    }
                    xVar.F = null;
                    break;
                }
                break;
            case 10:
                LaunchActivity launchActivity = (LaunchActivity) this.d;
                launchActivity.H0 = null;
                launchActivity.A0.invalidate();
                launchActivity.p0.invalidate();
                launchActivity.p0.setImageDrawable(null);
                wz0 wz0Var = launchActivity.p0;
                wz0Var.c = null;
                wz0Var.a.setShader(null);
                wz0Var.n = null;
                wz0Var.r = null;
                launchActivity.p0.setVisibility(8);
                launchActivity.q0.setVisibility(8);
                fh0 fh0Var2 = (fh0) this.b;
                if (fh0Var2 != null) {
                    fh0Var2.setImageDrawable((ch0) this.c);
                }
                hs.e().k(hs.q4, new Object[0]);
                if (fh0Var2 != null) {
                    fh0Var2.setVisibility(0);
                }
                uw.y4 = false;
                break;
            default:
                g11 g11Var = (g11) this.d;
                g11Var.t1 = null;
                g11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((xt0) this.c).run();
                    break;
                }
                break;
        }
    }

    public k3(b4.n nVar, View view) {
        this.a = 5;
        this.d = nVar;
        this.c = view;
        this.b = new lt(this, 0);
    }
}
