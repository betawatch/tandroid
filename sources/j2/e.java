package j2;

import b2.k0;
import e2.m;
import e9.i0;
import m4.a0;
import m4.a1;
import m4.b0;
import m4.f1;
import m4.n;
import m4.q;
import m4.r;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements m, d9.e, i5.g, a0, a1, e2.h {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i10) {
        this.a = i10;
    }

    @Override // e2.h
    public void accept(Object obj) {
        f1 f1Var = (f1) obj;
        switch (this.a) {
            case 22:
                f1Var.e();
                break;
            case 23:
                f1Var.e0();
                break;
            case 24:
                f1Var.z0();
                break;
            case 25:
                f1Var.G0();
                break;
            case 26:
            default:
                f1Var.F();
                break;
            case 27:
                f1Var.V();
                break;
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        return i0.z(Integer.valueOf(((v2.h) obj).a));
    }

    @Override // m4.a0
    public void d(q qVar, int i10) {
        switch (this.a) {
            case 17:
                qVar.getClass();
                break;
            case 18:
                qVar.b(i10);
                break;
            default:
                qVar.getClass();
                break;
        }
    }

    @Override // m4.a1
    public Object h(b0 b0Var, r rVar, int i10) {
        switch (this.a) {
            case 20:
                b0Var.getClass();
                throw new ClassCastException();
            case 21:
                b0Var.getClass();
                throw new ClassCastException();
            case 26:
                return b0Var.n(rVar);
            default:
                b0Var.getClass();
                throw new ClassCastException();
        }
    }

    @Override // e2.m
    public void invoke(Object obj) {
        b bVar = (b) obj;
        switch (this.a) {
            case 0:
                bVar.getClass();
                break;
            case 1:
                bVar.getClass();
                break;
            case 2:
                bVar.getClass();
                break;
            case 3:
                bVar.getClass();
                break;
            case 4:
                bVar.getClass();
                break;
            default:
                bVar.getClass();
                break;
        }
    }

    public /* synthetic */ e(int i10, Object obj, Object obj2) {
        this.a = i10;
    }

    public /* synthetic */ e(a aVar, float f7) {
        this.a = 5;
    }

    public /* synthetic */ e(a aVar, int i10) {
        this.a = 3;
    }

    public /* synthetic */ e(a aVar, k0 k0Var, int i10) {
        this.a = 4;
    }

    public /* synthetic */ e(a aVar, boolean z10) {
        this.a = 1;
    }

    public /* synthetic */ e(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ e(String str, int i10, int i11, n nVar) {
        this.a = 21;
    }

    @Override // i5.g
    public void a(Exception exc) {
    }
}
