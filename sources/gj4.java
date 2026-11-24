// default package

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class gj4 extends eeb implements fs4 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gj4(Object obj, Object obj2, px2 px2Var, byte b) {
        super(2, px2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override // og0
    public final px2 create(Object obj, px2 px2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new gj4((hj4) this.c, (j9a) obj2, px2Var, (byte) 0);
            case 1:
                return new gj4((hia) this.c, (y7a) obj2, px2Var, (byte) 1);
            default:
                return new gj4((xvc) obj2, px2Var);
        }
    }

    @Override // fs4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g7c g7cVar = g7c.a;
        ky2 ky2Var = (ky2) obj;
        px2 px2Var = (px2) obj2;
        switch (b) {
        }
        return ((gj4) create(ky2Var, px2Var)).invokeSuspend(g7cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d5, code lost:
    
        if (r0.a(r5, r20) == r6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021f, code lost:
    
        if (r4.e(r0, eia.b, r20) == r6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x028a, code lost:
    
        if (r3.b(r20) == r6) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0254, code lost:
    
        if (r4 != r6) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0177, code lost:
    
        if (r2.invoke(r0, r20) != r6) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0177 -> B:8:0x017b). Please report as a decompilation issue!!! */
    @Override // og0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        g7c g7cVar;
        hj1 hj1Var;
        Object obj2;
        y11 y11Var;
        y11 y11Var2;
        pk1 pk1Var;
        byte b2 = this.a;
        Object obj3 = this.d;
        g7c g7cVar2 = g7c.a;
        ly2 ly2Var = ly2.a;
        byte b3 = 1;
        switch (b2) {
            case 0:
                hj4 hj4Var = (hj4) this.c;
                l9a l9aVar = hj4Var.b;
                byte b4 = this.b;
                if (b4 == 0) {
                    tue.b(obj);
                    pj4 pj4Var = pj4.a;
                    this.b = (byte) 1;
                    b = pj4Var.b(this);
                    break;
                } else {
                    if (b4 != 1) {
                        if (b4 != 2) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tue.b(obj);
                        Boolean b5 = l9aVar.a.b();
                        if ((b5 == null && (b5 = l9aVar.b.b()) == null) ? true : b5.booleanValue()) {
                            li4 li4Var = hj4Var.a;
                            h64 h64Var = new h64((byte) 22);
                            li4Var.a();
                            li4Var.j.add(h64Var);
                        } else {
                            zqd.a(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                        }
                        return g7cVar2;
                    }
                    tue.b(obj);
                    b = obj;
                }
                Collection values = ((Map) b).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((jz2) it.next()).a.a()) {
                            this.b = (byte) 2;
                            break;
                        }
                    }
                }
                zqd.a(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
                return g7cVar2;
            case 1:
                y7a y7aVar = (y7a) obj3;
                hia hiaVar = (hia) this.c;
                byte b6 = this.b;
                try {
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e.getMessage());
                    if (hiaVar.d(y7aVar)) {
                        c8a a = hiaVar.b.a(y7aVar.a);
                        hiaVar.h = y7a.a(y7aVar, a, null, null, 4);
                        i8a i8aVar = hiaVar.c;
                        srd.b(ibe.a(i8aVar.e), new g8a(i8aVar, a, null));
                        String str = a.a;
                        this.b = (byte) 2;
                        break;
                    }
                }
                if (b6 == 0) {
                    tue.b(obj);
                    h83 h83Var = hiaVar.e;
                    fia fiaVar = new fia(hiaVar, null, (byte) 1);
                    this.b = (byte) 1;
                    break;
                } else {
                    if (b6 != 1) {
                        if (b6 == 2) {
                            tue.b(obj);
                            return g7cVar2;
                        }
                        dq9.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tue.b(obj);
                }
                return g7cVar2;
            default:
                xvc xvcVar = (xvc) obj3;
                byte b7 = this.b;
                if (b7 == 0) {
                    tue.b(obj);
                    if (((AtomicInteger) ((k6d) xvcVar.e).b).get() <= 0) {
                        dq9.m("Check failed.");
                    }
                    pne.a(((ky2) xvcVar.b).c());
                    hj1 hj1Var2 = (hj1) xvcVar.c;
                    y11Var = (y11) xvcVar.d;
                    this.c = hj1Var2;
                    this.b = b3;
                    y11Var.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = y11.c;
                    Unsafe unsafe = fy.a;
                    long j = y11.x;
                    pk1 pk1Var2 = (pk1) unsafe.getObjectVolatile(y11Var, j);
                    while (!y11Var.s()) {
                    }
                    Throwable l = y11Var.l();
                    int i = poa.a;
                    throw l;
                }
                if (b7 == 1) {
                    hj1 hj1Var3 = (hj1) this.c;
                    tue.b(obj);
                    hj1Var = hj1Var3;
                    g7cVar = g7cVar2;
                    obj2 = obj;
                    this.c = null;
                    this.b = (byte) 2;
                } else {
                    if (b7 == 2) {
                        tue.b(obj);
                        g7cVar = g7cVar2;
                        g7cVar2 = g7cVar;
                        if (((AtomicInteger) ((k6d) xvcVar.e).b).decrementAndGet() == 0) {
                            return g7cVar2;
                        }
                        b3 = 1;
                        pne.a(((ky2) xvcVar.b).c());
                        hj1 hj1Var22 = (hj1) xvcVar.c;
                        y11Var = (y11) xvcVar.d;
                        this.c = hj1Var22;
                        this.b = b3;
                        y11Var.getClass();
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = y11.c;
                        Unsafe unsafe2 = fy.a;
                        long j2 = y11.x;
                        pk1 pk1Var22 = (pk1) unsafe2.getObjectVolatile(y11Var, j2);
                        while (!y11Var.s()) {
                            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(y11Var);
                            long j3 = a21.b;
                            y11 y11Var3 = y11Var;
                            long j4 = andIncrement / j3;
                            int i2 = (int) (andIncrement % j3);
                            if (pk1Var22.d == j4) {
                                y11Var2 = y11Var3;
                            } else {
                                y11Var2 = y11Var3;
                                pk1 h = y11Var2.h(j4, pk1Var22);
                                if (h == null) {
                                    y11Var = y11Var2;
                                } else {
                                    pk1Var22 = h;
                                }
                            }
                            long j5 = j2;
                            pk1 pk1Var3 = pk1Var22;
                            y11Var = y11Var2;
                            Object C = y11Var.C(pk1Var3, i2, andIncrement, null);
                            du2 du2Var = a21.m;
                            if (C != du2Var) {
                                hj1 hj1Var4 = hj1Var22;
                                du2 du2Var2 = a21.o;
                                if (C != du2Var2) {
                                    g7cVar = g7cVar2;
                                    if (C == a21.n) {
                                        vb1 a2 = lsd.a(fne.a(this));
                                        try {
                                            Object C2 = y11Var.C(pk1Var3, i2, andIncrement, a2);
                                            if (C2 == du2Var) {
                                                a2.a(pk1Var3, i2);
                                            } else if (C2 != du2Var2) {
                                                pk1Var3.b();
                                                a2.A(C2, null);
                                            } else {
                                                if (andIncrement < y11Var.o()) {
                                                    pk1Var3.b();
                                                }
                                                pk1 pk1Var4 = (pk1) fy.a.getObjectVolatile(y11Var, j5);
                                                while (true) {
                                                    if (y11Var.s()) {
                                                        a2.resumeWith(new sc9(y11Var.l()));
                                                    } else {
                                                        long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(y11Var);
                                                        long j6 = a21.b;
                                                        long j7 = andIncrement2 / j6;
                                                        int i3 = (int) (andIncrement2 % j6);
                                                        if (pk1Var4.d == j7) {
                                                            pk1Var = pk1Var4;
                                                        } else {
                                                            pk1 h2 = y11Var.h(j7, pk1Var4);
                                                            if (h2 != null) {
                                                                pk1Var = h2;
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                        Object C3 = y11Var.C(pk1Var, i3, andIncrement2, a2);
                                                        pk1 pk1Var5 = pk1Var;
                                                        if (C3 == a21.m) {
                                                            a2.a(pk1Var5, i3);
                                                        } else if (C3 == a21.o) {
                                                            if (andIncrement2 < y11Var.o()) {
                                                                pk1Var5.b();
                                                            }
                                                            pk1Var4 = pk1Var5;
                                                        } else {
                                                            if (C3 == a21.n) {
                                                                throw new IllegalStateException("unexpected");
                                                            }
                                                            pk1Var5.b();
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
                                        pk1Var3.b();
                                        obj2 = C;
                                    }
                                    if (obj2 != ly2Var) {
                                        hj1Var = hj1Var4;
                                        this.c = null;
                                        this.b = (byte) 2;
                                        break;
                                    }
                                    return ly2Var;
                                }
                                if (andIncrement < y11Var.o()) {
                                    pk1Var3.b();
                                }
                                hj1Var22 = hj1Var4;
                                pk1Var22 = pk1Var3;
                                j2 = j5;
                            } else {
                                dq9.m("unexpected");
                            }
                        }
                        Throwable l2 = y11Var.l();
                        int i4 = poa.a;
                        throw l2;
                    }
                    dq9.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj4(xvc xvcVar, px2 px2Var) {
        super(2, px2Var);
        this.a = (byte) 2;
        this.d = xvcVar;
    }
}
