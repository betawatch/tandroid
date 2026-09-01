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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class x20 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final boolean b;
    public final Object c;

    public /* synthetic */ x20(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 2:
                u60 u60Var = (u60) this.c;
                AnimatorSet animatorSet = u60Var.U;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    u60Var.U = null;
                    break;
                }
                break;
            case 7:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 9:
                ((zu0) this.c).K1 = null;
                break;
            case 13:
                o61 o61Var = (o61) this.c;
                AnimatorSet animatorSet2 = o61Var.d;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    o61Var.d = null;
                    break;
                }
                break;
            case 14:
                s61 s61Var = (s61) this.c;
                AnimatorSet animatorSet3 = s61Var.r;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    s61Var.r = null;
                    break;
                }
                break;
            case 16:
                ((org.telegram.ui.os) this.c).w = null;
                break;
            case 20:
                ((org.telegram.ui.f70) this.c).h = null;
                break;
            case 23:
                org.telegram.ui.hq0 hq0Var = (org.telegram.ui.hq0) this.c;
                if (animator.equals(hq0Var.h0)) {
                    hq0Var.h0 = null;
                    break;
                }
                break;
            case 29:
                ((org.telegram.ui.p81) this.c).r = null;
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
        org.telegram.ui.kd kdVar;
        org.telegram.ui.Cells.y3 y3Var;
        switch (this.a) {
            case 0:
                c30 c30Var = (c30) this.c;
                a30 a30Var = c30Var.a;
                if (!c30Var.C) {
                    float f10 = this.b ? 1.0f : 0.0f;
                    c30Var.Y = f10;
                    c30Var.R.setPinnedProgress(f10);
                    a30Var.setScaleX(1.0f - (c30Var.Y * 0.6f));
                    a30Var.setScaleY(1.0f - (c30Var.Y * 0.6f));
                    if (c30Var.T) {
                        c30Var.i();
                        break;
                    }
                }
                break;
            case 1:
                super.onAnimationEnd(animator);
                ((View) this.c).setVisibility(this.b ? 8 : 4);
                break;
            case 2:
                u60 u60Var = (u60) this.c;
                AnimatorSet animatorSet = u60Var.U;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.b) {
                        u60Var.V.setVisibility(4);
                    }
                    u60Var.U = null;
                    break;
                }
                break;
            case 3:
                e70 e70Var = (e70) this.c;
                boolean z4 = this.b;
                e70Var.e0 = z4 ? 1.0f : 0.0f;
                viewGroup = ((org.telegram.ui.ActionBar.h3) e70Var).containerView;
                viewGroup.invalidate();
                if (!z4) {
                    e70Var.S.setVisibility(8);
                    break;
                }
                break;
            case 4:
                yb0 yb0Var = (yb0) this.c;
                if (yb0Var.getParent() != null) {
                    ((ViewGroup) yb0Var.getParent()).removeView(yb0Var);
                }
                org.telegram.ui.fl flVar = (org.telegram.ui.fl) yb0Var;
                MessagePreviewParams messagePreviewParams = flVar.E.c5;
                if (messagePreviewParams != null) {
                    messagePreviewParams.attach(null);
                }
                if (this.b) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.el(flVar, 0), 15L);
                    break;
                }
                break;
            case 5:
                sb0 sb0Var = (sb0) this.c;
                sb0Var.M = null;
                sb0Var.g(this.b, false);
                break;
            case 6:
                xd0 xd0Var = (xd0) this.c;
                TextView textView = xd0Var.w;
                eh.d dVar = xd0Var.e;
                float f11 = this.b ? 1.0f : 0.0f;
                dVar.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                dVar.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f11));
                dVar.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                textView.setScaleX(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setScaleY(AndroidUtilities.lerp(1.0f, 0.9f, f11));
                textView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, f11));
                xd0Var.s.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, f11));
                break;
            case 7:
                PipRoundVideoView pipRoundVideoView = (PipRoundVideoView) this.c;
                if (animator.equals(pipRoundVideoView.r)) {
                    if (!this.b) {
                        pipRoundVideoView.a(false);
                    }
                    pipRoundVideoView.r = null;
                    break;
                }
                break;
            case 8:
                pn0 pn0Var = (pn0) this.c;
                if (animator == pn0Var.D) {
                    boolean z10 = this.b;
                    float f12 = z10 ? 1.0f : 0.0f;
                    pn0Var.C = f12;
                    pn0Var.setShown(f12);
                    if (!z10) {
                        pn0Var.setVisibility(8);
                    }
                    pn0Var.b(true);
                    break;
                }
                break;
            case 9:
                zu0 zu0Var = (zu0) this.c;
                if (zu0Var.K1 != null) {
                    zu0Var.K1 = null;
                    if (!this.b) {
                        zu0Var.y0.setVisibility(4);
                        break;
                    }
                }
                break;
            case 10:
                super.onAnimationEnd(animator);
                x11 x11Var = (x11) this.c;
                x11Var.J = this.b ? 1.0f : 0.0f;
                x11Var.invalidate();
                break;
            case 11:
                s21 s21Var = (s21) this.c;
                s21Var.C = this.b ? 1.0f : 0.0f;
                s21Var.h();
                break;
            case 12:
                w21 w21Var = (w21) this.c;
                w21Var.N = this.b ? 1.0f : 0.0f;
                w21Var.h();
                w21Var.g();
                break;
            case 13:
                o61 o61Var = (o61) this.c;
                AnimatorSet animatorSet2 = o61Var.d;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.b) {
                        o61Var.e.setVisibility(4);
                    }
                    o61Var.d = null;
                    break;
                }
                break;
            case 14:
                s61 s61Var = (s61) this.c;
                AnimatorSet animatorSet3 = s61Var.r;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    if (!this.b) {
                        s61Var.n.setVisibility(4);
                    }
                    s61Var.r = null;
                    break;
                }
                break;
            case 15:
                org.telegram.ui.Components.voip.w2 w2Var = (org.telegram.ui.Components.voip.w2) this.c;
                w2Var.v = null;
                if (this.b) {
                    TextView[] textViewArr = w2Var.h;
                    TextView textView2 = textViewArr[0];
                    textViewArr[0] = textViewArr[1];
                    textViewArr[1] = textView2;
                    textView2.setVisibility(8);
                }
                if (!w2Var.D && (drawable = (drawableArr = w2Var.e)[1]) != null) {
                    drawableArr[0] = drawable;
                    drawableArr[1] = null;
                }
                w2Var.D = false;
                if (!w2Var.L) {
                    w2Var.n = w2Var.r;
                }
                w2Var.s = 0.0f;
                w2Var.invalidate();
                break;
            case 16:
                org.telegram.ui.os osVar = (org.telegram.ui.os) this.c;
                if (osVar.w != null && (radialProgressView = osVar.s) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        osVar.v.setVisibility(4);
                    }
                    osVar.w = null;
                    break;
                }
                break;
            case 17:
                org.telegram.ui.hz hzVar = (org.telegram.ui.hz) this.c;
                hzVar.r = this.b ? 1.0f : 0.0f;
                p9 p9Var = hzVar.c;
                int i10 = org.telegram.ui.ActionBar.k6.C6;
                int v02 = org.telegram.ui.ActionBar.k6.v0(i10, hzVar.a);
                int i11 = org.telegram.ui.ActionBar.k6.Oh;
                int d = i0.a.d(hzVar.r, v02, org.telegram.ui.ActionBar.k6.v0(i11, hzVar.a));
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                p9Var.setColorFilter(new PorterDuffColorFilter(d, mode));
                hzVar.c.invalidate();
                hzVar.f.setColorFilter(new PorterDuffColorFilter(i0.a.d(1.0f - hzVar.r, org.telegram.ui.ActionBar.k6.v0(i10, hzVar.a), org.telegram.ui.ActionBar.k6.v0(i11, hzVar.a)), mode));
                hzVar.f.invalidate();
                break;
            case 18:
                org.telegram.ui.u00 u00Var = (org.telegram.ui.u00) this.c;
                u00Var.s = this.b ? 1.0f : 0.0f;
                u00Var.invalidate();
                break;
            case 19:
                org.telegram.ui.d60 d60Var = (org.telegram.ui.d60) this.c;
                d60Var.R2 = null;
                d60Var.L.getSubtitleTextView().setTranslationY(this.b ? 0.0f : AndroidUtilities.dp(20.0f));
                break;
            case 20:
                org.telegram.ui.f70 f70Var = (org.telegram.ui.f70) this.c;
                if (f70Var.h != null && (kdVar = f70Var.f) != null) {
                    if (this.b) {
                        kdVar.setVisibility(4);
                    } else {
                        f70Var.n.setVisibility(4);
                    }
                    f70Var.h = null;
                    break;
                }
                break;
            case 21:
                org.telegram.ui.og0 og0Var = (org.telegram.ui.og0) this.c;
                if (!this.b) {
                    og0Var.S.setVisibility(4);
                }
                AnimatorSet animatorSet4 = og0Var.I;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    og0Var.I = null;
                    break;
                }
                break;
            case 22:
                if (!this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(8);
                    break;
                }
                break;
            case 23:
                org.telegram.ui.hq0 hq0Var = (org.telegram.ui.hq0) this.c;
                if (animator.equals(hq0Var.h0)) {
                    if (!this.b) {
                        hq0Var.W.setVisibility(4);
                        hq0Var.X.setVisibility(4);
                    }
                    hq0Var.h0 = null;
                    break;
                }
                break;
            case 24:
                ((org.telegram.ui.tv0) this.c).B = this.b ? 1.0f : 0.0f;
                break;
            case 25:
                org.telegram.ui.l01 l01Var = (org.telegram.ui.l01) this.c;
                if (l01Var.h) {
                    org.telegram.ui.ActionBar.w0 w0Var = l01Var.n.R0;
                    if (w0Var != null) {
                        w0Var.setClickable(false);
                    }
                    ProfileActivity profileActivity = l01Var.n;
                    if (profileActivity.K0) {
                        profileActivity.P0.setVisibility(8);
                    }
                    ProfileActivity profileActivity2 = l01Var.n;
                    if (profileActivity2.I0) {
                        profileActivity2.N0.setVisibility(8);
                    }
                    ProfileActivity profileActivity3 = l01Var.n;
                    if (profileActivity3.J0) {
                        profileActivity3.O0.setVisibility(8);
                    }
                } else {
                    l01Var.setVisibility(8);
                }
                l01Var.n.l5(false);
                break;
            case 26:
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) this.c;
                if (this.b) {
                    r11Var.c.setVisibility(8);
                    break;
                } else {
                    r11Var.f.setVisibility(8);
                    break;
                }
            case 27:
                org.telegram.ui.r41 r41Var = (org.telegram.ui.r41) this.c;
                r41Var.v = this.b ? 1.0f : 0.0f;
                if (r41Var.P) {
                    r41Var.K.invalidate();
                    break;
                }
                break;
            case 28:
                org.telegram.ui.n61 n61Var = (org.telegram.ui.n61) this.c;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n61Var.v;
                float f13 = this.b ? 1.0f : 0.0f;
                n61Var.I = f13;
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackScaleY(f13);
                actionBarPopupWindow$ActionBarPopupWindowLayout.setAlpha(pr.g.getInterpolation(n61Var.I));
                int itemsCount = actionBarPopupWindow$ActionBarPopupWindowLayout.getItemsCount();
                for (int i12 = 0; i12 < itemsCount; i12++) {
                    float cascade = AndroidUtilities.cascade(n61Var.I, i12, itemsCount, 4.0f);
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i12).setTranslationY((1.0f - cascade) * AndroidUtilities.dp(-12.0f));
                    actionBarPopupWindow$ActionBarPopupWindowLayout.I.getChildAt(i12).setAlpha(cascade);
                }
                n61Var.K = null;
                break;
            default:
                org.telegram.ui.p81 p81Var = (org.telegram.ui.p81) this.c;
                if (p81Var.r != null && (y3Var = p81Var.s) != null) {
                    if (!this.b) {
                        y3Var.setVisibility(4);
                    }
                    p81Var.r = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 21:
                if (this.b) {
                    ((org.telegram.ui.og0) this.c).S.setVisibility(0);
                    break;
                }
                break;
            case 22:
                if (this.b) {
                    ((PasscodeActivity) this.c).v.setVisibility(0);
                    break;
                }
                break;
            case 23:
            case 24:
            default:
                super.onAnimationStart(animator);
                break;
            case 25:
                org.telegram.ui.l01 l01Var = (org.telegram.ui.l01) this.c;
                org.telegram.ui.ActionBar.w0 w0Var = l01Var.n.R0;
                if (w0Var != null && !this.b) {
                    w0Var.setClickable(true);
                }
                ProfileActivity profileActivity = l01Var.n;
                if (profileActivity.K0) {
                    profileActivity.P0.setVisibility(0);
                }
                ProfileActivity profileActivity2 = l01Var.n;
                if (profileActivity2.I0) {
                    profileActivity2.N0.setVisibility(0);
                }
                ProfileActivity profileActivity3 = l01Var.n;
                if (profileActivity3.J0) {
                    profileActivity3.O0.setVisibility(0);
                }
                l01Var.setVisibility(0);
                l01Var.n.l5(false);
                break;
            case 26:
                org.telegram.ui.r11 r11Var = (org.telegram.ui.r11) this.c;
                if (!this.b) {
                    r11Var.c.setAlpha(0.0f);
                    r11Var.c.setVisibility(0);
                    break;
                } else {
                    r11Var.f.setAlpha(0.0f);
                    r11Var.f.setVisibility(0);
                    break;
                }
        }
    }

    public x20(View view) {
        this.a = 1;
        this.c = view;
        this.b = true;
    }

    public x20(View view, boolean z4) {
        this.a = 1;
        this.c = view;
        this.b = z4;
    }
}
