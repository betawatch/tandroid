package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class eb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eb0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((hi.d0) this.b).invalidateSelf();
                break;
            case 1:
                ((h00) this.b).invalidateSelf();
                break;
            case 2:
                ((zb0) this.b).d();
                break;
            case 3:
                ic0 ic0Var = (ic0) this.b;
                ic0Var.getClass();
                try {
                    ic0Var.d.N.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((wc0) this.b).o1.start();
                break;
            case 5:
                bz bzVar = ((ae0) this.b).c.m0;
                if (bzVar != null) {
                    bzVar.c(false, true, false);
                    break;
                }
                break;
            case 6:
                ce0 ce0Var = (ce0) this.b;
                ce0Var.r = false;
                ce0Var.invalidate();
                break;
            case 7:
                ((ee0) this.b).h = null;
                break;
            case 8:
                ee0 ee0Var = (ee0) ((j6.k) this.b).c;
                ee0Var.d.q0(ee0Var.e, false);
                break;
            case 9:
                org.telegram.ui.dq0 dq0Var = (org.telegram.ui.dq0) this.b;
                if (dq0Var.y) {
                    dq0Var.h("pollPosition();");
                }
                if (dq0Var.H) {
                    org.telegram.messenger.g0.h3(dq0Var.M, 500L);
                    break;
                }
                break;
            case 10:
                ((we0) this.b).f();
                break;
            case 11:
                try {
                    vg0 vg0Var = ((ug0) this.b).b;
                    if (vg0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) vg0Var.getParent()).removeView(vg0Var);
                    }
                    vg0Var.R.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                ((RLottieNative) this.b).d();
                break;
            case 13:
                xi0 xi0Var = (xi0) this.b;
                xi0Var.y0 = null;
                xi0Var.j();
                wi0 wi0Var = xi0Var.h0;
                if (wi0Var != null) {
                    wi0Var.r();
                    break;
                }
                break;
            case 14:
                ((ui0) this.b).I.a.setVisibility(4);
                break;
            case 15:
                ((we) this.b).a();
                break;
            case 16:
                zi0 zi0Var = (zi0) this.b;
                h61 h61Var = zi0Var.n;
                if (h61Var != null) {
                    boolean d02 = h61Var.d0();
                    float S = zi0Var.n.S() / zi0Var.n.U();
                    float f10 = zi0Var.s;
                    if (S < f10) {
                        zi0Var.n.q0((long) (f10 * r2.U()), false);
                    } else if (S > zi0Var.w || (zi0Var.d0 && !d02 && zi0Var.x && zi0Var.n.S() >= zi0Var.n.U() - 50)) {
                        zi0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.h3(zi0Var.y, 16L);
                    }
                    if (zi0Var.d0) {
                        zi0Var.i(true);
                    }
                }
                zi0Var.invalidate();
                break;
            case 17:
                ek0 ek0Var = (ek0) this.b;
                ek0Var.U1 = null;
                ek0Var.T1 = null;
                org.telegram.ui.Cells.y yVar = ek0Var.C1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = ek0Var.C1;
                if (yVar2 != null && yVar2.isStateful()) {
                    ek0Var.C1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 18:
                rk0 rk0Var = (rk0) this.b;
                if (rk0Var.f0 && rk0Var.k0() != rk0Var.j0) {
                    rk0Var.q0("on screen, settled after start", true);
                    break;
                }
                break;
            case 19:
                sl0 sl0Var = (sl0) this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = sl0Var.d;
                org.telegram.messenger.w7.G(i7).y(arrayList);
                org.telegram.messenger.w7.G(i7).P(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i7);
                    if (org.telegram.messenger.w7.M(((org.telegram.messenger.fj) arrayList.get(i10)).k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.fj) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i7);
                    if (!org.telegram.messenger.w7.M(((org.telegram.messenger.fj) arrayList2.get(i11)).k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.fj) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.fa(sl0Var, arrayList3, arrayList4, 24));
                break;
            case 20:
                ((ul0) this.b).invalidateSelf();
                break;
            case 21:
                ((em0) this.b).f.setVisibility(8);
                break;
            case 22:
                ((org.telegram.ui.jw) this.b).p();
                break;
            case 23:
                ((x60) this.b).s();
                break;
            case 24:
                ((vm0) this.b).setOverscrolling(false);
                break;
            case 25:
                ((an0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.r1 r1Var = ((dn0) this.b).n;
                if (r1Var != null) {
                    r1Var.invalidate();
                    break;
                }
                break;
            case 27:
                en0 en0Var = (en0) this.b;
                en0Var.q = false;
                en0Var.b.run();
                break;
            case 28:
                ((go0) this.b).b.c1(1);
                break;
            default:
                dp0 dp0Var = (dp0) this.b;
                hi.s1[] s1VarArr = dp0Var.a;
                if (dp0Var.b != 1) {
                    for (hi.s1 s1Var : s1VarArr) {
                        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) s1Var.e;
                        n5Var.setAlpha(1.0f);
                        n5Var.setScaleX(1.0f);
                        n5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.n5) s1Var.f).setAlpha(0.0f);
                    }
                    dp0Var.F = false;
                    org.telegram.messenger.g0.h3(dp0Var.H, 4000L);
                    break;
                } else {
                    dp0Var.F = !dp0Var.F;
                    for (hi.s1 s1Var2 : s1VarArr) {
                        org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) s1Var2.e;
                        org.telegram.ui.ActionBar.n5 n5Var3 = (org.telegram.ui.ActionBar.n5) s1Var2.f;
                        n5Var2.setPivotX(0.0f);
                        n5Var3.setPivotX(0.0f);
                        if (dp0Var.F) {
                            n5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            n5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            n5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            n5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    org.telegram.messenger.g0.h3(dp0Var.H, 4000L);
                    break;
                }
        }
    }
}
