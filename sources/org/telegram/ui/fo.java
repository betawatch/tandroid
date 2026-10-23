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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class fo extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ fo(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((io) this.c).h = null;
                break;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    daVar.h = null;
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
                AnimatorSet animatorSet2 = v00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    v00Var.e = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.l70 l70Var = (org.telegram.ui.Components.l70) this.c;
                AnimatorSet animatorSet3 = l70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    l70Var.X = null;
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
                ((org.telegram.ui.Components.uv0) this.c).N1 = null;
                break;
            case 24:
                org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) this.c;
                AnimatorSet animatorSet4 = h71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    h71Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.l71 l71Var = (org.telegram.ui.Components.l71) this.c;
                AnimatorSet animatorSet5 = l71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    l71Var.r = null;
                    break;
                }
                break;
            case 27:
                ((fs) this.c).w = null;
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
                io ioVar = (io) this.c;
                if (ioVar.h != null && (radialProgressView = ioVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        ioVar.f.setVisibility(4);
                    }
                    ioVar.h = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.da daVar = (org.telegram.ui.Components.da) this.c;
                AnimatorSet animatorSet = daVar.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        daVar.c.setVisibility(4);
                        break;
                    } else {
                        daVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.yc ycVar = (org.telegram.ui.Components.yc) this.c;
                if (animator == ycVar.g) {
                    ycVar.g = null;
                    ycVar.j = this.b ? 1.0f : 0.0f;
                    ycVar.b();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.ti tiVar = (org.telegram.ui.Components.ti) this.c;
                if (tiVar.b1 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.u0 u0Var = tiVar.h1;
                        if (u0Var != null) {
                            u0Var.setVisibility(4);
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
                org.telegram.ui.Components.to toVar = (org.telegram.ui.Components.to) this.c;
                if (!this.b) {
                    org.telegram.ui.Components.w9 w9Var = toVar.h;
                    toVar.h = toVar.n;
                    toVar.n = w9Var;
                    w9Var.setVisibility(8);
                    toVar.n.setAlpha(0.0f);
                    toVar.h.setVisibility(0);
                    toVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) this.c;
                if (animator == dpVar.e) {
                    float f7 = z10 ? 1.0f : 0.0f;
                    dpVar.d = f7;
                    dpVar.setShown(f7);
                    if (!z10) {
                        dpVar.setVisibility(8);
                    }
                    dpVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.wp wpVar = (org.telegram.ui.Components.wp) this.c;
                wpVar.g0 = this.b ? 1.0f : 0.0f;
                wpVar.J.setTranslationY((-AndroidUtilities.dp(7.0f)) * wpVar.g0);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.wq) this.c).H.setVisibility(8);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.gw gwVar = (org.telegram.ui.Components.gw) this.c;
                org.telegram.ui.Components.kw kwVar = gwVar.J;
                if (kwVar.U && !gwVar.h) {
                    if (!this.b && !gwVar.n) {
                        gwVar.setBackground(null);
                        break;
                    } else if (gwVar.getBackground() == null) {
                        gwVar.setBackground(org.telegram.ui.ActionBar.h6.Z(kwVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.v00 v00Var = (org.telegram.ui.Components.v00) this.c;
                AnimatorSet animatorSet2 = v00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        v00Var.f.setVisibility(4);
                    }
                    v00Var.e = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.g10 g10Var = (org.telegram.ui.Components.g10) this.c;
                g10Var.h = this.b ? 1.0f : 0.0f;
                g10Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.i30 i30Var = (org.telegram.ui.Components.i30) this.c;
                org.telegram.ui.Components.f30 f30Var = i30Var.a;
                if (!i30Var.F) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    i30Var.b0 = f10;
                    i30Var.U.setPinnedProgress(f10);
                    f30Var.setScaleX(1.0f - (i30Var.b0 * 0.6f));
                    f30Var.setScaleY(1.0f - (i30Var.b0 * 0.6f));
                    if (i30Var.W) {
                        i30Var.i();
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.l70 l70Var = (org.telegram.ui.Components.l70) this.c;
                AnimatorSet animatorSet3 = l70Var.X;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        l70Var.Y.setVisibility(4);
                    }
                    l70Var.X = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.v70 v70Var = (org.telegram.ui.Components.v70) this.c;
                boolean z11 = this.b;
                v70Var.h0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.f3) v70Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    v70Var.V.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.oc0 oc0Var = (org.telegram.ui.Components.oc0) this.c;
                if (oc0Var.getParent() != null) {
                    ((ViewGroup) oc0Var.getParent()).removeView(oc0Var);
                }
                boolean z12 = this.b;
                al alVar = (al) oc0Var;
                MessagePreviewParams messagePreviewParams = alVar.H.f5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new zk(alVar, 0), 15L);
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
                ci.i4 i4Var = me0Var.e;
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
                org.telegram.ui.Components.go0 go0Var = (org.telegram.ui.Components.go0) this.c;
                if (animator == go0Var.G) {
                    float f12 = z13 ? 1.0f : 0.0f;
                    go0Var.F = f12;
                    go0Var.setShown(f12);
                    if (!z13) {
                        go0Var.setVisibility(8);
                    }
                    go0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.uv0 uv0Var = (org.telegram.ui.Components.uv0) this.c;
                if (uv0Var.N1 != null) {
                    uv0Var.N1 = null;
                    if (!this.b) {
                        uv0Var.B0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.r21 r21Var = (org.telegram.ui.Components.r21) this.c;
                r21Var.M = this.b ? 1.0f : 0.0f;
                r21Var.invalidate();
                break;
            case 22:
                org.telegram.ui.Components.m31 m31Var = (org.telegram.ui.Components.m31) this.c;
                m31Var.F = this.b ? 1.0f : 0.0f;
                m31Var.h();
                break;
            case 23:
                org.telegram.ui.Components.r31 r31Var = (org.telegram.ui.Components.r31) this.c;
                r31Var.Q = this.b ? 1.0f : 0.0f;
                r31Var.h();
                r31Var.g();
                break;
            case 24:
                org.telegram.ui.Components.h71 h71Var = (org.telegram.ui.Components.h71) this.c;
                AnimatorSet animatorSet4 = h71Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        h71Var.e.setVisibility(4);
                    }
                    h71Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.l71 l71Var = (org.telegram.ui.Components.l71) this.c;
                AnimatorSet animatorSet5 = l71Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        l71Var.n.setVisibility(4);
                    }
                    l71Var.r = null;
                    break;
                }
                break;
            case 26:
                org.telegram.ui.Components.voip.t2 t2Var = (org.telegram.ui.Components.voip.t2) this.c;
                t2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = t2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!t2Var.G && (drawable = (drawableArr = t2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                t2Var.G = false;
                if (!t2Var.O) {
                    t2Var.n = t2Var.r;
                }
                t2Var.s = 0.0f;
                t2Var.invalidate();
                break;
            case 27:
                fs fsVar = (fs) this.c;
                if (fsVar.w != null && (radialProgressView2 = fsVar.s) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        fsVar.v.setVisibility(4);
                    }
                    fsVar.w = null;
                    break;
                }
                break;
            case 28:
                ty tyVar = (ty) this.c;
                tyVar.r = this.b ? 1.0f : 0.0f;
                org.telegram.ui.Components.w9 w9Var2 = tyVar.c;
                int i10 = org.telegram.ui.ActionBar.h6.C6;
                int w02 = org.telegram.ui.ActionBar.h6.w0(i10, tyVar.a);
                int i11 = org.telegram.ui.ActionBar.h6.Oh;
                int f13 = i0.a.f(tyVar.r, w02, org.telegram.ui.ActionBar.h6.w0(i11, tyVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                w9Var2.setColorFilter(new PorterDuffColorFilter(f13, mode));
                tyVar.c.invalidate();
                tyVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.f(1.0f - tyVar.r, org.telegram.ui.ActionBar.h6.w0(i10, tyVar.a), org.telegram.ui.ActionBar.h6.w0(i11, tyVar.a)), mode));
                tyVar.f.invalidate();
                break;
            default:
                g00 g00Var = (g00) this.c;
                g00Var.s = this.b ? 1.0f : 0.0f;
                g00Var.invalidate();
                break;
        }
    }

    public fo(View view) {
        this.a = 12;
        this.c = view;
        this.b = true;
    }

    public fo(View view, boolean z10) {
        this.a = 12;
        this.c = view;
        this.b = z10;
    }

    public fo(org.telegram.ui.Components.to toVar) {
        this.a = 4;
        this.c = toVar;
    }
}
