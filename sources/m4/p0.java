package m4;

import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.sv0;
import v7.l8;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements e2.h, a1, z0, n2.l, d9.e, g2.g, a2, sv0 {
    public final /* synthetic */ int a;

    public /* synthetic */ p0(int i10) {
        this.a = i10;
    }

    @Override // m4.z0
    public void a(f1 f1Var, r rVar, List list) {
        switch (this.a) {
            case 6:
                f1Var.v0(list);
                break;
            default:
                f1Var.v0(list);
                break;
        }
    }

    @Override // e2.h
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                ((f1) obj).V();
                break;
            case 1:
                ((f1) obj).F();
                break;
            case 2:
            case 5:
            case 6:
            case 8:
            case 9:
            case 11:
            case 14:
            default:
                ((n2.j) obj).a();
                break;
            case 3:
                ((f1) obj).F0();
                break;
            case 4:
                ((f1) obj).E0();
                break;
            case 7:
                ((f1) obj).L();
                break;
            case 10:
                ((f1) obj).stop();
                break;
            case 12:
                ((f1) obj).b();
                break;
            case 13:
                ((f1) obj).H();
                break;
            case 15:
                ((f1) obj).v();
                break;
        }
    }

    @Override // d9.e, i5.e
    public Object apply(Object obj) {
        o2.q qVar = (o2.q) obj;
        qVar.e();
        return e9.i0.v(e9.q.w(qVar.Y.b, new s0.b(24)));
    }

    @Override // g2.g
    public g2.h createDataSource() {
        return new g2.b(ApplicationLoader.applicationContext);
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void f(b2 b2Var, int i10) {
        b2Var.dismiss();
    }

    @Override // org.telegram.ui.Components.sv0
    public void g(int i10) {
        if (i10 == 0) {
            SharedConfig.setKeepMedia(3);
            return;
        }
        if (i10 == 1) {
            SharedConfig.setKeepMedia(0);
        } else if (i10 == 2) {
            SharedConfig.setKeepMedia(1);
        } else if (i10 == 3) {
            SharedConfig.setKeepMedia(2);
        }
    }

    @Override // m4.a1
    public Object h(a0 a0Var, r rVar, int i10) {
        switch (this.a) {
            case 2:
                a0Var.getClass();
                throw new ClassCastException();
            case 5:
                na.d dVar = a0Var.e;
                a0Var.s(rVar);
                dVar.getClass();
                return l8.b(new l1(-6));
            case 9:
                a0Var.getClass();
                throw new ClassCastException();
            case 11:
                a0Var.getClass();
                throw new ClassCastException();
            case 14:
                a0Var.getClass();
                throw new ClassCastException();
            case 16:
                a0Var.getClass();
                throw new ClassCastException();
            default:
                na.d dVar2 = a0Var.e;
                a0Var.s(rVar);
                dVar2.getClass();
                return l8.b(new l1(-6));
        }
    }

    public /* synthetic */ p0(Object obj, int i10) {
        this.a = i10;
    }

    public /* synthetic */ p0(String str, int i10, int i11, n nVar) {
        this.a = 9;
    }

    public /* synthetic */ p0(String str, int i10, Object obj) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.sv0
    public /* synthetic */ void l() {
    }

    @Override // n2.l
    public void release() {
    }
}
