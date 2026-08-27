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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class go extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;

    public /* synthetic */ go(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((jo) this.c).h = null;
                break;
            case 1:
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.c;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    t9Var.h = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.Components.gi) this.c).U0 = null;
                break;
            case 4:
                this.b = true;
                break;
            case 9:
                org.telegram.ui.Components.b00 b00Var = (org.telegram.ui.Components.b00) this.c;
                AnimatorSet animatorSet2 = b00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    b00Var.e = null;
                    break;
                }
                break;
            case 13:
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) this.c;
                AnimatorSet animatorSet3 = f60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    f60Var.T = null;
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
                ((org.telegram.ui.Components.hu0) this.c).J1 = null;
                break;
            case 24:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) this.c;
                AnimatorSet animatorSet4 = q51Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    q51Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.c;
                AnimatorSet animatorSet5 = u51Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    u51Var.r = null;
                    break;
                }
                break;
            case 27:
                ((js) this.c).w = null;
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
                jo joVar = (jo) this.c;
                if (joVar.h != null && (radialProgressView = joVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        joVar.f.setVisibility(4);
                    }
                    joVar.h = null;
                    break;
                }
                break;
            case 1:
                org.telegram.ui.Components.t9 t9Var = (org.telegram.ui.Components.t9) this.c;
                AnimatorSet animatorSet = t9Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        t9Var.c.setVisibility(4);
                        break;
                    } else {
                        t9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 2:
                org.telegram.ui.Components.nc ncVar = (org.telegram.ui.Components.nc) this.c;
                if (animator == ncVar.g) {
                    ncVar.g = null;
                    ncVar.i = this.b ? 1.0f : 0.0f;
                    ncVar.b();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.Components.gi giVar = (org.telegram.ui.Components.gi) this.c;
                if (giVar.U0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.v0 v0Var = giVar.a1;
                        if (v0Var != null) {
                            v0Var.setVisibility(4);
                        }
                        if (giVar.M0 != 0 || !giVar.m1) {
                            giVar.W0.setVisibility(4);
                            break;
                        }
                    } else if (giVar.O0) {
                        org.telegram.ui.Components.yh yhVar = giVar.u0;
                        if (yhVar == null || yhVar.J()) {
                            giVar.t1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 4:
                org.telegram.ui.Components.wn wnVar = (org.telegram.ui.Components.wn) this.c;
                if (!this.b) {
                    org.telegram.ui.Components.n9 n9Var = wnVar.h;
                    wnVar.h = wnVar.n;
                    wnVar.n = n9Var;
                    n9Var.setVisibility(8);
                    wnVar.n.setAlpha(0.0f);
                    wnVar.h.setVisibility(0);
                    wnVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 5:
                boolean z10 = this.b;
                org.telegram.ui.Components.ho hoVar = (org.telegram.ui.Components.ho) this.c;
                if (animator == hoVar.e) {
                    float f10 = z10 ? 1.0f : 0.0f;
                    hoVar.d = f10;
                    hoVar.setShown(f10);
                    if (!z10) {
                        hoVar.setVisibility(8);
                    }
                    hoVar.a(true);
                    break;
                }
                break;
            case 6:
                org.telegram.ui.Components.ap apVar = (org.telegram.ui.Components.ap) this.c;
                apVar.c0 = this.b ? 1.0f : 0.0f;
                apVar.F.setTranslationY((-AndroidUtilities.dp(7.0f)) * apVar.c0);
                break;
            case 7:
                if (!this.b) {
                    ((org.telegram.ui.Components.aq) this.c).D.setVisibility(8);
                    break;
                }
                break;
            case 8:
                org.telegram.ui.Components.iv ivVar = (org.telegram.ui.Components.iv) this.c;
                org.telegram.ui.Components.mv mvVar = ivVar.F;
                if (mvVar.R && !ivVar.h) {
                    if (!this.b && !ivVar.n) {
                        ivVar.setBackground(null);
                        break;
                    } else if (ivVar.getBackground() == null) {
                        ivVar.setBackground(org.telegram.ui.ActionBar.g6.Y(mvVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 9:
                org.telegram.ui.Components.b00 b00Var = (org.telegram.ui.Components.b00) this.c;
                AnimatorSet animatorSet2 = b00Var.e;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        b00Var.f.setVisibility(4);
                    }
                    b00Var.e = null;
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.m00 m00Var = (org.telegram.ui.Components.m00) this.c;
                m00Var.h = this.b ? 1.0f : 0.0f;
                m00Var.invalidate();
                break;
            case 11:
                org.telegram.ui.Components.n20 n20Var = (org.telegram.ui.Components.n20) this.c;
                org.telegram.ui.Components.k20 k20Var = n20Var.a;
                if (!n20Var.B) {
                    float f11 = this.b ? 1.0f : 0.0f;
                    n20Var.X = f11;
                    n20Var.Q.setPinnedProgress(f11);
                    k20Var.setScaleX(1.0f - (n20Var.X * 0.6f));
                    k20Var.setScaleY(1.0f - (n20Var.X * 0.6f));
                    if (n20Var.S) {
                        n20Var.i();
                        break;
                    }
                }
                break;
            case 12:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 13:
                org.telegram.ui.Components.f60 f60Var = (org.telegram.ui.Components.f60) this.c;
                AnimatorSet animatorSet3 = f60Var.T;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        f60Var.U.setVisibility(4);
                    }
                    f60Var.T = null;
                    break;
                }
                break;
            case 14:
                org.telegram.ui.Components.p60 p60Var = (org.telegram.ui.Components.p60) this.c;
                boolean z11 = this.b;
                p60Var.d0 = z11 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.e3) p60Var).containerView;
                viewGroup.invalidate();
                if (!z11) {
                    p60Var.R.setVisibility(8);
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.gb0 gb0Var = (org.telegram.ui.Components.gb0) this.c;
                if (gb0Var.getParent() != null) {
                    ((ViewGroup) gb0Var.getParent()).removeView(gb0Var);
                }
                boolean z12 = this.b;
                yk ykVar = (yk) gb0Var;
                MessagePreviewParams messagePreviewParams = ykVar.D.b5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (z12) {
                    AndroidUtilities.runOnUIThread(new xk(ykVar, 0), 15L);
                    break;
                }
                break;
            case 16:
                org.telegram.ui.Components.ab0 ab0Var = (org.telegram.ui.Components.ab0) this.c;
                ab0Var.L = null;
                ab0Var.g(this.b, false);
                break;
            case 17:
                org.telegram.ui.Components.dd0 dd0Var = (org.telegram.ui.Components.dd0) this.c;
                TextView textView = dd0Var.w;
                ag.d dVar = dd0Var.e;
                float f12 = this.b ? 1.0f : 0.0f;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f12));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f12));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f12));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f12));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f12));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f12));
                dd0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f12));
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
                org.telegram.ui.Components.um0 um0Var = (org.telegram.ui.Components.um0) this.c;
                if (animator == um0Var.C) {
                    float f13 = z13 ? 1.0f : 0.0f;
                    um0Var.B = f13;
                    um0Var.setShown(f13);
                    if (!z13) {
                        um0Var.setVisibility(8);
                    }
                    um0Var.b(true);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.Components.hu0 hu0Var = (org.telegram.ui.Components.hu0) this.c;
                if (hu0Var.J1 != null) {
                    hu0Var.J1 = null;
                    if (!this.b) {
                        hu0Var.x0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                super.onAnimationEnd(animator);
                org.telegram.ui.Components.b11 b11Var = (org.telegram.ui.Components.b11) this.c;
                b11Var.I = this.b ? 1.0f : 0.0f;
                b11Var.invalidate();
                break;
            case 22:
                org.telegram.ui.Components.y11 y11Var = (org.telegram.ui.Components.y11) this.c;
                y11Var.B = this.b ? 1.0f : 0.0f;
                y11Var.h();
                break;
            case 23:
                org.telegram.ui.Components.c21 c21Var = (org.telegram.ui.Components.c21) this.c;
                c21Var.M = this.b ? 1.0f : 0.0f;
                c21Var.h();
                c21Var.g();
                break;
            case 24:
                org.telegram.ui.Components.q51 q51Var = (org.telegram.ui.Components.q51) this.c;
                AnimatorSet animatorSet4 = q51Var.d;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        q51Var.e.setVisibility(4);
                    }
                    q51Var.d = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Components.u51 u51Var = (org.telegram.ui.Components.u51) this.c;
                AnimatorSet animatorSet5 = u51Var.r;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        u51Var.n.setVisibility(4);
                    }
                    u51Var.r = null;
                    break;
                }
                break;
            case 26:
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
            case 27:
                js jsVar = (js) this.c;
                if (jsVar.w != null && (radialProgressView2 = jsVar.s) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        jsVar.v.setVisibility(4);
                    }
                    jsVar.w = null;
                    break;
                }
                break;
            case 28:
                xy xyVar = (xy) this.c;
                xyVar.r = this.b ? 1.0f : 0.0f;
                org.telegram.ui.Components.n9 n9Var2 = xyVar.c;
                int i10 = org.telegram.ui.ActionBar.g6.C6;
                int v02 = org.telegram.ui.ActionBar.g6.v0(i10, xyVar.a);
                int i11 = org.telegram.ui.ActionBar.g6.Oh;
                int d = i0.b.d(xyVar.r, v02, org.telegram.ui.ActionBar.g6.v0(i11, xyVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                n9Var2.setColorFilter(new PorterDuffColorFilter(d, mode));
                xyVar.c.invalidate();
                xyVar.f.setColorFilter(new PorterDuffColorFilter(i0.b.d(1.0f - xyVar.r, org.telegram.ui.ActionBar.g6.v0(i10, xyVar.a), org.telegram.ui.ActionBar.g6.v0(i11, xyVar.a)), mode));
                xyVar.f.invalidate();
                break;
            default:
                j00 j00Var = (j00) this.c;
                j00Var.s = this.b ? 1.0f : 0.0f;
                j00Var.invalidate();
                break;
        }
    }

    public go(View view) {
        this.a = 12;
        this.c = view;
        this.b = true;
    }

    public go(View view, boolean z10) {
        this.a = 12;
        this.c = view;
        this.b = z10;
    }

    public go(org.telegram.ui.Components.wn wnVar) {
        this.a = 4;
        this.c = wnVar;
    }
}
