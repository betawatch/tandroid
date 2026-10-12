package k2;

import android.os.Bundle;
import java.util.List;
import m4.g1;
import m4.h1;
import m4.n1;
import m4.p1;
import m4.t1;
import v7.q8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class y0 implements d9.k, i5.g, m4.e0, h1, e2.j, g1 {
    public final /* synthetic */ int a;

    public /* synthetic */ y0(int i10) {
        this.a = i10;
    }

    @Override // m4.g1
    public void a(n1 n1Var, m4.w wVar, List list) {
        switch (this.a) {
            case 27:
                n1Var.x0(list);
                break;
            default:
                n1Var.x0(list);
                break;
        }
    }

    @Override // e2.j
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.a) {
            case 14:
                n1Var.B0();
                break;
            case 15:
                n1Var.e();
                break;
            case 16:
                n1Var.f0();
                break;
            case 17:
            case 22:
            default:
                n1Var.K();
                break;
            case 18:
                n1Var.C0();
                break;
            case 19:
                n1Var.J0();
                break;
            case 20:
                n1Var.V();
                break;
            case 21:
                n1Var.E();
                break;
            case 23:
                n1Var.I0();
                break;
            case 24:
                n1Var.H0();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).a));
    }

    @Override // m4.h1
    public Object c(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.a) {
            case 12:
                f0Var.getClass();
                throw new ClassCastException();
            case 13:
                f0Var.getClass();
                throw new ClassCastException();
            case 17:
                return f0Var.n(wVar);
            case 22:
                f0Var.getClass();
                throw new ClassCastException();
            case 25:
                pb.a aVar = f0Var.e;
                f0Var.s(wVar);
                aVar.getClass();
                return q8.b(new t1(-6));
            default:
                f0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override // m4.e0
    public void d(m4.v vVar, int i10) {
        switch (this.a) {
            case 9:
                vVar.getClass();
                break;
            case 10:
                vVar.b(i10);
                break;
            default:
                vVar.getClass();
                break;
        }
    }

    public /* synthetic */ y0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ y0(String str, int i10, int i11, m4.r rVar, int i12) {
        this.a = i12;
    }

    public /* synthetic */ y0(String str, b2.h1 h1Var) {
        this.a = 25;
    }

    public /* synthetic */ y0(boolean z10, p1 p1Var, Bundle bundle) {
        this.a = 17;
    }

    @Override // i5.g
    public void b(Exception exc) {
    }
}
