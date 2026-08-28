package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagePreviewParams;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class u9 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ u9(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                v9 v9Var = (v9) this.c;
                AnimatorSet animatorSet = v9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    v9Var.h = null;
                    break;
                }
                break;
            case 2:
                ((ki) this.c).U0 = null;
                break;
            case 3:
                this.b = true;
                break;
            case 8:
                yz yzVar = (yz) this.c;
                AnimatorSet animatorSet2 = yzVar.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    yzVar.e = null;
                    break;
                }
                break;
            case 12:
                a60 a60Var = (a60) this.c;
                AnimatorSet animatorSet3 = a60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    a60Var.T = null;
                    break;
                }
                break;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 19:
                ((eu0) this.c).J1 = null;
                break;
            case 23:
                o51 o51Var = (o51) this.c;
                AnimatorSet animatorSet4 = o51Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    o51Var.d = null;
                    break;
                }
                break;
            case 24:
                s51 s51Var = (s51) this.c;
                AnimatorSet animatorSet5 = s51Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    s51Var.r = null;
                    break;
                }
                break;
            case 26:
                ((org.telegram.ui.is) this.c).w = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                v9 v9Var = (v9) this.c;
                AnimatorSet animatorSet = v9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        v9Var.c.setVisibility(4);
                        break;
                    } else {
                        v9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 1:
                pc pcVar = (pc) this.c;
                if (animator == pcVar.g) {
                    pcVar.g = null;
                    pcVar.i = this.b ? 1.0f : 0.0f;
                    pcVar.b();
                    break;
                }
                break;
            case 2:
                ki kiVar = (ki) this.c;
                if (kiVar.U0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.w0 w0Var = kiVar.a1;
                        if (w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                        if (kiVar.M0 != 0 || !kiVar.m1) {
                            kiVar.W0.setVisibility(4);
                            break;
                        }
                    } else if (kiVar.O0) {
                        ci ciVar = kiVar.u0;
                        if (ciVar == null || ciVar.I()) {
                            kiVar.t1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 3:
                yn ynVar = (yn) this.c;
                if (!this.b) {
                    o9 o9Var = ynVar.h;
                    ynVar.h = ynVar.n;
                    ynVar.n = o9Var;
                    o9Var.setVisibility(8);
                    ynVar.n.setAlpha(0.0f);
                    ynVar.h.setVisibility(0);
                    ynVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 4:
                boolean z10 = this.b;
                jo joVar = (jo) this.c;
                if (animator == joVar.e) {
                    float f10 = z10 ? 1.0f : 0.0f;
                    joVar.d = f10;
                    joVar.setShown(f10);
                    if (!z10) {
                        joVar.setVisibility(8);
                    }
                    joVar.a(true);
                    break;
                }
                break;
            case 5:
                cp cpVar = (cp) this.c;
                cpVar.c0 = this.b ? 1.0f : 0.0f;
                cpVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * cpVar.c0);
                break;
            case 6:
                if (!this.b) {
                    ((cq) this.c).D.setVisibility(8);
                    break;
                }
                break;
            case 7:
                jv jvVar = (jv) this.c;
                nv nvVar = jvVar.F;
                if (nvVar.Q && !jvVar.h) {
                    if (!this.b && !jvVar.n) {
                        jvVar.setBackground(null);
                        break;
                    } else if (jvVar.getBackground() == null) {
                        jvVar.setBackground(org.telegram.ui.ActionBar.f6.Y(nvVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 8:
                yz yzVar = (yz) this.c;
                AnimatorSet animatorSet2 = yzVar.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        yzVar.f.setVisibility(4);
                    }
                    yzVar.e = null;
                    break;
                }
                break;
            case 9:
                j00 j00Var = (j00) this.c;
                j00Var.h = this.b ? 1.0f : 0.0f;
                j00Var.invalidate();
                break;
            case 10:
                j20 j20Var = (j20) this.c;
                h20 h20Var = j20Var.a;
                if (!j20Var.B) {
                    float f11 = this.b ? 1.0f : 0.0f;
                    j20Var.X = f11;
                    j20Var.Q.setPinnedProgress(f11);
                    h20Var.setScaleX(1.0f - (j20Var.X * 0.6f));
                    h20Var.setScaleY(1.0f - (j20Var.X * 0.6f));
                    if (j20Var.S) {
                        j20Var.i();
                        break;
                    }
                }
                break;
            case 11:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 12:
                a60 a60Var = (a60) this.c;
                AnimatorSet animatorSet3 = a60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        a60Var.U.setVisibility(4);
                    }
                    a60Var.T = null;
                    break;
                }
                break;
            case 13:
                k60 k60Var = (k60) this.c;
                boolean z11 = this.b;
                k60Var.d0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.f3) k60Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    k60Var.R.setVisibility(8);
                    break;
                }
                break;
            case 14:
                cb0 cb0Var = (cb0) this.c;
                if (cb0Var.getParent() != null) {
                    ((ViewGroup) cb0Var.getParent()).removeView(cb0Var);
                }
                boolean z12 = this.b;
                org.telegram.ui.wk wkVar = (org.telegram.ui.wk) cb0Var;
                MessagePreviewParams messagePreviewParams = wkVar.D.b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.vk(wkVar, 0), 15L);
                    break;
                }
                break;
            case 15:
                wa0 wa0Var = (wa0) this.c;
                wa0Var.L = null;
                wa0Var.g(this.b, false);
                break;
            case 16:
                yc0 yc0Var = (yc0) this.c;
                TextView textView = yc0Var.w;
                dh.g gVar = yc0Var.e;
                float f12 = this.b ? 1.0f : 0.0f;
                gVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f12));
                gVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f12));
                gVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f12));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f12));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f12));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f12));
                yc0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f12));
                break;
            case 17:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 18:
                boolean z13 = this.b;
                sm0 sm0Var = (sm0) this.c;
                if (animator == sm0Var.C) {
                    float f13 = z13 ? 1.0f : 0.0f;
                    sm0Var.B = f13;
                    sm0Var.setShown(f13);
                    if (!z13) {
                        sm0Var.setVisibility(8);
                    }
                    sm0Var.b(true);
                    break;
                }
                break;
            case 19:
                eu0 eu0Var = (eu0) this.c;
                if (eu0Var.J1 != null) {
                    eu0Var.J1 = null;
                    if (!this.b) {
                        eu0Var.x0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 20:
                super.onAnimationEnd(animator);
                a11 a11Var = (a11) this.c;
                a11Var.I = this.b ? 1.0f : 0.0f;
                a11Var.invalidate();
                break;
            case 21:
                v11 v11Var = (v11) this.c;
                v11Var.B = this.b ? 1.0f : 0.0f;
                v11Var.h();
                break;
            case 22:
                a21 a21Var = (a21) this.c;
                a21Var.M = this.b ? 1.0f : 0.0f;
                a21Var.h();
                a21Var.g();
                break;
            case 23:
                o51 o51Var = (o51) this.c;
                AnimatorSet animatorSet4 = o51Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        o51Var.e.setVisibility(4);
                    }
                    o51Var.d = null;
                    break;
                }
                break;
            case 24:
                s51 s51Var = (s51) this.c;
                AnimatorSet animatorSet5 = s51Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        s51Var.n.setVisibility(4);
                    }
                    s51Var.r = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.voip.u2 u2Var = (org.telegram.ui.Components.voip.u2) this.c;
                u2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = u2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!u2Var.C && (drawable = (drawableArr = u2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                u2Var.C = false;
                if (!u2Var.K) {
                    u2Var.n = u2Var.r;
                }
                u2Var.s = 0.0f;
                u2Var.invalidate();
                break;
            case 26:
                org.telegram.ui.is isVar = (org.telegram.ui.is) this.c;
                if (isVar.w != null && (radialProgressView = isVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        isVar.v.setVisibility(4);
                    }
                    isVar.w = null;
                    break;
                }
                break;
            case 27:
                org.telegram.ui.uy uyVar = (org.telegram.ui.uy) this.c;
                uyVar.r = this.b ? 1.0f : 0.0f;
                o9 o9Var2 = uyVar.c;
                int i9 = org.telegram.ui.ActionBar.f6.C6;
                int v02 = org.telegram.ui.ActionBar.f6.v0(i9, uyVar.a);
                int i10 = org.telegram.ui.ActionBar.f6.Oh;
                int d = i0.a.d(uyVar.r, v02, org.telegram.ui.ActionBar.f6.v0(i10, uyVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                o9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                uyVar.c.invalidate();
                uyVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - uyVar.r, org.telegram.ui.ActionBar.f6.v0(i9, uyVar.a), org.telegram.ui.ActionBar.f6.v0(i10, uyVar.a)), mode));
                uyVar.f.invalidate();
                break;
            case 28:
                org.telegram.ui.g00 g00Var = (org.telegram.ui.g00) this.c;
                g00Var.s = this.b ? 1.0f : 0.0f;
                g00Var.invalidate();
                break;
            default:
                org.telegram.ui.o50 o50Var = (org.telegram.ui.o50) this.c;
                o50Var.Q2 = null;
                o50Var.K.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
        }
    }

    public u9(View view) {
        this.a = 11;
        this.c = view;
        this.b = true;
    }

    public u9(View view, boolean z10) {
        this.a = 11;
        this.c = view;
        this.b = z10;
    }

    public u9(yn ynVar) {
        this.a = 3;
        this.c = ynVar;
    }
}
