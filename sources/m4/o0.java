package m4;

import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import u2.o1;
import v7.m8;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class o0 implements e2.h, z0, y0, n2.m, d9.e, g2.g, z1 {
    public final /* synthetic */ int a;

    public /* synthetic */ o0(int i10) {
        this.a = i10;
    }

    @Override // m4.y0
    public void a(e1 e1Var, r rVar, List list) {
        switch (this.a) {
            case 8:
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
                ((e1) obj).G0();
                break;
            case 1:
            case 4:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 16:
            default:
                ((n2.k) obj).a();
                break;
            case 2:
                ((e1) obj).V();
                break;
            case 3:
                ((e1) obj).F();
                break;
            case 5:
                ((e1) obj).F0();
                break;
            case 6:
                ((e1) obj).E0();
                break;
            case 9:
                ((e1) obj).L();
                break;
            case 12:
                ((e1) obj).stop();
                break;
            case 14:
                ((e1) obj).b();
                break;
            case 15:
                ((e1) obj).H();
                break;
            case 17:
                ((e1) obj).v();
                break;
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.b, new o1(0)));
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void f(a2 a2Var, int i10) {
        a2Var.dismiss();
    }

    @Override // m4.z0
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 1:
                return a0Var.n(rVar);
            case 4:
                a0Var.getClass();
                throw new ClassCastException();
            case 7:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return m8.b(new k1(-6));
            case 11:
                a0Var.getClass();
                throw new ClassCastException();
            case 13:
                a0Var.getClass();
                throw new ClassCastException();
            case 16:
                a0Var.getClass();
                throw new ClassCastException();
            case 18:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar2 = a0Var.e;
                a0Var.s(rVar);
                dVar2.getClass();
                return m8.b(new k1(-6));
        }
    }

    public /* synthetic */ o0(int i10, Object obj, Object obj2) {
        this.a = i10;
    }

    public /* synthetic */ o0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ o0(String str, int i10, int i11, n nVar) {
        this.a = 11;
    }

    @Override // n2.m
    public void release() {
    }
}
