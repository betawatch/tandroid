package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.ViewGroup;
import android.view.WindowManager;
import oh.f4;
import oh.i9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.mq;
import org.telegram.ui.Components.o00;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vv;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zv;
import org.telegram.ui.b5;
import org.telegram.ui.e5;
import org.telegram.ui.kd;
import org.telegram.ui.l4;
import org.telegram.ui.ma;
import org.telegram.ui.nd;
import org.telegram.ui.po;
import org.telegram.ui.u4;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class u2 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u2(int i10, Object obj, boolean z4) {
        this.a = i10;
        this.c = obj;
        this.b = z4;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 12:
                org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) this.c;
                AnimatorSet animatorSet = e2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.O = null;
                    break;
                }
                break;
            case 13:
                t5 t5Var = (t5) this.c;
                AnimatorSet animatorSet2 = t5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.G = null;
                    break;
                }
                break;
            case 14:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            default:
                super.onAnimationCancel(animator);
                break;
            case 15:
                ya yaVar = (ya) this.c;
                AnimatorSet animatorSet3 = yaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yaVar.f = null;
                    break;
                }
                break;
            case 17:
                ((nd) this.c).n = null;
                break;
            case 18:
                xn xnVar = (xn) this.c;
                AnimatorSet animatorSet4 = xnVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    xnVar.E0 = null;
                    break;
                }
                break;
            case 19:
                ((po) this.c).h = null;
                break;
            case 20:
                v9 v9Var = (v9) this.c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    v9Var.h = null;
                    break;
                }
                break;
            case 22:
                ((mi) this.c).V0 = null;
                break;
            case 23:
                this.b = true;
                break;
            case 28:
                o00 o00Var = (o00) this.c;
                AnimatorSet animatorSet6 = o00Var.e;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    o00Var.e = null;
                    break;
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        oh.e1 e1Var;
        kd kdVar;
        RadialProgressView radialProgressView;
        switch (this.a) {
            case 0:
                v2 v2Var = (v2) this.c;
                ((dg.p) v2Var).y.n.d();
                if (this.b) {
                    v2Var.w.accept(Integer.valueOf(v2Var.s));
                }
                if (v2Var.getParent() != null) {
                    ((ViewGroup) v2Var.getParent()).removeView(v2Var);
                    break;
                }
                break;
            case 1:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.c;
                if (this.b) {
                    limitPreviewView.g0 = false;
                }
                Runnable runnable = limitPreviewView.h0;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                    limitPreviewView.h0.run();
                    break;
                }
                break;
            case 2:
                fg.b1 b1Var = (fg.b1) this.c;
                b1Var.J = this.b ? 1.0f : 0.0f;
                b1Var.d.invalidate();
                fg.a1 a1Var = b1Var.e;
                if (a1Var != null) {
                    a1Var.invalidate();
                    break;
                }
                break;
            case 3:
                ng.d0 d0Var = (ng.d0) this.c;
                qk0 qk0Var = d0Var.n;
                d0Var.k();
                d0Var.l();
                boolean z4 = this.b;
                ng.d0.a(d0Var, z4);
                d0Var.m.invalidateOutline();
                d0Var.j = z4 ? 1.0f : 0.0f;
                if (z4) {
                    d0Var.k = true;
                    d0Var.a.invalidate();
                }
                qk0Var.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.j, 1.0f, 0.0f));
                if (!z4) {
                    qk0Var.setImportantForAccessibility(0);
                    qk0Var.setSkipDraw(false);
                    d0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = d0Var.y;
                    qk0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                d0Var.C = false;
                break;
            case 4:
                oh.p pVar = (oh.p) this.c;
                pVar.a0 = this.b ? 1.0f : 0.0f;
                pVar.b();
                break;
            case 5:
                oh.h2 h2Var = (oh.h2) this.c;
                mh.d1 d1Var = h2Var.c;
                boolean z10 = this.b;
                d1Var.setAlpha(z10 ? 0.0f : 1.0f);
                h2Var.a.setAlpha(z10 ? 0.0f : 0.5f);
                h2Var.invalidate();
                break;
            case 6:
                oh.j1 j1Var = (oh.j1) this.c;
                j1Var.b.removeViewImmediate(j1Var.d);
                j1Var.f.b();
                if (this.b && (e1Var = j1Var.v) != null && e1Var != oh.e1.T) {
                    e1Var.e();
                }
                j1Var.v = null;
                j1Var.s = true;
                j1Var.D = null;
                j1Var.B = false;
                break;
            case 7:
                i9 i9Var = (i9) this.c;
                i9Var.G0.unlock();
                i9Var.b0 = this.b ? i9Var.w.c : 0.0f;
                f4 currentPeerView = i9Var.k0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.v.invalidate();
                i9Var.s1 = null;
                break;
            case 8:
                org.telegram.ui.ActionBar.g1 g1Var = (org.telegram.ui.ActionBar.g1) this.c;
                float f10 = this.b ? 1.0f : 0.0f;
                g1Var.setTextColor(i0.a.d(f10, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f10, -1, -9194260));
                break;
            case 9:
                l4 l4Var = (l4) this.c;
                boolean z11 = this.b;
                float f11 = z11 ? 1.0f : 0.0f;
                l4Var.V0 = f11;
                l4Var.n0.setTranslationY(((1.0f - f11) * AndroidUtilities.dp(51.0f)) + l4Var.m0);
                if (!z11) {
                    l4Var.n0.setVisibility(8);
                    break;
                }
                break;
            case 10:
                e5 e5Var = (e5) this.c;
                if (!this.b) {
                    e5Var.setVisibility(4);
                    cb.m mVar = ((u4) e5Var).D;
                    if (mVar.a) {
                        mVar.a = false;
                        if (((u4) mVar.d).getParent() != null) {
                            ((WindowManager) mVar.c).removeView((u4) mVar.d);
                        }
                        u4 u4Var = (u4) mVar.d;
                        u4Var.B = true;
                        b5 b5Var = u4Var.y;
                        if (b5Var != null) {
                            if (b5Var.g) {
                                b5Var.g = false;
                                b5Var.b.removeObserver(b5Var.a, b5Var.e);
                            }
                            u4Var.y = null;
                        }
                        mVar.d = null;
                        ((ViewGroup) mVar.b).requestDisallowInterceptTouchEvent(false);
                        mVar.b = null;
                        mVar.c = null;
                        break;
                    }
                }
                break;
            case 11:
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) this.c;
                org.telegram.ui.Cells.s1 s1Var = t1Var.Wc;
                int g10 = s1Var.g();
                int i11 = t1Var.ed;
                if (i11 == g10) {
                    t1Var.hd = false;
                    s1Var.a2 = i11;
                    break;
                } else {
                    t1Var.t1(i11, g10, this.b);
                    break;
                }
            case 12:
                org.telegram.ui.Cells.e2 e2Var = (org.telegram.ui.Cells.e2) this.c;
                AnimatorSet animatorSet = e2Var.O;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.O = null;
                    if (!this.b) {
                        e2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 13:
                t5 t5Var = (t5) this.c;
                AnimatorSet animatorSet2 = t5Var.G;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.G = null;
                    if (!this.b) {
                        t5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 14:
                r7 r7Var = (r7) this.c;
                ValueAnimator valueAnimator = r7Var.x0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    r7Var.y0 = this.b ? 1.0f : 0.0f;
                    r7Var.x0 = null;
                    break;
                }
                break;
            case 15:
                ya yaVar = (ya) this.c;
                AnimatorSet animatorSet3 = yaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yaVar.f = null;
                    if (!this.b) {
                        yaVar.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 16:
                ((ma) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 17:
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
            case 18:
                xn xnVar = (xn) this.c;
                AnimatorSet animatorSet4 = xnVar.E0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        xnVar.D0.setVisibility(4);
                        break;
                    } else {
                        (xnVar.z0 ? xnVar.A0 : xnVar.y0).setVisibility(4);
                        break;
                    }
                }
                break;
            case 19:
                po poVar = (po) this.c;
                if (poVar.h != null && (radialProgressView = poVar.n) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        poVar.f.setVisibility(4);
                    }
                    poVar.h = null;
                    break;
                }
                break;
            case 20:
                v9 v9Var = (v9) this.c;
                AnimatorSet animatorSet5 = v9Var.h;
                if (animatorSet5 != null && animatorSet5.equals(animator)) {
                    if (!this.b) {
                        v9Var.c.setVisibility(4);
                        break;
                    } else {
                        v9Var.b.setVisibility(4);
                        break;
                    }
                }
                break;
            case 21:
                rc rcVar = (rc) this.c;
                if (animator == rcVar.g) {
                    rcVar.g = null;
                    rcVar.i = this.b ? 1.0f : 0.0f;
                    rcVar.b();
                    break;
                }
                break;
            case 22:
                mi miVar = (mi) this.c;
                if (miVar.V0 != null) {
                    if (!this.b) {
                        org.telegram.ui.ActionBar.w0 w0Var = miVar.b1;
                        if (w0Var != null) {
                            w0Var.setVisibility(4);
                        }
                        if (miVar.N0 != 0 || !miVar.n1) {
                            miVar.X0.setVisibility(4);
                            break;
                        }
                    } else if (miVar.P0) {
                        ei eiVar = miVar.v0;
                        if (eiVar == null || eiVar.I()) {
                            miVar.u1.setVisibility(4);
                            break;
                        }
                    }
                }
                break;
            case 23:
                ho hoVar = (ho) this.c;
                if (!this.b) {
                    p9 p9Var = hoVar.h;
                    hoVar.h = hoVar.n;
                    hoVar.n = p9Var;
                    p9Var.setVisibility(8);
                    hoVar.n.setAlpha(0.0f);
                    hoVar.h.setVisibility(0);
                    hoVar.h.setAlpha(1.0f);
                    break;
                }
                break;
            case 24:
                boolean z12 = this.b;
                ro roVar = (ro) this.c;
                if (animator == roVar.e) {
                    float f12 = z12 ? 1.0f : 0.0f;
                    roVar.d = f12;
                    roVar.setShown(f12);
                    if (!z12) {
                        roVar.setVisibility(8);
                    }
                    roVar.a(true);
                    break;
                }
                break;
            case 25:
                mp mpVar = (mp) this.c;
                mpVar.d0 = this.b ? 1.0f : 0.0f;
                mpVar.G.setTranslationY((-AndroidUtilities.dp(7.0f)) * mpVar.d0);
                break;
            case 26:
                if (!this.b) {
                    ((mq) this.c).E.setVisibility(8);
                    break;
                }
                break;
            case 27:
                vv vvVar = (vv) this.c;
                zv zvVar = vvVar.G;
                if (zvVar.R && !vvVar.h) {
                    if (!this.b && !vvVar.n) {
                        vvVar.setBackground(null);
                        break;
                    } else if (vvVar.getBackground() == null) {
                        vvVar.setBackground(k6.Y(zvVar.k(), 8, 8));
                        break;
                    }
                }
                break;
            case 28:
                o00 o00Var = (o00) this.c;
                AnimatorSet animatorSet6 = o00Var.e;
                if (animatorSet6 != null && animatorSet6.equals(animator)) {
                    if (!this.b) {
                        o00Var.f.setVisibility(4);
                    }
                    o00Var.e = null;
                    break;
                }
                break;
            default:
                z00 z00Var = (z00) this.c;
                z00Var.h = this.b ? 1.0f : 0.0f;
                z00Var.invalidate();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 4:
                super.onAnimationStart(animator);
                try {
                    ((oh.p) this.c).performHapticFeedback(3);
                    break;
                } catch (Exception unused) {
                    return;
                }
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public u2(ho hoVar) {
        this.a = 23;
        this.c = hoVar;
    }
}
