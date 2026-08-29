package bg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import lh.i9;
import nh.gb;
import nh.t5;
import nh.w8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Cells.r5;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.c5;
import org.telegram.ui.ed;
import org.telegram.ui.hd;
import org.telegram.ui.ia;
import org.telegram.ui.ko;
import org.telegram.ui.m4;
import org.telegram.ui.s4;
import org.telegram.ui.tn;
import org.telegram.ui.z4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class z2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z2(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 22:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                AnimatorSet animatorSet = d2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.N = null;
                    break;
                }
                break;
            case 23:
                r5 r5Var = (r5) this.c;
                AnimatorSet animatorSet2 = r5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    r5Var.F = null;
                    break;
                }
                break;
            case 24:
            case 26:
            default:
                super.onAnimationCancel(animator);
                break;
            case 25:
                va vaVar = (va) this.c;
                AnimatorSet animatorSet3 = vaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    vaVar.f = null;
                    break;
                }
                break;
            case 27:
                ((hd) this.c).n = null;
                break;
            case 28:
                tn tnVar = (tn) this.c;
                AnimatorSet animatorSet4 = tnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    tnVar.D0 = null;
                    break;
                }
                break;
            case 29:
                ((ko) this.c).h = null;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        lh.d1 d1Var;
        View m10;
        ed edVar;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                a3 a3Var = (a3) this.c;
                ((ag.q) a3Var).y.n.d();
                if (this.b) {
                    a3Var.w.accept(Integer.valueOf(a3Var.s));
                }
                if (a3Var.getParent() != null) {
                    ((ViewGroup) a3Var.getParent()).removeView(a3Var);
                    break;
                }
                break;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.c;
                if (this.b) {
                    limitPreviewView.f0 = false;
                }
                Runnable runnable = limitPreviewView.g0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.g0.run();
                    break;
                }
                break;
            case 2:
                cg.d1 d1Var2 = (cg.d1) this.c;
                d1Var2.I = this.b ? 1.0f : 0.0f;
                d1Var2.d.invalidate();
                cg.b1 b1Var = d1Var2.e;
                if (b1Var != null) {
                    b1Var.invalidate();
                    break;
                }
                break;
            case 3:
                kg.d0 d0Var = (kg.d0) this.c;
                fk0 fk0Var = d0Var.n;
                d0Var.k();
                d0Var.l();
                boolean z10 = this.b;
                kg.d0.a(d0Var, z10);
                d0Var.m.invalidateOutline();
                d0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    d0Var.k = true;
                    d0Var.a.invalidate();
                }
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    fk0Var.setImportantForAccessibility(0);
                    fk0Var.setSkipDraw(false);
                    d0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = d0Var.y;
                    fk0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                d0Var.C = false;
                break;
            case 4:
                lh.p pVar = (lh.p) this.c;
                pVar.W = this.b ? 1.0f : 0.0f;
                pVar.b();
                break;
            case 5:
                lh.f2 f2Var = (lh.f2) this.c;
                jh.e1 e1Var = f2Var.c;
                boolean z11 = this.b;
                e1Var.setAlpha(z11 ? 0.0f : 1.0f);
                f2Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                f2Var.invalidate();
                break;
            case 6:
                lh.i1 i1Var = (lh.i1) this.c;
                i1Var.b.removeViewImmediate(i1Var.d);
                i1Var.f.b();
                if (this.b && (d1Var = i1Var.v) != null && d1Var != lh.d1.S) {
                    d1Var.e();
                }
                i1Var.v = null;
                i1Var.s = true;
                i1Var.C = null;
                i1Var.A = false;
                break;
            case 7:
                i9 i9Var = (i9) this.c;
                i9Var.F0.unlock();
                i9Var.a0 = this.b ? i9Var.w.c : 0.0f;
                lh.d4 currentPeerView = i9Var.j0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.v.invalidate();
                i9Var.r1 = null;
                break;
            case 8:
                mh.v vVar = (mh.v) this.c;
                boolean z12 = this.b;
                vVar.w = z12 ? 1.0f : 0.0f;
                vVar.r.setTranslationY(AndroidUtilities.dp(z12 ? 0.0f : -42.0f));
                vVar.n.setTranslationY(AndroidUtilities.dp(z12 ? 42.0f : 0.0f));
                break;
            case 9:
                mh.r rVar = (mh.r) this.c;
                mh.h hVar = rVar.h;
                mh.i iVar = rVar.f;
                mh.l lVar = rVar.v;
                rVar.b = false;
                boolean z13 = this.b;
                if (z13) {
                    int i11 = rVar.e;
                    rVar.d = i11;
                    rVar.S.y = i11;
                    SharedConfig.setStoriesColumnsCount(i11);
                }
                int h = lVar.h();
                if (z13) {
                    hVar.y1(rVar.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                rVar.r.setVisibility(8);
                int i12 = rVar.O;
                if (i12 >= 0) {
                    if (z13 && (m10 = rVar.s.m(i12)) != null) {
                        rVar.P = m10.getTop();
                    }
                    hVar.h1(rVar.O, (-iVar.getPaddingTop()) + rVar.P);
                }
                super.onAnimationEnd(animator);
                break;
            case 10:
                nh.d dVar = (nh.d) this.c;
                dVar.I = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 11:
                nh.m mVar = (nh.m) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    mVar.r.setVisibility(8);
                    nh.i iVar2 = mVar.I;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z14) {
                    mVar.f.getEditText().setAllowDrawCursor(true);
                }
                mVar.c(z14);
                break;
            case 12:
                nh.y yVar = (nh.y) this.c;
                nh.v vVar2 = yVar.a;
                boolean z15 = this.b;
                yVar.d = z15 ? 1.0f : 0.0f;
                vVar2.invalidate();
                vVar2.setVisibility(z15 ? 0 : 8);
                break;
            case 13:
                if (!this.b) {
                    ((nh.n3) this.c).E.setVisibility(8);
                    break;
                }
                break;
            case 14:
                if (!this.b) {
                    ((nh.g4) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 15:
                t5 t5Var = (t5) this.c;
                if (!this.b) {
                    t5Var.V1.setVisibility(8);
                    t5Var.V1.n();
                    break;
                }
                break;
            case 16:
                w8 w8Var = (w8) this.c;
                if (this.b) {
                    w8Var.setVisibility(8);
                }
                w8Var.c = null;
                break;
            case 17:
                gb gbVar = (gb) this.c;
                if (!this.b) {
                    gbVar.R0.setVisibility(8);
                }
                gbVar.b2 = null;
                break;
            case 18:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                float f9 = this.b ? 1.0f : 0.0f;
                g1Var.setTextColor(i0.a.d(f9, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f9, -1, -9194260));
                break;
            case 19:
                m4 m4Var = (m4) this.c;
                boolean z16 = this.b;
                float f10 = z16 ? 1.0f : 0.0f;
                m4Var.U0 = f10;
                m4Var.m0.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(51.0f)) + m4Var.l0);
                if (!z16) {
                    m4Var.m0.setVisibility(8);
                    break;
                }
                break;
            case 20:
                c5 c5Var = (c5) this.c;
                if (!this.b) {
                    c5Var.setVisibility(4);
                    ab.m mVar2 = ((s4) c5Var).C;
                    if (mVar2.a) {
                        mVar2.a = false;
                        if (((s4) mVar2.d).getParent() != null) {
                            ((WindowManager) mVar2.c).removeView((s4) mVar2.d);
                        }
                        s4 s4Var = (s4) mVar2.d;
                        s4Var.A = true;
                        z4 z4Var = s4Var.y;
                        if (z4Var != null) {
                            if (z4Var.g) {
                                z4Var.g = false;
                                z4Var.b.removeObserver(z4Var.a, z4Var.e);
                            }
                            s4Var.y = null;
                        }
                        mVar2.d = null;
                        ((ViewGroup) mVar2.b).requestDisallowInterceptTouchEvent(false);
                        mVar2.b = null;
                        mVar2.c = null;
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) this.c;
                org.telegram.ui.Cells.r1 r1Var = s1Var.Vc;
                int g10 = r1Var.g();
                int i13 = s1Var.dd;
                if (i13 == g10) {
                    s1Var.gd = false;
                    r1Var.a2 = i13;
                    break;
                } else {
                    s1Var.t1(i13, g10, this.b);
                    break;
                }
            case 22:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                AnimatorSet animatorSet = d2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.N = null;
                    if (!this.b) {
                        d2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 23:
                r5 r5Var = (r5) this.c;
                AnimatorSet animatorSet2 = r5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    r5Var.F = null;
                    if (!this.b) {
                        r5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 24:
                p7 p7Var = (p7) this.c;
                ValueAnimator valueAnimator = p7Var.w0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    p7Var.x0 = this.b ? 1.0f : 0.0f;
                    p7Var.w0 = null;
                    break;
                }
                break;
            case 25:
                va vaVar = (va) this.c;
                AnimatorSet animatorSet3 = vaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    vaVar.f = null;
                    if (!this.b) {
                        vaVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 26:
                ((ia) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 27:
                hd hdVar = (hd) this.c;
                if (hdVar.n != null && (edVar = hdVar.h) != null) {
                    if (this.b) {
                        edVar.setVisibility(4);
                    } else {
                        hdVar.r.setVisibility(4);
                    }
                    hdVar.n = null;
                    break;
                }
                break;
            case 28:
                tn tnVar = (tn) this.c;
                AnimatorSet animatorSet4 = tnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        tnVar.C0.setVisibility(4);
                        break;
                    } else {
                        (tnVar.y0 ? tnVar.z0 : tnVar.x0).setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ko koVar = (ko) this.c;
                if (koVar.h != null && (radialProgressView = koVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        koVar.f.setVisibility(4);
                    }
                    koVar.h = null;
                    break;
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
                    ((lh.p) this.c).performHapticFeedback(3);
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
