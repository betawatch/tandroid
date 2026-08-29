package od;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class o {
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(o.class, Object.class, "_next$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(o.class, "_state$volatile");
    public static final fc.a g = new fc.a("REMOVE_FROZEN", 2);
    private volatile /* synthetic */ Object _next$volatile;
    private volatile /* synthetic */ long _state$volatile;
    public final int a;
    public final boolean b;
    public final int c;
    public final /* synthetic */ AtomicReferenceArray d;

    public o(int i10, boolean z10) {
        this.a = i10;
        this.b = z10;
        int i11 = i10 - 1;
        this.c = i11;
        this.d = new AtomicReferenceArray(i10);
        if (i11 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i10 & i11) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j10 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j10) != 0) {
                return (2305843009213693952L & j10) != 0 ? 2 : 1;
            }
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = this.c;
            if (((i11 + 2) & i12) == (i10 & i12)) {
                return 1;
            }
            boolean z10 = this.b;
            AtomicReferenceArray atomicReferenceArray = this.d;
            if (z10 || atomicReferenceArray.get(i11 & i12) == null) {
                if (f.compareAndSet(this, j10, ((-1152921503533105153L) & j10) | (((i11 + 1) & 1073741823) << 30))) {
                    atomicReferenceArray.set(i11 & i12, obj);
                    o oVar = this;
                    while ((atomicLongFieldUpdater.get(oVar) & 1152921504606846976L) != 0) {
                        oVar = oVar.c();
                        AtomicReferenceArray atomicReferenceArray2 = oVar.d;
                        int i13 = oVar.c & i11;
                        Object obj2 = atomicReferenceArray2.get(i13);
                        if ((obj2 instanceof n) && ((n) obj2).a == i11) {
                            atomicReferenceArray2.set(i13, obj);
                        } else {
                            oVar = null;
                        }
                        if (oVar == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i14 = this.a;
                if (i14 < 1024 || ((i11 - i10) & 1073741823) > (i14 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        do {
            atomicLongFieldUpdater = f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j10) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j10, 2305843009213693952L | j10));
        return true;
    }

    public final o c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j10;
        o oVar;
        while (true) {
            atomicLongFieldUpdater = f;
            j10 = atomicLongFieldUpdater.get(this);
            if ((j10 & 1152921504606846976L) != 0) {
                oVar = this;
                break;
            }
            long j11 = 1152921504606846976L | j10;
            oVar = this;
            if (atomicLongFieldUpdater.compareAndSet(oVar, j10, j11)) {
                j10 = j11;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            o oVar2 = (o) atomicReferenceFieldUpdater.get(this);
            if (oVar2 != null) {
                return oVar2;
            }
            o oVar3 = new o(oVar.a * 2, oVar.b);
            int i10 = (int) (1073741823 & j10);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            while (true) {
                int i12 = oVar.c;
                int i13 = i10 & i12;
                if (i13 == (i12 & i11)) {
                    break;
                }
                Object obj = oVar.d.get(i13);
                if (obj == null) {
                    obj = new n(i10);
                }
                oVar3.d.set(oVar3.c & i10, obj);
                i10++;
            }
            atomicLongFieldUpdater.set(oVar3, (-1152921504606846977L) & j10);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, oVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        o oVar = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f;
            long j10 = atomicLongFieldUpdater.get(oVar);
            if ((j10 & 1152921504606846976L) != 0) {
                return g;
            }
            int i10 = (int) (j10 & 1073741823);
            int i11 = (int) ((1152921503533105152L & j10) >> 30);
            int i12 = oVar.c;
            int i13 = i10 & i12;
            if ((i11 & i12) == i13) {
                break;
            }
            AtomicReferenceArray atomicReferenceArray = oVar.d;
            Object obj = atomicReferenceArray.get(i13);
            boolean z10 = oVar.b;
            if (obj == null) {
                if (z10) {
                    break;
                }
            } else {
                if (obj instanceof n) {
                    break;
                }
                long j11 = (i10 + 1) & 1073741823;
                if (f.compareAndSet(oVar, j10, (j10 & (-1073741824)) | j11)) {
                    atomicReferenceArray.set(i13, null);
                    return obj;
                }
                oVar = this;
                if (z10) {
                    while (true) {
                        long j12 = atomicLongFieldUpdater.get(oVar);
                        int i14 = (int) (j12 & 1073741823);
                        if ((j12 & 1152921504606846976L) != 0) {
                            oVar = oVar.c();
                        } else {
                            o oVar2 = oVar;
                            if (f.compareAndSet(oVar2, j12, (j12 & (-1073741824)) | j11)) {
                                oVar2.d.set(i14 & oVar2.c, null);
                                oVar = null;
                            } else {
                                oVar = oVar2;
                            }
                        }
                        if (oVar == null) {
                            return obj;
                        }
                    }
                }
            }
        }
        return null;
    }
}
