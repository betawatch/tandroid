package be;

import java.util.concurrent.atomic.AtomicReferenceArray;
import zd.c2;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class k extends ee.r {
    public final c e;
    public final /* synthetic */ AtomicReferenceArray f;

    public k(long j3, k kVar, c cVar, int i7) {
        super(j3, kVar, i7);
        this.e = cVar;
        this.f = new AtomicReferenceArray(e.b * 2);
    }

    @Override // ee.r
    public final int g() {
        return e.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005e, code lost:
    
        kotlin.jvm.internal.j.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // ee.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i7, id.h hVar) {
        int i10 = e.b;
        boolean z9 = i7 >= i10;
        if (z9) {
            i7 -= i10;
        }
        this.f.get(i7 * 2);
        while (true) {
            Object l10 = l(i7);
            boolean z10 = l10 instanceof c2;
            c cVar = this.e;
            if (z10 || (l10 instanceof v)) {
                if (k(i7, l10, z9 ? e.j : e.k)) {
                    n(i7, null);
                    m(i7, !z9);
                    if (z9) {
                        kotlin.jvm.internal.j.b(cVar);
                        return;
                    }
                    return;
                }
            } else {
                if (l10 == e.j || l10 == e.k) {
                    break;
                }
                if (l10 != e.g && l10 != e.f) {
                    if (l10 == e.i || l10 == e.d || l10 == e.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + l10).toString());
                }
            }
        }
    }

    public final boolean k(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i7 * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i7) {
        return this.f.get((i7 * 2) + 1);
    }

    public final void m(int i7, boolean z9) {
        if (z9) {
            c cVar = this.e;
            kotlin.jvm.internal.j.b(cVar);
            cVar.B((this.c * e.b) + i7);
        }
        i();
    }

    public final void n(int i7, Object obj) {
        this.f.set(i7 * 2, obj);
    }

    public final void o(int i7, Object obj) {
        this.f.set((i7 * 2) + 1, obj);
    }
}
