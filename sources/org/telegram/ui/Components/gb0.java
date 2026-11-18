package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gb0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((hi.v) this.b).invalidateSelf();
                break;
            case 1:
                ((h00) this.b).invalidateSelf();
                break;
            case 2:
                ((bc0) this.b).d();
                break;
            case 3:
                jc0 jc0Var = (jc0) this.b;
                jc0Var.getClass();
                try {
                    jc0Var.d.N.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 4:
                ((xc0) this.b).o1.start();
                break;
            case 5:
                cz czVar = ((ae0) this.b).c.m0;
                if (czVar != null) {
                    czVar.c(false, true, false);
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
                ee0 ee0Var = (ee0) ((ji.j) this.b).c;
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
                ((ve0) this.b).f();
                break;
            case 11:
                try {
                    ug0 ug0Var = ((tg0) this.b).b;
                    if (ug0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ug0Var.getParent()).removeView(ug0Var);
                    }
                    ug0Var.R.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 12:
                ((RLottieNative) this.b).d();
                break;
            case 13:
                vi0 vi0Var = (vi0) this.b;
                vi0Var.y0 = null;
                vi0Var.j();
                ui0 ui0Var = vi0Var.h0;
                if (ui0Var != null) {
                    ui0Var.z();
                    break;
                }
                break;
            case 14:
                ((si0) this.b).I.a.setVisibility(4);
                break;
            case 15:
                ((ve) this.b).a();
                break;
            case 16:
                xi0 xi0Var = (xi0) this.b;
                f61 f61Var = xi0Var.n;
                if (f61Var != null) {
                    boolean d02 = f61Var.d0();
                    float S = xi0Var.n.S() / xi0Var.n.U();
                    float f10 = xi0Var.s;
                    if (S < f10) {
                        xi0Var.n.q0((long) (f10 * r2.U()), false);
                    } else if (S > xi0Var.w || (xi0Var.d0 && !d02 && xi0Var.x && xi0Var.n.S() >= xi0Var.n.U() - 50)) {
                        xi0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.h3(xi0Var.y, 16L);
                    }
                    if (xi0Var.d0) {
                        xi0Var.i(true);
                    }
                }
                xi0Var.invalidate();
                break;
            case 17:
                ck0 ck0Var = (ck0) this.b;
                ck0Var.U1 = null;
                ck0Var.T1 = null;
                org.telegram.ui.Cells.y yVar = ck0Var.C1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = ck0Var.C1;
                if (yVar2 != null && yVar2.isStateful()) {
                    ck0Var.C1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 18:
                pk0 pk0Var = (pk0) this.b;
                if (pk0Var.f0 && pk0Var.k0() != pk0Var.j0) {
                    pk0Var.q0("on screen, settled after start", true);
                    break;
                }
                break;
            case 19:
                ql0 ql0Var = (ql0) this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = ql0Var.d;
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
                org.telegram.messenger.g0.g3(new k7(ql0Var, arrayList3, arrayList4, 22));
                break;
            case 20:
                ((sl0) this.b).invalidateSelf();
                break;
            case 21:
                ((cm0) this.b).f.setVisibility(8);
                break;
            case 22:
                ((org.telegram.ui.kw) this.b).o();
                break;
            case 23:
                ((y60) this.b).s();
                break;
            case 24:
                ((tm0) this.b).setOverscrolling(false);
                break;
            case 25:
                ((ym0) this.b).getClass();
                break;
            case 26:
                org.telegram.ui.Cells.q1 q1Var = ((bn0) this.b).n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    break;
                }
                break;
            case 27:
                cn0 cn0Var = (cn0) this.b;
                cn0Var.q = false;
                cn0Var.b.run();
                break;
            case 28:
                ((fo0) this.b).b.c1(1);
                break;
            default:
                cp0 cp0Var = (cp0) this.b;
                hi.k1[] k1VarArr = cp0Var.a;
                if (cp0Var.b != 1) {
                    for (hi.k1 k1Var : k1VarArr) {
                        org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) k1Var.e;
                        n5Var.setAlpha(1.0f);
                        n5Var.setScaleX(1.0f);
                        n5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.n5) k1Var.f).setAlpha(0.0f);
                    }
                    cp0Var.F = false;
                    org.telegram.messenger.g0.h3(cp0Var.H, 4000L);
                    break;
                } else {
                    cp0Var.F = !cp0Var.F;
                    for (hi.k1 k1Var2 : k1VarArr) {
                        org.telegram.ui.ActionBar.n5 n5Var2 = (org.telegram.ui.ActionBar.n5) k1Var2.e;
                        org.telegram.ui.ActionBar.n5 n5Var3 = (org.telegram.ui.ActionBar.n5) k1Var2.f;
                        n5Var2.setPivotX(0.0f);
                        n5Var3.setPivotX(0.0f);
                        if (cp0Var.F) {
                            n5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            n5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            n5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            n5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    org.telegram.messenger.g0.h3(cp0Var.H, 4000L);
                    break;
                }
        }
    }
}
