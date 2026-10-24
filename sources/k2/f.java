package k2;

import android.media.AudioDescriptor;
import android.os.Bundle;
import android.os.SystemClock;
import m4.g1;
import m4.m1;
import m4.o1;
import m4.s1;
import v7.q8;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements e2.o, d9.k, i5.g, m4.e0, g1, e2.j {
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i10) {
        this.a = i10;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor b(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // m4.g1
    public Object a(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.a) {
            case 16:
                f0Var.getClass();
                throw new ClassCastException();
            case 17:
                f0Var.getClass();
                throw new ClassCastException();
            case 21:
                return f0Var.n(vVar);
            case 26:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                pb.a aVar = f0Var.e;
                f0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.a) {
            case 18:
                m1Var.B0();
                break;
            case 19:
                m1Var.e();
                break;
            case 20:
                m1Var.f0();
                break;
            case 21:
            case 26:
            default:
                m1Var.H0();
                break;
            case 22:
                m1Var.C0();
                break;
            case 23:
                m1Var.J0();
                break;
            case 24:
                m1Var.V();
                break;
            case 25:
                m1Var.E();
                break;
            case 27:
                m1Var.I0();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).a));
    }

    @Override // m4.e0
    public void e(m4.u uVar, int i10) {
        switch (this.a) {
            case 13:
                uVar.getClass();
                break;
            case 14:
                uVar.b(i10);
                break;
            default:
                uVar.getClass();
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        long j10;
        y yVar;
        switch (this.a) {
            case 1:
                p0 p0Var = (p0) obj;
                t0 t0Var = p0Var.b;
                if (p0Var.equals(t0Var.j) && t0Var.n != null) {
                    q0 q0Var = t0Var.p;
                    int i10 = q0Var.b;
                    if (i10 != -1) {
                        long j11 = ((p) q0Var.e).f / i10;
                        i0 i0Var = t0Var.t;
                        i0Var.getClass();
                        j10 = e2.m0.Y(i0Var.a.getSampleRate(), j11);
                    } else {
                        j10 = -9223372036854775807L;
                    }
                    t0Var.n.t(((p) t0Var.p.e).f, e2.m0.h0(j10), SystemClock.elapsedRealtime() - t0Var.W);
                    break;
                }
                break;
            case 2:
                p0 p0Var2 = (p0) obj;
                p0Var2.getClass();
                t0.c0.getAndDecrement();
                y yVar2 = p0Var2.b.n;
                if (yVar2 != null) {
                    int i11 = p0Var2.a.a;
                    yVar2.T(new u0());
                    break;
                }
                break;
            case 3:
                p0 p0Var3 = (p0) obj;
                t0 t0Var2 = p0Var3.b;
                if (p0Var3.equals(t0Var2.j) && (yVar = t0Var2.n) != null && t0Var2.O) {
                    yVar.U();
                    break;
                }
                break;
            case 4:
                p0 p0Var4 = (p0) obj;
                t0 t0Var3 = p0Var4.b;
                if (p0Var4.equals(t0Var3.j) && t0Var3.M) {
                    t0Var3.N = true;
                    break;
                }
                break;
            default:
                y yVar3 = ((o0) obj).a.n;
                if (yVar3 != null) {
                    yVar3.B();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ f(String str, int i10, int i11, m4.q qVar) {
        this.a = 17;
    }

    public /* synthetic */ f(String str, b2.g1 g1Var) {
        this.a = 29;
    }

    public /* synthetic */ f(boolean z10, o1 o1Var, Bundle bundle) {
        this.a = 21;
    }

    @Override // i5.g
    public void c(Exception exc) {
    }
}
