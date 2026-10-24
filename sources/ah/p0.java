package ah;

import ai.u1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import ci.m2;
import ci.o1;
import ci.p4;
import ci.z9;
import ei.f6;
import ei.i9;
import ei.l4;
import ei.q3;
import ei.vb;
import gi.d3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.ab;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.d5;
import org.telegram.ui.g5;
import org.telegram.ui.jd;
import org.telegram.ui.k4;
import org.telegram.ui.md;
import org.telegram.ui.pa;
import org.telegram.ui.sn;
import org.telegram.ui.w4;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
            case 17:
                ((hi.o) this.c).x = null;
                break;
            case 23:
                e2 e2Var = (e2) this.c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    break;
                }
                break;
            case 24:
                s5 s5Var = (s5) this.c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    break;
                }
                break;
            case 26:
                ab abVar = (ab) this.c;
                AnimatorSet animatorSet3 = abVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    abVar.f = null;
                    break;
                }
                break;
            case 28:
                ((md) this.c).r = null;
                break;
            case 29:
                sn snVar = (sn) this.c;
                AnimatorSet animatorSet4 = snVar.T0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    snVar.T0 = null;
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
        ci.h1 h1Var;
        View m10;
        RadialProgressView radialProgressView;
        jd jdVar;
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
                ci.r rVar = (ci.r) this.c;
                rVar.d0 = this.b ? 1.0f : 0.0f;
                rVar.b();
                break;
            case 2:
                m2 m2Var = (m2) this.c;
                u1 u1Var = m2Var.c;
                boolean z11 = this.b;
                u1Var.setAlpha(z11 ? 0.0f : 1.0f);
                m2Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                m2Var.invalidate();
                break;
            case 3:
                o1 o1Var = (o1) this.c;
                o1Var.b.removeViewImmediate(o1Var.d);
                o1Var.f.b();
                if (this.b && (h1Var = o1Var.v) != null && h1Var != ci.h1.W) {
                    h1Var.e();
                }
                o1Var.v = null;
                o1Var.s = true;
                o1Var.G = null;
                o1Var.E = false;
                break;
            case 4:
                z9 z9Var = (z9) this.c;
                z9Var.J0.unlock();
                z9Var.e0 = this.b ? z9Var.w.c : 0.0f;
                p4 currentPeerView = z9Var.n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                z9Var.v.invalidate();
                z9Var.v1 = null;
                break;
            case 5:
                di.v vVar = (di.v) this.c;
                boolean z12 = this.b;
                vVar.w = z12 ? 1.0f : 0.0f;
                vVar.r.setTranslationY(AndroidUtilities.dp(z12 ? 0.0f : -42.0f));
                vVar.n.setTranslationY(AndroidUtilities.dp(z12 ? 42.0f : 0.0f));
                break;
            case 6:
                di.r rVar2 = (di.r) this.c;
                di.h hVar = rVar2.h;
                di.i iVar = rVar2.f;
                di.l lVar = rVar2.v;
                rVar2.b = false;
                boolean z13 = this.b;
                if (z13) {
                    int i11 = rVar2.e;
                    rVar2.d = i11;
                    rVar2.W.y = i11;
                    SharedConfig.setStoriesColumnsCount(i11);
                }
                int h = lVar.h();
                if (z13) {
                    hVar.y1(rVar2.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                rVar2.r.setVisibility(8);
                int i12 = rVar2.S;
                if (i12 >= 0) {
                    if (z13 && (m10 = rVar2.s.m(i12)) != null) {
                        rVar2.T = m10.getTop();
                    }
                    hVar.h1(rVar2.S, (-iVar.getPaddingTop()) + rVar2.T);
                }
                super.onAnimationEnd(animator);
                break;
            case 7:
                ei.d dVar = (ei.d) this.c;
                dVar.P = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 8:
                ei.m mVar = (ei.m) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    mVar.r.setVisibility(8);
                    ei.i iVar2 = mVar.M;
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
                ei.y yVar = (ei.y) this.c;
                ei.v vVar2 = yVar.a;
                boolean z15 = this.b;
                yVar.d = z15 ? 1.0f : 0.0f;
                vVar2.invalidate();
                vVar2.setVisibility(z15 ? 0 : 8);
                break;
            case 10:
                if (!this.b) {
                    ((q3) this.c).I.setVisibility(8);
                    break;
                }
                break;
            case 11:
                if (!this.b) {
                    ((l4) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 12:
                f6 f6Var = (f6) this.c;
                if (!this.b) {
                    f6Var.Z1.setVisibility(8);
                    f6Var.Z1.n();
                    break;
                }
                break;
            case 13:
                i9 i9Var = (i9) this.c;
                if (this.b) {
                    i9Var.setVisibility(8);
                }
                i9Var.c = null;
                break;
            case 14:
                vb vbVar = (vb) this.c;
                if (!this.b) {
                    vbVar.V0.setVisibility(8);
                }
                vbVar.f2 = null;
                break;
            case 15:
                d3 d3Var = (d3) this.c;
                d3Var.R0 = this.b ? 1.0f : 0.0f;
                d3Var.h();
                break;
            case 16:
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
            case 17:
                hi.o oVar = (hi.o) this.c;
                if (oVar.x != null && (radialProgressView = oVar.y) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        oVar.v.setVisibility(4);
                    }
                    oVar.x = null;
                    break;
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
                e1Var.setTextColor(i0.a.f(f7, -1, -9194260));
                e1Var.setIconColor(i0.a.f(f7, -1, -9194260));
                break;
            case 20:
                k4 k4Var = (k4) this.c;
                boolean z17 = this.b;
                float f10 = z17 ? 1.0f : 0.0f;
                k4Var.Z0 = f10;
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
                t1 t1Var = (t1) this.c;
                s1 s1Var = t1Var.Zc;
                int g10 = s1Var.g();
                int i14 = t1Var.hd;
                if (i14 == g10) {
                    t1Var.kd = false;
                    s1Var.a2 = i14;
                    break;
                } else {
                    t1Var.s1(i14, g10, this.b);
                    break;
                }
            case 23:
                e2 e2Var = (e2) this.c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    if (!this.b) {
                        e2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 24:
                s5 s5Var = (s5) this.c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    if (!this.b) {
                        s5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 25:
                s7 s7Var = (s7) this.c;
                ValueAnimator valueAnimator = s7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    s7Var.B0 = this.b ? 1.0f : 0.0f;
                    s7Var.A0 = null;
                    break;
                }
                break;
            case 26:
                ab abVar = (ab) this.c;
                AnimatorSet animatorSet3 = abVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    abVar.f = null;
                    if (!this.b) {
                        abVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 27:
                ((pa) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 28:
                md mdVar = (md) this.c;
                if (mdVar.r != null && (jdVar = mdVar.n) != null) {
                    if (this.b) {
                        jdVar.setVisibility(4);
                    } else {
                        mdVar.s.setVisibility(4);
                    }
                    mdVar.r = null;
                    break;
                }
                break;
            default:
                sn snVar = (sn) this.c;
                AnimatorSet animatorSet4 = snVar.T0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        snVar.G0.setVisibility(4);
                        break;
                    } else {
                        (snVar.C0 ? snVar.D0 : snVar.B0).setVisibility(4);
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
                    ((ci.r) this.c).performHapticFeedback(3);
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
