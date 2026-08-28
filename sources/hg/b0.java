package hg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import ih.f1;
import ih.h2;
import ih.i4;
import ih.k1;
import ih.m9;
import kh.g6;
import kh.l9;
import kh.m4;
import kh.q3;
import kh.wb;
import mh.c3;
import of.i1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g1;
import org.telegram.ui.Cells.e2;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.t5;
import org.telegram.ui.Cells.ya;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.b5;
import org.telegram.ui.fd;
import org.telegram.ui.ho;
import org.telegram.ui.id;
import org.telegram.ui.ja;
import org.telegram.ui.l4;
import org.telegram.ui.qn;
import org.telegram.ui.r4;
import org.telegram.ui.y4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class b0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b0(int i9, Object obj, boolean z10) {
        this.a = i9;
        this.c = obj;
        this.b = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 16:
                ((nh.o) this.c).w = null;
                break;
            case 22:
                e2 e2Var = (e2) this.c;
                AnimatorSet animatorSet = e2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.N = null;
                    break;
                }
                break;
            case 23:
                t5 t5Var = (t5) this.c;
                AnimatorSet animatorSet2 = t5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.F = null;
                    break;
                }
                break;
            case 25:
                ya yaVar = (ya) this.c;
                AnimatorSet animatorSet3 = yaVar.f;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    yaVar.f = null;
                    break;
                }
                break;
            case 27:
                ((id) this.c).n = null;
                break;
            case 28:
                qn qnVar = (qn) this.c;
                AnimatorSet animatorSet4 = qnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    qnVar.D0 = null;
                    break;
                }
                break;
            case 29:
                ((ho) this.c).h = null;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        f1 f1Var;
        View m10;
        RadialProgressView radialProgressView;
        fd fdVar;
        RadialProgressView radialProgressView2;
        switch (this.a) {
            case 0:
                e0 e0Var = (e0) this.c;
                uj0 uj0Var = e0Var.n;
                e0Var.k();
                e0Var.l();
                boolean z10 = this.b;
                e0.a(e0Var, z10);
                e0Var.m.invalidateOutline();
                e0Var.j = z10 ? 1.0f : 0.0f;
                if (z10) {
                    e0Var.k = true;
                    e0Var.a.invalidate();
                }
                uj0Var.setCustomEmojiEnterProgress(Utilities.clamp(e0Var.j, 1.0f, 0.0f));
                if (!z10) {
                    uj0Var.setImportantForAccessibility(0);
                    uj0Var.setSkipDraw(false);
                    e0Var.f();
                    Runtime.getRuntime().gc();
                    int i9 = e0Var.y;
                    uj0Var.setCustomEmojiReactionsBackground((i9 == 4 || i9 == 5) ? false : true);
                }
                e0Var.C = false;
                break;
            case 1:
                ih.r rVar = (ih.r) this.c;
                rVar.W = this.b ? 1.0f : 0.0f;
                rVar.b();
                break;
            case 2:
                h2 h2Var = (h2) this.c;
                gh.f1 f1Var2 = h2Var.c;
                boolean z11 = this.b;
                f1Var2.setAlpha(z11 ? 0.0f : 1.0f);
                h2Var.a.setAlpha(z11 ? 0.0f : 0.5f);
                h2Var.invalidate();
                break;
            case 3:
                k1 k1Var = (k1) this.c;
                k1Var.b.removeViewImmediate(k1Var.d);
                k1Var.f.b();
                if (this.b && (f1Var = k1Var.v) != null && f1Var != f1.S) {
                    f1Var.e();
                }
                k1Var.v = null;
                k1Var.s = true;
                k1Var.C = null;
                k1Var.A = false;
                break;
            case 4:
                m9 m9Var = (m9) this.c;
                m9Var.F0.unlock();
                m9Var.a0 = this.b ? m9Var.w.c : 0.0f;
                i4 currentPeerView = m9Var.j0.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                m9Var.v.invalidate();
                m9Var.r1 = null;
                break;
            case 5:
                jh.u uVar = (jh.u) this.c;
                boolean z12 = this.b;
                uVar.w = z12 ? 1.0f : 0.0f;
                uVar.r.setTranslationY(AndroidUtilities.dp(z12 ? 0.0f : -42.0f));
                uVar.n.setTranslationY(AndroidUtilities.dp(z12 ? 42.0f : 0.0f));
                break;
            case 6:
                jh.q qVar = (jh.q) this.c;
                jh.h hVar = qVar.h;
                jh.i iVar = qVar.f;
                jh.l lVar = qVar.v;
                qVar.b = false;
                boolean z13 = this.b;
                if (z13) {
                    int i10 = qVar.e;
                    qVar.d = i10;
                    qVar.S.y = i10;
                    SharedConfig.setStoriesColumnsCount(i10);
                }
                int h = lVar.h();
                if (z13) {
                    hVar.y1(qVar.d);
                    iVar.a0();
                    if (lVar.h() == h) {
                        AndroidUtilities.updateVisibleRows(iVar);
                    } else {
                        lVar.l();
                    }
                }
                qVar.r.setVisibility(8);
                int i11 = qVar.O;
                if (i11 >= 0) {
                    if (z13 && (m10 = qVar.s.m(i11)) != null) {
                        qVar.P = m10.getTop();
                    }
                    hVar.h1(qVar.O, (-iVar.getPaddingTop()) + qVar.P);
                }
                super.onAnimationEnd(animator);
                break;
            case 7:
                kh.d dVar = (kh.d) this.c;
                dVar.I = this.b ? 1.0f : 0.0f;
                dVar.invalidate();
                break;
            case 8:
                kh.m mVar = (kh.m) this.c;
                boolean z14 = this.b;
                if (!z14) {
                    mVar.r.setVisibility(8);
                    kh.i iVar2 = mVar.I;
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
                kh.z zVar = (kh.z) this.c;
                kh.w wVar = zVar.a;
                boolean z15 = this.b;
                zVar.d = z15 ? 1.0f : 0.0f;
                wVar.invalidate();
                wVar.setVisibility(z15 ? 0 : 8);
                break;
            case 10:
                if (!this.b) {
                    ((q3) this.c).E.setVisibility(8);
                    break;
                }
                break;
            case 11:
                if (!this.b) {
                    ((m4) this.c).b.setVisibility(8);
                    break;
                }
                break;
            case 12:
                g6 g6Var = (g6) this.c;
                if (!this.b) {
                    g6Var.V1.setVisibility(8);
                    g6Var.V1.n();
                    break;
                }
                break;
            case 13:
                l9 l9Var = (l9) this.c;
                if (this.b) {
                    l9Var.setVisibility(8);
                }
                l9Var.c = null;
                break;
            case 14:
                wb wbVar = (wb) this.c;
                if (!this.b) {
                    wbVar.R0.setVisibility(8);
                }
                wbVar.b2 = null;
                break;
            case 15:
                c3 c3Var = (c3) this.c;
                c3Var.J0 = this.b ? 1.0f : 0.0f;
                c3Var.h();
                break;
            case 16:
                nh.o oVar = (nh.o) this.c;
                if (oVar.w != null && (radialProgressView = oVar.x) != null) {
                    if (!this.b) {
                        radialProgressView.setVisibility(4);
                        oVar.s.setVisibility(4);
                    }
                    oVar.w = null;
                    break;
                }
                break;
            case 17:
                i1 i1Var = (i1) this.c;
                boolean z16 = this.b;
                i1Var.e = z16 ? 1.0f : 0.0f;
                i1Var.invalidate();
                int i12 = 0;
                while (i12 < 2) {
                    i1Var.c[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), i1Var.e));
                    i1Var.c[i12].setVisibility((i12 == 1) == z16 ? 0 : 8);
                    i1Var.c[i12].setAlpha(AndroidUtilities.lerp(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, i1Var.e));
                    i1Var.d[i12].setTranslationX(AndroidUtilities.lerp(0, -AndroidUtilities.dp(62.0f), i1Var.e));
                    i1Var.d[i12].setVisibility((i12 == 1) == z16 ? 0 : 8);
                    i1Var.d[i12].setAlpha(AndroidUtilities.lerp(i12 == 0 ? 1.0f : 0.0f, i12 == 1 ? 1.0f : 0.0f, i1Var.e));
                    i12++;
                }
                break;
            case 18:
                g1 g1Var = (g1) this.c;
                float f10 = this.b ? 1.0f : 0.0f;
                g1Var.setTextColor(i0.a.d(f10, -1, -9194260));
                g1Var.setIconColor(i0.a.d(f10, -1, -9194260));
                break;
            case 19:
                l4 l4Var = (l4) this.c;
                boolean z17 = this.b;
                float f11 = z17 ? 1.0f : 0.0f;
                l4Var.U0 = f11;
                l4Var.m0.setTranslationY(((1.0f - f11) * AndroidUtilities.dp(51.0f)) + l4Var.l0);
                if (!z17) {
                    l4Var.m0.setVisibility(8);
                    break;
                }
                break;
            case 20:
                b5 b5Var = (b5) this.c;
                if (!this.b) {
                    b5Var.setVisibility(4);
                    com.google.firebase.messaging.l lVar2 = ((r4) b5Var).C;
                    if (lVar2.a) {
                        lVar2.a = false;
                        if (((r4) lVar2.d).getParent() != null) {
                            ((WindowManager) lVar2.c).removeView((r4) lVar2.d);
                        }
                        r4 r4Var = (r4) lVar2.d;
                        r4Var.A = true;
                        y4 y4Var = r4Var.y;
                        if (y4Var != null) {
                            if (y4Var.g) {
                                y4Var.g = false;
                                y4Var.b.removeObserver(y4Var.a, y4Var.e);
                            }
                            r4Var.y = null;
                        }
                        lVar2.d = null;
                        ((ViewGroup) lVar2.b).requestDisallowInterceptTouchEvent(false);
                        lVar2.b = null;
                        lVar2.c = null;
                        break;
                    }
                }
                break;
            case 21:
                t1 t1Var = (t1) this.c;
                s1 s1Var = t1Var.Vc;
                int g10 = s1Var.g();
                int i13 = t1Var.dd;
                if (i13 == g10) {
                    t1Var.gd = false;
                    s1Var.a2 = i13;
                    break;
                } else {
                    t1Var.t1(i13, g10, this.b);
                    break;
                }
            case 22:
                e2 e2Var = (e2) this.c;
                AnimatorSet animatorSet = e2Var.N;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e2Var.N = null;
                    if (!this.b) {
                        e2Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 23:
                t5 t5Var = (t5) this.c;
                AnimatorSet animatorSet2 = t5Var.F;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    t5Var.F = null;
                    if (!this.b) {
                        t5Var.setBackgroundColor(0);
                        break;
                    }
                }
                break;
            case 24:
                r7 r7Var = (r7) this.c;
                ValueAnimator valueAnimator = r7Var.w0;
                if (valueAnimator != null && valueAnimator.equals(animator)) {
                    r7Var.x0 = this.b ? 1.0f : 0.0f;
                    r7Var.w0 = null;
                    break;
                }
                break;
            case 25:
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
            case 26:
                ((ja) this.c).d.setVisibility(this.b ? 0 : 8);
                break;
            case 27:
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
            case 28:
                qn qnVar = (qn) this.c;
                AnimatorSet animatorSet4 = qnVar.D0;
                if (animatorSet4 != null && animatorSet4.equals(animator)) {
                    if (!this.b) {
                        qnVar.C0.setVisibility(4);
                        break;
                    } else {
                        (qnVar.y0 ? qnVar.z0 : qnVar.x0).setVisibility(4);
                        break;
                    }
                }
                break;
            default:
                ho hoVar = (ho) this.c;
                if (hoVar.h != null && (radialProgressView2 = hoVar.n) != null) {
                    if (!this.b) {
                        radialProgressView2.setVisibility(4);
                        hoVar.f.setVisibility(4);
                    }
                    hoVar.h = null;
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
                    ((ih.r) this.c).performHapticFeedback(3);
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
