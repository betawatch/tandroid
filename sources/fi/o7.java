package fi;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.ui.Components.aa;
import org.telegram.ui.ss0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class o7 implements c5.h {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ o7(KeyEvent.Callback callback, Object obj, int i7) {
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
                i9 i9Var = (i9) this.b;
                w wVar = (w) callback;
                b4 currentPeerView = wVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    ((z8) wVar.C0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    wVar.F();
                    e9 e9Var = i9Var.u0;
                    if (e9Var != null) {
                        if (i7 >= 3) {
                            if (i7 > wVar.A0.b() - 4) {
                                i9Var.u0.c(true);
                                break;
                            }
                        } else {
                            e9Var.c(false);
                            break;
                        }
                    }
                }
                break;
            default:
                ug.x0 x0Var = (ug.x0) callback;
                ArrayList arrayList = x0Var.o1;
                if (((ss0) arrayList.get(i7)).a == 0) {
                    x0Var.I1.setTitle(hd.M0(2131751349, null));
                    x0Var.I1.requestLayout();
                } else if (((ss0) arrayList.get(i7)).a == 14) {
                    x0Var.I1.setTitle(hd.M0(2131743805, null));
                    x0Var.I1.requestLayout();
                } else if (((ss0) arrayList.get(i7)).a == 40) {
                    x0Var.I1.setTitle(hd.M0(2131750837, null));
                    x0Var.I1.requestLayout();
                } else if (((ss0) arrayList.get(i7)).a == 28) {
                    x0Var.I1.setTitle(hd.M0(2131744252, null));
                    x0Var.I1.requestLayout();
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
                long j3 = m10.i(wVar.z0).n;
                int i11 = wVar.J0;
                if (i11 >= 0 && (wVar.y0 != null ? wVar.x0 == j3 : !(i11 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.J0)).longValue() != j3))) {
                    ((z8) wVar.C0).d(1.0f - wVar.L0);
                    break;
                } else {
                    int i12 = wVar.K0;
                    if (i12 >= 0 && (wVar.y0 != null ? wVar.x0 == j3 : !(i12 >= wVar.B0.size() || ((Long) wVar.B0.get(wVar.K0)).longValue() != j3))) {
                        ((z8) wVar.C0).d(wVar.L0);
                        break;
                    } else {
                        ((z8) wVar.C0).d(0.0f);
                        break;
                    }
                }
                break;
            default:
                aa aaVar = (aa) this.b;
                aaVar.b = f10;
                aaVar.c = i7;
                aaVar.invalidate();
                ug.x0 x0Var = (ug.x0) this.c;
                x0Var.B1 = i7;
                x0Var.C1 = i10 > 0 ? i7 + 1 : i7 - 1;
                x0Var.D1 = f10;
                d();
                break;
        }
    }

    @Override // c5.h
    public final void c(int i7) {
        switch (this.a) {
            case 0:
                w wVar = (w) this.c;
                ((z8) wVar.C0).d.V();
                Runnable runnable = wVar.H0;
                if (runnable != null && i7 == 0) {
                    runnable.run();
                    wVar.H0 = null;
                }
                wVar.G0 = i7;
                i9 i9Var = ((y8) wVar).S0;
                if (i9Var.o0.G0 == 1) {
                    org.telegram.messenger.g0.r(i9Var.b1);
                    break;
                }
                break;
        }
    }

    public void d() {
        int i7;
        int i10;
        ug.x0 x0Var = (ug.x0) this.c;
        ug.v0 v0Var = x0Var.s1;
        ArrayList arrayList = x0Var.o1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= v0Var.getChildCount()) {
                break;
            }
            ug.w0 w0Var = (ug.w0) v0Var.getChildAt(i11);
            if (!x0Var.w1 || !(w0Var.f instanceof ug.o0)) {
                int i12 = w0Var.a;
                ug.m0 m0Var = w0Var.e;
                if (i12 == x0Var.B1) {
                    f10 = (-w0Var.getMeasuredWidth()) * x0Var.D1;
                    m0Var.setOffset(f10);
                } else if (i12 == x0Var.C1) {
                    f10 = ((-w0Var.getMeasuredWidth()) * x0Var.D1) + w0Var.getMeasuredWidth();
                    m0Var.setOffset(f10);
                } else {
                    m0Var.setOffset(w0Var.getMeasuredWidth());
                }
            }
            if (w0Var.f instanceof ug.o0) {
                w0Var.setTranslationX(-f10);
                w0Var.b.setTranslationX(f10);
                w0Var.c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = x0Var.B1;
        boolean z10 = i13 >= 0 && i13 < arrayList.size() && ((i10 = ((ss0) arrayList.get(x0Var.B1)).a) == 0 || i10 == 14 || i10 == 28);
        int i14 = x0Var.C1;
        boolean z11 = i14 >= 0 && i14 < arrayList.size() && ((i7 = ((ss0) arrayList.get(x0Var.C1)).a) == 0 || i7 == 14 || i7 == 28);
        if (z10 && z11) {
            x0Var.q1 = 1.0f;
            float f11 = x0Var.D1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            x0Var.p1 = f11;
            x0Var.r1 = true;
        } else if (z10) {
            float f12 = 1.0f - x0Var.D1;
            x0Var.p1 = f12;
            x0Var.q1 = f12;
            x0Var.r1 = true;
        } else if (z11) {
            float f13 = x0Var.D1;
            x0Var.p1 = f13;
            x0Var.q1 = f13;
            x0Var.r1 = false;
        } else {
            x0Var.p1 = 0.0f;
            x0Var.q1 = 0.0f;
            x0Var.r1 = true;
        }
        int i15 = (int) ((1.0f - x0Var.p1) * 255.0f);
        if (i15 != x0Var.F1) {
            x0Var.F1 = i15;
            x0Var.t1.invalidate();
            org.telegram.messenger.g0.h3(new q2.d(this, 23));
        }
    }

    private final void e(int i7) {
    }
}
