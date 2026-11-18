package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import fi.f9;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.bz;
import org.telegram.ui.Cells.ta;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.ia;
import org.telegram.ui.xc;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class e7 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e7(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 17:
                ((li.p) this.c).y = null;
                break;
            case 23:
                org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) this.c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    break;
                }
                break;
            case 24:
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) this.c;
                AnimatorSet animatorSet2 = r5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    r5Var.L = null;
                    break;
                }
                break;
            case 26:
                ta taVar = (ta) this.c;
                AnimatorSet animatorSet3 = taVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar.f = null;
                    break;
                }
                break;
            case 28:
                ((ad) this.c).r = null;
                break;
            case 29:
                bn bnVar = (bn) this.c;
                AnimatorSet animatorSet4 = bnVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    bnVar.W0 = null;
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
        View m10;
        RadialProgressView radialProgressView;
        xc xcVar;
        switch (this.a) {
            case 0:
                if (!this.b) {
                    ((h8) this.c).w.setVisibility(8);
                    break;
                }
                break;
            case 1:
                ch.b0 b0Var = (ch.b0) this.c;
                vi0 vi0Var = b0Var.n;
                b0Var.k();
                b0Var.l();
                boolean z10 = this.b;
                ch.b0.a(b0Var, z10);
                b0Var.m.invalidateOutline();
                b0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    b0Var.k = true;
                    b0Var.a.invalidate();
                }
                vi0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    vi0Var.setImportantForAccessibility(0);
                    vi0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i7 = b0Var.y;
                    vi0Var.setCustomEmojiReactionsBackground((i7 == 4 || i7 == 5) ? false : true);
                }
                b0Var.C = false;
                break;
            case 2:
                fi.q qVar = (fi.q) this.c;
                qVar.e0 = this.b ? 1.0f : 0.0f;
                qVar.b();
                break;
            case 3:
                fi.a2 a2Var = (fi.a2) this.c;
                di.b1 b1Var = a2Var.c;
                boolean z11 = this.b;
                b1Var.setAlpha(z11 ? 0.0f : 1.0f);
                a2Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                a2Var.invalidate();
                break;
            case 4:
                f9 f9Var = (f9) this.c;
                f9Var.J0.e();
                f9Var.f0 = this.b ? f9Var.x.c : 0.0f;
                fi.z3 currentPeerView = f9Var.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                f9Var.w.invalidate();
                f9Var.v1 = null;
                break;
            case 5:
                gi.q qVar2 = (gi.q) this.c;
                boolean z12 = this.b;
                qVar2.x = z12 ? 1.0f : 0.0f;
                qVar2.r.setTranslationY(org.telegram.messenger.g0.L(z12 ? 0.0f : -42.0f));
                qVar2.n.setTranslationY(org.telegram.messenger.g0.L(z12 ? 42.0f : 0.0f));
                break;
            case 6:
                gi.m mVar = (gi.m) this.c;
                c51 c51Var = mVar.h;
                gi.e eVar = mVar.f;
                gi.h hVar = mVar.w;
                mVar.b = false;
                boolean z13 = this.b;
                if (z13) {
                    int i10 = mVar.e;
                    mVar.d = i10;
                    mVar.a0.E = i10;
                    bz.F(i10);
                }
                int b10 = hVar.b();
                if (z13) {
                    c51Var.y1(mVar.d);
                    eVar.a0();
                    if (hVar.b() == b10) {
                        org.telegram.messenger.g0.Z3(eVar);
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
                    c51Var.h1(mVar.T, (-eVar.getPaddingTop()) + mVar.U);
                }
                super.onAnimationEnd(animator);
                break;
            case 7:
                hi.d dVar = (hi.d) this.c;
                dVar.Q = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 8:
                hi.n nVar = (hi.n) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    nVar.r.setVisibility(8);
                    hi.i iVar = nVar.N;
                    if (iVar != null) {
                        iVar.setVisibility(8);
                    }
                }
                if (z14) {
                    nVar.f.getEditText().setAllowDrawCursor(true);
                }
                nVar.c(z14);
                break;
            case 9:
                hi.z zVar = (hi.z) this.c;
                hi.w wVar = zVar.a;
                boolean z15 = this.b;
                zVar.d = z15 ? 1.0f : 0.0f;
                wVar.invalidate();
                wVar.setVisibility(z15 ? 0 : 8);
                break;
            case 10:
                if (!this.b) {
                    ((hi.e3) this.c).J.setVisibility(8);
                    break;
                }
                break;
            case 11:
                if (!this.b) {
                    ((hi.x3) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 12:
                hi.l5 l5Var = (hi.l5) this.c;
                if (!this.b) {
                    l5Var.J1.setVisibility(8);
                    l5Var.J1.n();
                    break;
                }
                break;
            case 13:
                hi.j8 j8Var = (hi.j8) this.c;
                if (this.b) {
                    j8Var.setVisibility(8);
                }
                j8Var.c = null;
                break;
            case 14:
                hi.ta taVar = (hi.ta) this.c;
                if (!this.b) {
                    taVar.W0.setVisibility(8);
                }
                taVar.g2 = null;
                break;
            case 15:
                jg.k1 k1Var = (jg.k1) this.c;
                boolean z16 = this.b;
                k1Var.e = z16 ? 1.0f : 0.0f;
                k1Var.invalidate();
                int i12 = 0;
                while (i12 < 2) {
                    k1Var.c[i12].setTranslationX(org.telegram.messenger.g0.W1(k1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.c[i12].setVisibility((i12 == 1) == z16 ? 0 : 8);
                    k1Var.c[i12].setAlpha(org.telegram.messenger.g0.T1(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, k1Var.e));
                    k1Var.d[i12].setTranslationX(org.telegram.messenger.g0.W1(k1Var.e, 0, -org.telegram.messenger.g0.L(62.0f)));
                    k1Var.d[i12].setVisibility((i12 == 1) == z16 ? 0 : 8);
                    k1Var.d[i12].setAlpha(org.telegram.messenger.g0.T1(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, k1Var.e));
                    i12++;
                }
                break;
            case 16:
                ki.t2 t2Var = (ki.t2) this.c;
                t2Var.S0 = this.b ? 1.0f : 0.0f;
                t2Var.l();
                break;
            case 17:
                li.p pVar = (li.p) this.c;
                if (pVar.y != null && (radialProgressView = pVar.E) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        pVar.w.setVisibility(4);
                    }
                    pVar.y = null;
                    break;
                }
                break;
            case 18:
                if (this.b) {
                    ((og.o) this.c).e(false, false, true, false);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.z0 z0Var = (org.telegram.ui.ActionBar.z0) this.c;
                float f10 = this.b ? 1.0f : 0.0f;
                z0Var.setTextColor(i0.a.f(f10, -1, -9194260));
                z0Var.setIconColor(i0.a.f(f10, -1, -9194260));
                break;
            case 20:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.c;
                boolean z17 = this.b;
                float f11 = z17 ? 1.0f : 0.0f;
                g4Var.a1 = f11;
                g4Var.r0.setTranslationY(((1.0f - f11) * org.telegram.messenger.g0.L(51.0f)) + g4Var.q0);
                if (!z17) {
                    g4Var.r0.setVisibility(8);
                    break;
                }
                break;
            case 21:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.c;
                if (!this.b) {
                    b5Var.setVisibility(4);
                    ab.q qVar3 = ((org.telegram.ui.r4) b5Var).H;
                    if (qVar3.a) {
                        qVar3.a = false;
                        if (((org.telegram.ui.r4) qVar3.d).getParent() != null) {
                            ((WindowManager) qVar3.c).removeView((org.telegram.ui.r4) qVar3.d);
                        }
                        org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) qVar3.d;
                        r4Var.F = true;
                        org.telegram.ui.y4 y4Var = r4Var.E;
                        if (y4Var != null) {
                            if (y4Var.g) {
                                y4Var.g = false;
                                y4Var.b.n(y4Var.a, y4Var.e);
                            }
                            r4Var.E = null;
                        }
                        qVar3.d = null;
                        ((ViewGroup) qVar3.b).requestDisallowInterceptTouchEvent(false);
                        qVar3.b = null;
                        qVar3.c = null;
                        break;
                    }
                }
                break;
            case 22:
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.c;
                org.telegram.ui.Cells.x1 x1Var = q1Var.ib;
                int b11 = x1Var.b();
                int i13 = q1Var.qb;
                if (i13 == b11) {
                    q1Var.tb = false;
                    x1Var.b2 = i13;
                    break;
                } else {
                    q1Var.B0(i13, b11, this.b);
                    break;
                }
            case 23:
                org.telegram.ui.Cells.h2 h2Var = (org.telegram.ui.Cells.h2) this.c;
                AnimatorSet animatorSet = h2Var.T;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h2Var.T = null;
                    if (!this.b) {
                        h2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 24:
                org.telegram.ui.Cells.r5 r5Var = (org.telegram.ui.Cells.r5) this.c;
                AnimatorSet animatorSet2 = r5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    r5Var.L = null;
                    if (!this.b) {
                        r5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 25:
                org.telegram.ui.Cells.o7 o7Var = (org.telegram.ui.Cells.o7) this.c;
                ValueAnimator valueAnimator = o7Var.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    o7Var.C0 = this.b ? 1.0f : 0.0f;
                    o7Var.B0 = null;
                    break;
                }
                break;
            case 26:
                ta taVar2 = (ta) this.c;
                AnimatorSet animatorSet3 = taVar2.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    taVar2.f = null;
                    if (!this.b) {
                        taVar2.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 27:
                ((ia) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 28:
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
            default:
                bn bnVar = (bn) this.c;
                AnimatorSet animatorSet4 = bnVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        bnVar.J0.setVisibility(4);
                        break;
                    } else {
                        (bnVar.F0 ? bnVar.G0 : bnVar.E0).setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 2:
                super.onAnimationStart(animator);
                try {
                    ((fi.q) this.c).performHapticFeedback(3);
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
