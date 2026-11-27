// default package

import java.io.File;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class cj7 extends az5 implements ur4 {
    public final /* synthetic */ byte b;
    public final /* synthetic */ Serializable c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cj7(Serializable serializable, Object obj, byte b) {
        super(1);
        this.b = b;
        this.c = serializable;
        this.d = obj;
    }

    @Override // ur4
    public final Object invoke(Object obj) {
        Object nj1Var;
        qj1 qj1Var;
        f9c f9cVar;
        byte b = this.b;
        Object obj2 = this.d;
        Serializable serializable = this.c;
        f9c f9cVar2 = f9c.a;
        zw2 zw2Var = null;
        switch (b) {
            case 0:
                if (ur5.a((String) obj, ((File) serializable).getName())) {
                    so8 so8Var = (so8) obj2;
                    Object d = so8Var.d(f9cVar2);
                    if (!(d instanceof oj1)) {
                        break;
                    } else {
                        Object obj3 = ((pj1) ytd.a(new ii1(so8Var, zw2Var, (byte) 2))).a;
                        break;
                    }
                }
                break;
            default:
                Throwable th = (Throwable) obj;
                ((l83) serializable).invoke(th);
                z01 z01Var = (z01) ((lyc) obj2).d;
                z01Var.c(th, false);
                do {
                    z01Var.getClass();
                    Unsafe unsafe = fx.a;
                    long longVolatile = unsafe.getLongVolatile(z01Var, z01.y);
                    long longVolatile2 = unsafe.getLongVolatile(z01Var, z01.F);
                    if (z01Var.r(longVolatile2, true)) {
                        nj1Var = new nj1(z01Var.k());
                    } else {
                        long j = longVolatile2 & 1152921504606846975L;
                        oj1 oj1Var = pj1.b;
                        if (longVolatile < j) {
                            Object obj4 = b11.k;
                            qj1 qj1Var2 = (qj1) unsafe.getObjectVolatile(z01Var, z01.x);
                            while (true) {
                                if (z01Var.s()) {
                                    nj1Var = new nj1(z01Var.k());
                                } else {
                                    long andIncrement = z01.c.getAndIncrement(z01Var);
                                    long j2 = b11.b;
                                    long j3 = andIncrement / j2;
                                    int i = (int) (andIncrement % j2);
                                    if (qj1Var2.d != j3) {
                                        qj1 h = z01Var.h(j3, qj1Var2);
                                        if (h != null) {
                                            qj1Var = h;
                                        } else {
                                            continue;
                                        }
                                    } else {
                                        qj1Var = qj1Var2;
                                    }
                                    nj1Var = z01Var.C(qj1Var, i, andIncrement, obj4);
                                    qj1Var2 = qj1Var;
                                    if (nj1Var == b11.m) {
                                        noc nocVar = obj4 instanceof noc ? (noc) obj4 : null;
                                        if (nocVar != null) {
                                            nocVar.a(qj1Var2, i);
                                        }
                                        z01Var.F(andIncrement);
                                        qj1Var2.i();
                                    } else if (nj1Var == b11.o) {
                                        if (andIncrement < z01Var.o()) {
                                            qj1Var2.b();
                                        }
                                    } else if (nj1Var != b11.n) {
                                        qj1Var2.b();
                                    } else {
                                        grb.i("unexpected");
                                        nj1Var = null;
                                    }
                                }
                            }
                        }
                        nj1Var = oj1Var;
                    }
                    if (nj1Var instanceof oj1) {
                        nj1Var = null;
                    }
                    if (nj1Var != null) {
                        ((k37) nj1Var).b.P(th == null ? new CancellationException("DataStore scope was cancelled before updateData could complete") : th);
                        f9cVar = f9cVar2;
                    } else {
                        f9cVar = null;
                    }
                } while (f9cVar != null);
        }
        return f9cVar2;
    }
}
