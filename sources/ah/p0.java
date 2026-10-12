package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bi.b2;
import bi.h3;
import bi.q5;
import bi.sb;
import bi.t1;
import di.kc;
import di.o6;
import di.s4;
import di.v3;
import di.v9;
import fi.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.bb;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Cells.u1;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.d5;
import org.telegram.ui.fo;
import org.telegram.ui.g5;
import org.telegram.ui.k4;
import org.telegram.ui.pd;
import org.telegram.ui.sa;
import org.telegram.ui.sd;
import org.telegram.ui.w4;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class p0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 16:
                ((gi.p) this.c).w = null;
                break;
            case 23:
                f2 f2Var = (f2) this.c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    break;
                }
                break;
            case 24:
                t5 t5Var = (t5) this.c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    break;
                }
                break;
            case 26:
                bb bbVar = (bb) this.c;
                AnimatorSet animatorSet3 = bbVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bbVar.f = null;
                    break;
                }
                break;
            case 28:
                ((sd) this.c).n = null;
                break;
            case 29:
                fo foVar = (fo) this.c;
                AnimatorSet animatorSet4 = foVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    foVar.H0 = null;
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
        t1 t1Var;
        View m10;
        RadialProgressView radialProgressView;
        pd pdVar;
        switch (this.a) {
            case 0:
                t0 t0Var = (t0) this.c;
                gl0 gl0Var = t0Var.n;
                t0Var.k();
                t0Var.l();
                boolean z10 = this.b;
                t0.a(t0Var, z10);
                t0Var.m.invalidateOutline();
                t0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    t0Var.k = true;
                    t0Var.a.invalidate();
                }
                gl0Var.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    gl0Var.setImportantForAccessibility(0);
                    gl0Var.setSkipDraw(false);
                    t0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = t0Var.y;
                    gl0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                t0Var.C = false;
                break;
            case 1:
                bi.v vVar = (bi.v) this.c;
                vVar.d0 = this.b ? 1.0f : 0.0f;
                vVar.b();
                break;
            case 2:
                h3 h3Var = (h3) this.c;
                bi.o0 o0Var = h3Var.c;
                boolean z11 = this.b;
                o0Var.setAlpha(z11 ? 0.0f : 1.0f);
                h3Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                h3Var.invalidate();
                break;
            case 3:
                b2 b2Var = (b2) this.c;
                b2Var.b.removeViewImmediate(b2Var.d);
                b2Var.f.b();
                if (this.b && (t1Var = b2Var.v) != null && t1Var != t1.W) {
                    t1Var.e();
                }
                b2Var.v = null;
                b2Var.s = true;
                b2Var.G = null;
                b2Var.E = false;
                break;
            case 4:
                sb sbVar = (sb) this.c;
                sbVar.J0.unlock();
                sbVar.e0 = this.b ? sbVar.w.c : 0.0f;
                q5 currentPeerView = sbVar.n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                sbVar.v.invalidate();
                sbVar.v1 = null;
                break;
            case 5:
                ci.y yVar = (ci.y) this.c;
                boolean z12 = this.b;
                yVar.w = z12 ? 1.0f : 0.0f;
                yVar.r.setTranslationY(AndroidUtilities.dp(z12 ? 0.0f : -42.0f));
                yVar.n.setTranslationY(AndroidUtilities.dp(z12 ? 42.0f : 0.0f));
                break;
            case 6:
                ci.t tVar = (ci.t) this.c;
                ci.h hVar = tVar.h;
                ci.i iVar = tVar.f;
                ci.l lVar = tVar.v;
                tVar.b = false;
                boolean z13 = this.b;
                if (z13) {
                    int i11 = tVar.e;
                    tVar.d = i11;
                    tVar.W.y = i11;
                    SharedConfig.setStoriesColumnsCount(i11);
                }
                int h = lVar.h();
                if (z13) {
                    hVar.y1(tVar.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                tVar.r.setVisibility(8);
                int i12 = tVar.S;
                if (i12 >= 0) {
                    if (z13 && (m10 = tVar.s.m(i12)) != null) {
                        tVar.T = m10.getTop();
                    }
                    hVar.h1(tVar.S, (-iVar.getPaddingTop()) + tVar.T);
                }
                super.onAnimationEnd(animator);
                break;
            case 7:
                di.d dVar = (di.d) this.c;
                dVar.M = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 8:
                di.m mVar = (di.m) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    mVar.r.setVisibility(8);
                    di.i iVar2 = mVar.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z14) {
                    mVar.f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z14);
                break;
            case 9:
                di.y yVar2 = (di.y) this.c;
                di.v vVar2 = yVar2.a;
                boolean z15 = this.b;
                yVar2.d = z15 ? 1.0f : 0.0f;
                vVar2.invalidate();
                vVar2.setVisibility(z15 ? 0 : 8);
                break;
            case 10:
                if (!this.b) {
                    ((v3) this.c).I.setVisibility(8);
                    break;
                }
                break;
            case 11:
                if (!this.b) {
                    ((s4) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 12:
                o6 o6Var = (o6) this.c;
                if (!this.b) {
                    o6Var.Z1.setVisibility(8);
                    o6Var.Z1.n();
                    break;
                }
                break;
            case 13:
                v9 v9Var = (v9) this.c;
                if (this.b) {
                    v9Var.setVisibility(8);
                }
                v9Var.c = null;
                break;
            case 14:
                kc kcVar = (kc) this.c;
                if (!this.b) {
                    kcVar.V0.setVisibility(8);
                }
                kcVar.f2 = null;
                break;
            case 15:
                k3 k3Var = (k3) this.c;
                k3Var.N0 = this.b ? 1.0f : 0.0f;
                k3Var.h();
                break;
            case 16:
                gi.p pVar = (gi.p) this.c;
                if (pVar.w != null && (radialProgressView = pVar.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        pVar.s.setVisibility(4);
                    }
                    pVar.w = null;
                    break;
                }
                break;
            case 17:
                hg.m1 m1Var = (hg.m1) this.c;
                boolean z16 = this.b;
                m1Var.e = z16 ? 1.0f : 0.0f;
                m1Var.invalidate();
                int i13 = 0;
                while (i13 < 2) {
                    m1Var.c[i13].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.c[i13].setVisibility((i13 == 1) == z16 ? 0 : 8);
                    m1Var.c[i13].setAlpha(AndroidUtilities.lerp(i13 == 0 ? 1.0f : 0.0f, i13 == 1 ? 1.0f : 0.0f, m1Var.e));
                    m1Var.d[i13].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), m1Var.e));
                    m1Var.d[i13].setVisibility((i13 == 1) == z16 ? 0 : 8);
                    m1Var.d[i13].setAlpha(AndroidUtilities.lerp(i13 == 0 ? 1.0f : 0.0f, i13 == 1 ? 1.0f : 0.0f, m1Var.e));
                    i13++;
                }
                break;
            case 18:
                if (this.b) {
                    ((mg.p) this.c).e(false, false, true, false);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                float f7 = this.b ? 1.0f : 0.0f;
                e1Var.setTextColor(i0.a.d(f7, -1, -9194260));
                e1Var.setIconColor(i0.a.d(f7, -1, -9194260));
                break;
            case 20:
                k4 k4Var = (k4) this.c;
                boolean z17 = this.b;
                float f10 = z17 ? 1.0f : 0.0f;
                k4Var.Y0 = f10;
                k4Var.q0.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(51.0f)) + k4Var.p0);
                if (!z17) {
                    k4Var.q0.setVisibility(8);
                    break;
                }
                break;
            case 21:
                g5 g5Var = (g5) this.c;
                if (!this.b) {
                    g5Var.setVisibility(4);
                    c2.b bVar = ((w4) g5Var).G;
                    if (bVar.a) {
                        bVar.a = false;
                        if (((w4) bVar.d).getParent() != null) {
                            ((WindowManager) bVar.c).removeView((w4) bVar.d);
                        }
                        w4 w4Var = (w4) bVar.d;
                        w4Var.E = true;
                        d5 d5Var = w4Var.y;
                        if (d5Var != null) {
                            if (d5Var.g) {
                                d5Var.g = false;
                                d5Var.b.removeObserver(d5Var.a, d5Var.e);
                            }
                            w4Var.y = null;
                        }
                        bVar.d = null;
                        ((ViewGroup) bVar.b).requestDisallowInterceptTouchEvent(false);
                        bVar.b = null;
                        bVar.c = null;
                        break;
                    }
                }
                break;
            case 22:
                u1 u1Var = (u1) this.c;
                org.telegram.ui.Cells.t1 t1Var2 = u1Var.Zc;
                int g10 = t1Var2.g();
                int i14 = u1Var.hd;
                if (i14 == g10) {
                    u1Var.kd = false;
                    t1Var2.a2 = i14;
                    break;
                } else {
                    u1Var.t1(i14, g10, this.b);
                    break;
                }
            case 23:
                f2 f2Var = (f2) this.c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    if (!this.b) {
                        f2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 24:
                t5 t5Var = (t5) this.c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    if (!this.b) {
                        t5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 25:
                t7 t7Var = (t7) this.c;
                ValueAnimator valueAnimator = t7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    t7Var.B0 = this.b ? 1.0f : 0.0f;
                    t7Var.A0 = null;
                    break;
                }
                break;
            case 26:
                bb bbVar = (bb) this.c;
                AnimatorSet animatorSet3 = bbVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bbVar.f = null;
                    if (!this.b) {
                        bbVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 27:
                ((sa) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 28:
                sd sdVar = (sd) this.c;
                if (sdVar.n != null && (pdVar = sdVar.h) != null) {
                    if (this.b) {
                        pdVar.setVisibility(4);
                    } else {
                        sdVar.r.setVisibility(4);
                    }
                    sdVar.n = null;
                    break;
                }
                break;
            default:
                fo foVar = (fo) this.c;
                AnimatorSet animatorSet4 = foVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        foVar.G0.setVisibility(4);
                        break;
                    } else {
                        (foVar.C0 ? foVar.D0 : foVar.B0).setVisibility(4);
                        break;
                    }
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
                    ((bi.v) this.c).performHapticFeedback(3);
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
