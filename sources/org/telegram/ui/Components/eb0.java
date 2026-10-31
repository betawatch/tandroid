package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eb0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((gb0) this.b).a();
                break;
            case 1:
                ((ob0) this.b).invalidateSelf();
                break;
            case 2:
                ((k00) this.b).invalidateSelf();
                break;
            case 3:
                ((jc0) this.b).d();
                break;
            case 4:
                sc0 sc0Var = (sc0) this.b;
                sc0Var.getClass();
                try {
                    sc0Var.d.M.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 5:
                ((hd0) this.b).k1.start();
                break;
            case 6:
                gz gzVar = ((le0) this.b).c.l0;
                if (gzVar != null) {
                    gzVar.c(false, true, false);
                    break;
                }
                break;
            case 7:
                ne0 ne0Var = (ne0) this.b;
                ne0Var.r = false;
                ne0Var.invalidate();
                break;
            case 8:
                ((pe0) this.b).h = null;
                break;
            case 9:
                pe0 pe0Var = (pe0) ((m5.e) this.b).c;
                pe0Var.d.q0(pe0Var.e, false);
                break;
            case 10:
                org.telegram.ui.mr0 mr0Var = (org.telegram.ui.mr0) this.b;
                if (mr0Var.y) {
                    mr0Var.h("pollPosition();");
                }
                if (mr0Var.G) {
                    org.telegram.messenger.i0.h3(mr0Var.L, 500L);
                    break;
                }
                break;
            case 11:
                ((FrameLayout) this.b).invalidate();
                break;
            case 12:
                jf0 jf0Var = (jf0) ((eg.b) this.b).b;
                jf0Var.d.invalidate();
                jf0Var.e.requestLayout();
                break;
            case 13:
                ((lf0) this.b).f();
                break;
            case 14:
                try {
                    jh0 jh0Var = ((ih0) this.b).b;
                    if (jh0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) jh0Var.getParent()).removeView(jh0Var);
                    }
                    jh0Var.Q.run();
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                mj0 mj0Var = (mj0) this.b;
                mj0Var.x0 = null;
                mj0Var.j();
                lj0 lj0Var = mj0Var.g0;
                if (lj0Var != null) {
                    lj0Var.t();
                    break;
                }
                break;
            case 17:
                ((jj0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                nj0 nj0Var = (nj0) this.b;
                u61 u61Var = nj0Var.n;
                if (u61Var != null) {
                    boolean d02 = u61Var.d0();
                    float S = nj0Var.n.S() / nj0Var.n.U();
                    float f7 = nj0Var.s;
                    if (S < f7) {
                        nj0Var.n.q0((long) (f7 * r2.U()), false);
                    } else if (S > nj0Var.w) {
                        nj0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.i0.h3(nj0Var.y, 16L);
                    }
                }
                nj0Var.invalidate();
                break;
            case 19:
                tk0 tk0Var = (tk0) this.b;
                tk0Var.T1 = null;
                tk0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = tk0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = tk0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    tk0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                gl0 gl0Var = (gl0) this.b;
                if (gl0Var.e0 && gl0Var.j0() != gl0Var.i0) {
                    gl0Var.q0("on screen, settled after start", true);
                    break;
                }
                break;
            case 21:
                gm0 gm0Var = (gm0) this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = gm0Var.d;
                org.telegram.messenger.b8.G(i10).y(arrayList);
                org.telegram.messenger.b8.G(i10).Q(arrayList2);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.b8.G(i10);
                    if (org.telegram.messenger.b8.N(((org.telegram.messenger.jj) arrayList.get(i11)).k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.jj) arrayList.get(i11));
                    }
                }
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    org.telegram.messenger.b8.G(i10);
                    if (!org.telegram.messenger.b8.N(((org.telegram.messenger.jj) arrayList2.get(i12)).k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.jj) arrayList2.get(i12));
                    }
                }
                org.telegram.messenger.i0.g3(new jg(gm0Var, arrayList3, arrayList4, 17));
                break;
            case 22:
                ((im0) this.b).invalidateSelf();
                break;
            case 23:
                ((rm0) this.b).f.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.kx) this.b).s();
                break;
            case 25:
                ((z60) this.b).s();
                break;
            case 26:
                ((in0) this.b).setOverscrolling(false);
                break;
            case 27:
                ((nn0) this.b).getClass();
                break;
            case 28:
                org.telegram.ui.Cells.q1 q1Var = ((qn0) this.b).n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    break;
                }
                break;
            default:
                rn0 rn0Var = (rn0) this.b;
                rn0Var.q = false;
                rn0Var.b.run();
                break;
        }
    }
}
