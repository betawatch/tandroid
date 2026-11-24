// default package

import android.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class eh4 extends ccb implements eq4 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eh4(Object obj, Object obj2, fw2 fw2Var, byte b) {
        super(2, fw2Var);
        this.a = b;
        this.c = obj;
        this.d = obj2;
    }

    @Override // of0
    public final fw2 create(Object obj, fw2 fw2Var) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new eh4((fh4) this.c, (i7a) obj2, fw2Var, (byte) 0);
            case 1:
                return new eh4((fga) this.c, (w5a) obj2, fw2Var, (byte) 1);
            default:
                return new eh4((c5a) obj2, fw2Var);
        }
    }

    @Override // eq4
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        g5c g5cVar = g5c.a;
        ax2 ax2Var = (ax2) obj;
        fw2 fw2Var = (fw2) obj2;
        switch (b) {
        }
        return ((eh4) create(ax2Var, fw2Var)).invokeSuspend(g5cVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d5, code lost:
    
        if (r0.a(r5, r20) == r6) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x021f, code lost:
    
        if (r4.e(r0, cga.b, r20) == r6) goto L107;
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
    @Override // of0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object b;
        g5c g5cVar;
        ai1 ai1Var;
        Object obj2;
        q01 q01Var;
        q01 q01Var2;
        hj1 hj1Var;
        byte b2 = this.a;
        Object obj3 = this.d;
        g5c g5cVar2 = g5c.a;
        bx2 bx2Var = bx2.a;
        byte b3 = 1;
        switch (b2) {
            case 0:
                fh4 fh4Var = (fh4) this.c;
                k7a k7aVar = fh4Var.b;
                byte b4 = this.b;
                if (b4 == 0) {
                    qse.b(obj);
                    lh4 lh4Var = lh4.a;
                    this.b = (byte) 1;
                    b = lh4Var.b(this);
                    break;
                } else {
                    if (b4 != 1) {
                        if (b4 != 2) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qse.b(obj);
                        Boolean b5 = k7aVar.a.b();
                        if ((b5 == null && (b5 = k7aVar.b.b()) == null) ? true : b5.booleanValue()) {
                            jg4 jg4Var = fh4Var.a;
                            w44 w44Var = new w44((byte) 20);
                            jg4Var.a();
                            jg4Var.j.add(w44Var);
                        } else {
                            wod.a(Log.d("FirebaseSessions", "Sessions SDK disabled. Not listening to lifecycle events."));
                        }
                        return g5cVar2;
                    }
                    qse.b(obj);
                    b = obj;
                }
                Collection values = ((Map) b).values();
                if (!(values instanceof Collection) || !values.isEmpty()) {
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        if (((zx2) it.next()).a.a()) {
                            this.b = (byte) 2;
                            break;
                        }
                    }
                }
                wod.a(Log.d("FirebaseSessions", "No Sessions subscribers. Not listening to lifecycle events."));
                return g5cVar2;
            case 1:
                w5a w5aVar = (w5a) obj3;
                fga fgaVar = (fga) this.c;
                byte b6 = this.b;
                try {
                } catch (Exception e) {
                    Log.d("FirebaseSessions", "App foregrounded, failed to update data. Message: " + e.getMessage());
                    if (fgaVar.d(w5aVar)) {
                        a6a a = fgaVar.b.a(w5aVar.a);
                        fgaVar.h = w5a.a(w5aVar, a, null, null, 4);
                        g6a g6aVar = fgaVar.c;
                        ppd.b(h9e.a(g6aVar.e), new e6a(g6aVar, a, null));
                        String str = a.a;
                        this.b = (byte) 2;
                        break;
                    }
                }
                if (b6 == 0) {
                    qse.b(obj);
                    v63 v63Var = fgaVar.e;
                    dga dgaVar = new dga(fgaVar, null, (byte) 1);
                    this.b = (byte) 1;
                    break;
                } else {
                    if (b6 != 1) {
                        if (b6 == 2) {
                            qse.b(obj);
                            return g5cVar2;
                        }
                        sc8.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qse.b(obj);
                }
                return g5cVar2;
            default:
                c5a c5aVar = (c5a) obj3;
                byte b7 = this.b;
                if (b7 == 0) {
                    qse.b(obj);
                    if (((AtomicInteger) ((i4d) c5aVar.e).a).get() <= 0) {
                        sc8.j("Check failed.");
                    }
                    nle.a(((ax2) c5aVar.b).c());
                    ai1 ai1Var2 = (ai1) c5aVar.c;
                    q01Var = (q01) c5aVar.d;
                    this.c = ai1Var2;
                    this.b = b3;
                    q01Var.getClass();
                    AtomicLongFieldUpdater atomicLongFieldUpdater = q01.c;
                    Unsafe unsafe = ex.a;
                    long j = q01.x;
                    hj1 hj1Var2 = (hj1) unsafe.getObjectVolatile(q01Var, j);
                    while (!q01Var.s()) {
                    }
                    Throwable l = q01Var.l();
                    int i = oma.a;
                    throw l;
                }
                if (b7 == 1) {
                    ai1 ai1Var3 = (ai1) this.c;
                    qse.b(obj);
                    ai1Var = ai1Var3;
                    g5cVar = g5cVar2;
                    obj2 = obj;
                    this.c = null;
                    this.b = (byte) 2;
                } else {
                    if (b7 == 2) {
                        qse.b(obj);
                        g5cVar = g5cVar2;
                        g5cVar2 = g5cVar;
                        if (((AtomicInteger) ((i4d) c5aVar.e).a).decrementAndGet() == 0) {
                            return g5cVar2;
                        }
                        b3 = 1;
                        nle.a(((ax2) c5aVar.b).c());
                        ai1 ai1Var22 = (ai1) c5aVar.c;
                        q01Var = (q01) c5aVar.d;
                        this.c = ai1Var22;
                        this.b = b3;
                        q01Var.getClass();
                        AtomicLongFieldUpdater atomicLongFieldUpdater2 = q01.c;
                        Unsafe unsafe2 = ex.a;
                        long j2 = q01.x;
                        hj1 hj1Var22 = (hj1) unsafe2.getObjectVolatile(q01Var, j2);
                        while (!q01Var.s()) {
                            long andIncrement = atomicLongFieldUpdater2.getAndIncrement(q01Var);
                            long j3 = s01.b;
                            q01 q01Var3 = q01Var;
                            long j4 = andIncrement / j3;
                            int i2 = (int) (andIncrement % j3);
                            if (hj1Var22.d == j4) {
                                q01Var2 = q01Var3;
                            } else {
                                q01Var2 = q01Var3;
                                hj1 h = q01Var2.h(j4, hj1Var22);
                                if (h == null) {
                                    q01Var = q01Var2;
                                } else {
                                    hj1Var22 = h;
                                }
                            }
                            long j5 = j2;
                            hj1 hj1Var3 = hj1Var22;
                            q01Var = q01Var2;
                            Object C = q01Var.C(hj1Var3, i2, andIncrement, null);
                            lo5 lo5Var = s01.m;
                            if (C != lo5Var) {
                                ai1 ai1Var4 = ai1Var22;
                                lo5 lo5Var2 = s01.o;
                                if (C != lo5Var2) {
                                    g5cVar = g5cVar2;
                                    if (C == s01.n) {
                                        na1 a2 = iqd.a(dle.a(this));
                                        try {
                                            Object C2 = q01Var.C(hj1Var3, i2, andIncrement, a2);
                                            if (C2 == lo5Var) {
                                                a2.a(hj1Var3, i2);
                                            } else if (C2 != lo5Var2) {
                                                hj1Var3.b();
                                                a2.A(C2, null);
                                            } else {
                                                if (andIncrement < q01Var.o()) {
                                                    hj1Var3.b();
                                                }
                                                hj1 hj1Var4 = (hj1) ex.a.getObjectVolatile(q01Var, j5);
                                                while (true) {
                                                    if (q01Var.s()) {
                                                        a2.resumeWith(new sa9(q01Var.l()));
                                                    } else {
                                                        long andIncrement2 = atomicLongFieldUpdater2.getAndIncrement(q01Var);
                                                        long j6 = s01.b;
                                                        long j7 = andIncrement2 / j6;
                                                        int i3 = (int) (andIncrement2 % j6);
                                                        if (hj1Var4.d == j7) {
                                                            hj1Var = hj1Var4;
                                                        } else {
                                                            hj1 h2 = q01Var.h(j7, hj1Var4);
                                                            if (h2 != null) {
                                                                hj1Var = h2;
                                                            } else {
                                                                continue;
                                                            }
                                                        }
                                                        Object C3 = q01Var.C(hj1Var, i3, andIncrement2, a2);
                                                        hj1 hj1Var5 = hj1Var;
                                                        if (C3 == s01.m) {
                                                            a2.a(hj1Var5, i3);
                                                        } else if (C3 == s01.o) {
                                                            if (andIncrement2 < q01Var.o()) {
                                                                hj1Var5.b();
                                                            }
                                                            hj1Var4 = hj1Var5;
                                                        } else {
                                                            if (C3 == s01.n) {
                                                                throw new IllegalStateException("unexpected");
                                                            }
                                                            hj1Var5.b();
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
                                        hj1Var3.b();
                                        obj2 = C;
                                    }
                                    if (obj2 != bx2Var) {
                                        ai1Var = ai1Var4;
                                        this.c = null;
                                        this.b = (byte) 2;
                                        break;
                                    }
                                    return bx2Var;
                                }
                                if (andIncrement < q01Var.o()) {
                                    hj1Var3.b();
                                }
                                ai1Var22 = ai1Var4;
                                hj1Var22 = hj1Var3;
                                j2 = j5;
                            } else {
                                sc8.j("unexpected");
                            }
                        }
                        Throwable l2 = q01Var.l();
                        int i4 = oma.a;
                        throw l2;
                    }
                    sc8.j("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh4(c5a c5aVar, fw2 fw2Var) {
        super(2, fw2Var);
        this.a = (byte) 2;
        this.d = c5aVar;
    }
}
