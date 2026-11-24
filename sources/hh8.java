// default package

import android.view.KeyEvent;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class hh8 implements eec {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ KeyEvent.Callback c;

    public /* synthetic */ hh8(KeyEvent.Callback callback, Object obj, byte b) {
        this.a = b;
        this.c = callback;
        this.b = obj;
    }

    @Override // eec
    public final void a(int i) {
        byte b = this.a;
        KeyEvent.Callback callback = this.c;
        switch (b) {
            case 0:
                jh8 jh8Var = (jh8) callback;
                ArrayList arrayList = jh8Var.n1;
                if (((fi8) arrayList.get(i)).a == 0) {
                    jh8Var.H1.setTitle(k96.M0(2131751337, null));
                    jh8Var.H1.requestLayout();
                } else if (((fi8) arrayList.get(i)).a == 14) {
                    jh8Var.H1.setTitle(k96.M0(2131743566, null));
                    jh8Var.H1.requestLayout();
                } else if (((fi8) arrayList.get(i)).a == 40) {
                    jh8Var.H1.setTitle(k96.M0(2131750825, null));
                    jh8Var.H1.requestLayout();
                } else if (((fi8) arrayList.get(i)).a == 28) {
                    jh8Var.H1.setTitle(k96.M0(2131744011, null));
                    jh8Var.H1.requestLayout();
                }
                d();
                break;
            default:
                m8b m8bVar = (m8b) this.b;
                c8b c8bVar = (c8b) callback;
                y28 currentPeerView = c8bVar.getCurrentPeerView();
                if (currentPeerView != null) {
                    ((d8b) c8bVar.C0).a(currentPeerView.getSelectedPosition(), currentPeerView.getCurrentPeer());
                    c8bVar.F();
                    i8b i8bVar = m8bVar.u0;
                    if (i8bVar != null) {
                        if (i >= 3) {
                            if (i > c8bVar.A0.b() - 4) {
                                m8bVar.u0.i(true);
                                break;
                            }
                        } else {
                            i8bVar.i(false);
                            break;
                        }
                    }
                }
                break;
        }
    }

    @Override // eec
    public final void b(float f, int i, int i2) {
        byte b = this.a;
        KeyEvent.Callback callback = this.c;
        switch (b) {
            case 0:
                qw0 qw0Var = (qw0) this.b;
                qw0Var.b = f;
                qw0Var.c = i;
                qw0Var.invalidate();
                jh8 jh8Var = (jh8) callback;
                jh8Var.A1 = i;
                jh8Var.B1 = i2 > 0 ? i + 1 : i - 1;
                jh8Var.C1 = f;
                d();
                break;
            default:
                c8b c8bVar = (c8b) callback;
                c8bVar.J0 = i;
                c8bVar.K0 = i2 > 0 ? i + 1 : i - 1;
                c8bVar.L0 = f;
                long j = y6c.h(c8bVar.z0).n;
                int i3 = c8bVar.J0;
                if (i3 >= 0 && (c8bVar.y0 != null ? c8bVar.x0 == j : !(i3 >= c8bVar.B0.size() || ((Long) c8bVar.B0.get(c8bVar.J0)).longValue() != j))) {
                    ((d8b) c8bVar.C0).d(1.0f - c8bVar.L0);
                    break;
                } else {
                    int i4 = c8bVar.K0;
                    if (i4 >= 0 && (c8bVar.y0 != null ? c8bVar.x0 == j : !(i4 >= c8bVar.B0.size() || ((Long) c8bVar.B0.get(c8bVar.K0)).longValue() != j))) {
                        ((d8b) c8bVar.C0).d(c8bVar.L0);
                        break;
                    } else {
                        ((d8b) c8bVar.C0).d(0.0f);
                        break;
                    }
                }
                break;
        }
    }

    @Override // eec
    public final void c(int i) {
        switch (this.a) {
            case 0:
                break;
            default:
                c8b c8bVar = (c8b) this.c;
                ((d8b) c8bVar.C0).d.U();
                Runnable runnable = c8bVar.H0;
                if (runnable != null && i == 0) {
                    runnable.run();
                    c8bVar.H0 = null;
                }
                c8bVar.G0 = i;
                m8b m8bVar = c8bVar.S0;
                if (m8bVar.o0.G0 == 1) {
                    gl.r(m8bVar.b1);
                    break;
                }
                break;
        }
    }

    public final void d() {
        float f;
        byte b;
        byte b2;
        jh8 jh8Var = (jh8) this.c;
        gh8 gh8Var = jh8Var.r1;
        ArrayList arrayList = jh8Var.n1;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= gh8Var.getChildCount()) {
                break;
            }
            ih8 ih8Var = (ih8) gh8Var.getChildAt(i);
            if (!jh8Var.v1 || !(ih8Var.f instanceof xg8)) {
                int i2 = ih8Var.a;
                qr7 qr7Var = ih8Var.e;
                if (i2 == jh8Var.A1) {
                    f = (-ih8Var.getMeasuredWidth()) * jh8Var.C1;
                    qr7Var.setOffset(f);
                } else if (i2 == jh8Var.B1) {
                    f = ((-ih8Var.getMeasuredWidth()) * jh8Var.C1) + ih8Var.getMeasuredWidth();
                    qr7Var.setOffset(f);
                } else {
                    qr7Var.setOffset(ih8Var.getMeasuredWidth());
                }
            }
            if (ih8Var.f instanceof xg8) {
                ih8Var.setTranslationX(-f);
                ih8Var.b.setTranslationX(f);
                ih8Var.c.setTranslationX(f);
            }
            i++;
        }
        int i3 = jh8Var.A1;
        boolean z = i3 >= 0 && i3 < arrayList.size() && ((b2 = ((fi8) arrayList.get(jh8Var.A1)).a) == 0 || b2 == 14 || b2 == 28);
        int i4 = jh8Var.B1;
        boolean z2 = i4 >= 0 && i4 < arrayList.size() && ((b = ((fi8) arrayList.get(jh8Var.B1)).a) == 0 || b == 14 || b == 28);
        if (z) {
            if (z2) {
                jh8Var.p1 = 1.0f;
                float f2 = jh8Var.C1;
                f = f2 == 0.0f ? 1.0f : f2;
                jh8Var.o1 = f;
                jh8Var.q1 = true;
            } else {
                f = 1.0f - jh8Var.C1;
                jh8Var.o1 = f;
                jh8Var.p1 = f;
                jh8Var.q1 = true;
            }
        } else if (z2) {
            f = jh8Var.C1;
            jh8Var.o1 = f;
            jh8Var.p1 = f;
            jh8Var.q1 = false;
        } else {
            jh8Var.o1 = 0.0f;
            jh8Var.p1 = 0.0f;
            jh8Var.q1 = true;
        }
        int i5 = (int) ((1.0f - f) * 255.0f);
        if (i5 != jh8Var.E1) {
            jh8Var.E1 = i5;
            jh8Var.s1.invalidate();
            gl.c3(new w88(this, (byte) 15));
        }
    }

    private final void e(int i) {
    }
}
