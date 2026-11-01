package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                org.telegram.ui.lr0 lr0Var = (org.telegram.ui.lr0) this.b;
                if (lr0Var.y) {
                    lr0Var.h("pollPosition();");
                }
                if (lr0Var.G) {
                    org.telegram.messenger.i0.h3(lr0Var.L, 500L);
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
                    kh0 kh0Var = ((jh0) this.b).b;
                    if (kh0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) kh0Var.getParent()).removeView(kh0Var);
                    }
                    kh0Var.Q.run();
                    break;
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                    return;
                }
            case 15:
                ((RLottieNative) this.b).d();
                break;
            case 16:
                nj0 nj0Var = (nj0) this.b;
                nj0Var.x0 = null;
                nj0Var.j();
                mj0 mj0Var = nj0Var.g0;
                if (mj0Var != null) {
                    mj0Var.t();
                    break;
                }
                break;
            case 17:
                ((kj0) this.b).H.a.setVisibility(4);
                break;
            case 18:
                oj0 oj0Var = (oj0) this.b;
                v61 v61Var = oj0Var.n;
                if (v61Var != null) {
                    boolean d02 = v61Var.d0();
                    float S = oj0Var.n.S() / oj0Var.n.U();
                    float f7 = oj0Var.s;
                    if (S < f7) {
                        oj0Var.n.q0((long) (f7 * r2.U()), false);
                    } else if (S > oj0Var.w) {
                        oj0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.i0.h3(oj0Var.y, 16L);
                    }
                }
                oj0Var.invalidate();
                break;
            case 19:
                uk0 uk0Var = (uk0) this.b;
                uk0Var.T1 = null;
                uk0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = uk0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = uk0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    uk0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 20:
                hl0 hl0Var = (hl0) this.b;
                if (hl0Var.e0 && hl0Var.j0() != hl0Var.i0) {
                    hl0Var.q0("on screen, settled after start", true);
                    break;
                }
                break;
            case 21:
                hm0 hm0Var = (hm0) this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i10 = hm0Var.d;
                org.telegram.messenger.b8.G(i10).y(arrayList);
                org.telegram.messenger.b8.G(i10).Q(arrayList2);
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    org.telegram.messenger.b8.G(i10);
                    if (org.telegram.messenger.b8.N(((org.telegram.messenger.kj) arrayList.get(i11)).k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.kj) arrayList.get(i11));
                    }
                }
                for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                    org.telegram.messenger.b8.G(i10);
                    if (!org.telegram.messenger.b8.N(((org.telegram.messenger.kj) arrayList2.get(i12)).k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.kj) arrayList2.get(i12));
                    }
                }
                org.telegram.messenger.i0.g3(new jg(hm0Var, arrayList3, arrayList4, 17));
                break;
            case 22:
                ((jm0) this.b).invalidateSelf();
                break;
            case 23:
                ((sm0) this.b).f.setVisibility(8);
                break;
            case 24:
                ((org.telegram.ui.jx) this.b).s();
                break;
            case 25:
                ((z60) this.b).s();
                break;
            case 26:
                ((jn0) this.b).setOverscrolling(false);
                break;
            case 27:
                ((on0) this.b).getClass();
                break;
            case 28:
                org.telegram.ui.Cells.q1 q1Var = ((rn0) this.b).n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    break;
                }
                break;
            default:
                sn0 sn0Var = (sn0) this.b;
                sn0Var.q = false;
                sn0Var.b.run();
                break;
        }
    }
}
