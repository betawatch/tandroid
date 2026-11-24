package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes4.dex */
public final class p extends k {
    public static final j$.sun.misc.a h;
    public static final long i;
    public q e;
    public volatile q f;
    public volatile Thread g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.a(p.class, "lockState");
    }

    public p(q qVar) {
        super(-2, null, null);
        int i2;
        this.f = qVar;
        q qVar2 = null;
        while (qVar != null) {
            q qVar3 = (q) qVar.d;
            qVar.g = null;
            qVar.f = null;
            if (qVar2 == null) {
                qVar.e = null;
                qVar.i = false;
            } else {
                Object obj = qVar.b;
                int i3 = qVar.a;
                q qVar4 = qVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = qVar4.b;
                    int i4 = qVar4.a;
                    if (i4 > i3) {
                        i2 = -1;
                    } else if (i4 < i3) {
                        i2 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i5 = ConcurrentHashMap.g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i2 = compareTo;
                            }
                        }
                        i2 = i(obj, obj2);
                    }
                    q qVar5 = i2 <= 0 ? qVar4.f : qVar4.g;
                    if (qVar5 == null) {
                        break;
                    } else {
                        qVar4 = qVar5;
                    }
                }
                qVar.e = qVar4;
                if (i2 <= 0) {
                    qVar4.f = qVar;
                } else {
                    qVar4.g = qVar;
                }
                qVar = c(qVar2, qVar);
            }
            qVar2 = qVar;
            qVar = qVar3;
        }
        this.e = qVar2;
    }

    public static q b(q qVar, q qVar2) {
        while (qVar2 != null && qVar2 != qVar) {
            q qVar3 = qVar2.e;
            if (qVar3 == null) {
                qVar2.i = false;
                return qVar2;
            }
            if (qVar2.i) {
                qVar2.i = false;
                return qVar;
            }
            q qVar4 = qVar3.f;
            if (qVar4 == qVar2) {
                q qVar5 = qVar3.g;
                if (qVar5 != null && qVar5.i) {
                    qVar5.i = false;
                    qVar3.i = true;
                    qVar = g(qVar, qVar3);
                    qVar3 = qVar2.e;
                    qVar5 = qVar3 == null ? null : qVar3.g;
                }
                if (qVar5 != null) {
                    q qVar6 = qVar5.f;
                    q qVar7 = qVar5.g;
                    if ((qVar7 == null || !qVar7.i) && (qVar6 == null || !qVar6.i)) {
                        qVar5.i = true;
                    } else {
                        if (qVar7 == null || !qVar7.i) {
                            if (qVar6 != null) {
                                qVar6.i = false;
                            }
                            qVar5.i = true;
                            qVar = h(qVar, qVar5);
                            qVar3 = qVar2.e;
                            qVar5 = qVar3 != null ? qVar3.g : null;
                        }
                        if (qVar5 != null) {
                            qVar5.i = qVar3 == null ? false : qVar3.i;
                            q qVar8 = qVar5.g;
                            if (qVar8 != null) {
                                qVar8.i = false;
                            }
                        }
                        if (qVar3 != null) {
                            qVar3.i = false;
                            qVar = g(qVar, qVar3);
                        }
                        qVar2 = qVar;
                    }
                }
                qVar2 = qVar3;
            } else {
                if (qVar4 != null && qVar4.i) {
                    qVar4.i = false;
                    qVar3.i = true;
                    qVar = h(qVar, qVar3);
                    qVar3 = qVar2.e;
                    qVar4 = qVar3 == null ? null : qVar3.f;
                }
                if (qVar4 != null) {
                    q qVar9 = qVar4.f;
                    q qVar10 = qVar4.g;
                    if ((qVar9 == null || !qVar9.i) && (qVar10 == null || !qVar10.i)) {
                        qVar4.i = true;
                    } else {
                        if (qVar9 == null || !qVar9.i) {
                            if (qVar10 != null) {
                                qVar10.i = false;
                            }
                            qVar4.i = true;
                            qVar = g(qVar, qVar4);
                            qVar3 = qVar2.e;
                            qVar4 = qVar3 != null ? qVar3.f : null;
                        }
                        if (qVar4 != null) {
                            qVar4.i = qVar3 == null ? false : qVar3.i;
                            q qVar11 = qVar4.f;
                            if (qVar11 != null) {
                                qVar11.i = false;
                            }
                        }
                        if (qVar3 != null) {
                            qVar3.i = false;
                            qVar = h(qVar, qVar3);
                        }
                        qVar2 = qVar;
                    }
                }
                qVar2 = qVar3;
            }
        }
        return qVar;
    }

    public static q c(q qVar, q qVar2) {
        q qVar3;
        qVar2.i = true;
        while (true) {
            q qVar4 = qVar2.e;
            if (qVar4 == null) {
                qVar2.i = false;
                return qVar2;
            }
            if (!qVar4.i || (qVar3 = qVar4.e) == null) {
                break;
            }
            q qVar5 = qVar3.f;
            if (qVar4 == qVar5) {
                q qVar6 = qVar3.g;
                if (qVar6 == null || !qVar6.i) {
                    if (qVar2 == qVar4.g) {
                        qVar = g(qVar, qVar4);
                        q qVar7 = qVar4.e;
                        qVar3 = qVar7 == null ? null : qVar7.e;
                        qVar4 = qVar7;
                        qVar2 = qVar4;
                    }
                    if (qVar4 != null) {
                        qVar4.i = false;
                        if (qVar3 != null) {
                            qVar3.i = true;
                            qVar = h(qVar, qVar3);
                        }
                    }
                } else {
                    qVar6.i = false;
                    qVar4.i = false;
                    qVar3.i = true;
                    qVar2 = qVar3;
                }
            } else if (qVar5 == null || !qVar5.i) {
                if (qVar2 == qVar4.f) {
                    qVar = h(qVar, qVar4);
                    q qVar8 = qVar4.e;
                    qVar3 = qVar8 == null ? null : qVar8.e;
                    qVar4 = qVar8;
                    qVar2 = qVar4;
                }
                if (qVar4 != null) {
                    qVar4.i = false;
                    if (qVar3 != null) {
                        qVar3.i = true;
                        qVar = g(qVar, qVar3);
                    }
                }
            } else {
                qVar5.i = false;
                qVar4.i = false;
                qVar3.i = true;
                qVar2 = qVar3;
            }
        }
        return qVar;
    }

    public static q g(q qVar, q qVar2) {
        q qVar3;
        if (qVar2 != null && (qVar3 = qVar2.g) != null) {
            q qVar4 = qVar3.f;
            qVar2.g = qVar4;
            if (qVar4 != null) {
                qVar4.e = qVar2;
            }
            q qVar5 = qVar2.e;
            qVar3.e = qVar5;
            if (qVar5 == null) {
                qVar3.i = false;
                qVar = qVar3;
            } else if (qVar5.f == qVar2) {
                qVar5.f = qVar3;
            } else {
                qVar5.g = qVar3;
            }
            qVar3.f = qVar2;
            qVar2.e = qVar3;
        }
        return qVar;
    }

    public static q h(q qVar, q qVar2) {
        q qVar3;
        if (qVar2 != null && (qVar3 = qVar2.f) != null) {
            q qVar4 = qVar3.g;
            qVar2.f = qVar4;
            if (qVar4 != null) {
                qVar4.e = qVar2;
            }
            q qVar5 = qVar2.e;
            qVar3.e = qVar5;
            if (qVar5 == null) {
                qVar3.i = false;
                qVar = qVar3;
            } else if (qVar5.g == qVar2) {
                qVar5.g = qVar3;
            } else {
                qVar5.f = qVar3;
            }
            qVar3.g = qVar2;
            qVar2.e = qVar3;
        }
        return qVar;
    }

    public static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    @Override // j$.util.concurrent.k
    public final k a(int i2, Object obj) {
        k kVar;
        int i3;
        Object obj2;
        j$.sun.misc.a aVar;
        long j;
        int intVolatile;
        Thread thread;
        k kVar2 = this.f;
        while (true) {
            kVar = kVar2;
            do {
                if (kVar == null) {
                    return null;
                }
                i3 = this.lockState;
                if ((i3 & 3) == 0) {
                    aVar = h;
                    j = i;
                } else if (kVar.a != i2 || ((obj2 = kVar.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    kVar2 = kVar.d;
                }
            } while (!aVar.a.compareAndSwapInt(this, j, i3, i3 + 4));
            try {
                q qVar = this.e;
                q b = qVar != null ? qVar.b(i2, obj, null) : null;
                do {
                    intVolatile = aVar.a.getIntVolatile(this, j);
                } while (!aVar.a.compareAndSwapInt(this, j, intVolatile, intVolatile - 4));
                if (intVolatile == 6 && (thread = this.g) != null) {
                    LockSupport.unpark(thread);
                }
                return b;
            } finally {
            }
        }
        return kVar;
    }

    public final void d() {
        j$.sun.misc.a aVar = h;
        if (aVar.a.compareAndSwapInt(this, i, 0, 1)) {
            return;
        }
        boolean z = false;
        while (true) {
            int i2 = this.lockState;
            if ((i2 & (-3)) == 0) {
                j$.sun.misc.a aVar2 = h;
                if (aVar2.a.compareAndSwapInt(this, i, i2, 1)) {
                    break;
                }
            } else if ((i2 & 2) == 0) {
                if (h.a.compareAndSwapInt(this, i, i2, i2 | 2)) {
                    this.g = Thread.currentThread();
                    z = true;
                }
            } else if (z) {
                LockSupport.park(this);
            }
        }
        if (z) {
            this.g = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a5 A[LOOP:0: B:2:0x0007->B:10:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0075 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q e(int i2, Object obj, Object obj2) {
        int i3;
        int i4;
        q b;
        q b2;
        q qVar;
        q qVar2 = this.e;
        Class<?> cls = null;
        boolean z = false;
        while (qVar2 != null) {
            int i5 = qVar2.a;
            if (i5 > i2) {
                i4 = -1;
            } else {
                if (i5 < i2) {
                    i3 = 1;
                } else {
                    Object obj3 = qVar2.b;
                    if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                        return qVar2;
                    }
                    if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                        int i6 = ConcurrentHashMap.g;
                        int compareTo = (obj3 == null || obj3.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj3);
                        if (compareTo != 0) {
                            i3 = compareTo;
                        }
                    }
                    if (!z) {
                        q qVar3 = qVar2.f;
                        if (qVar3 != null && (b2 = qVar3.b(i2, obj, cls)) != null) {
                            return b2;
                        }
                        q qVar4 = qVar2.g;
                        if (qVar4 != null && (b = qVar4.b(i2, obj, cls)) != null) {
                            return b;
                        }
                        z = true;
                    }
                    i4 = i(obj, obj3);
                }
                qVar = i3 > 0 ? qVar2.f : qVar2.g;
                if (qVar != null) {
                    q qVar5 = this.f;
                    q qVar6 = new q(i2, obj, obj2, qVar5, qVar2);
                    this.f = qVar6;
                    if (qVar5 != null) {
                        qVar5.h = qVar6;
                    }
                    if (i3 <= 0) {
                        qVar2.f = qVar6;
                    } else {
                        qVar2.g = qVar6;
                    }
                    if (!qVar2.i) {
                        qVar6.i = true;
                        return null;
                    }
                    d();
                    try {
                        this.e = c(this.e, qVar6);
                        return null;
                    } finally {
                        this.lockState = 0;
                    }
                }
                qVar2 = qVar;
            }
            i3 = i4;
            if (i3 > 0) {
            }
            if (qVar != null) {
            }
        }
        q qVar7 = new q(i2, obj, obj2, null, null);
        this.e = qVar7;
        this.f = qVar7;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0089 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:21:0x002e, B:25:0x0037, B:29:0x003d, B:31:0x004b, B:32:0x0063, B:34:0x0069, B:35:0x006b, B:41:0x0075, B:43:0x0079, B:44:0x007c, B:45:0x0050, B:47:0x0056, B:49:0x005a, B:50:0x005d, B:51:0x005f, B:53:0x0089, B:56:0x009a, B:57:0x0091, B:59:0x0095, B:60:0x0098, B:61:0x00a0, B:63:0x00a4, B:64:0x00a8, B:66:0x00ac, B:68:0x00b0, B:70:0x00b4, B:71:0x00bd, B:73:0x00b7, B:75:0x00bb), top: B:20:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a4 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:21:0x002e, B:25:0x0037, B:29:0x003d, B:31:0x004b, B:32:0x0063, B:34:0x0069, B:35:0x006b, B:41:0x0075, B:43:0x0079, B:44:0x007c, B:45:0x0050, B:47:0x0056, B:49:0x005a, B:50:0x005d, B:51:0x005f, B:53:0x0089, B:56:0x009a, B:57:0x0091, B:59:0x0095, B:60:0x0098, B:61:0x00a0, B:63:0x00a4, B:64:0x00a8, B:66:0x00ac, B:68:0x00b0, B:70:0x00b4, B:71:0x00bd, B:73:0x00b7, B:75:0x00bb), top: B:20:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ac A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:21:0x002e, B:25:0x0037, B:29:0x003d, B:31:0x004b, B:32:0x0063, B:34:0x0069, B:35:0x006b, B:41:0x0075, B:43:0x0079, B:44:0x007c, B:45:0x0050, B:47:0x0056, B:49:0x005a, B:50:0x005d, B:51:0x005f, B:53:0x0089, B:56:0x009a, B:57:0x0091, B:59:0x0095, B:60:0x0098, B:61:0x00a0, B:63:0x00a4, B:64:0x00a8, B:66:0x00ac, B:68:0x00b0, B:70:0x00b4, B:71:0x00bd, B:73:0x00b7, B:75:0x00bb), top: B:20:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:21:0x002e, B:25:0x0037, B:29:0x003d, B:31:0x004b, B:32:0x0063, B:34:0x0069, B:35:0x006b, B:41:0x0075, B:43:0x0079, B:44:0x007c, B:45:0x0050, B:47:0x0056, B:49:0x005a, B:50:0x005d, B:51:0x005f, B:53:0x0089, B:56:0x009a, B:57:0x0091, B:59:0x0095, B:60:0x0098, B:61:0x00a0, B:63:0x00a4, B:64:0x00a8, B:66:0x00ac, B:68:0x00b0, B:70:0x00b4, B:71:0x00bd, B:73:0x00b7, B:75:0x00bb), top: B:20:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b7 A[Catch: all -> 0x00c2, TryCatch #0 {all -> 0x00c2, blocks: (B:21:0x002e, B:25:0x0037, B:29:0x003d, B:31:0x004b, B:32:0x0063, B:34:0x0069, B:35:0x006b, B:41:0x0075, B:43:0x0079, B:44:0x007c, B:45:0x0050, B:47:0x0056, B:49:0x005a, B:50:0x005d, B:51:0x005f, B:53:0x0089, B:56:0x009a, B:57:0x0091, B:59:0x0095, B:60:0x0098, B:61:0x00a0, B:63:0x00a4, B:64:0x00a8, B:66:0x00ac, B:68:0x00b0, B:70:0x00b4, B:71:0x00bd, B:73:0x00b7, B:75:0x00bb), top: B:20:0x002e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean f(q qVar) {
        q qVar2;
        q qVar3;
        q qVar4 = (q) qVar.d;
        q qVar5 = qVar.h;
        if (qVar5 == null) {
            this.f = qVar4;
        } else {
            qVar5.d = qVar4;
        }
        if (qVar4 != null) {
            qVar4.h = qVar5;
        }
        if (this.f == null) {
            this.e = null;
            return true;
        }
        q qVar6 = this.e;
        if (qVar6 == null || qVar6.g == null || (qVar2 = qVar6.f) == null || qVar2.f == null) {
            return true;
        }
        d();
        try {
            q qVar7 = qVar.f;
            q qVar8 = qVar.g;
            if (qVar7 == null) {
                if (qVar8 != null) {
                    qVar7 = qVar8;
                    if (qVar7 != qVar) {
                    }
                    if (!qVar.i) {
                    }
                    this.e = qVar6;
                    if (qVar == qVar7) {
                        if (qVar != qVar3.f) {
                        }
                        qVar.e = null;
                    }
                    return false;
                }
                qVar7 = qVar;
                if (qVar7 != qVar) {
                }
                if (!qVar.i) {
                }
                this.e = qVar6;
                if (qVar == qVar7) {
                }
                return false;
            }
            if (qVar8 != null) {
                q qVar9 = qVar8;
                while (true) {
                    q qVar10 = qVar9.f;
                    if (qVar10 == null) {
                        break;
                    }
                    qVar9 = qVar10;
                }
                boolean z = qVar9.i;
                qVar9.i = qVar.i;
                qVar.i = z;
                q qVar11 = qVar9.g;
                q qVar12 = qVar.e;
                if (qVar9 == qVar8) {
                    qVar.e = qVar9;
                    qVar9.g = qVar;
                } else {
                    q qVar13 = qVar9.e;
                    qVar.e = qVar13;
                    if (qVar13 != null) {
                        if (qVar9 == qVar13.f) {
                            qVar13.f = qVar;
                        } else {
                            qVar13.g = qVar;
                        }
                    }
                    qVar9.g = qVar8;
                    qVar8.e = qVar9;
                }
                qVar.f = null;
                qVar.g = qVar11;
                if (qVar11 != null) {
                    qVar11.e = qVar;
                }
                qVar9.f = qVar7;
                qVar7.e = qVar9;
                qVar9.e = qVar12;
                if (qVar12 == null) {
                    qVar6 = qVar9;
                } else if (qVar == qVar12.f) {
                    qVar12.f = qVar9;
                } else {
                    qVar12.g = qVar9;
                }
                if (qVar11 != null) {
                    qVar7 = qVar11;
                }
                qVar7 = qVar;
            }
            if (qVar7 != qVar) {
                q qVar14 = qVar.e;
                qVar7.e = qVar14;
                if (qVar14 == null) {
                    qVar6 = qVar7;
                } else if (qVar == qVar14.f) {
                    qVar14.f = qVar7;
                } else {
                    qVar14.g = qVar7;
                }
                qVar.e = null;
                qVar.g = null;
                qVar.f = null;
            }
            if (!qVar.i) {
                qVar6 = b(qVar6, qVar7);
            }
            this.e = qVar6;
            if (qVar == qVar7 && (qVar3 = qVar.e) != null) {
                if (qVar != qVar3.f) {
                    qVar3.f = null;
                } else if (qVar == qVar3.g) {
                    qVar3.g = null;
                }
                qVar.e = null;
            }
            return false;
        } finally {
            this.lockState = 0;
        }
        this.lockState = 0;
    }
}
