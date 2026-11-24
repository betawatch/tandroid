// default package

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLObject;
import sun.misc.Unsafe;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kya implements im4, ss4, jm4 {
    public static final /* synthetic */ long e = fy.a.objectFieldOffset(kya.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ Object _state$volatile;
    public lya[] a;
    public int b;
    public int c;
    public int d;

    public kya(Object obj) {
        this._state$volatile = obj;
    }

    @Override // ss4
    public final im4 D(int i, w11 w11Var) {
        return ((((i < 0 || i >= 2) && i != -2) || w11Var != w11.b) && !((i == 0 || i == -3) && w11Var == w11.a)) ? new ij1(this, k34.a, i, w11Var, (byte) 1) : this;
    }

    public final void a(lya lyaVar) {
        synchronized (this) {
            int i = this.b - 1;
            this.b = i;
            if (i == 0) {
                this.c = 0;
            }
            lyaVar.getClass();
            lyaVar.a.set(null);
        }
    }

    public final void b(Object obj) {
        if (obj == null) {
            obj = bdd.a;
        }
        d(null, obj);
    }

    @Override // jm4
    public final Object c(Object obj, px2 px2Var) {
        b(obj);
        return g7c.a;
    }

    public final boolean d(Object obj, Object obj2) {
        int i;
        lya[] lyaVarArr;
        du2 du2Var;
        synchronized (this) {
            Unsafe unsafe = fy.a;
            long j = e;
            Object objectVolatile = unsafe.getObjectVolatile(this, j);
            if (obj != null && !rr5.a(objectVolatile, obj)) {
                return false;
            }
            if (rr5.a(objectVolatile, obj2)) {
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
            lya[] lyaVarArr2 = this.a;
            while (true) {
                if (lyaVarArr2 != null) {
                    for (lya lyaVar : lyaVarArr2) {
                        if (lyaVar != null) {
                            AtomicReference atomicReference = lyaVar.a;
                            while (true) {
                                Object obj3 = atomicReference.get();
                                if (obj3 != null && obj3 != (du2Var = ffd.b)) {
                                    du2 du2Var2 = ffd.a;
                                    if (obj3 != du2Var2) {
                                        while (!atomicReference.compareAndSet(obj3, du2Var2)) {
                                            if (atomicReference.get() != obj3) {
                                                break;
                                            }
                                        }
                                        ((vb1) obj3).resumeWith(g7c.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj3, du2Var)) {
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
                    lyaVarArr = this.a;
                }
                lyaVarArr2 = lyaVarArr;
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
    /* JADX WARN: Type inference failed for: r2v1, types: [lya] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [lya] */
    /* JADX WARN: Type inference failed for: r2v16, types: [lya] */
    /* JADX WARN: Type inference failed for: r2v17, types: [lya] */
    /* JADX WARN: Type inference failed for: r2v19, types: [lya] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r8v3, types: [kya] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00f6 -> B:14:0x00b0). Please report as a decompilation issue!!! */
    @Override // im4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(jm4 jm4Var, px2 px2Var) {
        jya jyaVar;
        ?? r2;
        lya lyaVar;
        AtomicReference atomicReference;
        kya kyaVar;
        jm4 jm4Var2;
        av5 av5Var;
        Object obj;
        Object andSet;
        try {
            if (px2Var instanceof jya) {
                jyaVar = (jya) px2Var;
                int i = jyaVar.n;
                if ((i & TLObject.FLAG_31) != 0) {
                    jyaVar.n = i - TLObject.FLAG_31;
                    Object obj2 = jyaVar.f;
                    ly2 ly2Var = ly2.a;
                    r2 = jyaVar.n;
                    if (r2 != 0) {
                        tue.b(obj2);
                        synchronized (this) {
                            lya[] lyaVarArr = this.a;
                            if (lyaVarArr == null) {
                                lyaVarArr = new lya[2];
                                this.a = lyaVarArr;
                            } else if (this.b >= lyaVarArr.length) {
                                Object[] copyOf = Arrays.copyOf(lyaVarArr, lyaVarArr.length << 1);
                                this.a = (lya[]) copyOf;
                                lyaVarArr = (lya[]) copyOf;
                            }
                            int i2 = this.c;
                            do {
                                lyaVar = lyaVarArr[i2];
                                if (lyaVar == null) {
                                    lyaVar = new lya();
                                    lyaVarArr[i2] = lyaVar;
                                }
                                i2++;
                                if (i2 >= lyaVarArr.length) {
                                    i2 = 0;
                                }
                                atomicReference = lyaVar.a;
                            } while (atomicReference.get() != null);
                            atomicReference.set(ffd.a);
                            this.c = i2;
                            this.b++;
                        }
                        r2 = lyaVar;
                    } else if (r2 == 1) {
                        r2 = jyaVar.c;
                        jm4Var = jyaVar.b;
                        this = jyaVar.a;
                        try {
                            tue.b(obj2);
                            r2 = r2;
                        } catch (Throwable th) {
                            ?? r8 = this;
                            th = th;
                            r8.a(r2);
                            throw th;
                        }
                    } else if (r2 == 2) {
                        obj = jyaVar.e;
                        av5Var = jyaVar.d;
                        lya lyaVar2 = jyaVar.c;
                        jm4Var2 = jyaVar.b;
                        kyaVar = jyaVar.a;
                        tue.b(obj2);
                        r2 = lyaVar2;
                        AtomicReference atomicReference2 = r2.a;
                        du2 du2Var = ffd.a;
                        andSet = atomicReference2.getAndSet(du2Var);
                        andSet.getClass();
                        if (andSet != ffd.b) {
                        }
                        if (kyaVar != null) {
                        }
                    } else {
                        if (r2 != 3) {
                            dq9.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        obj = jyaVar.e;
                        av5Var = jyaVar.d;
                        r2 = jyaVar.c;
                        jm4Var2 = jyaVar.b;
                        kyaVar = jyaVar.a;
                        tue.b(obj2);
                        if (kyaVar != null) {
                            Object objectVolatile = fy.a.getObjectVolatile(kyaVar, e);
                            if (av5Var != null && !av5Var.isActive()) {
                                throw av5Var.getCancellationException();
                            }
                            if (obj != null) {
                                r2 = r2;
                            }
                            Object obj3 = objectVolatile == bdd.a ? null : objectVolatile;
                            jyaVar.a = kyaVar;
                            jyaVar.b = jm4Var2;
                            jyaVar.c = r2;
                            jyaVar.d = av5Var;
                            jyaVar.e = objectVolatile;
                            jyaVar.n = 2;
                            if (jm4Var2.c(obj3, jyaVar) != ly2Var) {
                                obj = objectVolatile;
                                r2 = r2;
                                AtomicReference atomicReference22 = r2.a;
                                du2 du2Var2 = ffd.a;
                                andSet = atomicReference22.getAndSet(du2Var2);
                                andSet.getClass();
                                if (andSet != ffd.b) {
                                    jyaVar.a = kyaVar;
                                    jyaVar.b = jm4Var2;
                                    jyaVar.c = r2;
                                    jyaVar.d = av5Var;
                                    jyaVar.e = obj;
                                    jyaVar.n = 3;
                                    g7c g7cVar = g7c.a;
                                    vb1 vb1Var = new vb1(1, fne.a(jyaVar));
                                    vb1Var.s();
                                    AtomicReference atomicReference3 = r2.a;
                                    while (true) {
                                        if (atomicReference3.compareAndSet(du2Var2, vb1Var)) {
                                            break;
                                        }
                                        if (atomicReference3.get() != du2Var2) {
                                            vb1Var.resumeWith(g7cVar);
                                            break;
                                        }
                                    }
                                    Object q = vb1Var.q();
                                    if (q == ly2.a) {
                                    }
                                }
                                if (kyaVar != null) {
                                    throw new ClassCastException();
                                }
                            }
                            return ly2Var;
                        }
                    }
                    kyaVar = this;
                    jm4Var2 = jm4Var;
                    av5Var = (av5) jyaVar.getContext().get(nf5.c);
                    obj = null;
                    if (kyaVar != null) {
                    }
                }
            }
            if (r2 != 0) {
            }
            kyaVar = this;
            jm4Var2 = jm4Var;
            av5Var = (av5) jyaVar.getContext().get(nf5.c);
            obj = null;
            if (kyaVar != null) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        jyaVar = new jya(this, px2Var);
        Object obj22 = jyaVar.f;
        ly2 ly2Var2 = ly2.a;
        r2 = jyaVar.n;
    }
}
