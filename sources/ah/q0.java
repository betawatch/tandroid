package ah;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bi.a2;
import bi.e3;
import bi.o5;
import bi.pb;
import bi.t1;
import di.pc;
import di.q6;
import di.u4;
import di.x3;
import di.z9;
import fi.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.db;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.s5;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.c5;
import org.telegram.ui.co;
import org.telegram.ui.i4;
import org.telegram.ui.jd;
import org.telegram.ui.md;
import org.telegram.ui.na;
import org.telegram.ui.s4;
import org.telegram.ui.z4;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class q0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q0(int i10, Object obj, boolean z10) {
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
                db dbVar = (db) this.c;
                AnimatorSet animatorSet3 = dbVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dbVar.f = null;
                    break;
                }
                break;
            case 28:
                ((md) this.c).n = null;
                break;
            case 29:
                co coVar = (co) this.c;
                AnimatorSet animatorSet4 = coVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    coVar.H0 = null;
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
        jd jdVar;
        switch (this.a) {
            case 0:
                u0 u0Var = (u0) this.c;
                fk0 fk0Var = u0Var.n;
                u0Var.k();
                u0Var.l();
                boolean z10 = this.b;
                u0.a(u0Var, z10);
                u0Var.m.invalidateOutline();
                u0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    u0Var.k = true;
                    u0Var.a.invalidate();
                }
                fk0Var.setCustomEmojiEnterProgress(Utilities.clamp(u0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    fk0Var.setImportantForAccessibility(0);
                    fk0Var.setSkipDraw(false);
                    u0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = u0Var.y;
                    fk0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                u0Var.C = false;
                break;
            case 1:
                bi.v vVar = (bi.v) this.c;
                vVar.d0 = this.b ? 1.0f : 0.0f;
                vVar.b();
                break;
            case 2:
                e3 e3Var = (e3) this.c;
                bi.o0 o0Var = e3Var.c;
                boolean z11 = this.b;
                o0Var.setAlpha(z11 ? 0.0f : 1.0f);
                e3Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                e3Var.invalidate();
                break;
            case 3:
                a2 a2Var = (a2) this.c;
                a2Var.b.removeViewImmediate(a2Var.d);
                a2Var.f.b();
                if (this.b && (t1Var = a2Var.v) != null && t1Var != t1.W) {
                    t1Var.e();
                }
                a2Var.v = null;
                a2Var.s = true;
                a2Var.G = null;
                a2Var.E = false;
                break;
            case 4:
                pb pbVar = (pb) this.c;
                pbVar.J0.unlock();
                pbVar.e0 = this.b ? pbVar.w.c : 0.0f;
                o5 currentPeerView = pbVar.n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                pbVar.v.invalidate();
                pbVar.v1 = null;
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
                    ((x3) this.c).I.setVisibility(8);
                    break;
                }
                break;
            case 11:
                if (!this.b) {
                    ((u4) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 12:
                q6 q6Var = (q6) this.c;
                if (!this.b) {
                    q6Var.Z1.setVisibility(8);
                    q6Var.Z1.n();
                    break;
                }
                break;
            case 13:
                z9 z9Var = (z9) this.c;
                if (this.b) {
                    z9Var.setVisibility(8);
                }
                z9Var.c = null;
                break;
            case 14:
                pc pcVar = (pc) this.c;
                if (!this.b) {
                    pcVar.V0.setVisibility(8);
                }
                pcVar.f2 = null;
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
                hg.n1 n1Var = (hg.n1) this.c;
                boolean z16 = this.b;
                n1Var.e = z16 ? 1.0f : 0.0f;
                n1Var.invalidate();
                int i13 = 0;
                while (i13 < 2) {
                    n1Var.c[i13].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    n1Var.c[i13].setVisibility((i13 == 1) == z16 ? 0 : 8);
                    n1Var.c[i13].setAlpha(AndroidUtilities.lerp(i13 == 0 ? 1.0f : 0.0f, i13 == 1 ? 1.0f : 0.0f, n1Var.e));
                    n1Var.d[i13].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), n1Var.e));
                    n1Var.d[i13].setVisibility((i13 == 1) == z16 ? 0 : 8);
                    n1Var.d[i13].setAlpha(AndroidUtilities.lerp(i13 == 0 ? 1.0f : 0.0f, i13 == 1 ? 1.0f : 0.0f, n1Var.e));
                    i13++;
                }
                break;
            case 18:
                if (this.b) {
                    ((mg.q) this.c).e(false, false, true, false);
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.f1 f1Var = (org.telegram.ui.ActionBar.f1) this.c;
                float f7 = this.b ? 1.0f : 0.0f;
                f1Var.setTextColor(i0.a.d(f7, -1, -9194260));
                f1Var.setIconColor(i0.a.d(f7, -1, -9194260));
                break;
            case 20:
                i4 i4Var = (i4) this.c;
                boolean z17 = this.b;
                float f10 = z17 ? 1.0f : 0.0f;
                i4Var.Y0 = f10;
                i4Var.q0.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(51.0f)) + i4Var.p0);
                if (!z17) {
                    i4Var.q0.setVisibility(8);
                    break;
                }
                break;
            case 21:
                c5 c5Var = (c5) this.c;
                if (!this.b) {
                    c5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar2 = ((s4) c5Var).G;
                    if (mVar2.a) {
                        mVar2.a = false;
                        if (((s4) mVar2.d).getParent() != null) {
                            ((WindowManager) mVar2.c).removeView((s4) mVar2.d);
                        }
                        s4 s4Var = (s4) mVar2.d;
                        s4Var.E = true;
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
            case 22:
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) this.c;
                s1 s1Var = t1Var2.Zc;
                int g10 = s1Var.g();
                int i14 = t1Var2.hd;
                if (i14 == g10) {
                    t1Var2.kd = false;
                    s1Var.a2 = i14;
                    break;
                } else {
                    t1Var2.t1(i14, g10, this.b);
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
                t7 t7Var = (t7) this.c;
                ValueAnimator valueAnimator = t7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    t7Var.B0 = this.b ? 1.0f : 0.0f;
                    t7Var.A0 = null;
                    break;
                }
                break;
            case 26:
                db dbVar = (db) this.c;
                AnimatorSet animatorSet3 = dbVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dbVar.f = null;
                    if (!this.b) {
                        dbVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 27:
                ((na) this.c).d.setVisibility(this.b ? 0 : 8);
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
                co coVar = (co) this.c;
                AnimatorSet animatorSet4 = coVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        coVar.G0.setVisibility(4);
                        break;
                    } else {
                        (coVar.C0 ? coVar.D0 : coVar.B0).setVisibility(4);
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
