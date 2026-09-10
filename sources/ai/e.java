package ai;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import bi.ce;
import bi.ib;
import bi.p4;
import bi.p5;
import bi.r7;
import di.n3;
import fg.o1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.fb;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ca;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.qi;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yi;
import org.telegram.ui.c5;
import org.telegram.ui.eo;
import org.telegram.ui.j4;
import org.telegram.ui.kd;
import org.telegram.ui.nd;
import org.telegram.ui.oa;
import org.telegram.ui.s4;
import org.telegram.ui.yo;
import org.telegram.ui.z4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 11:
                ((ei.p) this.c).w = null;
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 20:
            case 22:
            case 27:
            default:
                super.onAnimationCancel(animator);
                break;
            case 18:
                e2 e2Var = (e2) this.c;
                AnimatorSet animatorSet = e2Var.R;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.R = null;
                    break;
                }
                break;
            case 19:
                t5 t5Var = (t5) this.c;
                AnimatorSet animatorSet2 = t5Var.J;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.J = null;
                    break;
                }
                break;
            case 21:
                fb fbVar = (fb) this.c;
                AnimatorSet animatorSet3 = fbVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fbVar.f = null;
                    break;
                }
                break;
            case 23:
                ((nd) this.c).n = null;
                break;
            case 24:
                eo eoVar = (eo) this.c;
                AnimatorSet animatorSet4 = eoVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    eoVar.H0 = null;
                    break;
                }
                break;
            case 25:
                ((yo) this.c).h = null;
                break;
            case 26:
                ca caVar = (ca) this.c;
                AnimatorSet animatorSet5 = caVar.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    caVar.h = null;
                    break;
                }
                break;
            case 28:
                ((yi) this.c).Y0 = null;
                break;
            case 29:
                this.b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View m10;
        RadialProgressView radialProgressView;
        kd kdVar;
        RadialProgressView radialProgressView2;
        switch (this.a) {
            case 0:
                g0 g0Var = (g0) this.c;
                boolean z10 = this.b;
                g0Var.w = z10 ? 1.0f : 0.0f;
                g0Var.r.setTranslationY(AndroidUtilities.dp(z10 ? 0.0f : -42.0f));
                g0Var.n.setTranslationY(AndroidUtilities.dp(z10 ? 42.0f : 0.0f));
                break;
            case 1:
                a0 a0Var = (a0) this.c;
                n nVar = a0Var.h;
                o oVar = a0Var.f;
                r rVar = a0Var.v;
                a0Var.b = false;
                boolean z11 = this.b;
                if (z11) {
                    int i10 = a0Var.e;
                    a0Var.d = i10;
                    a0Var.W.y = i10;
                    SharedConfig.setStoriesColumnsCount(i10);
                }
                int h = rVar.h();
                if (z11) {
                    nVar.y1(a0Var.d);
                    oVar.a0();
                    if (rVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(oVar);
                    } else {
                        rVar.l();
                    }
                }
                a0Var.r.setVisibility(8);
                int i11 = a0Var.S;
                if (i11 >= 0) {
                    if (z11 && (m10 = a0Var.s.m(i11)) != null) {
                        a0Var.T = m10.getTop();
                    }
                    nVar.h1(a0Var.S, (-oVar.getPaddingTop()) + a0Var.T);
                }
                super.onAnimationEnd(animator);
                break;
            case 2:
                bi.d dVar = (bi.d) this.c;
                dVar.M = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 3:
                bi.o oVar2 = (bi.o) this.c;
                boolean z12 = this.b;
                if (!z12) {
                    oVar2.r.setVisibility(8);
                    bi.k kVar = oVar2.M;
                    if (kVar != null) {
                        kVar.setVisibility(8);
                    }
                }
                if (z12) {
                    oVar2.f.getEditText().setAllowDrawCursor(true);
                }
                oVar2.c(z12);
                break;
            case 4:
                bi.c0 c0Var = (bi.c0) this.c;
                bi.z zVar = c0Var.a;
                boolean z13 = this.b;
                c0Var.d = z13 ? 1.0f : 0.0f;
                zVar.invalidate();
                zVar.setVisibility(z13 ? 0 : 8);
                break;
            case 5:
                if (!this.b) {
                    ((p4) this.c).I.setVisibility(8);
                    break;
                }
                break;
            case 6:
                if (!this.b) {
                    ((p5) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 7:
                r7 r7Var = (r7) this.c;
                if (!this.b) {
                    r7Var.Z1.setVisibility(8);
                    r7Var.Z1.n();
                    break;
                }
                break;
            case 8:
                ib ibVar = (ib) this.c;
                if (this.b) {
                    ibVar.setVisibility(8);
                }
                ibVar.c = null;
                break;
            case 9:
                ce ceVar = (ce) this.c;
                if (!this.b) {
                    ceVar.V0.setVisibility(8);
                }
                ceVar.f2 = null;
                break;
            case 10:
                n3 n3Var = (n3) this.c;
                n3Var.N0 = this.b ? 1.0f : 0.0f;
                n3Var.h();
                break;
            case 11:
                ei.p pVar = (ei.p) this.c;
                if (pVar.w != null && (radialProgressView = pVar.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        pVar.s.setVisibility(4);
                    }
                    pVar.w = null;
                    break;
                }
                break;
            case 12:
                o1 o1Var = (o1) this.c;
                boolean z14 = this.b;
                o1Var.e = z14 ? 1.0f : 0.0f;
                o1Var.invalidate();
                int i12 = 0;
                while (i12 < 2) {
                    o1Var.c[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), o1Var.e));
                    o1Var.c[i12].setVisibility((i12 == 1) == z14 ? 0 : 8);
                    o1Var.c[i12].setAlpha(AndroidUtilities.lerp(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, o1Var.e));
                    o1Var.d[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), o1Var.e));
                    o1Var.d[i12].setVisibility((i12 == 1) == z14 ? 0 : 8);
                    o1Var.d[i12].setAlpha(AndroidUtilities.lerp(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, o1Var.e));
                    i12++;
                }
                break;
            case 13:
                if (this.b) {
                    ((kg.p) this.c).e(false, false, true, false);
                    break;
                }
                break;
            case 14:
                g1 g1Var = (g1) this.c;
                float f7 = this.b ? 1.0f : 0.0f;
                g1Var.setTextColor(i0.a.d(f7, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f7, -1, -9194260));
                break;
            case 15:
                j4 j4Var = (j4) this.c;
                boolean z15 = this.b;
                float f10 = z15 ? 1.0f : 0.0f;
                j4Var.Y0 = f10;
                j4Var.q0.setTranslationY(((1.0f - f10) * AndroidUtilities.dp(51.0f)) + j4Var.p0);
                if (!z15) {
                    j4Var.q0.setVisibility(8);
                    break;
                }
                break;
            case 16:
                c5 c5Var = (c5) this.c;
                if (!this.b) {
                    c5Var.setVisibility(4);
                    com.google.firebase.messaging.m mVar = ((s4) c5Var).G;
                    if (mVar.a) {
                        mVar.a = false;
                        if (((s4) mVar.d).getParent() != null) {
                            ((WindowManager) mVar.c).removeView((s4) mVar.d);
                        }
                        s4 s4Var = (s4) mVar.d;
                        s4Var.E = true;
                        z4 z4Var = s4Var.y;
                        if (z4Var != null) {
                            if (z4Var.g) {
                                z4Var.g = false;
                                z4Var.b.removeObserver(z4Var.a, z4Var.e);
                            }
                            s4Var.y = null;
                        }
                        mVar.d = null;
                        ((ViewGroup) mVar.b).requestDisallowInterceptTouchEvent(false);
                        mVar.b = null;
                        mVar.c = null;
                        break;
                    }
                }
                break;
            case 17:
                t1 t1Var = (t1) this.c;
                s1 s1Var = t1Var.Zc;
                int g10 = s1Var.g();
                int i13 = t1Var.hd;
                if (i13 == g10) {
                    t1Var.kd = false;
                    s1Var.a2 = i13;
                    break;
                } else {
                    t1Var.t1(i13, g10, this.b);
                    break;
                }
            case 18:
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
            case 19:
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
            case 20:
                u7 u7Var = (u7) this.c;
                ValueAnimator valueAnimator = u7Var.A0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    u7Var.B0 = this.b ? 1.0f : 0.0f;
                    u7Var.A0 = null;
                    break;
                }
                break;
            case 21:
                fb fbVar = (fb) this.c;
                AnimatorSet animatorSet3 = fbVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fbVar.f = null;
                    if (!this.b) {
                        fbVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 22:
                ((oa) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 23:
                nd ndVar = (nd) this.c;
                if (ndVar.n != null && (kdVar = ndVar.h) != null) {
                    if (this.b) {
                        kdVar.setVisibility(4);
                    } else {
                        ndVar.r.setVisibility(4);
                    }
                    ndVar.n = null;
                    break;
                }
                break;
            case 24:
                eo eoVar = (eo) this.c;
                AnimatorSet animatorSet4 = eoVar.H0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        eoVar.G0.setVisibility(4);
                        break;
                    } else {
                        (eoVar.C0 ? eoVar.D0 : eoVar.B0).setVisibility(4);
                        break;
                    }
                }
                break;
            case 25:
                yo yoVar = (yo) this.c;
                if (yoVar.h != null && (radialProgressView2 = yoVar.n) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        yoVar.f.setVisibility(4);
                    }
                    yoVar.h = null;
                    break;
                }
                break;
            case 26:
                ca caVar = (ca) this.c;
                AnimatorSet animatorSet5 = caVar.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        caVar.c.setVisibility(4);
                        break;
                    } else {
                        caVar.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 27:
                xc xcVar = (xc) this.c;
                if (animator == xcVar.g) {
                    xcVar.g = null;
                    xcVar.i = this.b ? 1.0f : 0.0f;
                    xcVar.b();
                    break;
                }
                break;
            case 28:
                yi yiVar = (yi) this.c;
                if (yiVar.Y0 != null) {
                    if (!this.b) {
                        w0 w0Var = yiVar.e1;
                        if (w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                        if (yiVar.Q0 != 0 || !yiVar.q1) {
                            yiVar.a1.setVisibility(4);
                            break;
                        }
                    } else if (yiVar.S0) {
                        qi qiVar = yiVar.y0;
                        if (qiVar == null || qiVar.J()) {
                            yiVar.x1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            default:
                oo ooVar = (oo) this.c;
                if (!this.b) {
                    w9 w9Var = ooVar.h;
                    ooVar.h = ooVar.n;
                    ooVar.n = w9Var;
                    w9Var.setVisibility(8);
                    ooVar.n.setAlpha(0.0f);
                    ooVar.h.setVisibility(0);
                    ooVar.h.setAlpha(1.0f);
                    break;
                }
                break;
        }
    }

    public e(oo ooVar) {
        this.a = 29;
        this.c = ooVar;
    }
}
