// default package

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class fj4 extends yfb implements is4 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fj4(Object obj, Object obj2, zw2 zw2Var, byte b) {
        super(2, zw2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override // qf0
    public final zw2 create(Object obj, zw2 zw2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new fj4((gj4) this.c, (zaa) obj2, zw2Var, (byte) 0);
            case 1:
                return new fj4((yja) this.c, (o9a) obj2, zw2Var, (byte) 1);
            default:
                return new fj4((lyc) obj2, zw2Var);
        }
    }

    @Override // is4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        f9c f9cVar = f9c.a;
        ux2 ux2Var = (ux2) obj;
        zw2 zw2Var = (zw2) obj2;
        switch (b) {
        }
        return ((fj4) create(ux2Var, zw2Var)).invokeSuspend(f9cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d5, code lost:
    
        if (r0.a(r5, r20) == r6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021f, code lost:
    
        if (r4.e(r0, vja.b, r20) == r6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x028a, code lost:
    
        if (r3.b(r20) == r6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0254, code lost:
    
        if (r4 != r6) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0177, code lost:
    
        if (r2.invoke(r0, r20) != r6) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0177 -> B:8:0x017b). Please report as a decompilation issue!!! */
    @Override // qf0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        f9c f9cVar;
        ii1 ii1Var;
        Object obj2;
        z01 z01Var;
        z01 z01Var2;
        qj1 qj1Var;
        byte b2 = this.a;
        Object obj3 = this.d;
        f9c f9cVar2 = f9c.a;
        vx2 vx2Var = vx2.a;
        byte b3 = 1;
        switch (b2) {
            case 0:
                gj4 gj4Var = (gj4) this.c;
                bba bbaVar = gj4Var.b;
                byte b4 = this.b;
                if (b4 == 0) {
                    ixe.b(obj);
                    nj4 nj4Var = nj4.a;
                    this.b = (byte) 1;
                    b = nj4Var.b(this);
                    break;
                } else {
                    if (b4 != 1) {
                        if (b4 != 2) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ixe.b(obj);
                        Boolean b5 = bbaVar.a.b();
                        if ((b5 == null && (b5 = bbaVar.b.b()) == null) ? true : b5.booleanValue()) {
                            ji4 ji4Var = gj4Var.a;
                            xi4 xi4Var = new xi4((byte) 2);
                            ji4Var.a();
                            ji4Var.j.add(xi4Var);
                        } else {
                            mtd.a(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                        }
                        return f9cVar2;
                    }
                    ixe.b(obj);
                    b = obj;
                }
                Collection values = ((Map) b).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((ty2) it.next()).a.a()) {
                            this.b = (byte) 2;
                            break;
                        }
                    }
                }
                mtd.a(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
                return f9cVar2;
            case 1:
                o9a o9aVar = (o9a) obj3;
                yja yjaVar = (yja) this.c;
                byte b6 = this.b;
                try {
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e.getMessage());
                    if (yjaVar.d(o9aVar)) {
                        s9a a = yjaVar.b.a(o9aVar.a);
                        yjaVar.h = o9a.a(o9aVar, a, null, null, 4);
                        y9a y9aVar = yjaVar.c;
                        fud.b(xde.a(y9aVar.e), new w9a(y9aVar, a, null));
                        String str = a.a;
                        this.b = (byte) 2;
                        break;
                    }
                }
                if (b6 == 0) {
                    ixe.b(obj);
                    o73 o73Var = yjaVar.e;
                    wja wjaVar = new wja(yjaVar, null, (byte) 1);
                    this.b = (byte) 1;
                    break;
                } else {
                    if (b6 != 1) {
                        if (b6 == 2) {
                            ixe.b(obj);
                            return f9cVar2;
                        }
                        grb.i("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ixe.b(obj);
                }
                return f9cVar2;
            default:
                lyc lycVar = (lyc) obj3;
                byte b7 = this.b;
                if (b7 == 0) {
                    ixe.b(obj);
                    if (((AtomicInteger) ((z8d) lycVar.e).b).get() <= 0) {
                        grb.i("Check failed.");
                    }
                    gqe.a(((ux2) lycVar.b).c());
                    ii1 ii1Var2 = (ii1) lycVar.c;
                    z01Var = (z01) lycVar.d;
                    this.c = ii1Var2;
                    this.b = b3;
                    z01Var.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = z01.c;
                    Unsafe unsafe = fx.a;
                    long j = z01.x;
                    qj1 qj1Var2 = (qj1) unsafe.getObjectVolatile(z01Var, j);
                    while (!z01Var.s()) {
                    }
                    Throwable l = z01Var.l();
                    int i = lqa.a;
                    throw l;
                }
                if (b7 == 1) {
                    ii1 ii1Var3 = (ii1) this.c;
                    ixe.b(obj);
                    ii1Var = ii1Var3;
                    f9cVar = f9cVar2;
                    obj2 = obj;
                    this.c = null;
                    this.b = (byte) 2;
                } else {
                    if (b7 == 2) {
                        ixe.b(obj);
                        f9cVar = f9cVar2;
                        f9cVar2 = f9cVar;
                        if (((AtomicInteger) ((z8d) lycVar.e).b).decrementAndGet() == 0) {
                            return f9cVar2;
                        }
                        b3 = 1;
                        gqe.a(((ux2) lycVar.b).c());
                        ii1 ii1Var22 = (ii1) lycVar.c;
                        z01Var = (z01) lycVar.d;
                        this.c = ii1Var22;
                        this.b = b3;
                        z01Var.getClass();
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = z01.c;
                        Unsafe unsafe2 = fx.a;
                        long j2 = z01.x;
                        qj1 qj1Var22 = (qj1) unsafe2.getObjectVolatile(z01Var, j2);
                        while (!z01Var.s()) {
                            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(z01Var);
                            long j3 = b11.b;
                            z01 z01Var3 = z01Var;
                            long j4 = andIncrement / j3;
                            int i2 = (int) (andIncrement % j3);
                            if (qj1Var22.d == j4) {
                                z01Var2 = z01Var3;
                            } else {
                                z01Var2 = z01Var3;
                                qj1 h = z01Var2.h(j4, qj1Var22);
                                if (h == null) {
                                    z01Var = z01Var2;
                                } else {
                                    qj1Var22 = h;
                                }
                            }
                            long j5 = j2;
                            qj1 qj1Var3 = qj1Var22;
                            z01Var = z01Var2;
                            Object C = z01Var.C(qj1Var3, i2, andIncrement, null);
                            ow5 ow5Var = b11.m;
                            if (C != ow5Var) {
                                ii1 ii1Var4 = ii1Var22;
                                ow5 ow5Var2 = b11.o;
                                if (C != ow5Var2) {
                                    f9cVar = f9cVar2;
                                    if (C == b11.n) {
                                        va1 a2 = yud.a(xpe.a(this));
                                        try {
                                            Object C2 = z01Var.C(qj1Var3, i2, andIncrement, a2);
                                            if (C2 == ow5Var) {
                                                a2.a(qj1Var3, i2);
                                            } else if (C2 != ow5Var2) {
                                                qj1Var3.b();
                                                a2.A(C2, null);
                                            } else {
                                                if (andIncrement < z01Var.o()) {
                                                    qj1Var3.b();
                                                }
                                                qj1 qj1Var4 = (qj1) fx.a.getObjectVolatile(z01Var, j5);
                                                while (true) {
                                                    if (z01Var.s()) {
                                                        a2.resumeWith(new ge9(z01Var.l()));
                                                    } else {
                                                        long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(z01Var);
                                                        long j6 = b11.b;
                                                        long j7 = andIncrement2 / j6;
                                                        int i3 = (int) (andIncrement2 % j6);
                                                        if (qj1Var4.d == j7) {
                                                            qj1Var = qj1Var4;
                                                        } else {
                                                            qj1 h2 = z01Var.h(j7, qj1Var4);
                                                            if (h2 != null) {
                                                                qj1Var = h2;
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                        Object C3 = z01Var.C(qj1Var, i3, andIncrement2, a2);
                                                        qj1 qj1Var5 = qj1Var;
                                                        if (C3 == b11.m) {
                                                            a2.a(qj1Var5, i3);
                                                        } else if (C3 == b11.o) {
                                                            if (andIncrement2 < z01Var.o()) {
                                                                qj1Var5.b();
                                                            }
                                                            qj1Var4 = qj1Var5;
                                                        } else {
                                                            if (C3 == b11.n) {
                                                                throw new IllegalStateException("unexpected");
                                                            }
                                                            qj1Var5.b();
                                                            a2.A(C3, null);
                                                        }
                                                    }
                                                }
                                            }
                                            obj2 = a2.q();
                                        } catch (Throwable th) {
                                            a2.z();
                                            throw th;
                                        }
                                    } else {
                                        qj1Var3.b();
                                        obj2 = C;
                                    }
                                    if (obj2 != vx2Var) {
                                        ii1Var = ii1Var4;
                                        this.c = null;
                                        this.b = (byte) 2;
                                        break;
                                    }
                                    return vx2Var;
                                }
                                if (andIncrement < z01Var.o()) {
                                    qj1Var3.b();
                                }
                                ii1Var22 = ii1Var4;
                                qj1Var22 = qj1Var3;
                                j2 = j5;
                            } else {
                                grb.i("unexpected");
                            }
                        }
                        Throwable l2 = z01Var.l();
                        int i4 = lqa.a;
                        throw l2;
                    }
                    grb.i("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj4(lyc lycVar, zw2 zw2Var) {
        super(2, zw2Var);
        this.a = (byte) 2;
        this.d = lycVar;
    }
}
