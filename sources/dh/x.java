package dh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import ci.j1;
import ei.g1;
import ei.j4;
import ei.k2;
import ei.n1;
import ei.r9;
import gi.d3;
import gi.m5;
import gi.m8;
import gi.va;
import gi.y3;
import ii.a3;
import kg.h1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.az;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.j41;
import org.telegram.ui.Components.li0;
import org.telegram.ui.a5;
import org.telegram.ui.ad;
import org.telegram.ui.d5;
import org.telegram.ui.ha;
import org.telegram.ui.i4;
import org.telegram.ui.ln;
import org.telegram.ui.t4;
import org.telegram.ui.wm;
import org.telegram.ui.xc;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(int i3, Object obj, boolean z10) {
        this.a = i3;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 16:
                ((ji.n) this.c).y = null;
                break;
            case 22:
                h2 h2Var = (h2) this.c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    break;
                }
                break;
            case 23:
                q5 q5Var = (q5) this.c;
                AnimatorSet animatorSet2 = q5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.L = null;
                    break;
                }
                break;
            case 25:
                sa saVar = (sa) this.c;
                AnimatorSet animatorSet3 = saVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    saVar.f = null;
                    break;
                }
                break;
            case 27:
                ((ad) this.c).r = null;
                break;
            case 28:
                wm wmVar = (wm) this.c;
                AnimatorSet animatorSet4 = wmVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    wmVar.W0 = null;
                    break;
                }
                break;
            case 29:
                ((ln) this.c).h = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        g1 g1Var;
        View m10;
        RadialProgressView radialProgressView;
        xc xcVar;
        RadialProgressView radialProgressView2;
        switch (this.a) {
            case 0:
                a0 a0Var = (a0) this.c;
                li0 li0Var = a0Var.n;
                a0Var.k();
                a0Var.l();
                boolean z10 = this.b;
                a0.a(a0Var, z10);
                a0Var.m.invalidateOutline();
                a0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    a0Var.k = true;
                    a0Var.a.invalidate();
                }
                li0Var.setCustomEmojiEnterProgress(Utilities.i(a0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    li0Var.setImportantForAccessibility(0);
                    li0Var.setSkipDraw(false);
                    a0Var.f();
                    Runtime.getRuntime().gc();
                    int i3 = a0Var.y;
                    li0Var.setCustomEmojiReactionsBackground((i3 == 4 || i3 == 5) ? false : true);
                }
                a0Var.C = false;
                break;
            case 1:
                ei.r rVar = (ei.r) this.c;
                rVar.e0 = this.b ? 1.0f : 0.0f;
                rVar.b();
                break;
            case 2:
                k2 k2Var = (k2) this.c;
                j1 j1Var = k2Var.c;
                boolean z11 = this.b;
                j1Var.setAlpha(z11 ? 0.0f : 1.0f);
                k2Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                k2Var.invalidate();
                break;
            case 3:
                n1 n1Var = (n1) this.c;
                n1Var.b.removeViewImmediate(n1Var.d);
                n1Var.f.b();
                if (this.b && (g1Var = n1Var.w) != null && g1Var != g1.X) {
                    g1Var.e();
                }
                n1Var.w = null;
                n1Var.s = true;
                n1Var.H = null;
                n1Var.F = false;
                break;
            case 4:
                r9 r9Var = (r9) this.c;
                r9Var.K0.e();
                r9Var.f0 = this.b ? r9Var.x.c : 0.0f;
                j4 currentPeerView = r9Var.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                r9Var.w.invalidate();
                r9Var.w1 = null;
                break;
            case 5:
                fi.q qVar = (fi.q) this.c;
                boolean z12 = this.b;
                qVar.x = z12 ? 1.0f : 0.0f;
                qVar.r.setTranslationY(org.telegram.messenger.g0.L(z12 ? 0.0f : -42.0f));
                qVar.n.setTranslationY(org.telegram.messenger.g0.L(z12 ? 42.0f : 0.0f));
                break;
            case 6:
                fi.m mVar = (fi.m) this.c;
                j41 j41Var = mVar.h;
                fi.e eVar = mVar.f;
                fi.h hVar = mVar.w;
                mVar.b = false;
                boolean z13 = this.b;
                if (z13) {
                    int i10 = mVar.e;
                    mVar.d = i10;
                    mVar.a0.E = i10;
                    az.F(i10);
                }
                int b10 = hVar.b();
                if (z13) {
                    j41Var.y1(mVar.d);
                    eVar.a0();
                    if (hVar.b() == b10) {
                        org.telegram.messenger.g0.b4(eVar);
                    } else {
                        hVar.f();
                    }
                }
                mVar.r.setVisibility(8);
                int i11 = mVar.T;
                if (i11 >= 0) {
                    if (z13 && (m10 = mVar.s.m(i11)) != null) {
                        mVar.U = m10.getTop();
                    }
                    j41Var.h1(mVar.T, (-eVar.getPaddingTop()) + mVar.U);
                }
                super.onAnimationEnd(animator);
                break;
            case 7:
                gi.d dVar = (gi.d) this.c;
                dVar.Q = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 8:
                gi.m mVar2 = (gi.m) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    mVar2.r.setVisibility(8);
                    gi.i iVar = mVar2.N;
                    if (iVar != null) {
                        iVar.setVisibility(8);
                    }
                }
                if (z14) {
                    mVar2.f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z14);
                break;
            case 9:
                gi.y yVar = (gi.y) this.c;
                gi.v vVar = yVar.a;
                boolean z15 = this.b;
                yVar.d = z15 ? 1.0f : 0.0f;
                vVar.invalidate();
                vVar.setVisibility(z15 ? 0 : 8);
                break;
            case 10:
                if (!this.b) {
                    ((d3) this.c).J.setVisibility(8);
                    break;
                }
                break;
            case 11:
                if (!this.b) {
                    ((y3) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 12:
                m5 m5Var = (m5) this.c;
                if (!this.b) {
                    m5Var.J1.setVisibility(8);
                    m5Var.J1.n();
                    break;
                }
                break;
            case 13:
                m8 m8Var = (m8) this.c;
                if (this.b) {
                    m8Var.setVisibility(8);
                }
                m8Var.c = null;
                break;
            case 14:
                va vaVar = (va) this.c;
                if (!this.b) {
                    vaVar.W0.setVisibility(8);
                }
                vaVar.g2 = null;
                break;
            case 15:
                a3 a3Var = (a3) this.c;
                a3Var.S0 = this.b ? 1.0f : 0.0f;
                a3Var.l();
                break;
            case 16:
                ji.n nVar = (ji.n) this.c;
                if (nVar.y != null && (radialProgressView = nVar.E) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        nVar.w.setVisibility(4);
                    }
                    nVar.y = null;
                    break;
                }
                break;
            case 17:
                h1 h1Var = (h1) this.c;
                boolean z16 = this.b;
                h1Var.e = z16 ? 1.0f : 0.0f;
                h1Var.invalidate();
                int i12 = 0;
                while (i12 < 2) {
                    h1Var.c[i12].setTranslationX(org.telegram.messenger.g0.W1(h1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    h1Var.c[i12].setVisibility((i12 == 1) == z16 ? 0 : 8);
                    h1Var.c[i12].setAlpha(org.telegram.messenger.g0.T1(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, h1Var.e));
                    h1Var.d[i12].setTranslationX(org.telegram.messenger.g0.W1(h1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    h1Var.d[i12].setVisibility((i12 == 1) == z16 ? 0 : 8);
                    h1Var.d[i12].setAlpha(org.telegram.messenger.g0.T1(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, h1Var.e));
                    i12++;
                }
                break;
            case 18:
                y0 y0Var = (y0) this.c;
                float f10 = this.b ? 1.0f : 0.0f;
                y0Var.setTextColor(i0.a.f(f10, -1, -9194260));
                y0Var.setIconColor(i0.a.f(f10, -1, -9194260));
                break;
            case 19:
                i4 i4Var = (i4) this.c;
                boolean z17 = this.b;
                float f11 = z17 ? 1.0f : 0.0f;
                i4Var.a1 = f11;
                i4Var.r0.setTranslationY(((1.0f - f11) * org.telegram.messenger.g0.L(51.0f)) + i4Var.q0);
                if (!z17) {
                    i4Var.r0.setVisibility(8);
                    break;
                }
                break;
            case 20:
                d5 d5Var = (d5) this.c;
                if (!this.b) {
                    d5Var.setVisibility(4);
                    b4.n nVar2 = ((t4) d5Var).H;
                    if (nVar2.a) {
                        nVar2.a = false;
                        if (((t4) nVar2.d).getParent() != null) {
                            ((WindowManager) nVar2.c).removeView((t4) nVar2.d);
                        }
                        t4 t4Var = (t4) nVar2.d;
                        t4Var.F = true;
                        a5 a5Var = t4Var.E;
                        if (a5Var != null) {
                            if (a5Var.g) {
                                a5Var.g = false;
                                a5Var.b.n(a5Var.a, a5Var.e);
                            }
                            t4Var.E = null;
                        }
                        nVar2.d = null;
                        ((ViewGroup) nVar2.b).requestDisallowInterceptTouchEvent(false);
                        nVar2.b = null;
                        nVar2.c = null;
                        break;
                    }
                }
                break;
            case 21:
                q1 q1Var = (q1) this.c;
                x1 x1Var = q1Var.hb;
                int b11 = x1Var.b();
                int i13 = q1Var.pb;
                if (i13 == b11) {
                    q1Var.sb = false;
                    x1Var.b2 = i13;
                    break;
                } else {
                    q1Var.B0(i13, b11, this.b);
                    break;
                }
            case 22:
                h2 h2Var = (h2) this.c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    if (!this.b) {
                        h2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 23:
                q5 q5Var = (q5) this.c;
                AnimatorSet animatorSet2 = q5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.L = null;
                    if (!this.b) {
                        q5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 24:
                n7 n7Var = (n7) this.c;
                ValueAnimator valueAnimator = n7Var.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    n7Var.C0 = this.b ? 1.0f : 0.0f;
                    n7Var.B0 = null;
                    break;
                }
                break;
            case 25:
                sa saVar = (sa) this.c;
                AnimatorSet animatorSet3 = saVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    saVar.f = null;
                    if (!this.b) {
                        saVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 26:
                ((ha) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 27:
                ad adVar = (ad) this.c;
                if (adVar.r != null && (xcVar = adVar.n) != null) {
                    if (this.b) {
                        xcVar.setVisibility(4);
                    } else {
                        adVar.s.setVisibility(4);
                    }
                    adVar.r = null;
                    break;
                }
                break;
            case 28:
                wm wmVar = (wm) this.c;
                AnimatorSet animatorSet4 = wmVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        wmVar.J0.setVisibility(4);
                        break;
                    } else {
                        (wmVar.F0 ? wmVar.G0 : wmVar.E0).setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ln lnVar = (ln) this.c;
                if (lnVar.h != null && (radialProgressView2 = lnVar.n) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        lnVar.f.setVisibility(4);
                    }
                    lnVar.h = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationStart(animator);
                try {
                    ((ei.r) this.c).performHapticFeedback(3);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
