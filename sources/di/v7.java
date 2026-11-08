package di;

import android.view.KeyEvent;
import java.util.ArrayList;
import org.telegram.messenger.id;
import org.telegram.messenger.p10;
import org.telegram.ui.Components.ea;
import org.telegram.ui.vs0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class v7 implements c5.g {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ v7(KeyEvent.Callback callback, Object obj, int i7) {
        this.a = i7;
        this.c = callback;
        this.b = obj;
    }

    @Override // c5.g
    public final void a(int i7) {
        int i10 = this.a;
        KeyEvent.Callback callback = this.c;
        switch (i10) {
            case 0:
                p9 p9Var = (p9) this.b;
                w wVar = (w) callback;
                i4 currentPeerView = wVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    ((g9) wVar.B0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    wVar.F();
                    l9 l9Var = p9Var.t0;
                    if (l9Var != null) {
                        if (i7 >= 3) {
                            if (i7 > wVar.z0.b() - 4) {
                                p9Var.t0.b(true);
                                break;
                            }
                        } else {
                            l9Var.b(false);
                            break;
                        }
                    }
                }
                break;
            default:
                ug.w0 w0Var = (ug.w0) callback;
                ArrayList arrayList = w0Var.k1;
                if (((vs0) arrayList.get(i7)).a == 0) {
                    w0Var.E1.setTitle(id.M0(2131751350, null));
                    w0Var.E1.requestLayout();
                } else if (((vs0) arrayList.get(i7)).a == 14) {
                    w0Var.E1.setTitle(id.M0(2131743808, null));
                    w0Var.E1.requestLayout();
                } else if (((vs0) arrayList.get(i7)).a == 40) {
                    w0Var.E1.setTitle(id.M0(2131750838, null));
                    w0Var.E1.requestLayout();
                } else if (((vs0) arrayList.get(i7)).a == 28) {
                    w0Var.E1.setTitle(id.M0(2131744255, null));
                    w0Var.E1.requestLayout();
                }
                d();
                break;
        }
    }

    @Override // c5.g
    public final void b(float f10, int i7, int i10) {
        switch (this.a) {
            case 0:
                w wVar = (w) this.c;
                wVar.I0 = i7;
                wVar.J0 = i10 > 0 ? i7 + 1 : i7 - 1;
                wVar.K0 = f10;
                long j3 = p10.i(wVar.y0).n;
                int i11 = wVar.I0;
                if (i11 >= 0 && (wVar.x0 != null ? wVar.w0 == j3 : !(i11 >= wVar.A0.size() || ((Long) wVar.A0.get(wVar.I0)).longValue() != j3))) {
                    ((g9) wVar.B0).d(1.0f - wVar.K0);
                    break;
                } else {
                    int i12 = wVar.J0;
                    if (i12 >= 0 && (wVar.x0 != null ? wVar.w0 == j3 : !(i12 >= wVar.A0.size() || ((Long) wVar.A0.get(wVar.J0)).longValue() != j3))) {
                        ((g9) wVar.B0).d(wVar.K0);
                        break;
                    } else {
                        ((g9) wVar.B0).d(0.0f);
                        break;
                    }
                }
                break;
            default:
                ea eaVar = (ea) this.b;
                eaVar.b = f10;
                eaVar.c = i7;
                eaVar.invalidate();
                ug.w0 w0Var = (ug.w0) this.c;
                w0Var.x1 = i7;
                w0Var.y1 = i10 > 0 ? i7 + 1 : i7 - 1;
                w0Var.z1 = f10;
                d();
                break;
        }
    }

    @Override // c5.g
    public final void c(int i7) {
        switch (this.a) {
            case 0:
                w wVar = (w) this.c;
                ((g9) wVar.B0).d.V();
                Runnable runnable = wVar.G0;
                if (runnable != null && i7 == 0) {
                    runnable.run();
                    wVar.G0 = null;
                }
                wVar.F0 = i7;
                p9 p9Var = ((f9) wVar).R0;
                if (p9Var.n0.F0 == 1) {
                    org.telegram.messenger.g0.r(p9Var.a1);
                    break;
                }
                break;
        }
    }

    public void d() {
        int i7;
        int i10;
        ug.w0 w0Var = (ug.w0) this.c;
        ug.u0 u0Var = w0Var.o1;
        ArrayList arrayList = w0Var.k1;
        int i11 = 0;
        while (true) {
            float f10 = 0.0f;
            if (i11 >= u0Var.getChildCount()) {
                break;
            }
            ug.v0 v0Var = (ug.v0) u0Var.getChildAt(i11);
            if (!w0Var.s1 || !(v0Var.f instanceof ug.n0)) {
                int i12 = v0Var.a;
                ug.l0 l0Var = v0Var.e;
                if (i12 == w0Var.x1) {
                    f10 = (-v0Var.getMeasuredWidth()) * w0Var.z1;
                    l0Var.setOffset(f10);
                } else if (i12 == w0Var.y1) {
                    f10 = ((-v0Var.getMeasuredWidth()) * w0Var.z1) + v0Var.getMeasuredWidth();
                    l0Var.setOffset(f10);
                } else {
                    l0Var.setOffset(v0Var.getMeasuredWidth());
                }
            }
            if (v0Var.f instanceof ug.n0) {
                v0Var.setTranslationX(-f10);
                v0Var.b.setTranslationX(f10);
                v0Var.c.setTranslationX(f10);
            }
            i11++;
        }
        int i13 = w0Var.x1;
        boolean z9 = i13 >= 0 && i13 < arrayList.size() && ((i10 = ((vs0) arrayList.get(w0Var.x1)).a) == 0 || i10 == 14 || i10 == 28);
        int i14 = w0Var.y1;
        boolean z10 = i14 >= 0 && i14 < arrayList.size() && ((i7 = ((vs0) arrayList.get(w0Var.y1)).a) == 0 || i7 == 14 || i7 == 28);
        if (z9 && z10) {
            w0Var.m1 = 1.0f;
            float f11 = w0Var.z1;
            if (f11 == 0.0f) {
                f11 = 1.0f;
            }
            w0Var.l1 = f11;
            w0Var.n1 = true;
        } else if (z9) {
            float f12 = 1.0f - w0Var.z1;
            w0Var.l1 = f12;
            w0Var.m1 = f12;
            w0Var.n1 = true;
        } else if (z10) {
            float f13 = w0Var.z1;
            w0Var.l1 = f13;
            w0Var.m1 = f13;
            w0Var.n1 = false;
        } else {
            w0Var.l1 = 0.0f;
            w0Var.m1 = 0.0f;
            w0Var.n1 = true;
        }
        int i15 = (int) ((1.0f - w0Var.l1) * 255.0f);
        if (i15 != w0Var.B1) {
            w0Var.B1 = i15;
            w0Var.p1.invalidate();
            org.telegram.messenger.g0.h3(new sg.t0(this, 18));
        }
    }

    private final void e(int i7) {
    }
}
