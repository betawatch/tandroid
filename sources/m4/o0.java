package m4;

import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import v7.l8;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements e2.h, z0, y0, n2.m, d9.e, g2.g {
    public final /* synthetic */ int a;

    public /* synthetic */ o0(int i10) {
        this.a = i10;
    }

    @Override // m4.y0
    public void a(e1 e1Var, r rVar, List list) {
        switch (this.a) {
            case 9:
                e1Var.v0(list);
                break;
            default:
                e1Var.v0(list);
                break;
        }
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((e1) obj).z0();
                break;
            case 1:
                ((e1) obj).G0();
                break;
            case 2:
            case 5:
            case 8:
            case 9:
            case 11:
            case 12:
            case 14:
            case 17:
            default:
                ((n2.k) obj).a();
                break;
            case 3:
                ((e1) obj).V();
                break;
            case 4:
                ((e1) obj).F();
                break;
            case 6:
                ((e1) obj).F0();
                break;
            case 7:
                ((e1) obj).E0();
                break;
            case 10:
                ((e1) obj).L();
                break;
            case 13:
                ((e1) obj).stop();
                break;
            case 15:
                ((e1) obj).b();
                break;
            case 16:
                ((e1) obj).H();
                break;
            case 18:
                ((e1) obj).v();
                break;
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.b, new u2.l0(2)));
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // m4.z0
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 2:
                return a0Var.n(rVar);
            case 5:
                a0Var.getClass();
                throw new ClassCastException();
            case 8:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return l8.b(new k1(-6));
            case 12:
                a0Var.getClass();
                throw new ClassCastException();
            case 14:
                a0Var.getClass();
                throw new ClassCastException();
            case 17:
                a0Var.getClass();
                throw new ClassCastException();
            case 19:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar2 = a0Var.e;
                a0Var.s(rVar);
                dVar2.getClass();
                return l8.b(new k1(-6));
        }
    }

    public /* synthetic */ o0(int i10, Object obj, Object obj2) {
        this.a = i10;
    }

    public /* synthetic */ o0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ o0(String str, int i10, int i11, n nVar) {
        this.a = 12;
    }

    @Override // n2.m
    public void release() {
    }
}
