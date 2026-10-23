package ah;

import ai.u1;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import ci.aa;
import ci.n2;
import ci.p1;
import ci.q4;
import ei.f6;
import ei.i9;
import ei.l4;
import ei.q3;
import ei.vb;
import gi.d3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.f2;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.e5;
import org.telegram.ui.h5;
import org.telegram.ui.jd;
import org.telegram.ui.md;
import org.telegram.ui.pa;
import org.telegram.ui.qn;
import org.telegram.ui.x4;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                ((hi.o) this.c).w = null;
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
                s5 s5Var = (s5) this.c;
                AnimatorSet animatorSet2 = s5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    s5Var.J = null;
                    break;
                }
                break;
            case 26:
                za zaVar = (za) this.c;
                AnimatorSet animatorSet3 = zaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    zaVar.f = null;
                    break;
                }
                break;
            case 28:
                ((md) this.c).n = null;
                break;
            case 29:
                qn qnVar = (qn) this.c;
                AnimatorSet animatorSet4 = qnVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    qnVar.H0 = null;
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
                dl0 dl0Var = t0Var.n;
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
                dl0Var.setCustomEmojiEnterProgress(Utilities.clamp(t0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    dl0Var.setImportantForAccessibility(0);
                    dl0Var.setSkipDraw(false);
                    t0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = t0Var.y;
                    dl0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                t0Var.C = false;
                break;
            case 1:
                ci.r rVar = (ci.r) this.c;
                rVar.d0 = this.b ? 1.0f : 0.0f;
                rVar.b();
                break;
            case 2:
                n2 n2Var = (n2) this.c;
                u1 u1Var = n2Var.c;
                boolean z11 = this.b;
                u1Var.setAlpha(z11 ? 0.0f : 1.0f);
                n2Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                n2Var.invalidate();
                break;
            case 3:
                p1 p1Var = (p1) this.c;
                p1Var.b.removeViewImmediate(p1Var.d);
                p1Var.f.b();
                if (this.b && (h1Var = p1Var.v) != null && h1Var != ci.h1.W) {
                    h1Var.e();
                }
                p1Var.v = null;
                p1Var.s = true;
                p1Var.G = null;
                p1Var.E = false;
                break;
            case 4:
                aa aaVar = (aa) this.c;
                aaVar.J0.unlock();
                aaVar.e0 = this.b ? aaVar.w.c : 0.0f;
                q4 currentPeerView = aaVar.n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                aaVar.v.invalidate();
                aaVar.v1 = null;
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
                dVar.M = this.b ? 1.0f : 0.0f;
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
                d3Var.N0 = this.b ? 1.0f : 0.0f;
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
                if (oVar.w != null && (radialProgressView = oVar.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        oVar.s.setVisibility(4);
                    }
                    oVar.w = null;
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
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.c;
                boolean z17 = this.b;
                float f10 = z17 ? 1.0f : 0.0f;
                l4Var.Y0 = f10;
                l4Var.q0.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(51.0f)) + l4Var.p0);
                if (!z17) {
                    l4Var.q0.setVisibility(8);
                    break;
                }
                break;
            case 21:
                h5 h5Var = (h5) this.c;
                if (!this.b) {
                    h5Var.setVisibility(4);
                    c2.b bVar = ((x4) h5Var).G;
                    if (bVar.a) {
                        bVar.a = false;
                        if (((x4) bVar.d).getParent() != null) {
                            ((WindowManager) bVar.c).removeView((x4) bVar.d);
                        }
                        x4 x4Var = (x4) bVar.d;
                        x4Var.E = true;
                        e5 e5Var = x4Var.y;
                        if (e5Var != null) {
                            if (e5Var.g) {
                                e5Var.g = false;
                                e5Var.b.removeObserver(e5Var.a, e5Var.e);
                            }
                            x4Var.y = null;
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
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) this.c;
                t1 t1Var = u1Var2.Zc;
                int g10 = t1Var.g();
                int i14 = u1Var2.hd;
                if (i14 == g10) {
                    u1Var2.kd = false;
                    t1Var.a2 = i14;
                    break;
                } else {
                    u1Var2.t1(i14, g10, this.b);
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
                za zaVar = (za) this.c;
                AnimatorSet animatorSet3 = zaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    zaVar.f = null;
                    if (!this.b) {
                        zaVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 27:
                ((pa) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 28:
                md mdVar = (md) this.c;
                if (mdVar.n != null && (jdVar = mdVar.h) != null) {
                    if (this.b) {
                        jdVar.setVisibility(4);
                    } else {
                        mdVar.r.setVisibility(4);
                    }
                    mdVar.n = null;
                    break;
                }
                break;
            default:
                qn qnVar = (qn) this.c;
                AnimatorSet animatorSet4 = qnVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        qnVar.G0.setVisibility(4);
                        break;
                    } else {
                        (qnVar.C0 ? qnVar.D0 : qnVar.B0).setVisibility(4);
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
