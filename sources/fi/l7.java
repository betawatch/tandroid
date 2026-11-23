package fi;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.ui.Components.ha;
import org.telegram.ui.vs0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class l7 implements c5.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ l7(KeyEvent.Callback callback, Object obj, int i7) {
        this.a = i7;
        this.c = callback;
        this.b = obj;
    }

    @Override // c5.h
    public final void a(int i7) {
        int i10 = this.a;
        KeyEvent.Callback callback = this.c;
        switch (i10) {
            case 0:
                f9 f9Var = (f9) this.b;
                w wVar = (w) callback;
                z3 currentPeerView = wVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    ((w8) wVar.C0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    wVar.F();
                    b9 b9Var = f9Var.u0;
                    if (b9Var != null) {
                        if (i7 >= 3) {
                            if (i7 > wVar.A0.b() - 4) {
                                f9Var.u0.c(true);
                                break;
                            }
                        } else {
                            b9Var.c(false);
                            break;
                        }
                    }
                }
                break;
            default:
                ug.y0 y0Var = (ug.y0) callback;
                ArrayList arrayList = y0Var.o1;
                if (((vs0) arrayList.get(i7)).a == 0) {
                    y0Var.I1.setTitle(gd.N0(2131751337, null));
                    y0Var.I1.requestLayout();
                } else if (((vs0) arrayList.get(i7)).a == 14) {
                    y0Var.I1.setTitle(gd.N0(2131743558, null));
                    y0Var.I1.requestLayout();
                } else if (((vs0) arrayList.get(i7)).a == 40) {
                    y0Var.I1.setTitle(gd.N0(2131750825, null));
                    y0Var.I1.requestLayout();
                } else if (((vs0) arrayList.get(i7)).a == 28) {
                    y0Var.I1.setTitle(gd.N0(2131744007, null));
                    y0Var.I1.requestLayout();
                }
                d();
                break;
        }
    }

    @Override // c5.h
    public final void b(float f10, int i7, int i10) {
        switch (this.a) {
            case 0:
                w wVar = (w) this.c;
                wVar.J0 = i7;
                wVar.K0 = i10 > 0 ? i7 + 1 : i7 - 1;
                wVar.L0 = f10;
                long j3 = i10.i(wVar.z0).n;
                int i11 = wVar.J0;
                if (i11 >= 0 && (wVar.y0 != null ? wVar.x0 == j3 : !(i11 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.J0)).longValue() != j3))) {
                    ((w8) wVar.C0).d(1.0f - wVar.L0);
                    break;
                } else {
                    int i12 = wVar.K0;
                    if (i12 >= 0 && (wVar.y0 != null ? wVar.x0 == j3 : !(i12 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.K0)).longValue() != j3))) {
                        ((w8) wVar.C0).d(wVar.L0);
                        break;
                    } else {
                        ((w8) wVar.C0).d(0.0f);
                        break;
                    }
                }
                break;
            default:
                ha haVar = (ha) this.b;
                haVar.b = f10;
                haVar.c = i7;
                haVar.invalidate();
                ug.y0 y0Var = (ug.y0) this.c;
                y0Var.B1 = i7;
                y0Var.C1 = i10 > 0 ? i7 + 1 : i7 - 1;
                y0Var.D1 = f10;
                d();
                break;
        }
    }

    @Override // c5.h
    public final void c(int i7) {
        switch (this.a) {
            case 0:
                w wVar = (w) this.c;
                ((w8) wVar.C0).d.V();
                Runnable runnable = wVar.H0;
                if (runnable != null && i7 == 0) {
                    runnable.run();
                    wVar.H0 = null;
                }
                wVar.G0 = i7;
                f9 f9Var = ((v8) wVar).S0;
                if (f9Var.o0.G0 == 1) {
                    org.telegram.messenger.g0.r(f9Var.b1);
                    break;
                }
                break;
        }
    }

    public void d() {
        int i7;
        int i10;
        ug.y0 y0Var = (ug.y0) this.c;
        ug.w0 w0Var = y0Var.s1;
        ArrayList arrayList = y0Var.o1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= w0Var.getChildCount()) {
                break;
            }
            ug.x0 x0Var = (ug.x0) w0Var.getChildAt(i11);
            if (!y0Var.w1 || !(x0Var.f instanceof ug.p0)) {
                int i12 = x0Var.a;
                ug.n0 n0Var = x0Var.e;
                if (i12 == y0Var.B1) {
                    f10 = (-x0Var.getMeasuredWidth()) * y0Var.D1;
                    n0Var.setOffset(f10);
                } else if (i12 == y0Var.C1) {
                    f10 = ((-x0Var.getMeasuredWidth()) * y0Var.D1) + x0Var.getMeasuredWidth();
                    n0Var.setOffset(f10);
                } else {
                    n0Var.setOffset(x0Var.getMeasuredWidth());
                }
            }
            if (x0Var.f instanceof ug.p0) {
                x0Var.setTranslationX(-f10);
                x0Var.b.setTranslationX(f10);
                x0Var.c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = y0Var.B1;
        boolean z10 = i13 >= 0 && i13 < arrayList.size() && ((i10 = ((vs0) arrayList.get(y0Var.B1)).a) == 0 || i10 == 14 || i10 == 28);
        int i14 = y0Var.C1;
        boolean z11 = i14 >= 0 && i14 < arrayList.size() && ((i7 = ((vs0) arrayList.get(y0Var.C1)).a) == 0 || i7 == 14 || i7 == 28);
        if (z10 && z11) {
            y0Var.q1 = 1.0f;
            float f11 = y0Var.D1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            y0Var.p1 = f11;
            y0Var.r1 = true;
        } else if (z10) {
            float f12 = 1.0f - y0Var.D1;
            y0Var.p1 = f12;
            y0Var.q1 = f12;
            y0Var.r1 = true;
        } else if (z11) {
            float f13 = y0Var.D1;
            y0Var.p1 = f13;
            y0Var.q1 = f13;
            y0Var.r1 = false;
        } else {
            y0Var.p1 = 0.0f;
            y0Var.q1 = 0.0f;
            y0Var.r1 = true;
        }
        int i15 = (int) ((1.0f - y0Var.p1) * 255.0f);
        if (i15 != y0Var.F1) {
            y0Var.F1 = i15;
            y0Var.t1.invalidate();
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 27));
        }
    }

    private final void e(int i7) {
    }
}
