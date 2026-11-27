// default package

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class k0b implements mm4, vs4, nm4 {
    public static final /* synthetic */ long e = fx.a.objectFieldOffset(k0b.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public l0b[] a;
    public int b;
    public int c;
    public int d;

    public k0b(Object obj) {
        this._state$volatile = obj;
    }

    @Override // vs4
    public final mm4 D(int i, x01 x01Var) {
        return ((((i < 0 || i >= 2) && i != -2) || x01Var != x01.b) && !((i == 0 || i == -3) && x01Var == x01.a)) ? new ji1(this, u24.a, i, x01Var, (byte) 1) : this;
    }

    public final void a(l0b l0bVar) {
        synchronized (this) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                this.c = 0;
            }
            l0bVar.getClass();
            l0bVar.a.set(null);
        }
    }

    public final void b(Object obj) {
        if (obj == null) {
            obj = sfd.a;
        }
        d(null, obj);
    }

    @Override // nm4
    public final Object c(Object obj, zw2 zw2Var) {
        b(obj);
        return f9c.a;
    }

    public final boolean d(Object obj, Object obj2) {
        int i;
        l0b[] l0bVarArr;
        ow5 ow5Var;
        synchronized (this) {
            Unsafe unsafe = fx.a;
            long j = e;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !ur5.a(objectVolatile, obj)) {
                return false;
            }
            if (ur5.a(objectVolatile, obj2)) {
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
            l0b[] l0bVarArr2 = this.a;
            while (true) {
                if (l0bVarArr2 != null) {
                    for (l0b l0bVar : l0bVarArr2) {
                        if (l0bVar != null) {
                            AtomicReference atomicReference = l0bVar.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (ow5Var = whd.b)) {
                                    ow5 ow5Var2 = whd.a;
                                    if (obj3 != ow5Var2) {
                                        while (!atomicReference.compareAndSet(obj3, ow5Var2)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        ((va1) obj3).resumeWith(f9c.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, ow5Var)) {
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
                    l0bVarArr = this.a;
                }
                l0bVarArr2 = l0bVarArr;
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
    /* JADX WARN: Type inference failed for: r2v1, types: [l0b] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [l0b] */
    /* JADX WARN: Type inference failed for: r2v16, types: [l0b] */
    /* JADX WARN: Type inference failed for: r2v17, types: [l0b] */
    /* JADX WARN: Type inference failed for: r2v19, types: [l0b] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [k0b] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f6 -> B:14:0x00b0). Please report as a decompilation issue!!! */
    @Override // mm4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(nm4 nm4Var, zw2 zw2Var) {
        j0b j0bVar;
        ?? r2;
        l0b l0bVar;
        AtomicReference atomicReference;
        k0b k0bVar;
        nm4 nm4Var2;
        ev5 ev5Var;
        Object obj;
        Object andSet;
        try {
            if (zw2Var instanceof j0b) {
                j0bVar = (j0b) zw2Var;
                int i = j0bVar.n;
                if ((i & TLObject.FLAG_31) != 0) {
                    j0bVar.n = i - TLObject.FLAG_31;
                    Object obj2 = j0bVar.f;
                    vx2 vx2Var = vx2.a;
                    r2 = j0bVar.n;
                    if (r2 != 0) {
                        ixe.b(obj2);
                        synchronized (this) {
                            l0b[] l0bVarArr = this.a;
                            if (l0bVarArr == null) {
                                l0bVarArr = new l0b[2];
                                this.a = l0bVarArr;
                            } else if (this.b >= l0bVarArr.length) {
                                Object[] copyOf = Arrays.copyOf(l0bVarArr, l0bVarArr.length << 1);
                                this.a = (l0b[]) copyOf;
                                l0bVarArr = (l0b[]) copyOf;
                            }
                            int i2 = this.c;
                            do {
                                l0bVar = l0bVarArr[i2];
                                if (l0bVar == null) {
                                    l0bVar = new l0b();
                                    l0bVarArr[i2] = l0bVar;
                                }
                                i2++;
                                if (i2 >= l0bVarArr.length) {
                                    i2 = 0;
                                }
                                atomicReference = l0bVar.a;
                            } while (atomicReference.get() != null);
                            atomicReference.set(whd.a);
                            this.c = i2;
                            this.b++;
                        }
                        r2 = l0bVar;
                    } else if (r2 == 1) {
                        r2 = j0bVar.c;
                        nm4Var = j0bVar.b;
                        this = j0bVar.a;
                        try {
                            ixe.b(obj2);
                            r2 = r2;
                        } catch (Throwable th) {
                            ?? r8 = this;
                            th = th;
                            r8.a(r2);
                            throw th;
                        }
                    } else if (r2 == 2) {
                        obj = j0bVar.e;
                        ev5Var = j0bVar.d;
                        l0b l0bVar2 = j0bVar.c;
                        nm4Var2 = j0bVar.b;
                        k0bVar = j0bVar.a;
                        ixe.b(obj2);
                        r2 = l0bVar2;
                        AtomicReference atomicReference2 = r2.a;
                        ow5 ow5Var = whd.a;
                        andSet = atomicReference2.getAndSet(ow5Var);
                        andSet.getClass();
                        if (andSet != whd.b) {
                        }
                        if (k0bVar != null) {
                        }
                    } else {
                        if (r2 != 3) {
                            grb.i("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = j0bVar.e;
                        ev5Var = j0bVar.d;
                        r2 = j0bVar.c;
                        nm4Var2 = j0bVar.b;
                        k0bVar = j0bVar.a;
                        ixe.b(obj2);
                        if (k0bVar != null) {
                            Object objectVolatile = fx.a.getObjectVolatile(k0bVar, e);
                            if (ev5Var != null && !ev5Var.isActive()) {
                                throw ev5Var.getCancellationException();
                            }
                            if (obj != null) {
                                r2 = r2;
                            }
                            Object obj3 = objectVolatile == sfd.a ? null : objectVolatile;
                            j0bVar.a = k0bVar;
                            j0bVar.b = nm4Var2;
                            j0bVar.c = r2;
                            j0bVar.d = ev5Var;
                            j0bVar.e = objectVolatile;
                            j0bVar.n = 2;
                            if (nm4Var2.c(obj3, j0bVar) != vx2Var) {
                                obj = objectVolatile;
                                r2 = r2;
                                AtomicReference atomicReference22 = r2.a;
                                ow5 ow5Var2 = whd.a;
                                andSet = atomicReference22.getAndSet(ow5Var2);
                                andSet.getClass();
                                if (andSet != whd.b) {
                                    j0bVar.a = k0bVar;
                                    j0bVar.b = nm4Var2;
                                    j0bVar.c = r2;
                                    j0bVar.d = ev5Var;
                                    j0bVar.e = obj;
                                    j0bVar.n = 3;
                                    f9c f9cVar = f9c.a;
                                    va1 va1Var = new va1(1, xpe.a(j0bVar));
                                    va1Var.s();
                                    AtomicReference atomicReference3 = r2.a;
                                    while (true) {
                                        if (atomicReference3.compareAndSet(ow5Var2, va1Var)) {
                                            break;
                                        }
                                        if (atomicReference3.get() != ow5Var2) {
                                            va1Var.resumeWith(f9cVar);
                                            break;
                                        }
                                    }
                                    Object q = va1Var.q();
                                    if (q == vx2.a) {
                                    }
                                }
                                if (k0bVar != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return vx2Var;
                        }
                    }
                    k0bVar = this;
                    nm4Var2 = nm4Var;
                    ev5Var = (ev5) j0bVar.getContext().get(qf5.c);
                    obj = null;
                    if (k0bVar != null) {
                    }
                }
            }
            if (r2 != 0) {
            }
            k0bVar = this;
            nm4Var2 = nm4Var;
            ev5Var = (ev5) j0bVar.getContext().get(qf5.c);
            obj = null;
            if (k0bVar != null) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        j0bVar = new j0b(this, zw2Var);
        Object obj22 = j0bVar.f;
        vx2 vx2Var2 = vx2.a;
        r2 = j0bVar.n;
    }
}
