// default package

import android.view.KeyEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ij8 implements egc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ ij8(KeyEvent.Callback callback, Object obj, byte b) {
        this.a = b;
        this.c = callback;
        this.b = obj;
    }

    @Override // egc
    public final void a(int i) {
        byte b = this.a;
        KeyEvent.Callback callback = this.c;
        switch (b) {
            case 0:
                kj8 kj8Var = (kj8) callback;
                ArrayList arrayList = kj8Var.n1;
                if (((hk8) arrayList.get(i)).a == 0) {
                    kj8Var.H1.setTitle(jb6.M0(2131751286, null));
                    kj8Var.H1.requestLayout();
                } else if (((hk8) arrayList.get(i)).a == 14) {
                    kj8Var.H1.setTitle(jb6.M0(2131743492, null));
                    kj8Var.H1.requestLayout();
                } else if (((hk8) arrayList.get(i)).a == 40) {
                    kj8Var.H1.setTitle(jb6.M0(2131750774, null));
                    kj8Var.H1.requestLayout();
                } else if (((hk8) arrayList.get(i)).a == 28) {
                    kj8Var.H1.setTitle(jb6.M0(2131743937, null));
                    kj8Var.H1.requestLayout();
                }
                d();
                break;
            default:
                oab oabVar = (oab) this.b;
                eab eabVar = (eab) callback;
                a58 currentPeerView = eabVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    ((fab) eabVar.C0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    eabVar.F();
                    kab kabVar = oabVar.u0;
                    if (kabVar != null) {
                        if (i >= 3) {
                            if (i > eabVar.A0.b() - 4) {
                                oabVar.u0.e(true);
                                break;
                            }
                        } else {
                            kabVar.e(false);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // egc
    public final void b(float f, int i, int i2) {
        byte b = this.a;
        KeyEvent.Callback callback = this.c;
        switch (b) {
            case 0:
                yx0 yx0Var = (yx0) this.b;
                yx0Var.b = f;
                yx0Var.c = i;
                yx0Var.invalidate();
                kj8 kj8Var = (kj8) callback;
                kj8Var.A1 = i;
                kj8Var.B1 = i2 > 0 ? i + 1 : i - 1;
                kj8Var.C1 = f;
                d();
                break;
            default:
                eab eabVar = (eab) callback;
                eabVar.J0 = i;
                eabVar.K0 = i2 > 0 ? i + 1 : i - 1;
                eabVar.L0 = f;
                long j = z8c.h(eabVar.z0).n;
                int i3 = eabVar.J0;
                if (i3 >= 0 && (eabVar.y0 != null ? eabVar.x0 == j : !(i3 >= eabVar.B0.size() || ((Long) eabVar.B0.get(eabVar.J0)).longValue() != j))) {
                    ((fab) eabVar.C0).d(1.0f - eabVar.L0);
                    break;
                } else {
                    int i4 = eabVar.K0;
                    if (i4 >= 0 && (eabVar.y0 != null ? eabVar.x0 == j : !(i4 >= eabVar.B0.size() || ((Long) eabVar.B0.get(eabVar.K0)).longValue() != j))) {
                        ((fab) eabVar.C0).d(eabVar.L0);
                        break;
                    } else {
                        ((fab) eabVar.C0).d(0.0f);
                        break;
                    }
                }
                break;
        }
    }

    @Override // egc
    public final void c(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                eab eabVar = (eab) this.c;
                ((fab) eabVar.C0).d.U();
                Runnable runnable = eabVar.H0;
                if (runnable != null && i == 0) {
                    runnable.run();
                    eabVar.H0 = null;
                }
                eabVar.G0 = i;
                oab oabVar = eabVar.S0;
                if (oabVar.o0.G0 == 1) {
                    gm.r(oabVar.b1);
                    break;
                }
                break;
        }
    }

    public final void d() {
        float f;
        byte b;
        byte b2;
        kj8 kj8Var = (kj8) this.c;
        hj8 hj8Var = kj8Var.r1;
        ArrayList arrayList = kj8Var.n1;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= hj8Var.getChildCount()) {
                break;
            }
            jj8 jj8Var = (jj8) hj8Var.getChildAt(i);
            if (!kj8Var.v1 || !(jj8Var.f instanceof zi8)) {
                int i2 = jj8Var.a;
                rt7 rt7Var = jj8Var.e;
                if (i2 == kj8Var.A1) {
                    f = (-jj8Var.getMeasuredWidth()) * kj8Var.C1;
                    rt7Var.setOffset(f);
                } else if (i2 == kj8Var.B1) {
                    f = ((-jj8Var.getMeasuredWidth()) * kj8Var.C1) + jj8Var.getMeasuredWidth();
                    rt7Var.setOffset(f);
                } else {
                    rt7Var.setOffset(jj8Var.getMeasuredWidth());
                }
            }
            if (jj8Var.f instanceof zi8) {
                jj8Var.setTranslationX(-f);
                jj8Var.b.setTranslationX(f);
                jj8Var.c.setTranslationX(f);
            }
            i++;
        }
        int i3 = kj8Var.A1;
        boolean z = i3 >= 0 && i3 < arrayList.size() && ((b2 = ((hk8) arrayList.get(kj8Var.A1)).a) == 0 || b2 == 14 || b2 == 28);
        int i4 = kj8Var.B1;
        boolean z2 = i4 >= 0 && i4 < arrayList.size() && ((b = ((hk8) arrayList.get(kj8Var.B1)).a) == 0 || b == 14 || b == 28);
        if (z) {
            if (z2) {
                kj8Var.p1 = 1.0f;
                float f2 = kj8Var.C1;
                f = f2 == 0.0f ? 1.0f : f2;
                kj8Var.o1 = f;
                kj8Var.q1 = true;
            } else {
                f = 1.0f - kj8Var.C1;
                kj8Var.o1 = f;
                kj8Var.p1 = f;
                kj8Var.q1 = true;
            }
        } else if (z2) {
            f = kj8Var.C1;
            kj8Var.o1 = f;
            kj8Var.p1 = f;
            kj8Var.q1 = false;
        } else {
            kj8Var.o1 = 0.0f;
            kj8Var.p1 = 0.0f;
            kj8Var.q1 = true;
        }
        int i5 = (int) ((1.0f - f) * 255.0f);
        if (i5 != kj8Var.E1) {
            kj8Var.E1 = i5;
            kj8Var.s1.invalidate();
            gm.c3(new q78(this, (byte) 22));
        }
    }

    private final void e(int i) {
    }
}
