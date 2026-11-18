package fi;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.ui.Components.ia;
import org.telegram.ui.ws0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                                f9Var.u0.b(true);
                                break;
                            }
                        } else {
                            b9Var.b(false);
                            break;
                        }
                    }
                }
                break;
            default:
                ug.z0 z0Var = (ug.z0) callback;
                ArrayList arrayList = z0Var.o1;
                if (((ws0) arrayList.get(i7)).a == 0) {
                    z0Var.I1.setTitle(gd.M0(2131751338, null));
                    z0Var.I1.requestLayout();
                } else if (((ws0) arrayList.get(i7)).a == 14) {
                    z0Var.I1.setTitle(gd.M0(2131743568, null));
                    z0Var.I1.requestLayout();
                } else if (((ws0) arrayList.get(i7)).a == 40) {
                    z0Var.I1.setTitle(gd.M0(2131750826, null));
                    z0Var.I1.requestLayout();
                } else if (((ws0) arrayList.get(i7)).a == 28) {
                    z0Var.I1.setTitle(gd.M0(2131744017, null));
                    z0Var.I1.requestLayout();
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
                long j3 = j10.i(wVar.z0).n;
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
                ia iaVar = (ia) this.b;
                iaVar.b = f10;
                iaVar.c = i7;
                iaVar.invalidate();
                ug.z0 z0Var = (ug.z0) this.c;
                z0Var.B1 = i7;
                z0Var.C1 = i10 > 0 ? i7 + 1 : i7 - 1;
                z0Var.D1 = f10;
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
        ug.z0 z0Var = (ug.z0) this.c;
        ug.x0 x0Var = z0Var.s1;
        ArrayList arrayList = z0Var.o1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= x0Var.getChildCount()) {
                break;
            }
            ug.y0 y0Var = (ug.y0) x0Var.getChildAt(i11);
            if (!z0Var.w1 || !(y0Var.f instanceof ug.q0)) {
                int i12 = y0Var.a;
                ug.o0 o0Var = y0Var.e;
                if (i12 == z0Var.B1) {
                    f10 = (-y0Var.getMeasuredWidth()) * z0Var.D1;
                    o0Var.setOffset(f10);
                } else if (i12 == z0Var.C1) {
                    f10 = ((-y0Var.getMeasuredWidth()) * z0Var.D1) + y0Var.getMeasuredWidth();
                    o0Var.setOffset(f10);
                } else {
                    o0Var.setOffset(y0Var.getMeasuredWidth());
                }
            }
            if (y0Var.f instanceof ug.q0) {
                y0Var.setTranslationX(-f10);
                y0Var.b.setTranslationX(f10);
                y0Var.c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = z0Var.B1;
        boolean z10 = i13 >= 0 && i13 < arrayList.size() && ((i10 = ((ws0) arrayList.get(z0Var.B1)).a) == 0 || i10 == 14 || i10 == 28);
        int i14 = z0Var.C1;
        boolean z11 = i14 >= 0 && i14 < arrayList.size() && ((i7 = ((ws0) arrayList.get(z0Var.C1)).a) == 0 || i7 == 14 || i7 == 28);
        if (z10 && z11) {
            z0Var.q1 = 1.0f;
            float f11 = z0Var.D1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            z0Var.p1 = f11;
            z0Var.r1 = true;
        } else if (z10) {
            float f12 = 1.0f - z0Var.D1;
            z0Var.p1 = f12;
            z0Var.q1 = f12;
            z0Var.r1 = true;
        } else if (z11) {
            float f13 = z0Var.D1;
            z0Var.p1 = f13;
            z0Var.q1 = f13;
            z0Var.r1 = false;
        } else {
            z0Var.p1 = 0.0f;
            z0Var.q1 = 0.0f;
            z0Var.r1 = true;
        }
        int i15 = (int) ((1.0f - z0Var.p1) * 255.0f);
        if (i15 != z0Var.F1) {
            z0Var.F1 = i15;
            z0Var.t1.invalidate();
            org.telegram.messenger.g0.g3(new org.telegram.ui.web.z0(this, 26));
        }
    }

    private final void e(int i7) {
    }
}
