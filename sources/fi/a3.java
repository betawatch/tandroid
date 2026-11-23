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
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.t60;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.z40;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
import org.telegram.ui.eu0;
import org.telegram.ui.q11;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                qy qyVar = (qy) this.d;
                if (animator.equals(qyVar.N0)) {
                    qyVar.N0 = null;
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
                if (imageReceiver.C() != null) {
                    imageReceiver.C().N(0, false, true);
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
                if (view instanceof org.telegram.ui.ActionBar.y0) {
                    qh0 qh0Var = ((org.telegram.ui.ActionBar.y0) view).c;
                    if (qh0Var.getAnimatedDrawable() != null) {
                        qh0Var.getAnimatedDrawable().start();
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
                chatActivityEnterView.o2();
                ki.y yVar = chatActivityEnterView.m0;
                if (yVar != null) {
                    yVar.setAlpha(0.0f);
                    chatActivityEnterView.m0.setScaleX(0.0f);
                    chatActivityEnterView.m0.setScaleY(0.0f);
                }
                if (chatActivityEnterView.E2 != null && chatActivityEnterView.Q && !chatActivityEnterView.P && mp.g1().getInt("voiceoncehint", 0) < 3) {
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
                    ((View) this.c).postDelayed((rc) this.b, 300L);
                    break;
                }
                break;
            case 6:
                ek0 ek0Var = (ek0) this.c;
                v4.t tVar = (v4.t) this.b;
                qy qyVar = (qy) this.d;
                if (animator.equals(qyVar.N0)) {
                    int L0 = tVar.L0();
                    ek0Var.setTranslationY(0.0f);
                    if (ek0Var == qyVar.E0) {
                        ek0Var.setPadding(0, org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(44.0f) + qyVar.r2);
                    } else if (ek0Var == qyVar.i0) {
                        ek0Var.setPadding(0, qyVar.c1, 0, org.telegram.messenger.g0.L(44.0f) + qyVar.r2);
                    } else if (ek0Var == qyVar.Q) {
                        ek0Var.setPadding(org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(5.0f), org.telegram.messenger.g0.L(44.0f) + qyVar.r2);
                    }
                    if (L0 != -1) {
                        tVar.h1(L0, 0);
                    }
                    qyVar.N0 = null;
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
                t60 t60Var = (t60) this.b;
                t60Var.setProgress(0.0f);
                t60Var.invalidate();
                org.telegram.messenger.g0.E2(t60Var);
                ViewTreeObserver viewTreeObserver = ((ViewGroup) this.c).getViewTreeObserver();
                x60 x60Var = (x60) this.d;
                View view2 = x60Var.f;
                viewTreeObserver.removeOnPreDrawListener(x60Var.y);
                if (x60Var.S) {
                    if (view2 instanceof w60) {
                        ((w60) view2).setScrimHidden(false);
                    } else {
                        view2.setVisibility(0);
                    }
                    if (view2 instanceof bi.i3) {
                        bi.i3 i3Var = (bi.i3) view2;
                        FrameLayout frameLayout = i3Var.d;
                        frameLayout.invalidate();
                        frameLayout.invalidateDrawable(i3Var.e);
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
                h01 h01Var = launchActivity.n0;
                h01Var.c = null;
                h01Var.a.setShader(null);
                h01Var.n = null;
                h01Var.r = null;
                launchActivity.n0.setVisibility(8);
                launchActivity.o0.setVisibility(8);
                qh0 qh0Var2 = (qh0) this.b;
                if (qh0Var2 != null) {
                    qh0Var2.setImageDrawable((nh0) this.c);
                }
                ks.e().k(ks.t4, new Object[0]);
                if (qh0Var2 != null) {
                    qh0Var2.setVisibility(0);
                }
                bx.C4 = false;
                break;
            default:
                q11 q11Var = (q11) this.d;
                q11Var.t1 = null;
                q11Var.invalidate();
                boolean[] zArr3 = (boolean[]) this.b;
                if (!zArr3[0]) {
                    zArr3[0] = true;
                    ((eu0) this.c).run();
                    break;
                }
                break;
        }
    }

    public a3(ab.q qVar, View view) {
        this.a = 5;
        this.d = qVar;
        this.c = view;
        this.b = new rc(this, 5);
    }
}
