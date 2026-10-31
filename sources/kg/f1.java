package kg;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.ui.Components.y9;
import org.telegram.ui.eu0;
import th.e7;
import th.f7;
import th.k7;
import th.o7;
import th.z2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f1 implements z4.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ f1(KeyEvent.Callback callback, Object obj, int i10) {
        this.a = i10;
        this.c = callback;
        this.b = obj;
    }

    @Override // z4.e
    public final void a(int i10) {
        int i11 = this.a;
        KeyEvent.Callback callback = this.c;
        switch (i11) {
            case 0:
                i1 i1Var = (i1) callback;
                ArrayList arrayList = i1Var.k1;
                if (((eu0) arrayList.get(i10)).a == 0) {
                    i1Var.E1.setTitle(cd.L0(2131751350, null));
                    i1Var.E1.requestLayout();
                } else if (((eu0) arrayList.get(i10)).a == 14) {
                    i1Var.E1.setTitle(cd.L0(2131743831, null));
                    i1Var.E1.requestLayout();
                } else if (((eu0) arrayList.get(i10)).a == 40) {
                    i1Var.E1.setTitle(cd.L0(2131750838, null));
                    i1Var.E1.requestLayout();
                } else if (((eu0) arrayList.get(i10)).a == 28) {
                    i1Var.E1.setTitle(cd.L0(2131744277, null));
                    i1Var.E1.requestLayout();
                }
                d();
                break;
            default:
                o7 o7Var = (o7) this.b;
                th.q qVar = (th.q) callback;
                z2 currentPeerView = qVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    ((f7) qVar.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    qVar.F();
                    k7 k7Var = o7Var.t0;
                    if (k7Var != null) {
                        if (i10 >= 3) {
                            if (i10 > qVar.z0.b() - 4) {
                                o7Var.t0.c(true);
                                break;
                            }
                        } else {
                            k7Var.c(false);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // z4.e
    public final void b(float f7, int i10, int i11) {
        switch (this.a) {
            case 0:
                y9 y9Var = (y9) this.b;
                y9Var.b = f7;
                y9Var.c = i10;
                y9Var.invalidate();
                i1 i1Var = (i1) this.c;
                i1Var.x1 = i10;
                i1Var.y1 = i11 > 0 ? i10 + 1 : i10 - 1;
                i1Var.z1 = f7;
                d();
                break;
            default:
                th.q qVar = (th.q) this.c;
                qVar.I0 = i10;
                qVar.J0 = i11 > 0 ? i10 + 1 : i10 - 1;
                qVar.K0 = f7;
                long j10 = d20.i(qVar.y0).n;
                int i12 = qVar.I0;
                if (i12 >= 0 && (qVar.x0 != null ? qVar.w0 == j10 : !(i12 >= qVar.A0.size() || ((Long) qVar.A0.get(qVar.I0)).longValue() != j10))) {
                    ((f7) qVar.B0).d(1.0f - qVar.K0);
                    break;
                } else {
                    int i13 = qVar.J0;
                    if (i13 >= 0 && (qVar.x0 != null ? qVar.w0 == j10 : !(i13 >= qVar.A0.size() || ((Long) qVar.A0.get(qVar.J0)).longValue() != j10))) {
                        ((f7) qVar.B0).d(qVar.K0);
                        break;
                    } else {
                        ((f7) qVar.B0).d(0.0f);
                        break;
                    }
                }
                break;
        }
    }

    @Override // z4.e
    public final void c(int i10) {
        switch (this.a) {
            case 0:
                break;
            default:
                th.q qVar = (th.q) this.c;
                ((f7) qVar.B0).d.d0();
                Runnable runnable = qVar.G0;
                if (runnable != null && i10 == 0) {
                    runnable.run();
                    qVar.G0 = null;
                }
                qVar.F0 = i10;
                o7 o7Var = ((e7) qVar).R0;
                if (o7Var.n0.F0 == 1) {
                    org.telegram.messenger.i0.r(o7Var.b1);
                    break;
                }
                break;
        }
    }

    public void d() {
        int i10;
        int i11;
        i1 i1Var = (i1) this.c;
        d1 d1Var = i1Var.o1;
        ArrayList arrayList = i1Var.k1;
        int i12 = 0;
        while (true) {
            float f7 = 0.0f;
            if (i12 >= d1Var.getChildCount()) {
                break;
            }
            h1 h1Var = (h1) d1Var.getChildAt(i12);
            if (!i1Var.s1 || !(h1Var.f instanceof v0)) {
                int i13 = h1Var.a;
                t0 t0Var = h1Var.e;
                if (i13 == i1Var.x1) {
                    f7 = (-h1Var.getMeasuredWidth()) * i1Var.z1;
                    t0Var.setOffset(f7);
                } else if (i13 == i1Var.y1) {
                    f7 = ((-h1Var.getMeasuredWidth()) * i1Var.z1) + h1Var.getMeasuredWidth();
                    t0Var.setOffset(f7);
                } else {
                    t0Var.setOffset(h1Var.getMeasuredWidth());
                }
            }
            if (h1Var.f instanceof v0) {
                h1Var.setTranslationX(-f7);
                h1Var.b.setTranslationX(f7);
                h1Var.c.setTranslationX(f7);
            }
            i12++;
        }
        int i14 = i1Var.x1;
        boolean z10 = i14 >= 0 && i14 < arrayList.size() && ((i11 = ((eu0) arrayList.get(i1Var.x1)).a) == 0 || i11 == 14 || i11 == 28);
        int i15 = i1Var.y1;
        boolean z11 = i15 >= 0 && i15 < arrayList.size() && ((i10 = ((eu0) arrayList.get(i1Var.y1)).a) == 0 || i10 == 14 || i10 == 28);
        if (z10 && z11) {
            i1Var.m1 = 1.0f;
            float f10 = i1Var.z1;
            if (f10 == 0.0f) {
                f10 = 1.0f;
            }
            i1Var.l1 = f10;
            i1Var.n1 = true;
        } else if (z10) {
            float f11 = 1.0f - i1Var.z1;
            i1Var.l1 = f11;
            i1Var.m1 = f11;
            i1Var.n1 = true;
        } else if (z11) {
            float f12 = i1Var.z1;
            i1Var.l1 = f12;
            i1Var.m1 = f12;
            i1Var.n1 = false;
        } else {
            i1Var.l1 = 0.0f;
            i1Var.m1 = 0.0f;
            i1Var.n1 = true;
        }
        int i16 = (int) ((1.0f - i1Var.l1) * 255.0f);
        if (i16 != i1Var.B1) {
            i1Var.B1 = i16;
            i1Var.p1.invalidate();
            org.telegram.messenger.i0.g3(new gg.c(this, 24));
        }
    }

    private final void e(int i10) {
    }
}
