package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.id;
import org.telegram.ui.ld;
import org.telegram.ui.ro;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final class n extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 15:
                ((fi.p) this.c).w = null;
                break;
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    break;
                }
                break;
            case 23:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Cells.db dbVar = (org.telegram.ui.Cells.db) this.c;
                AnimatorSet animatorSet3 = dbVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dbVar.f = null;
                    break;
                }
                break;
            case 27:
                ((ld) this.c).n = null;
                break;
            case 28:
                wn wnVar = (wn) this.c;
                AnimatorSet animatorSet4 = wnVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    wnVar.H0 = null;
                    break;
                }
                break;
            case 29:
                ((ro) this.c).h = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        d2 d2Var;
        View m10;
        RadialProgressView radialProgressView;
        id idVar;
        RadialProgressView radialProgressView2;
        switch (this.a) {
            case 0:
                b0 b0Var = (b0) this.c;
                b0Var.d0 = this.b ? 1.0f : 0.0f;
                b0Var.b();
                break;
            case 1:
                r3 r3Var = (r3) this.c;
                w0 w0Var = r3Var.c;
                boolean z10 = this.b;
                w0Var.setAlpha(z10 ? 0.0f : 1.0f);
                r3Var.a.setAlpha(z10 ? 0.0f : 0.5f);
                r3Var.invalidate();
                break;
            case 2:
                m2 m2Var = (m2) this.c;
                m2Var.b.removeViewImmediate(m2Var.d);
                m2Var.f.b();
                if (this.b && (d2Var = m2Var.v) != null && d2Var != d2.W) {
                    d2Var.e();
                }
                m2Var.v = null;
                m2Var.s = true;
                m2Var.G = null;
                m2Var.E = false;
                break;
            case 3:
                jc jcVar = (jc) this.c;
                jcVar.J0.unlock();
                jcVar.e0 = this.b ? jcVar.w.c : 0.0f;
                e6 currentPeerView = jcVar.n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                jcVar.v.invalidate();
                jcVar.v1 = null;
                break;
            case 4:
                bi.z zVar = (bi.z) this.c;
                boolean z11 = this.b;
                zVar.w = z11 ? 1.0f : 0.0f;
                zVar.r.setTranslationY(AndroidUtilities.dp(z11 ? 0.0f : -42.0f));
                zVar.n.setTranslationY(AndroidUtilities.dp(z11 ? 42.0f : 0.0f));
                break;
            case 5:
                bi.u uVar = (bi.u) this.c;
                bi.i iVar = uVar.h;
                bi.j jVar = uVar.f;
                bi.m mVar = uVar.v;
                uVar.b = false;
                boolean z12 = this.b;
                if (z12) {
                    int i10 = uVar.e;
                    uVar.d = i10;
                    uVar.W.y = i10;
                    SharedConfig.setStoriesColumnsCount(i10);
                }
                int h = mVar.h();
                if (z12) {
                    iVar.y1(uVar.d);
                    jVar.a0();
                    if (mVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(jVar);
                    } else {
                        mVar.l();
                    }
                }
                uVar.r.setVisibility(8);
                int i11 = uVar.S;
                if (i11 >= 0) {
                    if (z12 && (m10 = uVar.s.m(i11)) != null) {
                        uVar.T = m10.getTop();
                    }
                    iVar.h1(uVar.S, (-jVar.getPaddingTop()) + uVar.T);
                }
                super.onAnimationEnd(animator);
                break;
            case 6:
                ci.d dVar = (ci.d) this.c;
                dVar.M = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 7:
                ci.m mVar2 = (ci.m) this.c;
                boolean z13 = this.b;
                if (!z13) {
                    mVar2.r.setVisibility(8);
                    ci.i iVar2 = mVar2.M;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z13) {
                    mVar2.f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z13);
                break;
            case 8:
                ci.y yVar = (ci.y) this.c;
                ci.v vVar = yVar.a;
                boolean z14 = this.b;
                yVar.d = z14 ? 1.0f : 0.0f;
                vVar.invalidate();
                vVar.setVisibility(z14 ? 0 : 8);
                break;
            case 9:
                if (!this.b) {
                    ((ci.w3) this.c).I.setVisibility(8);
                    break;
                }
                break;
            case 10:
                if (!this.b) {
                    ((ci.t4) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 11:
                ci.q6 q6Var = (ci.q6) this.c;
                if (!this.b) {
                    q6Var.Z1.setVisibility(8);
                    q6Var.Z1.n();
                    break;
                }
                break;
            case 12:
                ci.w9 w9Var = (ci.w9) this.c;
                if (this.b) {
                    w9Var.setVisibility(8);
                }
                w9Var.c = null;
                break;
            case 13:
                ci.lc lcVar = (ci.lc) this.c;
                if (!this.b) {
                    lcVar.V0.setVisibility(8);
                }
                lcVar.f2 = null;
                break;
            case 14:
                ei.k3 k3Var = (ei.k3) this.c;
                k3Var.N0 = this.b ? 1.0f : 0.0f;
                k3Var.h();
                break;
            case 15:
                fi.p pVar = (fi.p) this.c;
                if (pVar.w != null && (radialProgressView = pVar.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        pVar.s.setVisibility(4);
                    }
                    pVar.w = null;
                    break;
                }
                break;
            case 16:
                gg.n1 n1Var = (gg.n1) this.c;
                boolean z15 = this.b;
                n1Var.e = z15 ? 1.0f : 0.0f;
                n1Var.invalidate();
                int i12 = 0;
                while (i12 < 2) {
                    n1Var.c[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    n1Var.c[i12].setVisibility((i12 == 1) == z15 ? 0 : 8);
                    n1Var.c[i12].setAlpha(AndroidUtilities.lerp(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, n1Var.e));
                    n1Var.d[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    n1Var.d[i12].setVisibility((i12 == 1) == z15 ? 0 : 8);
                    n1Var.d[i12].setAlpha(AndroidUtilities.lerp(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, n1Var.e));
                    i12++;
                }
                break;
            case 17:
                if (this.b) {
                    ((lg.p) this.c).e(false, false, true, false);
                    break;
                }
                break;
            case 18:
                org.telegram.ui.ActionBar.e1 e1Var = (org.telegram.ui.ActionBar.e1) this.c;
                float f7 = this.b ? 1.0f : 0.0f;
                e1Var.setTextColor(i0.a.d(f7, -1, -9194260));
                e1Var.setIconColor(i0.a.d(f7, -1, -9194260));
                break;
            case 19:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.c;
                boolean z16 = this.b;
                float f10 = z16 ? 1.0f : 0.0f;
                i4Var.Y0 = f10;
                i4Var.q0.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(51.0f)) + i4Var.p0);
                if (!z16) {
                    i4Var.q0.setVisibility(8);
                    break;
                }
                break;
            case 20:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.c;
                if (!this.b) {
                    c5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar3 = ((org.telegram.ui.r4) c5Var).G;
                    if (mVar3.a) {
                        mVar3.a = false;
                        if (((org.telegram.ui.r4) mVar3.d).getParent() != null) {
                            ((WindowManager) mVar3.c).removeView((org.telegram.ui.r4) mVar3.d);
                        }
                        org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) mVar3.d;
                        r4Var.E = true;
                        org.telegram.ui.z4 z4Var = r4Var.y;
                        if (z4Var != null) {
                            if (z4Var.g) {
                                z4Var.g = false;
                                z4Var.b.removeObserver(z4Var.a, z4Var.e);
                            }
                            r4Var.y = null;
                        }
                        mVar3.d = null;
                        ((ViewGroup) mVar3.b).requestDisallowInterceptTouchEvent(false);
                        mVar3.b = null;
                        mVar3.c = null;
                        break;
                    }
                }
                break;
            case 21:
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) this.c;
                org.telegram.ui.Cells.t1 t1Var = u1Var.Zc;
                int g10 = t1Var.g();
                int i13 = u1Var.hd;
                if (i13 == g10) {
                    u1Var.kd = false;
                    t1Var.a2 = i13;
                    break;
                } else {
                    u1Var.t1(i13, g10, this.b);
                    break;
                }
            case 22:
                org.telegram.ui.Cells.f2 f2Var = (org.telegram.ui.Cells.f2) this.c;
                AnimatorSet animatorSet = f2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f2Var.R = null;
                    if (!this.b) {
                        f2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 23:
                org.telegram.ui.Cells.t5 t5Var = (org.telegram.ui.Cells.t5) this.c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    if (!this.b) {
                        t5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 24:
                org.telegram.ui.Cells.t7 t7Var = (org.telegram.ui.Cells.t7) this.c;
                ValueAnimator valueAnimator = t7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    t7Var.B0 = this.b ? 1.0f : 0.0f;
                    t7Var.A0 = null;
                    break;
                }
                break;
            case 25:
                org.telegram.ui.Cells.db dbVar = (org.telegram.ui.Cells.db) this.c;
                AnimatorSet animatorSet3 = dbVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dbVar.f = null;
                    if (!this.b) {
                        dbVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 26:
                ((org.telegram.ui.na) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 27:
                ld ldVar = (ld) this.c;
                if (ldVar.n != null && (idVar = ldVar.h) != null) {
                    if (this.b) {
                        idVar.setVisibility(4);
                    } else {
                        ldVar.r.setVisibility(4);
                    }
                    ldVar.n = null;
                    break;
                }
                break;
            case 28:
                wn wnVar = (wn) this.c;
                AnimatorSet animatorSet4 = wnVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        wnVar.G0.setVisibility(4);
                        break;
                    } else {
                        (wnVar.C0 ? wnVar.D0 : wnVar.B0).setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ro roVar = (ro) this.c;
                if (roVar.h != null && (radialProgressView2 = roVar.n) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        roVar.f.setVisibility(4);
                    }
                    roVar.h = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                super.onAnimationStart(animator);
                try {
                    ((b0) this.c).performHapticFeedback(3);
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
