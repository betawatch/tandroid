package org.telegram.ui.Components;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.StateSet;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pb0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((rb0) this.b).d();
                break;
            case 1:
                zb0 zb0Var = (zb0) this.b;
                zb0Var.getClass();
                try {
                    zb0Var.d.M.performHapticFeedback(3, 2);
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 2:
                ((nc0) this.b).k1.start();
                break;
            case 3:
                sy syVar = ((qd0) this.b).c.l0;
                if (syVar != null) {
                    syVar.c(false, true, false);
                    break;
                }
                break;
            case 4:
                sd0 sd0Var = (sd0) this.b;
                sd0Var.r = false;
                sd0Var.invalidate();
                break;
            case 5:
                ((vd0) this.b).h = null;
                break;
            case 6:
                vd0 vd0Var = (vd0) ((j2.n) this.b).c;
                vd0Var.d.q0(vd0Var.e, false);
                break;
            case 7:
                org.telegram.ui.eq0 eq0Var = (org.telegram.ui.eq0) this.b;
                if (eq0Var.y) {
                    eq0Var.h("pollPosition();");
                }
                if (eq0Var.G) {
                    org.telegram.messenger.g0.i3(eq0Var.L, 500L);
                    break;
                }
                break;
            case 8:
                ((je0) this.b).f();
                break;
            case 9:
                try {
                    ig0 ig0Var = ((hg0) this.b).b;
                    if (ig0Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) ig0Var.getParent()).removeView(ig0Var);
                    }
                    ig0Var.Q.run();
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 10:
                ((RLottieNative) this.b).d();
                break;
            case 11:
                ji0 ji0Var = (ji0) this.b;
                ji0Var.x0 = null;
                ji0Var.j();
                ii0 ii0Var = ji0Var.g0;
                if (ii0Var != null) {
                    ii0Var.M();
                    break;
                }
                break;
            case 12:
                ((gi0) this.b).H.a.setVisibility(4);
                break;
            case 13:
                ki0 ki0Var = (ki0) this.b;
                u51 u51Var = ki0Var.n;
                if (u51Var != null) {
                    boolean d02 = u51Var.d0();
                    float S = ki0Var.n.S() / ki0Var.n.U();
                    float f10 = ki0Var.s;
                    if (S < f10) {
                        ki0Var.n.q0((long) (f10 * r2.U()), false);
                    } else if (S > ki0Var.w) {
                        ki0Var.setPlaying(false);
                        d02 = false;
                    }
                    if (d02) {
                        org.telegram.messenger.g0.i3(ki0Var.y, 16L);
                    }
                }
                ki0Var.invalidate();
                break;
            case 14:
                qj0 qj0Var = (qj0) this.b;
                qj0Var.T1 = null;
                qj0Var.S1 = null;
                org.telegram.ui.Cells.y yVar = qj0Var.B1;
                if (yVar != null) {
                    Drawable current = yVar.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                org.telegram.ui.Cells.y yVar2 = qj0Var.B1;
                if (yVar2 != null && yVar2.isStateful()) {
                    qj0Var.B1.setState(StateSet.NOTHING);
                    break;
                }
                break;
            case 15:
                dk0 dk0Var = (dk0) this.b;
                if (dk0Var.e0 && dk0Var.k0() != dk0Var.i0) {
                    dk0Var.q0("on screen, settled after start", true);
                    break;
                }
                break;
            case 16:
                el0 el0Var = (el0) this.b;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                int i7 = el0Var.d;
                org.telegram.messenger.w7.G(i7).y(arrayList);
                org.telegram.messenger.w7.G(i7).P(arrayList2);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    org.telegram.messenger.w7.G(i7);
                    if (org.telegram.messenger.w7.M(((org.telegram.messenger.ij) arrayList.get(i10)).k, false, true).exists()) {
                        arrayList3.add((org.telegram.messenger.ij) arrayList.get(i10));
                    }
                }
                for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                    org.telegram.messenger.w7.G(i7);
                    if (!org.telegram.messenger.w7.M(((org.telegram.messenger.ij) arrayList2.get(i11)).k, false, true).exists()) {
                        arrayList4.add((org.telegram.messenger.ij) arrayList2.get(i11));
                    }
                }
                org.telegram.messenger.g0.h3(new ng(el0Var, arrayList3, arrayList4, 17));
                break;
            case 17:
                ((gl0) this.b).invalidateSelf();
                break;
            case 18:
                ((rl0) this.b).f.setVisibility(8);
                break;
            case 19:
                ((org.telegram.ui.hw) this.b).s();
                break;
            case 20:
                ((l60) this.b).s();
                break;
            case 21:
                ((im0) this.b).setOverscrolling(false);
                break;
            case 22:
                ((nm0) this.b).getClass();
                break;
            case 23:
                org.telegram.ui.Cells.q1 q1Var = ((qm0) this.b).n;
                if (q1Var != null) {
                    q1Var.invalidate();
                    break;
                }
                break;
            case 24:
                rm0 rm0Var = (rm0) this.b;
                rm0Var.q = false;
                rm0Var.b.run();
                break;
            case 25:
                ((un0) this.b).b.b1(1);
                break;
            case 26:
                qo0 qo0Var = (qo0) this.b;
                fi.i1[] i1VarArr = qo0Var.a;
                if (qo0Var.b != 1) {
                    for (fi.i1 i1Var : i1VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) i1Var.e;
                        l5Var.setAlpha(1.0f);
                        l5Var.setScaleX(1.0f);
                        l5Var.setScaleY(1.0f);
                        ((org.telegram.ui.ActionBar.l5) i1Var.f).setAlpha(0.0f);
                    }
                    qo0Var.E = false;
                    org.telegram.messenger.g0.i3(qo0Var.G, 4000L);
                    break;
                } else {
                    qo0Var.E = !qo0Var.E;
                    for (fi.i1 i1Var2 : i1VarArr) {
                        org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) i1Var2.e;
                        org.telegram.ui.ActionBar.l5 l5Var3 = (org.telegram.ui.ActionBar.l5) i1Var2.f;
                        l5Var2.setPivotX(0.0f);
                        l5Var3.setPivotX(0.0f);
                        if (qo0Var.E) {
                            l5Var2.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                            l5Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                        } else {
                            l5Var2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                            l5Var3.animate().alpha(0.0f).scaleX(0.98f).scaleY(0.98f).setDuration(150L).start();
                        }
                    }
                    org.telegram.messenger.g0.i3(qo0Var.G, 4000L);
                    break;
                }
            case 27:
                ((fi.i1) this.b).setVisibility(8);
                break;
            case 28:
                zs0 zs0Var = ((tp0) this.b).G;
                if (zs0Var.E1) {
                    zs0Var.q1(false);
                    break;
                }
                break;
            default:
                ((dr0) this.b).a.B1(false);
                break;
        }
    }
}
