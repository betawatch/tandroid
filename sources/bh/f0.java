package bh;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bi.r1;
import di.h1;
import di.m2;
import di.o1;
import di.q4;
import di.y9;
import fi.e6;
import fi.e9;
import fi.k4;
import fi.o3;
import fi.sb;
import hi.m3;
import ig.m1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.Cells.d2;
import org.telegram.ui.Cells.eb;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.x5;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.c5;
import org.telegram.ui.f5;
import org.telegram.ui.j4;
import org.telegram.ui.kd;
import org.telegram.ui.nd;
import org.telegram.ui.qa;
import org.telegram.ui.un;
import org.telegram.ui.v4;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class f0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ f0(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 17:
                ((ii.o) this.c).x = null;
                break;
            case 23:
                d2 d2Var = (d2) this.c;
                AnimatorSet animatorSet = d2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.R = null;
                    break;
                }
                break;
            case 24:
                x5 x5Var = (x5) this.c;
                AnimatorSet animatorSet2 = x5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x5Var.J = null;
                    break;
                }
                break;
            case 26:
                eb ebVar = (eb) this.c;
                AnimatorSet animatorSet3 = ebVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ebVar.f = null;
                    break;
                }
                break;
            case 28:
                ((nd) this.c).r = null;
                break;
            case 29:
                un unVar = (un) this.c;
                AnimatorSet animatorSet4 = unVar.T0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    unVar.T0 = null;
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
        h1 h1Var;
        View m10;
        RadialProgressView radialProgressView;
        kd kdVar;
        switch (this.a) {
            case 0:
                i0 i0Var = (i0) this.c;
                fl0 fl0Var = i0Var.n;
                i0Var.k();
                i0Var.l();
                boolean z10 = this.b;
                i0.a(i0Var, z10);
                i0Var.m.invalidateOutline();
                i0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    i0Var.k = true;
                    i0Var.a.invalidate();
                }
                fl0Var.setCustomEmojiEnterProgress(Utilities.clamp(i0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    fl0Var.setImportantForAccessibility(0);
                    fl0Var.setSkipDraw(false);
                    i0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = i0Var.y;
                    fl0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                i0Var.C = false;
                break;
            case 1:
                di.r rVar = (di.r) this.c;
                rVar.d0 = this.b ? 1.0f : 0.0f;
                rVar.b();
                break;
            case 2:
                m2 m2Var = (m2) this.c;
                r1 r1Var = m2Var.c;
                boolean z11 = this.b;
                r1Var.setAlpha(z11 ? 0.0f : 1.0f);
                m2Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                m2Var.invalidate();
                break;
            case 3:
                o1 o1Var = (o1) this.c;
                o1Var.b.removeViewImmediate(o1Var.d);
                o1Var.f.b();
                if (this.b && (h1Var = o1Var.v) != null && h1Var != h1.W) {
                    h1Var.e();
                }
                o1Var.v = null;
                o1Var.s = true;
                o1Var.G = null;
                o1Var.E = false;
                break;
            case 4:
                y9 y9Var = (y9) this.c;
                y9Var.J0.unlock();
                y9Var.e0 = this.b ? y9Var.w.c : 0.0f;
                q4 currentPeerView = y9Var.n0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                y9Var.v.invalidate();
                y9Var.v1 = null;
                break;
            case 5:
                ei.v vVar = (ei.v) this.c;
                boolean z12 = this.b;
                vVar.w = z12 ? 1.0f : 0.0f;
                vVar.r.setTranslationY(AndroidUtilities.dp(z12 ? 0.0f : -42.0f));
                vVar.n.setTranslationY(AndroidUtilities.dp(z12 ? 42.0f : 0.0f));
                break;
            case 6:
                ei.r rVar2 = (ei.r) this.c;
                ei.h hVar = rVar2.h;
                ei.i iVar = rVar2.f;
                ei.l lVar = rVar2.v;
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
                    hVar.z1(rVar2.d);
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
                fi.d dVar = (fi.d) this.c;
                dVar.P = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 8:
                fi.m mVar = (fi.m) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    mVar.r.setVisibility(8);
                    fi.i iVar2 = mVar.M;
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
                fi.y yVar = (fi.y) this.c;
                fi.v vVar2 = yVar.a;
                boolean z15 = this.b;
                yVar.d = z15 ? 1.0f : 0.0f;
                vVar2.invalidate();
                vVar2.setVisibility(z15 ? 0 : 8);
                break;
            case 10:
                if (!this.b) {
                    ((o3) this.c).I.setVisibility(8);
                    break;
                }
                break;
            case 11:
                if (!this.b) {
                    ((k4) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 12:
                e6 e6Var = (e6) this.c;
                if (!this.b) {
                    e6Var.O1.setVisibility(8);
                    e6Var.O1.n();
                    break;
                }
                break;
            case 13:
                e9 e9Var = (e9) this.c;
                if (this.b) {
                    e9Var.setVisibility(8);
                }
                e9Var.c = null;
                break;
            case 14:
                sb sbVar = (sb) this.c;
                if (!this.b) {
                    sbVar.V0.setVisibility(8);
                }
                sbVar.f2 = null;
                break;
            case 15:
                m3 m3Var = (m3) this.c;
                m3Var.R0 = this.b ? 1.0f : 0.0f;
                m3Var.h();
                break;
            case 16:
                m1 m1Var = (m1) this.c;
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
                ii.o oVar = (ii.o) this.c;
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
                    ((ng.p) this.c).e(false, false, true, false);
                    break;
                }
                break;
            case 19:
                g1 g1Var = (g1) this.c;
                float f7 = this.b ? 1.0f : 0.0f;
                g1Var.setTextColor(i0.a.f(f7, -1, -9194260));
                g1Var.setIconColor(i0.a.f(f7, -1, -9194260));
                break;
            case 20:
                j4 j4Var = (j4) this.c;
                boolean z17 = this.b;
                float f10 = z17 ? 1.0f : 0.0f;
                j4Var.Z0 = f10;
                j4Var.q0.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(51.0f)) + j4Var.p0);
                if (!z17) {
                    j4Var.q0.setVisibility(8);
                    break;
                }
                break;
            case 21:
                f5 f5Var = (f5) this.c;
                if (!this.b) {
                    f5Var.setVisibility(4);
                    c2.b bVar = ((v4) f5Var).G;
                    if (bVar.a) {
                        bVar.a = false;
                        if (((v4) bVar.d).getParent() != null) {
                            ((WindowManager) bVar.c).removeView((v4) bVar.d);
                        }
                        v4 v4Var = (v4) bVar.d;
                        v4Var.E = true;
                        c5 c5Var = v4Var.y;
                        if (c5Var != null) {
                            if (c5Var.g) {
                                c5Var.g = false;
                                c5Var.b.removeObserver(c5Var.a, c5Var.e);
                            }
                            v4Var.y = null;
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
                s1 s1Var = (s1) this.c;
                org.telegram.ui.Cells.r1 r1Var2 = s1Var.Zc;
                int g7 = r1Var2.g();
                int i14 = s1Var.hd;
                if (i14 == g7) {
                    s1Var.kd = false;
                    r1Var2.a2 = i14;
                    break;
                } else {
                    s1Var.t1(i14, g7, this.b);
                    break;
                }
            case 23:
                d2 d2Var = (d2) this.c;
                AnimatorSet animatorSet = d2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.R = null;
                    if (!this.b) {
                        d2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 24:
                x5 x5Var = (x5) this.c;
                AnimatorSet animatorSet2 = x5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    x5Var.J = null;
                    if (!this.b) {
                        x5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 25:
                w7 w7Var = (w7) this.c;
                ValueAnimator valueAnimator = w7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    w7Var.B0 = this.b ? 1.0f : 0.0f;
                    w7Var.A0 = null;
                    break;
                }
                break;
            case 26:
                eb ebVar = (eb) this.c;
                AnimatorSet animatorSet3 = ebVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ebVar.f = null;
                    if (!this.b) {
                        ebVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 27:
                ((qa) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 28:
                nd ndVar = (nd) this.c;
                if (ndVar.r != null && (kdVar = ndVar.n) != null) {
                    if (this.b) {
                        kdVar.setVisibility(4);
                    } else {
                        ndVar.s.setVisibility(4);
                    }
                    ndVar.r = null;
                    break;
                }
                break;
            default:
                un unVar = (un) this.c;
                AnimatorSet animatorSet4 = unVar.T0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        unVar.G0.setVisibility(4);
                        break;
                    } else {
                        (unVar.C0 ? unVar.D0 : unVar.B0).setVisibility(4);
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
                    ((di.r) this.c).performHapticFeedback(3);
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
