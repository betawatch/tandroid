package org.telegram.ui;

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
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class lo extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ lo(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((oo) this.c).h = null;
                break;
            case 1:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.c;
                AnimatorSet animatorSet = haVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    haVar.h = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.ti) this.c).b1 = null;
                break;
            case 4:
                this.b = true;
                break;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.c;
                AnimatorSet animatorSet2 = v00Var.f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v00Var.f = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) this.c;
                AnimatorSet animatorSet3 = o70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    o70Var.X = null;
                    break;
                }
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 20:
                ((org.telegram.ui.Components.bw0) this.c).Q1 = null;
                break;
            case 24:
                org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) this.c;
                AnimatorSet animatorSet4 = y71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    y71Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.c81 c81Var = (org.telegram.ui.Components.c81) this.c;
                AnimatorSet animatorSet5 = c81Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    c81Var.r = null;
                    break;
                }
                break;
            case 27:
                ((ls) this.c).w = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RadialProgressView radialProgressView;
        ViewGroup viewGroup;
        Drawable[] drawableArr;
        Drawable drawable;
        RadialProgressView radialProgressView2;
        switch (this.a) {
            case 0:
                oo ooVar = (oo) this.c;
                if (ooVar.h != null && (radialProgressView = ooVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        ooVar.f.setVisibility(4);
                    }
                    ooVar.h = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.ha haVar = (org.telegram.ui.Components.ha) this.c;
                AnimatorSet animatorSet = haVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        haVar.c.setVisibility(4);
                        break;
                    } else {
                        haVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.xc xcVar = (org.telegram.ui.Components.xc) this.c;
                if (animator == xcVar.g) {
                    xcVar.g = null;
                    xcVar.j = this.b ? 1.0f : 0.0f;
                    xcVar.b();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.c;
                if (tiVar.b1 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.w0 w0Var = tiVar.h1;
                        if (w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                        if (tiVar.T0 != 0 || !tiVar.t1) {
                            tiVar.d1.setVisibility(4);
                            break;
                        }
                    } else if (tiVar.V0) {
                        org.telegram.ui.Components.li liVar = tiVar.B0;
                        if (liVar == null || liVar.L()) {
                            tiVar.A1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.vo voVar = (org.telegram.ui.Components.vo) this.c;
                if (!this.b) {
                    org.telegram.ui.Components.y9 y9Var = voVar.h;
                    voVar.h = voVar.n;
                    voVar.n = y9Var;
                    y9Var.setVisibility(8);
                    voVar.n.setAlpha(0.0f);
                    voVar.h.setVisibility(0);
                    voVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.gp gpVar = (org.telegram.ui.Components.gp) this.c;
                if (animator == gpVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    gpVar.d = f7;
                    gpVar.setShown(f7);
                    if (!z10) {
                        gpVar.setVisibility(8);
                    }
                    gpVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.zp zpVar = (org.telegram.ui.Components.zp) this.c;
                zpVar.f0 = this.b ? 1.0f : 0.0f;
                zpVar.I.setTranslationY((-AndroidUtilities.dp(7.0f)) * zpVar.f0);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.yq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.gw gwVar = (org.telegram.ui.Components.gw) this.c;
                org.telegram.ui.Components.kw kwVar = gwVar.N;
                if (kwVar.U && !gwVar.h) {
                    if (!this.b && !gwVar.n) {
                        gwVar.setBackground(null);
                        break;
                    } else if (gwVar.getBackground() == null) {
                        gwVar.setBackground(org.telegram.ui.ActionBar.y6.Z(kwVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.c;
                AnimatorSet animatorSet2 = v00Var.f;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        v00Var.h.setVisibility(4);
                    }
                    v00Var.f = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.j10 j10Var = (org.telegram.ui.Components.j10) this.c;
                j10Var.n = this.b ? 1.0f : 0.0f;
                j10Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.k30 k30Var = (org.telegram.ui.Components.k30) this.c;
                org.telegram.ui.Components.h30 h30Var = k30Var.a;
                if (!k30Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    k30Var.b0 = f10;
                    k30Var.U.setPinnedProgress(f10);
                    h30Var.setScaleX(1.0f - (k30Var.b0 * 0.6f));
                    h30Var.setScaleY(1.0f - (k30Var.b0 * 0.6f));
                    if (k30Var.W) {
                        k30Var.i();
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.o70 o70Var = (org.telegram.ui.Components.o70) this.c;
                AnimatorSet animatorSet3 = o70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        o70Var.Y.setVisibility(4);
                    }
                    o70Var.X = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.z70 z70Var = (org.telegram.ui.Components.z70) this.c;
                boolean z11 = this.b;
                z70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.k3) z70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    z70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.oc0 oc0Var = (org.telegram.ui.Components.oc0) this.c;
                if (oc0Var.getParent() != null) {
                    ((ViewGroup) oc0Var.getParent()).removeView(oc0Var);
                }
                boolean z12 = this.b;
                el elVar = (el) oc0Var;
                MessagePreviewParams messagePreviewParams = elVar.H.v5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new dl(elVar, 0), 15L);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.ic0 ic0Var = (org.telegram.ui.Components.ic0) this.c;
                ic0Var.P = null;
                ic0Var.h(this.b, false);
                break;
            case 17:
                org.telegram.ui.Components.me0 me0Var = (org.telegram.ui.Components.me0) this.c;
                TextView textView = me0Var.w;
                di.i4 i4Var = me0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                i4Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                i4Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                i4Var.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                me0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                break;
            case 18:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 19:
                boolean z13 = this.b;
                org.telegram.ui.Components.po0 po0Var = (org.telegram.ui.Components.po0) this.c;
                if (animator == po0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    po0Var.F = f12;
                    po0Var.setShown(f12);
                    if (!z13) {
                        po0Var.setVisibility(8);
                    }
                    po0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.bw0 bw0Var = (org.telegram.ui.Components.bw0) this.c;
                if (bw0Var.Q1 != null) {
                    bw0Var.Q1 = null;
                    if (!this.b) {
                        bw0Var.D0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.e31 e31Var = (org.telegram.ui.Components.e31) this.c;
                e31Var.M = this.b ? 1.0f : 0.0f;
                e31Var.invalidate();
                break;
            case 22:
                org.telegram.ui.Components.a41 a41Var = (org.telegram.ui.Components.a41) this.c;
                a41Var.F = this.b ? 1.0f : 0.0f;
                a41Var.h();
                break;
            case 23:
                org.telegram.ui.Components.e41 e41Var = (org.telegram.ui.Components.e41) this.c;
                e41Var.U = this.b ? 1.0f : 0.0f;
                e41Var.h();
                e41Var.g();
                break;
            case 24:
                org.telegram.ui.Components.y71 y71Var = (org.telegram.ui.Components.y71) this.c;
                AnimatorSet animatorSet4 = y71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        y71Var.e.setVisibility(4);
                    }
                    y71Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.c81 c81Var = (org.telegram.ui.Components.c81) this.c;
                AnimatorSet animatorSet5 = c81Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        c81Var.n.setVisibility(4);
                    }
                    c81Var.r = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.c;
                w2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.G && (drawable = (drawableArr = w2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.G = false;
                if (!w2Var.O) {
                    w2Var.n = w2Var.r;
                }
                w2Var.s = 0.0f;
                w2Var.invalidate();
                break;
            case 27:
                ls lsVar = (ls) this.c;
                if (lsVar.w != null && (radialProgressView2 = lsVar.s) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        lsVar.v.setVisibility(4);
                    }
                    lsVar.w = null;
                    break;
                }
                break;
            case 28:
                vy vyVar = (vy) this.c;
                vyVar.r = this.b ? 1.0f : 0.0f;
                org.telegram.ui.Components.y9 y9Var2 = vyVar.c;
                int i10 = org.telegram.ui.ActionBar.y6.C6;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i10, vyVar.a);
                int i11 = org.telegram.ui.ActionBar.y6.Oh;
                int f13 = i0.a.f(vyVar.r, w02, org.telegram.ui.ActionBar.y6.w0(i11, vyVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                y9Var2.setColorFilter(new PorterDuffColorFilter(f13, mode));
                vyVar.c.invalidate();
                vyVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - vyVar.r, org.telegram.ui.ActionBar.y6.w0(i10, vyVar.a), org.telegram.ui.ActionBar.y6.w0(i11, vyVar.a)), mode));
                vyVar.f.invalidate();
                break;
            default:
                j00 j00Var = (j00) this.c;
                j00Var.s = this.b ? 1.0f : 0.0f;
                j00Var.invalidate();
                break;
        }
    }

    public lo(View view) {
        this.a = 12;
        this.c = view;
        this.b = true;
    }

    public lo(View view, boolean z10) {
        this.a = 12;
        this.c = view;
        this.b = z10;
    }

    public lo(org.telegram.ui.Components.vo voVar) {
        this.a = 4;
        this.c = voVar;
    }
}
