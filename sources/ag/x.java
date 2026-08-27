package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import jh.e4;
import jh.i9;
import lh.f6;
import lh.k4;
import lh.sb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Cells.q5;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.wj0;
import org.telegram.ui.c5;
import org.telegram.ui.fd;
import org.telegram.ui.id;
import org.telegram.ui.ka;
import org.telegram.ui.m4;
import org.telegram.ui.rn;
import org.telegram.ui.s4;
import org.telegram.ui.z4;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 18:
                ((oh.o) this.c).w = null;
                break;
            case 23:
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) this.c;
                AnimatorSet animatorSet = d2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    d2Var.N = null;
                    break;
                }
                break;
            case 24:
                q5 q5Var = (q5) this.c;
                AnimatorSet animatorSet2 = q5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.F = null;
                    break;
                }
                break;
            case 26:
                va vaVar = (va) this.c;
                AnimatorSet animatorSet3 = vaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    vaVar.f = null;
                    break;
                }
                break;
            case 28:
                ((id) this.c).n = null;
                break;
            case 29:
                rn rnVar = (rn) this.c;
                AnimatorSet animatorSet4 = rnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    rnVar.D0 = null;
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
        jh.d1 d1Var;
        View m10;
        RadialProgressView radialProgressView;
        fd fdVar;
        switch (this.a) {
            case 0:
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
            case 1:
                s1 s1Var = (s1) this.c;
                s1Var.I = this.b ? 1.0f : 0.0f;
                s1Var.d.invalidate();
                o1 o1Var = s1Var.e;
                if (o1Var != null) {
                    o1Var.invalidate();
                    break;
                }
                break;
            case 2:
                ig.d0 d0Var = (ig.d0) this.c;
                wj0 wj0Var = d0Var.n;
                d0Var.k();
                d0Var.l();
                boolean z10 = this.b;
                ig.d0.a(d0Var, z10);
                d0Var.m.invalidateOutline();
                d0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    d0Var.k = true;
                    d0Var.a.invalidate();
                }
                wj0Var.setCustomEmojiEnterProgress(Utilities.clamp(d0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    wj0Var.setImportantForAccessibility(0);
                    wj0Var.setSkipDraw(false);
                    d0Var.f();
                    Runtime.getRuntime().gc();
                    int i10 = d0Var.y;
                    wj0Var.setCustomEmojiReactionsBackground((i10 == 4 || i10 == 5) ? false : true);
                }
                d0Var.C = false;
                break;
            case 3:
                jh.p pVar = (jh.p) this.c;
                pVar.W = this.b ? 1.0f : 0.0f;
                pVar.b();
                break;
            case 4:
                jh.g2 g2Var = (jh.g2) this.c;
                hh.f1 f1Var = g2Var.c;
                boolean z11 = this.b;
                f1Var.setAlpha(z11 ? 0.0f : 1.0f);
                g2Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                g2Var.invalidate();
                break;
            case 5:
                jh.i1 i1Var = (jh.i1) this.c;
                i1Var.b.removeViewImmediate(i1Var.d);
                i1Var.f.b();
                if (this.b && (d1Var = i1Var.v) != null && d1Var != jh.d1.S) {
                    d1Var.e();
                }
                i1Var.v = null;
                i1Var.s = true;
                i1Var.C = null;
                i1Var.A = false;
                break;
            case 6:
                i9 i9Var = (i9) this.c;
                i9Var.F0.unlock();
                i9Var.a0 = this.b ? i9Var.w.c : 0.0f;
                e4 currentPeerView = i9Var.j0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                i9Var.v.invalidate();
                i9Var.r1 = null;
                break;
            case 7:
                kh.v vVar = (kh.v) this.c;
                boolean z12 = this.b;
                vVar.w = z12 ? 1.0f : 0.0f;
                vVar.r.setTranslationY(AndroidUtilities.dp(z12 ? 0.0f : -42.0f));
                vVar.n.setTranslationY(AndroidUtilities.dp(z12 ? 42.0f : 0.0f));
                break;
            case 8:
                kh.r rVar = (kh.r) this.c;
                kh.i iVar = rVar.h;
                kh.j jVar = rVar.f;
                kh.m mVar = rVar.v;
                rVar.b = false;
                boolean z13 = this.b;
                if (z13) {
                    int i11 = rVar.e;
                    rVar.d = i11;
                    rVar.S.y = i11;
                    SharedConfig.setStoriesColumnsCount(i11);
                }
                int h = mVar.h();
                if (z13) {
                    iVar.y1(rVar.d);
                    jVar.a0();
                    if (mVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(jVar);
                    } else {
                        mVar.l();
                    }
                }
                rVar.r.setVisibility(8);
                int i12 = rVar.O;
                if (i12 >= 0) {
                    if (z13 && (m10 = rVar.s.m(i12)) != null) {
                        rVar.P = m10.getTop();
                    }
                    iVar.h1(rVar.O, (-jVar.getPaddingTop()) + rVar.P);
                }
                super.onAnimationEnd(animator);
                break;
            case 9:
                lh.d dVar = (lh.d) this.c;
                dVar.I = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 10:
                lh.m mVar2 = (lh.m) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    mVar2.r.setVisibility(8);
                    lh.i iVar2 = mVar2.I;
                    if (iVar2 != null) {
                        iVar2.setVisibility(8);
                    }
                }
                if (z14) {
                    mVar2.f.getEditText().setAllowDrawCursor(true);
                }
                mVar2.c(z14);
                break;
            case 11:
                lh.z zVar = (lh.z) this.c;
                lh.w wVar = zVar.a;
                boolean z15 = this.b;
                zVar.d = z15 ? 1.0f : 0.0f;
                wVar.invalidate();
                wVar.setVisibility(z15 ? 0 : 8);
                break;
            case 12:
                if (!this.b) {
                    ((lh.p3) this.c).E.setVisibility(8);
                    break;
                }
                break;
            case 13:
                if (!this.b) {
                    ((k4) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 14:
                f6 f6Var = (f6) this.c;
                if (!this.b) {
                    f6Var.V1.setVisibility(8);
                    f6Var.V1.n();
                    break;
                }
                break;
            case 15:
                lh.i9 i9Var2 = (lh.i9) this.c;
                if (this.b) {
                    i9Var2.setVisibility(8);
                }
                i9Var2.c = null;
                break;
            case 16:
                sb sbVar = (sb) this.c;
                if (!this.b) {
                    sbVar.R0.setVisibility(8);
                }
                sbVar.b2 = null;
                break;
            case 17:
                nh.b3 b3Var = (nh.b3) this.c;
                b3Var.J0 = this.b ? 1.0f : 0.0f;
                b3Var.h();
                break;
            case 18:
                oh.o oVar = (oh.o) this.c;
                if (oVar.w != null && (radialProgressView = oVar.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        oVar.s.setVisibility(4);
                    }
                    oVar.w = null;
                    break;
                }
                break;
            case 19:
                org.telegram.ui.ActionBar.f1 f1Var2 = (org.telegram.ui.ActionBar.f1) this.c;
                float f10 = this.b ? 1.0f : 0.0f;
                f1Var2.setTextColor(i0.b.d(f10, -1, -9194260));
                f1Var2.setIconColor(i0.b.d(f10, -1, -9194260));
                break;
            case 20:
                m4 m4Var = (m4) this.c;
                boolean z16 = this.b;
                float f11 = z16 ? 1.0f : 0.0f;
                m4Var.U0 = f11;
                m4Var.m0.setTranslationY(((1.0f - f11) * AndroidUtilities.dp(51.0f)) + m4Var.l0);
                if (!z16) {
                    m4Var.m0.setVisibility(8);
                    break;
                }
                break;
            case 21:
                c5 c5Var = (c5) this.c;
                if (!this.b) {
                    c5Var.setVisibility(4);
                    com.google.firebase.messaging.l lVar = ((s4) c5Var).C;
                    if (lVar.a) {
                        lVar.a = false;
                        if (((s4) lVar.d).getParent() != null) {
                            ((WindowManager) lVar.c).removeView((s4) lVar.d);
                        }
                        s4 s4Var = (s4) lVar.d;
                        s4Var.A = true;
                        z4 z4Var = s4Var.y;
                        if (z4Var != null) {
                            if (z4Var.g) {
                                z4Var.g = false;
                                z4Var.b.removeObserver(z4Var.a, z4Var.e);
                            }
                            s4Var.y = null;
                        }
                        lVar.d = null;
                        ((ViewGroup) lVar.b).requestDisallowInterceptTouchEvent(false);
                        lVar.b = null;
                        lVar.c = null;
                        break;
                    }
                }
                break;
            case 22:
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) this.c;
                org.telegram.ui.Cells.r1 r1Var = s1Var2.Vc;
                int g10 = r1Var.g();
                int i13 = s1Var2.dd;
                if (i13 == g10) {
                    s1Var2.gd = false;
                    r1Var.a2 = i13;
                    break;
                } else {
                    s1Var2.s1(i13, g10, this.b);
                    break;
                }
            case 23:
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
            case 24:
                q5 q5Var = (q5) this.c;
                AnimatorSet animatorSet2 = q5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    q5Var.F = null;
                    if (!this.b) {
                        q5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 25:
                o7 o7Var = (o7) this.c;
                ValueAnimator valueAnimator = o7Var.w0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    o7Var.x0 = this.b ? 1.0f : 0.0f;
                    o7Var.w0 = null;
                    break;
                }
                break;
            case 26:
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
            case 27:
                ((ka) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 28:
                id idVar = (id) this.c;
                if (idVar.n != null && (fdVar = idVar.h) != null) {
                    if (this.b) {
                        fdVar.setVisibility(4);
                    } else {
                        idVar.r.setVisibility(4);
                    }
                    idVar.n = null;
                    break;
                }
                break;
            default:
                rn rnVar = (rn) this.c;
                AnimatorSet animatorSet4 = rnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        rnVar.C0.setVisibility(4);
                        break;
                    } else {
                        (rnVar.y0 ? rnVar.z0 : rnVar.x0).setVisibility(4);
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 3:
                super.onAnimationStart(animator);
                try {
                    ((jh.p) this.c).performHapticFeedback(3);
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
