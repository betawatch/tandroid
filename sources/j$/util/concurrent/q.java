package j$.util.concurrent;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
public final class q extends l {
    public static final j$.sun.misc.a h;
    public static final long i;
    public r e;
    public volatile r f;
    public volatile Thread g;
    volatile int lockState;

    static {
        j$.sun.misc.a aVar = j$.sun.misc.a.b;
        h = aVar;
        i = aVar.h(q.class, "lockState");
    }

    public static int i(Object obj, Object obj2) {
        int compareTo;
        return (obj == null || obj2 == null || (compareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : compareTo;
    }

    public q(r rVar) {
        super(-2, null, null);
        int i10;
        this.f = rVar;
        r rVar2 = null;
        while (rVar != null) {
            r rVar3 = (r) rVar.d;
            rVar.g = null;
            rVar.f = null;
            if (rVar2 == null) {
                rVar.e = null;
                rVar.i = false;
            } else {
                Object obj = rVar.b;
                int i11 = rVar.a;
                r rVar4 = rVar2;
                Class<?> cls = null;
                while (true) {
                    Object obj2 = rVar4.b;
                    int i12 = rVar4.a;
                    if (i12 > i11) {
                        i10 = -1;
                    } else if (i12 < i11) {
                        i10 = 1;
                    } else {
                        if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                            int i13 = ConcurrentHashMap.g;
                            int compareTo = (obj2 == null || obj2.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj2);
                            if (compareTo != 0) {
                                i10 = compareTo;
                            }
                        }
                        i10 = i(obj, obj2);
                    }
                    r rVar5 = i10 <= 0 ? rVar4.f : rVar4.g;
                    if (rVar5 == null) {
                        break;
                    } else {
                        rVar4 = rVar5;
                    }
                }
                rVar.e = rVar4;
                if (i10 <= 0) {
                    rVar4.f = rVar;
                } else {
                    rVar4.g = rVar;
                }
                rVar = c(rVar2, rVar);
            }
            rVar2 = rVar;
            rVar = rVar3;
        }
        this.e = rVar2;
    }

    public final void d() {
        if (h.c(this, i, 0, 1)) {
            return;
        }
        boolean z10 = false;
        while (true) {
            int i10 = this.lockState;
            if ((i10 & (-3)) == 0) {
                if (h.c(this, i, i10, 1)) {
                    break;
                }
            } else if ((i10 & 2) == 0) {
                if (h.c(this, i, i10, i10 | 2)) {
                    this.g = Thread.currentThread();
                    z10 = true;
                }
            } else if (z10) {
                LockSupport.park(this);
            }
        }
        if (z10) {
            this.g = null;
        }
    }

    @Override // j$.util.concurrent.l
    public final l a(int i10, Object obj) {
        Object obj2;
        Thread thread;
        l lVar = this.f;
        while (true) {
            r rVar = null;
            if (lVar == null) {
                return null;
            }
            int i11 = this.lockState;
            if ((i11 & 3) != 0) {
                if (lVar.a != i10 || ((obj2 = lVar.b) != obj && (obj2 == null || !obj.equals(obj2)))) {
                    lVar = lVar.d;
                }
            } else {
                j$.sun.misc.a aVar = h;
                long j10 = i;
                if (aVar.c(this, j10, i11, i11 + 4)) {
                    try {
                        r rVar2 = this.e;
                        if (rVar2 != null) {
                            rVar = rVar2.b(i10, obj, null);
                        }
                        if (aVar.e(this, j10) == 6 && (thread = this.g) != null) {
                            LockSupport.unpark(thread);
                        }
                        return rVar;
                    } finally {
                    }
                }
            }
        }
        return lVar;
    }

    public final r e(int i10, Object obj, Object obj2) {
        int i11;
        r b10;
        r b11;
        r rVar = this.e;
        Class<?> cls = null;
        boolean z10 = false;
        while (rVar != null) {
            int i12 = rVar.a;
            if (i12 > i10) {
                i11 = -1;
            } else if (i12 < i10) {
                i11 = 1;
            } else {
                Object obj3 = rVar.b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return rVar;
                }
                if (cls != null || (cls = ConcurrentHashMap.c(obj)) != null) {
                    int i13 = ConcurrentHashMap.g;
                    int compareTo = (obj3 == null || obj3.getClass() != cls) ? 0 : ((Comparable) obj).compareTo(obj3);
                    if (compareTo != 0) {
                        i11 = compareTo;
                    }
                }
                if (!z10) {
                    r rVar2 = rVar.f;
                    if (rVar2 != null && (b11 = rVar2.b(i10, obj, cls)) != null) {
                        return b11;
                    }
                    r rVar3 = rVar.g;
                    if (rVar3 != null && (b10 = rVar3.b(i10, obj, cls)) != null) {
                        return b10;
                    }
                    z10 = true;
                }
                i11 = i(obj, obj3);
            }
            r rVar4 = i11 <= 0 ? rVar.f : rVar.g;
            if (rVar4 == null) {
                r rVar5 = this.f;
                r rVar6 = new r(i10, obj, obj2, rVar5, rVar);
                this.f = rVar6;
                if (rVar5 != null) {
                    rVar5.h = rVar6;
                }
                if (i11 <= 0) {
                    rVar.f = rVar6;
                } else {
                    rVar.g = rVar6;
                }
                if (!rVar.i) {
                    rVar6.i = true;
                    return null;
                }
                d();
                try {
                    this.e = c(this.e, rVar6);
                    return null;
                } finally {
                    this.lockState = 0;
                }
            }
            rVar = rVar4;
        }
        r rVar7 = new r(i10, obj, obj2, null, null);
        this.e = rVar7;
        this.f = rVar7;
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
    public final boolean f(r rVar) {
        r rVar2;
        r rVar3;
        r rVar4 = (r) rVar.d;
        r rVar5 = rVar.h;
        if (rVar5 == null) {
            this.f = rVar4;
        } else {
            rVar5.d = rVar4;
        }
        if (rVar4 != null) {
            rVar4.h = rVar5;
        }
        if (this.f == null) {
            this.e = null;
            return true;
        }
        r rVar6 = this.e;
        if (rVar6 == null || rVar6.g == null || (rVar2 = rVar6.f) == null || rVar2.f == null) {
            return true;
        }
        d();
        try {
            r rVar7 = rVar.f;
            r rVar8 = rVar.g;
            if (rVar7 != null && rVar8 != null) {
                r rVar9 = rVar8;
                while (true) {
                    r rVar10 = rVar9.f;
                    if (rVar10 == null) {
                        break;
                    }
                    rVar9 = rVar10;
                }
                boolean z10 = rVar9.i;
                rVar9.i = rVar.i;
                rVar.i = z10;
                r rVar11 = rVar9.g;
                r rVar12 = rVar.e;
                if (rVar9 == rVar8) {
                    rVar.e = rVar9;
                    rVar9.g = rVar;
                } else {
                    r rVar13 = rVar9.e;
                    rVar.e = rVar13;
                    if (rVar13 != null) {
                        if (rVar9 == rVar13.f) {
                            rVar13.f = rVar;
                        } else {
                            rVar13.g = rVar;
                        }
                    }
                    rVar9.g = rVar8;
                    rVar8.e = rVar9;
                }
                rVar.f = null;
                rVar.g = rVar11;
                if (rVar11 != null) {
                    rVar11.e = rVar;
                }
                rVar9.f = rVar7;
                rVar7.e = rVar9;
                rVar9.e = rVar12;
                if (rVar12 == null) {
                    rVar6 = rVar9;
                } else if (rVar == rVar12.f) {
                    rVar12.f = rVar9;
                } else {
                    rVar12.g = rVar9;
                }
                if (rVar11 != null) {
                    rVar7 = rVar11;
                    if (rVar7 != rVar) {
                    }
                    if (!rVar.i) {
                    }
                    this.e = rVar6;
                    if (rVar == rVar7) {
                        if (rVar != rVar3.f) {
                        }
                        rVar.e = null;
                    }
                    this.lockState = 0;
                    return false;
                }
                rVar7 = rVar;
                if (rVar7 != rVar) {
                }
                if (!rVar.i) {
                }
                this.e = rVar6;
                if (rVar == rVar7) {
                }
                this.lockState = 0;
                return false;
            }
            if (rVar7 == null) {
                if (rVar8 != null) {
                    rVar7 = rVar8;
                }
                rVar7 = rVar;
            }
            if (rVar7 != rVar) {
                r rVar14 = rVar.e;
                rVar7.e = rVar14;
                if (rVar14 == null) {
                    rVar6 = rVar7;
                } else if (rVar == rVar14.f) {
                    rVar14.f = rVar7;
                } else {
                    rVar14.g = rVar7;
                }
                rVar.e = null;
                rVar.g = null;
                rVar.f = null;
            }
            if (!rVar.i) {
                rVar6 = b(rVar6, rVar7);
            }
            this.e = rVar6;
            if (rVar == rVar7 && (rVar3 = rVar.e) != null) {
                if (rVar != rVar3.f) {
                    rVar3.f = null;
                } else if (rVar == rVar3.g) {
                    rVar3.g = null;
                }
                rVar.e = null;
            }
            this.lockState = 0;
            return false;
        } catch (Throwable th2) {
            this.lockState = 0;
            throw th2;
        }
    }

    public static r g(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.g) != null) {
            r rVar4 = rVar3.f;
            rVar2.g = rVar4;
            if (rVar4 != null) {
                rVar4.e = rVar2;
            }
            r rVar5 = rVar2.e;
            rVar3.e = rVar5;
            if (rVar5 == null) {
                rVar3.i = false;
                rVar = rVar3;
            } else if (rVar5.f == rVar2) {
                rVar5.f = rVar3;
            } else {
                rVar5.g = rVar3;
            }
            rVar3.f = rVar2;
            rVar2.e = rVar3;
        }
        return rVar;
    }

    public static r h(r rVar, r rVar2) {
        r rVar3;
        if (rVar2 != null && (rVar3 = rVar2.f) != null) {
            r rVar4 = rVar3.g;
            rVar2.f = rVar4;
            if (rVar4 != null) {
                rVar4.e = rVar2;
            }
            r rVar5 = rVar2.e;
            rVar3.e = rVar5;
            if (rVar5 == null) {
                rVar3.i = false;
                rVar = rVar3;
            } else if (rVar5.g == rVar2) {
                rVar5.g = rVar3;
            } else {
                rVar5.f = rVar3;
            }
            rVar3.g = rVar2;
            rVar2.e = rVar3;
        }
        return rVar;
    }

    public static r c(r rVar, r rVar2) {
        r rVar3;
        rVar2.i = true;
        while (true) {
            r rVar4 = rVar2.e;
            if (rVar4 == null) {
                rVar2.i = false;
                return rVar2;
            }
            if (!rVar4.i || (rVar3 = rVar4.e) == null) {
                break;
            }
            r rVar5 = rVar3.f;
            if (rVar4 == rVar5) {
                r rVar6 = rVar3.g;
                if (rVar6 != null && rVar6.i) {
                    rVar6.i = false;
                    rVar4.i = false;
                    rVar3.i = true;
                    rVar2 = rVar3;
                } else {
                    if (rVar2 == rVar4.g) {
                        rVar = g(rVar, rVar4);
                        r rVar7 = rVar4.e;
                        rVar3 = rVar7 == null ? null : rVar7.e;
                        rVar4 = rVar7;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.i = false;
                        if (rVar3 != null) {
                            rVar3.i = true;
                            rVar = h(rVar, rVar3);
                        }
                    }
                }
            } else if (rVar5 != null && rVar5.i) {
                rVar5.i = false;
                rVar4.i = false;
                rVar3.i = true;
                rVar2 = rVar3;
            } else {
                if (rVar2 == rVar4.f) {
                    rVar = h(rVar, rVar4);
                    r rVar8 = rVar4.e;
                    rVar3 = rVar8 == null ? null : rVar8.e;
                    rVar4 = rVar8;
                    rVar2 = rVar4;
                }
                if (rVar4 != null) {
                    rVar4.i = false;
                    if (rVar3 != null) {
                        rVar3.i = true;
                        rVar = g(rVar, rVar3);
                    }
                }
            }
        }
        return rVar;
    }

    public static r b(r rVar, r rVar2) {
        while (rVar2 != null && rVar2 != rVar) {
            r rVar3 = rVar2.e;
            if (rVar3 == null) {
                rVar2.i = false;
                return rVar2;
            }
            if (rVar2.i) {
                rVar2.i = false;
                return rVar;
            }
            r rVar4 = rVar3.f;
            if (rVar4 == rVar2) {
                r rVar5 = rVar3.g;
                if (rVar5 != null && rVar5.i) {
                    rVar5.i = false;
                    rVar3.i = true;
                    rVar = g(rVar, rVar3);
                    rVar3 = rVar2.e;
                    rVar5 = rVar3 == null ? null : rVar3.g;
                }
                if (rVar5 != null) {
                    r rVar6 = rVar5.f;
                    r rVar7 = rVar5.g;
                    if ((rVar7 == null || !rVar7.i) && (rVar6 == null || !rVar6.i)) {
                        rVar5.i = true;
                    } else {
                        if (rVar7 == null || !rVar7.i) {
                            if (rVar6 != null) {
                                rVar6.i = false;
                            }
                            rVar5.i = true;
                            rVar = h(rVar, rVar5);
                            rVar3 = rVar2.e;
                            rVar5 = rVar3 != null ? rVar3.g : null;
                        }
                        if (rVar5 != null) {
                            rVar5.i = rVar3 == null ? false : rVar3.i;
                            r rVar8 = rVar5.g;
                            if (rVar8 != null) {
                                rVar8.i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.i = false;
                            rVar = g(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
                rVar2 = rVar3;
            } else {
                if (rVar4 != null && rVar4.i) {
                    rVar4.i = false;
                    rVar3.i = true;
                    rVar = h(rVar, rVar3);
                    rVar3 = rVar2.e;
                    rVar4 = rVar3 == null ? null : rVar3.f;
                }
                if (rVar4 != null) {
                    r rVar9 = rVar4.f;
                    r rVar10 = rVar4.g;
                    if ((rVar9 == null || !rVar9.i) && (rVar10 == null || !rVar10.i)) {
                        rVar4.i = true;
                    } else {
                        if (rVar9 == null || !rVar9.i) {
                            if (rVar10 != null) {
                                rVar10.i = false;
                            }
                            rVar4.i = true;
                            rVar = g(rVar, rVar4);
                            rVar3 = rVar2.e;
                            rVar4 = rVar3 != null ? rVar3.f : null;
                        }
                        if (rVar4 != null) {
                            rVar4.i = rVar3 == null ? false : rVar3.i;
                            r rVar11 = rVar4.f;
                            if (rVar11 != null) {
                                rVar11.i = false;
                            }
                        }
                        if (rVar3 != null) {
                            rVar3.i = false;
                            rVar = h(rVar, rVar3);
                        }
                        rVar2 = rVar;
                    }
                }
                rVar2 = rVar3;
            }
        }
        return rVar;
    }
}
