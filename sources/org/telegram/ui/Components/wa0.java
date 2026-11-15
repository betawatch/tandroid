package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class wa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wa0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((hi.u) this.b).invalidateSelf();
                break;
            case 1:
                ((a00) this.b).invalidateSelf();
                break;
            case 2:
                ((qb0) this.b).d();
                break;
            case 3:
                zb0 zb0Var = (zb0) this.b;
                zb0Var.getClass();
                try {
                    zb0Var.d.N.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((nc0) this.b).o1.start();
                break;
            case 5:
                wy wyVar = ((qd0) this.b).c.m0;
                if (wyVar != null) {
                    wyVar.c(false, true, false);
                    break;
                }
                break;
            case 6:
                sd0 sd0Var = (sd0) this.b;
                sd0Var.r = false;
                sd0Var.invalidate();
                break;
            case 7:
                ((ud0) this.b).h = null;
                break;
            case 8:
                ud0 ud0Var = (ud0) ((ji.j) this.b).c;
                ud0Var.d.q0(ud0Var.e, false);
                break;
            case 9:
                org.telegram.ui.bq0 bq0Var = (org.telegram.ui.bq0) this.b;
                if (bq0Var.y) {
                    bq0Var.h("pollPosition();");
                }
                if (bq0Var.H) {
                    org.telegram.messenger.g0.i3(bq0Var.M, 500L);
                    break;
                }
                break;
            case 10:
                ((le0) this.b).f();
                break;
            case 11:
                try {
                    kg0 kg0Var = ((jg0) this.b).b;
                    if (kg0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) kg0Var.getParent()).removeView(kg0Var);
                    }
                    kg0Var.R.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                ((RLottieNative) this.b).d();
                break;
            case 13:
                mi0 mi0Var = (mi0) this.b;
                mi0Var.y0 = null;
                mi0Var.j();
                li0 li0Var = mi0Var.h0;
                if (li0Var != null) {
                    li0Var.K();
                    break;
                }
                break;
            case 14:
                ((ji0) this.b).I.a.setVisibility(4);
                break;
            case 15:
                ((me) this.b).a();
                break;
            case 16:
                oi0 oi0Var = (oi0) this.b;
                u51 u51Var = oi0Var.n;
                if (u51Var != null) {
                    boolean d02 = u51Var.d0();
                    float S = oi0Var.n.S() / oi0Var.n.U();
                    float f10 = oi0Var.s;
                    if (S < f10) {
                        oi0Var.n.q0((long) (f10 * r2.U()), false);
                    } else if (S > oi0Var.w || (oi0Var.d0 && !d02 && oi0Var.x && oi0Var.n.S() >= oi0Var.n.U() - 50)) {
                        oi0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.i3(oi0Var.y, 16L);
                    }
                    if (oi0Var.d0) {
                        oi0Var.i(true);
                    }
                }
                oi0Var.invalidate();
                break;
            case 17:
                uj0 uj0Var = (uj0) this.b;
                uj0Var.U1 = null;
                uj0Var.T1 = null;
                org.telegram.ui.Cells.y yVar = uj0Var.C1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = uj0Var.C1;
                if (yVar2 != null && yVar2.isStateful()) {
                    uj0Var.C1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 18:
                hk0 hk0Var = (hk0) this.b;
                if (hk0Var.f0 && hk0Var.k0() != hk0Var.j0) {
                    hk0Var.q0("on screen, settled after start", true);
                    break;
                }
                break;
            case 19:
                il0 il0Var = (il0) this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = il0Var.d;
                org.telegram.messenger.w7.G(i7).y(arrayList);
                org.telegram.messenger.w7.G(i7).P(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i7);
                    if (org.telegram.messenger.w7.M(((org.telegram.messenger.gj) arrayList.get(i10)).k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.gj) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i7);
                    if (!org.telegram.messenger.w7.M(((org.telegram.messenger.gj) arrayList2.get(i11)).k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.gj) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.h3(new yf(il0Var, arrayList3, arrayList4, 19));
                break;
            case 20:
                ((kl0) this.b).invalidateSelf();
                break;
            case 21:
                ((ul0) this.b).f.setVisibility(8);
                break;
            case 22:
                ((org.telegram.ui.hw) this.b).p();
                break;
            case 23:
                ((m60) this.b).s();
                break;
            case 24:
                ((lm0) this.b).setOverscrolling(false);
                break;
            case 25:
                ((qm0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.q1 q1Var = ((tm0) this.b).n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    break;
                }
                break;
            case 27:
                um0 um0Var = (um0) this.b;
                um0Var.q = false;
                um0Var.b.run();
                break;
            case 28:
                ((wn0) this.b).b.b1(1);
                break;
            default:
                to0 to0Var = (to0) this.b;
                hi.k1[] k1VarArr = to0Var.a;
                if (to0Var.b != 1) {
                    for (hi.k1 k1Var : k1VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) k1Var.e;
                        j5Var.setAlpha(1.0f);
                        j5Var.setScaleX(1.0f);
                        j5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.j5) k1Var.f).setAlpha(0.0f);
                    }
                    to0Var.F = false;
                    org.telegram.messenger.g0.i3(to0Var.H, 4000L);
                    break;
                } else {
                    to0Var.F = !to0Var.F;
                    for (hi.k1 k1Var2 : k1VarArr) {
                        org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) k1Var2.e;
                        org.telegram.ui.ActionBar.j5 j5Var3 = (org.telegram.ui.ActionBar.j5) k1Var2.f;
                        j5Var2.setPivotX(0.0f);
                        j5Var3.setPivotX(0.0f);
                        if (to0Var.F) {
                            j5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            j5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            j5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            j5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    org.telegram.messenger.g0.i3(to0Var.H, 4000L);
                    break;
                }
        }
    }
}
