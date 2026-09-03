package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import nh.d4;
import nh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.xa;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.sv;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.wv;
import org.telegram.ui.d5;
import org.telegram.ui.g5;
import org.telegram.ui.md;
import org.telegram.ui.n4;
import org.telegram.ui.oa;
import org.telegram.ui.pd;
import org.telegram.ui.ro;
import org.telegram.ui.w4;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class w2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w2(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 14:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                AnimatorSet animatorSet = d2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.O = null;
                    break;
                }
                break;
            case 15:
                s5 s5Var = (s5) this.c;
                AnimatorSet animatorSet2 = s5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.G = null;
                    break;
                }
                break;
            case 16:
            case 18:
            case 23:
            default:
                super.onAnimationCancel(animator);
                break;
            case 17:
                xa xaVar = (xa) this.c;
                AnimatorSet animatorSet3 = xaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    xaVar.f = null;
                    break;
                }
                break;
            case 19:
                ((pd) this.c).n = null;
                break;
            case 20:
                zn znVar = (zn) this.c;
                AnimatorSet animatorSet4 = znVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    znVar.E0 = null;
                    break;
                }
                break;
            case 21:
                ((ro) this.c).h = null;
                break;
            case 22:
                v9 v9Var = (v9) this.c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    v9Var.h = null;
                    break;
                }
                break;
            case 24:
                ((li) this.c).V0 = null;
                break;
            case 25:
                this.b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        nh.e1 e1Var;
        View m9;
        md mdVar;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                x2 x2Var = (x2) this.c;
                ((cg.p) x2Var).y.n.d();
                if (this.b) {
                    x2Var.w.accept(Integer.valueOf(x2Var.s));
                }
                if (x2Var.getParent() != null) {
                    ((ViewGroup) x2Var.getParent()).removeView(x2Var);
                    break;
                }
                break;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.c;
                if (this.b) {
                    limitPreviewView.g0 = false;
                }
                Runnable runnable = limitPreviewView.h0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.h0.run();
                    break;
                }
                break;
            case 2:
                eg.c1 c1Var = (eg.c1) this.c;
                c1Var.J = this.b ? 1.0f : 0.0f;
                c1Var.d.invalidate();
                eg.a1 a1Var = c1Var.e;
                if (a1Var != null) {
                    a1Var.invalidate();
                    break;
                }
                break;
            case 3:
                mg.d0 d0Var = (mg.d0) this.c;
                pk0 pk0Var = d0Var.n;
                d0Var.k();
                d0Var.l();
                boolean z4 = this.b;
                mg.d0.a(d0Var, z4);
                d0Var.m.invalidateOutline();
                d0Var.j = z4 ? 1.0f : 0.0f;
                if (z4) {
                    d0Var.k = true;
                    d0Var.a.invalidate();
                }
                pk0Var.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.j, 1.0f, 0.0f));
                if (!z4) {
                    pk0Var.setImportantForAccessibility(0);
                    pk0Var.setSkipDraw(false);
                    d0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = d0Var.y;
                    pk0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                d0Var.C = false;
                break;
            case 4:
                nh.q qVar = (nh.q) this.c;
                qVar.a0 = this.b ? 1.0f : 0.0f;
                qVar.b();
                break;
            case 5:
                nh.g2 g2Var = (nh.g2) this.c;
                lh.e1 e1Var2 = g2Var.c;
                boolean z10 = this.b;
                e1Var2.setAlpha(z10 ? 0.0f : 1.0f);
                g2Var.a.setAlpha(z10 ? 0.0f : 0.5f);
                g2Var.invalidate();
                break;
            case 6:
                nh.j1 j1Var = (nh.j1) this.c;
                j1Var.b.removeViewImmediate(j1Var.d);
                j1Var.f.b();
                if (this.b && (e1Var = j1Var.v) != null && e1Var != nh.e1.T) {
                    e1Var.e();
                }
                j1Var.v = null;
                j1Var.s = true;
                j1Var.D = null;
                j1Var.B = false;
                break;
            case 7:
                i9 i9Var = (i9) this.c;
                i9Var.G0.unlock();
                i9Var.b0 = this.b ? i9Var.w.c : 0.0f;
                d4 currentPeerView = i9Var.k0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.v.invalidate();
                i9Var.s1 = null;
                break;
            case 8:
                oh.v vVar = (oh.v) this.c;
                boolean z11 = this.b;
                vVar.w = z11 ? 1.0f : 0.0f;
                vVar.r.setTranslationY(AndroidUtilities.dp(z11 ? 0.0f : -42.0f));
                vVar.n.setTranslationY(AndroidUtilities.dp(z11 ? 42.0f : 0.0f));
                break;
            case 9:
                oh.r rVar = (oh.r) this.c;
                oh.h hVar = rVar.h;
                oh.i iVar = rVar.f;
                oh.l lVar = rVar.v;
                rVar.b = false;
                boolean z12 = this.b;
                if (z12) {
                    int i11 = rVar.e;
                    rVar.d = i11;
                    rVar.T.y = i11;
                    SharedConfig.setStoriesColumnsCount(i11);
                }
                int h = lVar.h();
                if (z12) {
                    hVar.y1(rVar.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                rVar.r.setVisibility(8);
                int i12 = rVar.P;
                if (i12 >= 0) {
                    if (z12 && (m9 = rVar.s.m(i12)) != null) {
                        rVar.Q = m9.getTop();
                    }
                    hVar.h1(rVar.P, (-iVar.getPaddingTop()) + rVar.Q);
                }
                super.onAnimationEnd(animator);
                break;
            case 10:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                float f10 = this.b ? 1.0f : 0.0f;
                g1Var.setTextColor(i0.a.d(f10, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f10, -1, -9194260));
                break;
            case 11:
                n4 n4Var = (n4) this.c;
                boolean z13 = this.b;
                float f11 = z13 ? 1.0f : 0.0f;
                n4Var.V0 = f11;
                n4Var.n0.setTranslationY(((1.0f - f11) * AndroidUtilities.dp(51.0f)) + n4Var.m0);
                if (!z13) {
                    n4Var.n0.setVisibility(8);
                    break;
                }
                break;
            case 12:
                g5 g5Var = (g5) this.c;
                if (!this.b) {
                    g5Var.setVisibility(4);
                    cb.m mVar = ((w4) g5Var).D;
                    if (mVar.a) {
                        mVar.a = false;
                        if (((w4) mVar.d).getParent() != null) {
                            ((WindowManager) mVar.c).removeView((w4) mVar.d);
                        }
                        w4 w4Var = (w4) mVar.d;
                        w4Var.B = true;
                        d5 d5Var = w4Var.y;
                        if (d5Var != null) {
                            if (d5Var.g) {
                                d5Var.g = false;
                                d5Var.b.removeObserver(d5Var.a, d5Var.e);
                            }
                            w4Var.y = null;
                        }
                        mVar.d = null;
                        ((ViewGroup) mVar.b).requestDisallowInterceptTouchEvent(false);
                        mVar.b = null;
                        mVar.c = null;
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                org.telegram.ui.Cells.r1 r1Var = s1Var.Wc;
                int g10 = r1Var.g();
                int i13 = s1Var.ed;
                if (i13 == g10) {
                    s1Var.hd = false;
                    r1Var.a2 = i13;
                    break;
                } else {
                    s1Var.t1(i13, g10, this.b);
                    break;
                }
            case 14:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                AnimatorSet animatorSet = d2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.O = null;
                    if (!this.b) {
                        d2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 15:
                s5 s5Var = (s5) this.c;
                AnimatorSet animatorSet2 = s5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.G = null;
                    if (!this.b) {
                        s5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 16:
                q7 q7Var = (q7) this.c;
                ValueAnimator valueAnimator = q7Var.x0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    q7Var.y0 = this.b ? 1.0f : 0.0f;
                    q7Var.x0 = null;
                    break;
                }
                break;
            case 17:
                xa xaVar = (xa) this.c;
                AnimatorSet animatorSet3 = xaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    xaVar.f = null;
                    if (!this.b) {
                        xaVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 18:
                ((oa) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 19:
                pd pdVar = (pd) this.c;
                if (pdVar.n != null && (mdVar = pdVar.h) != null) {
                    if (this.b) {
                        mdVar.setVisibility(4);
                    } else {
                        pdVar.r.setVisibility(4);
                    }
                    pdVar.n = null;
                    break;
                }
                break;
            case 20:
                zn znVar = (zn) this.c;
                AnimatorSet animatorSet4 = znVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        znVar.D0.setVisibility(4);
                        break;
                    } else {
                        (znVar.z0 ? znVar.A0 : znVar.y0).setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                ro roVar = (ro) this.c;
                if (roVar.h != null && (radialProgressView = roVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        roVar.f.setVisibility(4);
                    }
                    roVar.h = null;
                    break;
                }
                break;
            case 22:
                v9 v9Var = (v9) this.c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        v9Var.c.setVisibility(4);
                        break;
                    } else {
                        v9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 23:
                rc rcVar = (rc) this.c;
                if (animator == rcVar.g) {
                    rcVar.g = null;
                    rcVar.i = this.b ? 1.0f : 0.0f;
                    rcVar.b();
                    break;
                }
                break;
            case 24:
                li liVar = (li) this.c;
                if (liVar.V0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.w0 w0Var = liVar.b1;
                        if (w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                        if (liVar.N0 != 0 || !liVar.n1) {
                            liVar.X0.setVisibility(4);
                            break;
                        }
                    } else if (liVar.P0) {
                        di diVar = liVar.v0;
                        if (diVar == null || diVar.I()) {
                            liVar.u1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 25:
                eo eoVar = (eo) this.c;
                if (!this.b) {
                    p9 p9Var = eoVar.h;
                    eoVar.h = eoVar.n;
                    eoVar.n = p9Var;
                    p9Var.setVisibility(8);
                    eoVar.n.setAlpha(0.0f);
                    eoVar.h.setVisibility(0);
                    eoVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 26:
                boolean z14 = this.b;
                oo ooVar = (oo) this.c;
                if (animator == ooVar.e) {
                    float f12 = z14 ? 1.0f : 0.0f;
                    ooVar.d = f12;
                    ooVar.setShown(f12);
                    if (!z14) {
                        ooVar.setVisibility(8);
                    }
                    ooVar.a(true);
                    break;
                }
                break;
            case 27:
                jp jpVar = (jp) this.c;
                jpVar.d0 = this.b ? 1.0f : 0.0f;
                jpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * jpVar.d0);
                break;
            case 28:
                if (!this.b) {
                    ((jq) this.c).E.setVisibility(8);
                    break;
                }
                break;
            default:
                sv svVar = (sv) this.c;
                wv wvVar = svVar.G;
                if (wvVar.R && !svVar.h) {
                    if (!this.b && !svVar.n) {
                        svVar.setBackground(null);
                        break;
                    } else if (svVar.getBackground() == null) {
                        svVar.setBackground(j6.Y(wvVar.k(), 8, 8));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                super.onAnimationStart(animator);
                try {
                    ((nh.q) this.c).performHapticFeedback(3);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public w2(eo eoVar) {
        this.a = 25;
        this.c = eoVar;
    }
}
