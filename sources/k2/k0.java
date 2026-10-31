package k2;

import android.os.Bundle;
import b2.g1;
import m4.h1;
import m4.n1;
import m4.p1;
import m4.t1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import v7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements e2.o, u1, d9.k, i5.g, m4.e0, h1, e2.j {
    public final /* synthetic */ int a;

    public /* synthetic */ k0(int i10) {
        this.a = i10;
    }

    @Override // e2.j
    public void accept(Object obj) {
        n1 n1Var = (n1) obj;
        switch (this.a) {
            case 17:
                n1Var.B0();
                break;
            case 18:
                n1Var.e();
                break;
            case 19:
                n1Var.e0();
                break;
            case 20:
            case 25:
            default:
                n1Var.K();
                break;
            case 21:
                n1Var.C0();
                break;
            case 22:
                n1Var.J0();
                break;
            case 23:
                n1Var.T();
                break;
            case 24:
                n1Var.E();
                break;
            case 26:
                n1Var.I0();
                break;
            case 27:
                n1Var.H0();
                break;
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return e9.n0.y(Integer.valueOf(((v2.i) obj).a));
    }

    @Override // m4.e0
    public void e(m4.v vVar, int i10) {
        switch (this.a) {
            case 12:
                vVar.getClass();
                break;
            case 13:
                vVar.b(i10);
                break;
            default:
                vVar.getClass();
                break;
        }
    }

    @Override // m4.h1
    public Object f(m4.f0 f0Var, m4.w wVar, int i10) {
        switch (this.a) {
            case 15:
                f0Var.getClass();
                throw new ClassCastException();
            case 16:
                f0Var.getClass();
                throw new ClassCastException();
            case 20:
                return f0Var.n(wVar);
            case 25:
                f0Var.getClass();
                throw new ClassCastException();
            default:
                oa.d dVar = f0Var.e;
                f0Var.s(wVar);
                dVar.getClass();
                return p8.b(new t1(-6));
        }
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        switch (this.a) {
            case 2:
                x1Var.dismiss();
                break;
            default:
                x1Var.dismiss();
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        z zVar = ((r0) obj).a.n;
        if (zVar != null) {
            zVar.H();
        }
    }

    public /* synthetic */ k0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ k0(String str, int i10, int i11, m4.r rVar) {
        this.a = 16;
    }

    public /* synthetic */ k0(String str, g1 g1Var) {
        this.a = 28;
    }

    public /* synthetic */ k0(boolean z10, p1 p1Var, Bundle bundle) {
        this.a = 20;
    }

    @Override // i5.g
    public void c(Exception exc) {
    }
}
