package ch;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bi.q1;
import di.g2;
import di.i4;
import di.p9;
import fi.b4;
import fi.f3;
import fi.l8;
import fi.o5;
import fi.va;
import hi.a3;
import jg.l1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.iz;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.h2;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Cells.x1;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.o41;
import org.telegram.ui.an;
import org.telegram.ui.b5;
import org.telegram.ui.bd;
import org.telegram.ui.g4;
import org.telegram.ui.ia;
import org.telegram.ui.pn;
import org.telegram.ui.r4;
import org.telegram.ui.y4;
import org.telegram.ui.yc;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class y extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ y(int i7, Object obj, boolean z9) {
        this.a = i7;
        this.c = obj;
        this.b = z9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 15:
                ((ii.p) this.c).y = null;
                break;
            case 22:
                h2 h2Var = (h2) this.c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    break;
                }
                break;
            case 23:
                q5 q5Var = (q5) this.c;
                AnimatorSet animatorSet2 = q5Var.K;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.K = null;
                    break;
                }
                break;
            case 25:
                ta taVar = (ta) this.c;
                AnimatorSet animatorSet3 = taVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f = null;
                    break;
                }
                break;
            case 27:
                ((bd) this.c).r = null;
                break;
            case 28:
                an anVar = (an) this.c;
                AnimatorSet animatorSet4 = anVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    anVar.V0 = null;
                    break;
                }
                break;
            case 29:
                ((pn) this.c).h = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View m10;
        RadialProgressView radialProgressView;
        yc ycVar;
        RadialProgressView radialProgressView2;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.c;
                ii0 ii0Var = b0Var.n;
                b0Var.k();
                b0Var.l();
                boolean z9 = this.b;
                b0.a(b0Var, z9);
                b0Var.m.invalidateOutline();
                b0Var.j = z9 ? 1.0f : 0.0f;
                if (z9) {
                    b0Var.k = true;
                    b0Var.a.invalidate();
                }
                ii0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.j, 1.0f, 0.0f));
                if (!z9) {
                    ii0Var.setImportantForAccessibility(0);
                    ii0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i7 = b0Var.y;
                    ii0Var.setCustomEmojiReactionsBackground((i7 == 4 || i7 == 5) ? false : true);
                }
                b0Var.C = false;
                break;
            case 1:
                di.q qVar = (di.q) this.c;
                qVar.d0 = this.b ? 1.0f : 0.0f;
                qVar.b();
                break;
            case 2:
                g2 g2Var = (g2) this.c;
                q1 q1Var = g2Var.c;
                boolean z10 = this.b;
                q1Var.setAlpha(z10 ? 0.0f : 1.0f);
                g2Var.a.setAlpha(z10 ? 0.0f : 0.5f);
                g2Var.invalidate();
                break;
            case 3:
                p9 p9Var = (p9) this.c;
                p9Var.I0.e();
                p9Var.e0 = this.b ? p9Var.x.c : 0.0f;
                i4 currentPeerView = p9Var.n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                p9Var.w.invalidate();
                p9Var.u1 = null;
                break;
            case 4:
                ei.r rVar = (ei.r) this.c;
                boolean z11 = this.b;
                rVar.x = z11 ? 1.0f : 0.0f;
                rVar.r.setTranslationY(org.telegram.messenger.g0.L(z11 ? 0.0f : -42.0f));
                rVar.n.setTranslationY(org.telegram.messenger.g0.L(z11 ? 42.0f : 0.0f));
                break;
            case 5:
                ei.n nVar = (ei.n) this.c;
                o41 o41Var = nVar.h;
                ei.f fVar = nVar.f;
                ei.i iVar = nVar.w;
                nVar.b = false;
                boolean z12 = this.b;
                if (z12) {
                    int i10 = nVar.e;
                    nVar.d = i10;
                    nVar.W.D = i10;
                    iz.F(i10);
                }
                int b10 = iVar.b();
                if (z12) {
                    o41Var.y1(nVar.d);
                    fVar.a0();
                    if (iVar.b() == b10) {
                        org.telegram.messenger.g0.b4(fVar);
                    } else {
                        iVar.f();
                    }
                }
                nVar.r.setVisibility(8);
                int i11 = nVar.S;
                if (i11 >= 0) {
                    if (z12 && (m10 = nVar.s.m(i11)) != null) {
                        nVar.T = m10.getTop();
                    }
                    o41Var.h1(nVar.S, (-fVar.getPaddingTop()) + nVar.T);
                }
                super.onAnimationEnd(animator);
                break;
            case 6:
                fi.d dVar = (fi.d) this.c;
                dVar.P = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 7:
                fi.m mVar = (fi.m) this.c;
                boolean z13 = this.b;
                if (!z13) {
                    mVar.r.setVisibility(8);
                    fi.i iVar2 = mVar.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z13) {
                    mVar.f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z13);
                break;
            case 8:
                fi.y yVar = (fi.y) this.c;
                fi.v vVar = yVar.a;
                boolean z14 = this.b;
                yVar.d = z14 ? 1.0f : 0.0f;
                vVar.invalidate();
                vVar.setVisibility(z14 ? 0 : 8);
                break;
            case 9:
                if (!this.b) {
                    ((f3) this.c).I.setVisibility(8);
                    break;
                }
                break;
            case 10:
                if (!this.b) {
                    ((b4) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 11:
                o5 o5Var = (o5) this.c;
                if (!this.b) {
                    o5Var.I1.setVisibility(8);
                    o5Var.I1.n();
                    break;
                }
                break;
            case 12:
                l8 l8Var = (l8) this.c;
                if (this.b) {
                    l8Var.setVisibility(8);
                }
                l8Var.c = null;
                break;
            case 13:
                va vaVar = (va) this.c;
                if (!this.b) {
                    vaVar.V0.setVisibility(8);
                }
                vaVar.f2 = null;
                break;
            case 14:
                a3 a3Var = (a3) this.c;
                a3Var.R0 = this.b ? 1.0f : 0.0f;
                a3Var.l();
                break;
            case 15:
                ii.p pVar = (ii.p) this.c;
                if (pVar.y != null && (radialProgressView = pVar.D) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        pVar.w.setVisibility(4);
                    }
                    pVar.y = null;
                    break;
                }
                break;
            case 16:
                l1 l1Var = (l1) this.c;
                boolean z15 = this.b;
                l1Var.e = z15 ? 1.0f : 0.0f;
                l1Var.invalidate();
                int i12 = 0;
                while (i12 < 2) {
                    l1Var.c[i12].setTranslationX(org.telegram.messenger.g0.W1(l1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    l1Var.c[i12].setVisibility((i12 == 1) == z15 ? 0 : 8);
                    l1Var.c[i12].setAlpha(org.telegram.messenger.g0.T1(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, l1Var.e));
                    l1Var.d[i12].setTranslationX(org.telegram.messenger.g0.W1(l1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    l1Var.d[i12].setVisibility((i12 == 1) == z15 ? 0 : 8);
                    l1Var.d[i12].setAlpha(org.telegram.messenger.g0.T1(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, l1Var.e));
                    i12++;
                }
                break;
            case 17:
                if (this.b) {
                    ((og.o) this.c).e(false, false, true, false);
                    break;
                }
                break;
            case 18:
                z0 z0Var = (z0) this.c;
                float f10 = this.b ? 1.0f : 0.0f;
                z0Var.setTextColor(i0.a.f(f10, -1, -9194260));
                z0Var.setIconColor(i0.a.f(f10, -1, -9194260));
                break;
            case 19:
                g4 g4Var = (g4) this.c;
                boolean z16 = this.b;
                float f11 = z16 ? 1.0f : 0.0f;
                g4Var.Z0 = f11;
                g4Var.q0.setTranslationY(((1.0f - f11) * org.telegram.messenger.g0.L(51.0f)) + g4Var.p0);
                if (!z16) {
                    g4Var.q0.setVisibility(8);
                    break;
                }
                break;
            case 20:
                b5 b5Var = (b5) this.c;
                if (!this.b) {
                    b5Var.setVisibility(4);
                    ab.q qVar2 = ((r4) b5Var).G;
                    if (qVar2.a) {
                        qVar2.a = false;
                        if (((r4) qVar2.d).getParent() != null) {
                            ((WindowManager) qVar2.c).removeView((r4) qVar2.d);
                        }
                        r4 r4Var = (r4) qVar2.d;
                        r4Var.E = true;
                        y4 y4Var = r4Var.D;
                        if (y4Var != null) {
                            if (y4Var.g) {
                                y4Var.g = false;
                                y4Var.b.n(y4Var.a, y4Var.e);
                            }
                            r4Var.D = null;
                        }
                        qVar2.d = null;
                        ((ViewGroup) qVar2.b).requestDisallowInterceptTouchEvent(false);
                        qVar2.b = null;
                        qVar2.c = null;
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) this.c;
                x1 x1Var = q1Var2.hb;
                int b11 = x1Var.b();
                int i13 = q1Var2.pb;
                if (i13 == b11) {
                    q1Var2.sb = false;
                    x1Var.b2 = i13;
                    break;
                } else {
                    q1Var2.C0(i13, b11, this.b);
                    break;
                }
            case 22:
                h2 h2Var = (h2) this.c;
                AnimatorSet animatorSet = h2Var.S;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.S = null;
                    if (!this.b) {
                        h2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 23:
                q5 q5Var = (q5) this.c;
                AnimatorSet animatorSet2 = q5Var.K;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.K = null;
                    if (!this.b) {
                        q5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 24:
                o7 o7Var = (o7) this.c;
                ValueAnimator valueAnimator = o7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    o7Var.B0 = this.b ? 1.0f : 0.0f;
                    o7Var.A0 = null;
                    break;
                }
                break;
            case 25:
                ta taVar = (ta) this.c;
                AnimatorSet animatorSet3 = taVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f = null;
                    if (!this.b) {
                        taVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 26:
                ((ia) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 27:
                bd bdVar = (bd) this.c;
                if (bdVar.r != null && (ycVar = bdVar.n) != null) {
                    if (this.b) {
                        ycVar.setVisibility(4);
                    } else {
                        bdVar.s.setVisibility(4);
                    }
                    bdVar.r = null;
                    break;
                }
                break;
            case 28:
                an anVar = (an) this.c;
                AnimatorSet animatorSet4 = anVar.V0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        anVar.I0.setVisibility(4);
                        break;
                    } else {
                        (anVar.E0 ? anVar.F0 : anVar.D0).setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                pn pnVar = (pn) this.c;
                if (pnVar.h != null && (radialProgressView2 = pnVar.n) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        pnVar.f.setVisibility(4);
                    }
                    pnVar.h = null;
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
                    ((di.q) this.c).performHapticFeedback(3);
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
