package k2;

import android.os.Bundle;
import java.util.List;
import m4.f1;
import m4.g1;
import m4.m1;
import m4.o1;
import m4.s1;
import v7.q8;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final /* synthetic */ class f0 implements e2.o, d9.k, i5.g, m4.e0, g1, e2.j, f1 {
    public final /* synthetic */ int a;

    public /* synthetic */ f0(int i10) {
        this.a = i10;
    }

    @Override // m4.f1
    public void a(m1 m1Var, m4.v vVar, List list) {
        switch (this.a) {
            case 27:
                m1Var.x0(list);
                break;
            default:
                m1Var.x0(list);
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        m1 m1Var = (m1) obj;
        switch (this.a) {
            case 14:
                m1Var.B0();
                break;
            case 15:
                m1Var.e();
                break;
            case 16:
                m1Var.f0();
                break;
            case 17:
            case 22:
            default:
                m1Var.K();
                break;
            case 18:
                m1Var.C0();
                break;
            case 19:
                m1Var.J0();
                break;
            case 20:
                m1Var.V();
                break;
            case 21:
                m1Var.E();
                break;
            case 23:
                m1Var.I0();
                break;
            case 24:
                m1Var.H0();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).a));
    }

    @Override // m4.e0
    public void b(m4.u uVar, int i10) {
        switch (this.a) {
            case 9:
                uVar.getClass();
                break;
            case 10:
                uVar.b(i10);
                break;
            default:
                uVar.getClass();
                break;
        }
    }

    @Override // m4.g1
    public Object e(m4.f0 f0Var, m4.v vVar, int i10) {
        switch (this.a) {
            case 12:
                f0Var.getClass();
                throw new ClassCastException();
            case 13:
                f0Var.getClass();
                throw new ClassCastException();
            case 17:
                return f0Var.n(vVar);
            case 22:
                f0Var.getClass();
                throw new ClassCastException();
            case 25:
                pb.a aVar = f0Var.e;
                f0Var.s(vVar);
                aVar.getClass();
                return q8.b(new s1(-6));
            default:
                f0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 0:
                p0 p0Var = (p0) obj;
                t0 t0Var = p0Var.b;
                if (p0Var.equals(t0Var.j) && t0Var.M) {
                    t0Var.N = true;
                    break;
                }
                break;
            default:
                x xVar = ((o0) obj).a.n;
                if (xVar != null) {
                    xVar.B();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ f0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ f0(String str, int i10, int i11, m4.q qVar, int i12) {
        this.a = i12;
    }

    public /* synthetic */ f0(String str, b2.g1 g1Var) {
        this.a = 25;
    }

    public /* synthetic */ f0(boolean z10, o1 o1Var, Bundle bundle) {
        this.a = 17;
    }

    @Override // i5.g
    public void c(Exception exc) {
    }
}
