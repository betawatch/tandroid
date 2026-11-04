package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jb0(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((lb0) this.b).d();
                break;
            case 1:
                tb0 tb0Var = (tb0) this.b;
                tb0Var.getClass();
                try {
                    tb0Var.d.N.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                ((hc0) this.b).l1.start();
                break;
            case 3:
                py pyVar = ((kd0) this.b).c.m0;
                if (pyVar != null) {
                    pyVar.c(false, true, false);
                    break;
                }
                break;
            case 4:
                md0 md0Var = (md0) this.b;
                md0Var.r = false;
                md0Var.invalidate();
                break;
            case 5:
                ((od0) this.b).h = null;
                break;
            case 6:
                od0 od0Var = (od0) ((mi.h0) this.b).c;
                od0Var.d.q0(od0Var.e, false);
                break;
            case 7:
                org.telegram.ui.tp0 tp0Var = (org.telegram.ui.tp0) this.b;
                if (tp0Var.y) {
                    tp0Var.h("pollPosition();");
                }
                if (tp0Var.H) {
                    org.telegram.messenger.g0.i3(tp0Var.M, 500L);
                    break;
                }
                break;
            case 8:
                ((FrameLayout) this.b).invalidate();
                break;
            case 9:
                ie0 ie0Var = (ie0) ((ee0) this.b).b;
                ie0Var.d.invalidate();
                ie0Var.e.requestLayout();
                break;
            case 10:
                ((ke0) this.b).f();
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
                li0 li0Var = (li0) this.b;
                li0Var.y0 = null;
                li0Var.j();
                ki0 ki0Var = li0Var.h0;
                if (ki0Var != null) {
                    ki0Var.J();
                    break;
                }
                break;
            case 14:
                ((ii0) this.b).I.a.setVisibility(4);
                break;
            case 15:
                mi0 mi0Var = (mi0) this.b;
                m51 m51Var = mi0Var.n;
                if (m51Var != null) {
                    boolean d02 = m51Var.d0();
                    float S = mi0Var.n.S() / mi0Var.n.U();
                    float f10 = mi0Var.s;
                    if (S < f10) {
                        mi0Var.n.q0((long) (f10 * r2.U()), false);
                    } else if (S > mi0Var.w) {
                        mi0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.i3(mi0Var.y, 16L);
                    }
                }
                mi0Var.invalidate();
                break;
            case 16:
                tj0 tj0Var = (tj0) this.b;
                tj0Var.U1 = null;
                tj0Var.T1 = null;
                org.telegram.ui.Cells.y yVar = tj0Var.C1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = tj0Var.C1;
                if (yVar2 != null && yVar2.isStateful()) {
                    tj0Var.C1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 17:
                gk0 gk0Var = (gk0) this.b;
                if (gk0Var.f0 && gk0Var.k0() != gk0Var.j0) {
                    gk0Var.q0("on screen, settled after start", true);
                    break;
                }
                break;
            case 18:
                hl0 hl0Var = (hl0) this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i3 = hl0Var.d;
                org.telegram.messenger.w7.G(i3).y(arrayList);
                org.telegram.messenger.w7.G(i3).Q(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i3);
                    if (org.telegram.messenger.w7.N(((org.telegram.messenger.zi) arrayList.get(i10)).k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.zi) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i3);
                    if (!org.telegram.messenger.w7.N(((org.telegram.messenger.zi) arrayList2.get(i11)).k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.zi) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.h3(new e7(hl0Var, arrayList3, arrayList4, 21));
                break;
            case 19:
                ((jl0) this.b).invalidateSelf();
                break;
            case 20:
                ((tl0) this.b).f.setVisibility(8);
                break;
            case 21:
                ((org.telegram.ui.cw) this.b).q();
                break;
            case 22:
                ((f60) this.b).s();
                break;
            case 23:
                ((km0) this.b).setOverscrolling(false);
                break;
            case 24:
                ((pm0) this.b).getClass();
                break;
            case 25:
                org.telegram.ui.Cells.q1 q1Var = ((sm0) this.b).n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    break;
                }
                break;
            case 26:
                tm0 tm0Var = (tm0) this.b;
                tm0Var.q = false;
                tm0Var.b.run();
                break;
            case 27:
                ((vn0) this.b).b.b1(1);
                break;
            case 28:
                ro0 ro0Var = (ro0) this.b;
                gi.i1[] i1VarArr = ro0Var.a;
                if (ro0Var.b != 1) {
                    for (gi.i1 i1Var : i1VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var = (org.telegram.ui.ActionBar.k5) i1Var.e;
                        k5Var.setAlpha(1.0f);
                        k5Var.setScaleX(1.0f);
                        k5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.k5) i1Var.f).setAlpha(0.0f);
                    }
                    ro0Var.F = false;
                    org.telegram.messenger.g0.i3(ro0Var.H, 4000L);
                    break;
                } else {
                    ro0Var.F = !ro0Var.F;
                    for (gi.i1 i1Var2 : i1VarArr) {
                        org.telegram.ui.ActionBar.k5 k5Var2 = (org.telegram.ui.ActionBar.k5) i1Var2.e;
                        org.telegram.ui.ActionBar.k5 k5Var3 = (org.telegram.ui.ActionBar.k5) i1Var2.f;
                        k5Var2.setPivotX(0.0f);
                        k5Var3.setPivotX(0.0f);
                        if (ro0Var.F) {
                            k5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            k5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            k5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            k5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    org.telegram.messenger.g0.i3(ro0Var.H, 4000L);
                    break;
                }
            default:
                ((gi.i1) this.b).setVisibility(8);
                break;
        }
    }
}
