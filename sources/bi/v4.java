package bi;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import fi.i9;
import hi.j8;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.gz;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.ia;
import org.telegram.ui.xc;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class v4 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v4(int i7, Object obj, boolean z10) {
        this.a = i7;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 17:
                ((li.n) this.c).y = null;
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
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) this.c;
                AnimatorSet animatorSet2 = q5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.L = null;
                    break;
                }
                break;
            case 26:
                sa saVar = (sa) this.c;
                AnimatorSet animatorSet3 = saVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    saVar.f = null;
                    break;
                }
                break;
            case 28:
                ((ad) this.c).r = null;
                break;
            case 29:
                an anVar = (an) this.c;
                AnimatorSet animatorSet4 = anVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    anVar.W0 = null;
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
                    ((a6) this.c).w.setVisibility(8);
                    break;
                }
                break;
            case 1:
                ch.b0 b0Var = (ch.b0) this.c;
                mi0 mi0Var = b0Var.n;
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
                mi0Var.setCustomEmojiEnterProgress(Utilities.i(b0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    mi0Var.setImportantForAccessibility(0);
                    mi0Var.setSkipDraw(false);
                    b0Var.f();
                    Runtime.getRuntime().gc();
                    int i7 = b0Var.y;
                    mi0Var.setCustomEmojiReactionsBackground((i7 == 4 || i7 == 5) ? false : true);
                }
                b0Var.C = false;
                break;
            case 2:
                fi.q qVar = (fi.q) this.c;
                qVar.e0 = this.b ? 1.0f : 0.0f;
                qVar.b();
                break;
            case 3:
                fi.c2 c2Var = (fi.c2) this.c;
                di.c1 c1Var = c2Var.c;
                boolean z11 = this.b;
                c1Var.setAlpha(z11 ? 0.0f : 1.0f);
                c2Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                c2Var.invalidate();
                break;
            case 4:
                i9 i9Var = (i9) this.c;
                i9Var.J0.e();
                i9Var.f0 = this.b ? i9Var.x.c : 0.0f;
                fi.b4 currentPeerView = i9Var.o0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.w.invalidate();
                i9Var.v1 = null;
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
                s41 s41Var = mVar.h;
                gi.e eVar = mVar.f;
                gi.h hVar = mVar.w;
                mVar.b = false;
                boolean z13 = this.b;
                if (z13) {
                    int i10 = mVar.e;
                    mVar.d = i10;
                    mVar.a0.E = i10;
                    gz.F(i10);
                }
                int b10 = hVar.b();
                if (z13) {
                    s41Var.y1(mVar.d);
                    eVar.a0();
                    if (hVar.b() == b10) {
                        org.telegram.messenger.g0.a4(eVar);
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
                    s41Var.h1(mVar.T, (-eVar.getPaddingTop()) + mVar.U);
                }
                super.onAnimationEnd(animator);
                break;
            case 7:
                hi.d dVar = (hi.d) this.c;
                dVar.Q = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 8:
                hi.m mVar2 = (hi.m) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    mVar2.r.setVisibility(8);
                    hi.i iVar = mVar2.N;
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
                hi.y yVar = (hi.y) this.c;
                hi.v vVar = yVar.a;
                boolean z15 = this.b;
                yVar.d = z15 ? 1.0f : 0.0f;
                vVar.invalidate();
                vVar.setVisibility(z15 ? 0 : 8);
                break;
            case 10:
                if (!this.b) {
                    ((hi.d3) this.c).J.setVisibility(8);
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
                hi.m5 m5Var = (hi.m5) this.c;
                if (!this.b) {
                    m5Var.J1.setVisibility(8);
                    m5Var.J1.n();
                    break;
                }
                break;
            case 13:
                j8 j8Var = (j8) this.c;
                if (this.b) {
                    j8Var.setVisibility(8);
                }
                j8Var.c = null;
                break;
            case 14:
                hi.sa saVar = (hi.sa) this.c;
                if (!this.b) {
                    saVar.W0.setVisibility(8);
                }
                saVar.g2 = null;
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
                ki.x2 x2Var = (ki.x2) this.c;
                x2Var.S0 = this.b ? 1.0f : 0.0f;
                x2Var.l();
                break;
            case 17:
                li.n nVar = (li.n) this.c;
                if (nVar.y != null && (radialProgressView = nVar.E) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        nVar.w.setVisibility(4);
                    }
                    nVar.y = null;
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
                    q1Var.C0(i13, b11, this.b);
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
                org.telegram.ui.Cells.q5 q5Var = (org.telegram.ui.Cells.q5) this.c;
                AnimatorSet animatorSet2 = q5Var.L;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.L = null;
                    if (!this.b) {
                        q5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 25:
                n7 n7Var = (n7) this.c;
                ValueAnimator valueAnimator = n7Var.B0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    n7Var.C0 = this.b ? 1.0f : 0.0f;
                    n7Var.B0 = null;
                    break;
                }
                break;
            case 26:
                sa saVar2 = (sa) this.c;
                AnimatorSet animatorSet3 = saVar2.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    saVar2.f = null;
                    if (!this.b) {
                        saVar2.setBackgroundColor(0);
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
                an anVar = (an) this.c;
                AnimatorSet animatorSet4 = anVar.W0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        anVar.J0.setVisibility(4);
                        break;
                    } else {
                        (anVar.F0 ? anVar.G0 : anVar.E0).setVisibility(4);
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
