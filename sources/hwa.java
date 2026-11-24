// default package

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hwa implements hk4, rq4, ik4 {
    public static final /* synthetic */ long e = ex.a.objectFieldOffset(hwa.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public iwa[] a;
    public int b;
    public int c;
    public int d;

    public hwa(Object obj) {
        this._state$volatile = obj;
    }

    @Override // rq4
    public final hk4 C(int i, o01 o01Var) {
        return ((((i < 0 || i >= 2) && i != -2) || o01Var != o01.b) && !((i == 0 || i == -3) && o01Var == o01.a)) ? new bi1(this, z14.a, i, o01Var, (byte) 1) : this;
    }

    public final void a(iwa iwaVar) {
        synchronized (this) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                this.c = 0;
            }
            iwaVar.getClass();
            iwaVar.a.set(null);
        }
    }

    public final void b(Object obj) {
        if (obj == null) {
            obj = zad.a;
        }
        d(null, obj);
    }

    @Override // ik4
    public final Object c(Object obj, fw2 fw2Var) {
        b(obj);
        return g5c.a;
    }

    public final boolean d(Object obj, Object obj2) {
        int i;
        iwa[] iwaVarArr;
        lo5 lo5Var;
        synchronized (this) {
            Unsafe unsafe = ex.a;
            long j = e;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !rp5.a(objectVolatile, obj)) {
                return false;
            }
            if (rp5.a(objectVolatile, obj2)) {
                return true;
            }
            unsafe.putObjectVolatile(this, j, obj2);
            int i2 = this.d;
            if ((i2 & 1) != 0) {
                this.d = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.d = i3;
            iwa[] iwaVarArr2 = this.a;
            while (true) {
                if (iwaVarArr2 != null) {
                    for (iwa iwaVar : iwaVarArr2) {
                        if (iwaVar != null) {
                            AtomicReference atomicReference = iwaVar.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (lo5Var = ddd.b)) {
                                    lo5 lo5Var2 = ddd.a;
                                    if (obj3 != lo5Var2) {
                                        while (!atomicReference.compareAndSet(obj3, lo5Var2)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        ((na1) obj3).resumeWith(g5c.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, lo5Var)) {
                                        if (atomicReference.get() != obj3) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.d;
                    if (i == i3) {
                        this.d = i3 + 1;
                        return true;
                    }
                    iwaVarArr = this.a;
                }
                iwaVarArr2 = iwaVarArr;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00cd, code lost:
    
        if (r13.equals(r15) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012c, code lost:
    
        if (r9 == r1) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        if (r15 != r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2 A[Catch: all -> 0x0135, TRY_ENTER, TryCatch #0 {all -> 0x0135, blocks: (B:13:0x0034, B:15:0x00b2, B:17:0x00bc, B:19:0x00c2, B:20:0x00c6, B:23:0x00c9, B:25:0x00e9, B:27:0x00f8, B:28:0x0114, B:30:0x011a, B:33:0x0120, B:34:0x0123, B:42:0x00cf, B:45:0x00d6, B:49:0x012f, B:50:0x0134, B:54:0x0049), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8 A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:13:0x0034, B:15:0x00b2, B:17:0x00bc, B:19:0x00c2, B:20:0x00c6, B:23:0x00c9, B:25:0x00e9, B:27:0x00f8, B:28:0x0114, B:30:0x011a, B:33:0x0120, B:34:0x0123, B:42:0x00cf, B:45:0x00d6, B:49:0x012f, B:50:0x0134, B:54:0x0049), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f A[Catch: all -> 0x0135, TryCatch #0 {all -> 0x0135, blocks: (B:13:0x0034, B:15:0x00b2, B:17:0x00bc, B:19:0x00c2, B:20:0x00c6, B:23:0x00c9, B:25:0x00e9, B:27:0x00f8, B:28:0x0114, B:30:0x011a, B:33:0x0120, B:34:0x0123, B:42:0x00cf, B:45:0x00d6, B:49:0x012f, B:50:0x0134, B:54:0x0049), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [iwa] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [iwa] */
    /* JADX WARN: Type inference failed for: r2v16, types: [iwa] */
    /* JADX WARN: Type inference failed for: r2v17, types: [iwa] */
    /* JADX WARN: Type inference failed for: r2v19, types: [iwa] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [hwa] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f6 -> B:14:0x00b0). Please report as a decompilation issue!!! */
    @Override // hk4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ik4 ik4Var, fw2 fw2Var) {
        gwa gwaVar;
        ?? r2;
        iwa iwaVar;
        AtomicReference atomicReference;
        hwa hwaVar;
        ik4 ik4Var2;
        bt5 bt5Var;
        Object obj;
        Object andSet;
        try {
            if (fw2Var instanceof gwa) {
                gwaVar = (gwa) fw2Var;
                int i = gwaVar.n;
                if ((i & TLObject.FLAG_31) != 0) {
                    gwaVar.n = i - TLObject.FLAG_31;
                    Object obj2 = gwaVar.f;
                    bx2 bx2Var = bx2.a;
                    r2 = gwaVar.n;
                    if (r2 != 0) {
                        qse.b(obj2);
                        synchronized (this) {
                            iwa[] iwaVarArr = this.a;
                            if (iwaVarArr == null) {
                                iwaVarArr = new iwa[2];
                                this.a = iwaVarArr;
                            } else if (this.b >= iwaVarArr.length) {
                                Object[] copyOf = Arrays.copyOf(iwaVarArr, iwaVarArr.length << 1);
                                this.a = (iwa[]) copyOf;
                                iwaVarArr = (iwa[]) copyOf;
                            }
                            int i2 = this.c;
                            do {
                                iwaVar = iwaVarArr[i2];
                                if (iwaVar == null) {
                                    iwaVar = new iwa();
                                    iwaVarArr[i2] = iwaVar;
                                }
                                i2++;
                                if (i2 >= iwaVarArr.length) {
                                    i2 = 0;
                                }
                                atomicReference = iwaVar.a;
                            } while (atomicReference.get() != null);
                            atomicReference.set(ddd.a);
                            this.c = i2;
                            this.b++;
                        }
                        r2 = iwaVar;
                    } else if (r2 == 1) {
                        r2 = gwaVar.c;
                        ik4Var = gwaVar.b;
                        this = gwaVar.a;
                        try {
                            qse.b(obj2);
                            r2 = r2;
                        } catch (Throwable th) {
                            ?? r8 = this;
                            th = th;
                            r8.a(r2);
                            throw th;
                        }
                    } else if (r2 == 2) {
                        obj = gwaVar.e;
                        bt5Var = gwaVar.d;
                        iwa iwaVar2 = gwaVar.c;
                        ik4Var2 = gwaVar.b;
                        hwaVar = gwaVar.a;
                        qse.b(obj2);
                        r2 = iwaVar2;
                        AtomicReference atomicReference2 = r2.a;
                        lo5 lo5Var = ddd.a;
                        andSet = atomicReference2.getAndSet(lo5Var);
                        andSet.getClass();
                        if (andSet != ddd.b) {
                        }
                        if (hwaVar != null) {
                        }
                    } else {
                        if (r2 != 3) {
                            sc8.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = gwaVar.e;
                        bt5Var = gwaVar.d;
                        r2 = gwaVar.c;
                        ik4Var2 = gwaVar.b;
                        hwaVar = gwaVar.a;
                        qse.b(obj2);
                        if (hwaVar != null) {
                            Object objectVolatile = ex.a.getObjectVolatile(hwaVar, e);
                            if (bt5Var != null && !bt5Var.isActive()) {
                                throw bt5Var.getCancellationException();
                            }
                            if (obj != null) {
                                r2 = r2;
                            }
                            Object obj3 = objectVolatile == zad.a ? null : objectVolatile;
                            gwaVar.a = hwaVar;
                            gwaVar.b = ik4Var2;
                            gwaVar.c = r2;
                            gwaVar.d = bt5Var;
                            gwaVar.e = objectVolatile;
                            gwaVar.n = 2;
                            if (ik4Var2.c(obj3, gwaVar) != bx2Var) {
                                obj = objectVolatile;
                                r2 = r2;
                                AtomicReference atomicReference22 = r2.a;
                                lo5 lo5Var2 = ddd.a;
                                andSet = atomicReference22.getAndSet(lo5Var2);
                                andSet.getClass();
                                if (andSet != ddd.b) {
                                    gwaVar.a = hwaVar;
                                    gwaVar.b = ik4Var2;
                                    gwaVar.c = r2;
                                    gwaVar.d = bt5Var;
                                    gwaVar.e = obj;
                                    gwaVar.n = 3;
                                    g5c g5cVar = g5c.a;
                                    na1 na1Var = new na1(1, dle.a(gwaVar));
                                    na1Var.s();
                                    AtomicReference atomicReference3 = r2.a;
                                    while (true) {
                                        if (atomicReference3.compareAndSet(lo5Var2, na1Var)) {
                                            break;
                                        }
                                        if (atomicReference3.get() != lo5Var2) {
                                            na1Var.resumeWith(g5cVar);
                                            break;
                                        }
                                    }
                                    Object q = na1Var.q();
                                    if (q == bx2.a) {
                                    }
                                }
                                if (hwaVar != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return bx2Var;
                        }
                    }
                    hwaVar = this;
                    ik4Var2 = ik4Var;
                    bt5Var = (bt5) gwaVar.getContext().get(pd5.c);
                    obj = null;
                    if (hwaVar != null) {
                    }
                }
            }
            if (r2 != 0) {
            }
            hwaVar = this;
            ik4Var2 = ik4Var;
            bt5Var = (bt5) gwaVar.getContext().get(pd5.c);
            obj = null;
            if (hwaVar != null) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        gwaVar = new gwa(this, fw2Var);
        Object obj22 = gwaVar.f;
        bx2 bx2Var2 = bx2.a;
        r2 = gwaVar.n;
    }
}
