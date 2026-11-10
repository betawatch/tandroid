package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
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
        i = aVar.h(p.class, "lockState");
    }

    public static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    public p(q qVar) {
        super(-2, null, null);
        int i7;
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
                int i10 = qVar.a;
                q qVar4 = qVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = qVar4.b;
                    int i11 = qVar4.a;
                    if (i11 > i10) {
                        i7 = -1;
                    } else if (i11 < i10) {
                        i7 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i12 = ConcurrentHashMap.g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i7 = compareTo;
                            }
                        }
                        i7 = i(obj, obj2);
                    }
                    q qVar5 = i7 <= 0 ? qVar4.f : qVar4.g;
                    if (qVar5 == null) {
                        break;
                    } else {
                        qVar4 = qVar5;
                    }
                }
                qVar.e = qVar4;
                if (i7 <= 0) {
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

    public final void d() {
        if (h.c(this, i, 0, 1)) {
            return;
        }
        boolean z9 = false;
        while (true) {
            int i7 = this.lockState;
            if ((i7 & (-3)) == 0) {
                if (h.c(this, i, i7, 1)) {
                    break;
                }
            } else if ((i7 & 2) == 0) {
                if (h.c(this, i, i7, i7 | 2)) {
                    this.g = Thread.currentThread();
                    z9 = true;
                }
            } else if (z9) {
                LockSupport.park(this);
            }
        }
        if (z9) {
            this.g = null;
        }
    }

    @Override // j$.util.concurrent.k
    public final k a(int i7, Object obj) {
        Object obj2;
        Thread thread;
        k kVar = this.f;
        while (true) {
            q qVar = null;
            if (kVar == null) {
                return null;
            }
            int i10 = this.lockState;
            if ((i10 & 3) != 0) {
                if (kVar.a != i7 || ((obj2 = kVar.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    kVar = kVar.d;
                }
            } else {
                j$.sun.misc.a aVar = h;
                long j3 = i;
                if (aVar.c(this, j3, i10, i10 + 4)) {
                    try {
                        q qVar2 = this.e;
                        if (qVar2 != null) {
                            qVar = qVar2.b(i7, obj, null);
                        }
                        if (aVar.e(this, j3) == 6 && (thread = this.g) != null) {
                            LockSupport.unpark(thread);
                        }
                        return qVar;
                    } finally {
                    }
                }
            }
        }
        return kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00a9 A[LOOP:0: B:2:0x0007->B:10:0x00a9, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final q e(int i7, Object obj, Object obj2) {
        int i10;
        int i11;
        q b10;
        q b11;
        q qVar;
        q qVar2 = this.e;
        Class<?> cls = null;
        boolean z9 = false;
        while (qVar2 != null) {
            int i12 = qVar2.a;
            if (i12 > i7) {
                i11 = -1;
            } else {
                if (i12 < i7) {
                    i10 = 1;
                } else {
                    Object obj3 = qVar2.b;
                    if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                        return qVar2;
                    }
                    if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                        int i13 = ConcurrentHashMap.g;
                        int compareTo = (obj3 == null || obj3.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj3);
                        if (compareTo != 0) {
                            i10 = compareTo;
                        }
                    }
                    if (!z9) {
                        q qVar3 = qVar2.f;
                        if (qVar3 != null && (b11 = qVar3.b(i7, obj, cls)) != null) {
                            return b11;
                        }
                        q qVar4 = qVar2.g;
                        if (qVar4 != null && (b10 = qVar4.b(i7, obj, cls)) != null) {
                            return b10;
                        }
                        z9 = true;
                    }
                    i11 = i(obj, obj3);
                }
                qVar = i10 > 0 ? qVar2.f : qVar2.g;
                if (qVar != null) {
                    q qVar5 = this.f;
                    q qVar6 = new q(i7, obj, obj2, qVar5, qVar2);
                    this.f = qVar6;
                    if (qVar5 != null) {
                        qVar5.h = qVar6;
                    }
                    if (i10 <= 0) {
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
            i10 = i11;
            if (i10 > 0) {
            }
            if (qVar != null) {
            }
        }
        q qVar7 = new q(i7, obj, obj2, null, null);
        this.e = qVar7;
        this.f = qVar7;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0091 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bd A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c0 A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ad A[Catch: all -> 0x0052, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x0030, B:25:0x0039, B:29:0x003f, B:31:0x004d, B:32:0x0068, B:34:0x006e, B:35:0x0070, B:41:0x0091, B:44:0x00a2, B:45:0x0099, B:47:0x009d, B:48:0x00a0, B:49:0x00a8, B:52:0x00b1, B:54:0x00b5, B:56:0x00b9, B:58:0x00bd, B:59:0x00c6, B:61:0x00c0, B:63:0x00c4, B:66:0x00ad, B:68:0x007a, B:70:0x007e, B:71:0x0081, B:72:0x0055, B:74:0x005b, B:76:0x005f, B:77:0x0062, B:78:0x0064), top: B:20:0x0030 }] */
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
            if (qVar7 != null && qVar8 != null) {
                q qVar9 = qVar8;
                while (true) {
                    q qVar10 = qVar9.f;
                    if (qVar10 == null) {
                        break;
                    }
                    qVar9 = qVar10;
                }
                boolean z9 = qVar9.i;
                qVar9.i = qVar.i;
                qVar.i = z9;
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
                    this.lockState = 0;
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
                this.lockState = 0;
                return false;
            }
            if (qVar7 == null) {
                if (qVar8 != null) {
                    qVar7 = qVar8;
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
            this.lockState = 0;
            return false;
        } catch (Throwable th2) {
            this.lockState = 0;
            throw th2;
        }
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
                if (qVar6 != null && qVar6.i) {
                    qVar6.i = false;
                    qVar4.i = false;
                    qVar3.i = true;
                    qVar2 = qVar3;
                } else {
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
                }
            } else if (qVar5 != null && qVar5.i) {
                qVar5.i = false;
                qVar4.i = false;
                qVar3.i = true;
                qVar2 = qVar3;
            } else {
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
            }
        }
        return qVar;
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
}
