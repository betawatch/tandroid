package ei;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.ui.Components.da;
import org.telegram.ui.ls0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v7 implements b5.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ v7(int i3, KeyEvent.Callback callback, Object obj) {
        this.a = i3;
        this.c = callback;
        this.b = obj;
    }

    @Override // b5.h
    public final void a(int i3) {
        int i10 = this.a;
        KeyEvent.Callback callback = this.c;
        switch (i10) {
            case 0:
                r9 r9Var = (r9) this.b;
                x xVar = (x) callback;
                j4 currentPeerView = xVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    ((i9) xVar.C0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    xVar.F();
                    n9 n9Var = r9Var.u0;
                    if (n9Var != null) {
                        if (i3 >= 3) {
                            if (i3 > xVar.A0.b() - 4) {
                                r9Var.u0.c(true);
                                break;
                            }
                        } else {
                            n9Var.c(false);
                            break;
                        }
                    }
                }
                break;
            default:
                vg.v0 v0Var = (vg.v0) callback;
                ArrayList arrayList = v0Var.l1;
                if (((ls0) arrayList.get(i3)).a == 0) {
                    v0Var.F1.setTitle(bd.M0(2131751350, null));
                    v0Var.F1.requestLayout();
                } else if (((ls0) arrayList.get(i3)).a == 14) {
                    v0Var.F1.setTitle(bd.M0(2131743815, null));
                    v0Var.F1.requestLayout();
                } else if (((ls0) arrayList.get(i3)).a == 40) {
                    v0Var.F1.setTitle(bd.M0(2131750838, null));
                    v0Var.F1.requestLayout();
                } else if (((ls0) arrayList.get(i3)).a == 28) {
                    v0Var.F1.setTitle(bd.M0(2131744262, null));
                    v0Var.F1.requestLayout();
                }
                d();
                break;
        }
    }

    @Override // b5.h
    public final void b(float f10, int i3, int i10) {
        switch (this.a) {
            case 0:
                x xVar = (x) this.c;
                xVar.J0 = i3;
                xVar.K0 = i10 > 0 ? i3 + 1 : i3 - 1;
                xVar.L0 = f10;
                long j10 = h10.i(xVar.z0).n;
                int i11 = xVar.J0;
                if (i11 >= 0 && (xVar.y0 != null ? xVar.x0 == j10 : !(i11 >= xVar.B0.size() || ((Long) xVar.B0.get(xVar.J0)).longValue() != j10))) {
                    ((i9) xVar.C0).d(1.0f - xVar.L0);
                    break;
                } else {
                    int i12 = xVar.K0;
                    if (i12 >= 0 && (xVar.y0 != null ? xVar.x0 == j10 : !(i12 >= xVar.B0.size() || ((Long) xVar.B0.get(xVar.K0)).longValue() != j10))) {
                        ((i9) xVar.C0).d(xVar.L0);
                        break;
                    } else {
                        ((i9) xVar.C0).d(0.0f);
                        break;
                    }
                }
                break;
            default:
                da daVar = (da) this.b;
                daVar.b = f10;
                daVar.c = i3;
                daVar.invalidate();
                vg.v0 v0Var = (vg.v0) this.c;
                v0Var.y1 = i3;
                v0Var.z1 = i10 > 0 ? i3 + 1 : i3 - 1;
                v0Var.A1 = f10;
                d();
                break;
        }
    }

    @Override // b5.h
    public final void c(int i3) {
        switch (this.a) {
            case 0:
                x xVar = (x) this.c;
                ((i9) xVar.C0).d.d0();
                Runnable runnable = xVar.H0;
                if (runnable != null && i3 == 0) {
                    runnable.run();
                    xVar.H0 = null;
                }
                xVar.G0 = i3;
                r9 r9Var = ((g9) xVar).S0;
                if (r9Var.o0.G0 == 1) {
                    org.telegram.messenger.g0.r(r9Var.c1);
                    break;
                }
                break;
        }
    }

    public void d() {
        int i3;
        int i10;
        vg.v0 v0Var = (vg.v0) this.c;
        vg.t0 t0Var = v0Var.p1;
        ArrayList arrayList = v0Var.l1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= t0Var.getChildCount()) {
                break;
            }
            vg.u0 u0Var = (vg.u0) t0Var.getChildAt(i11);
            if (!v0Var.t1 || !(u0Var.f instanceof vg.m0)) {
                int i12 = u0Var.a;
                vg.k0 k0Var = u0Var.e;
                if (i12 == v0Var.y1) {
                    f10 = (-u0Var.getMeasuredWidth()) * v0Var.A1;
                    k0Var.setOffset(f10);
                } else if (i12 == v0Var.z1) {
                    f10 = ((-u0Var.getMeasuredWidth()) * v0Var.A1) + u0Var.getMeasuredWidth();
                    k0Var.setOffset(f10);
                } else {
                    k0Var.setOffset(u0Var.getMeasuredWidth());
                }
            }
            if (u0Var.f instanceof vg.m0) {
                u0Var.setTranslationX(-f10);
                u0Var.b.setTranslationX(f10);
                u0Var.c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = v0Var.y1;
        boolean z10 = i13 >= 0 && i13 < arrayList.size() && ((i10 = ((ls0) arrayList.get(v0Var.y1)).a) == 0 || i10 == 14 || i10 == 28);
        int i14 = v0Var.z1;
        boolean z11 = i14 >= 0 && i14 < arrayList.size() && ((i3 = ((ls0) arrayList.get(v0Var.z1)).a) == 0 || i3 == 14 || i3 == 28);
        if (z10 && z11) {
            v0Var.n1 = 1.0f;
            float f11 = v0Var.A1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            v0Var.m1 = f11;
            v0Var.o1 = true;
        } else if (z10) {
            float f12 = 1.0f - v0Var.A1;
            v0Var.m1 = f12;
            v0Var.n1 = f12;
            v0Var.o1 = true;
        } else if (z11) {
            float f13 = v0Var.A1;
            v0Var.m1 = f13;
            v0Var.n1 = f13;
            v0Var.o1 = false;
        } else {
            v0Var.m1 = 0.0f;
            v0Var.n1 = 0.0f;
            v0Var.o1 = true;
        }
        int i15 = (int) ((1.0f - v0Var.m1) * 255.0f);
        if (i15 != v0Var.C1) {
            v0Var.C1 = i15;
            v0Var.q1.invalidate();
            org.telegram.messenger.g0.h3(new r4.u(this, 20));
        }
    }

    private final void e(int i3) {
    }
}
