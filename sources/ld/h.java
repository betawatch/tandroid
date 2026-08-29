package ld;

import java.util.concurrent.atomic.AtomicReferenceArray;
import jd.i2;
import k1.l;
import od.u;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class h extends u {
    public final b e;
    public final /* synthetic */ AtomicReferenceArray f;

    public h(long j10, h hVar, b bVar, int i10) {
        super(j10, hVar, i10);
        this.e = bVar;
        this.f = new AtomicReferenceArray(d.b * 2);
    }

    @Override // od.u
    public final int g() {
        return d.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x005a, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x005d, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005f, code lost:
    
        kotlin.jvm.internal.j.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // od.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i10, sc.h hVar) {
        int i11 = d.b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        this.f.get(i10 * 2);
        while (true) {
            Object l10 = l(i10);
            boolean z11 = l10 instanceof i2;
            b bVar = this.e;
            if (z11 || (l10 instanceof j)) {
                if (k(i10, l10, z10 ? d.j : d.k)) {
                    n(i10, null);
                    m(i10, !z10);
                    if (z10) {
                        kotlin.jvm.internal.j.b(bVar);
                        return;
                    }
                    return;
                }
            } else {
                if (l10 == d.j || l10 == d.k) {
                    break;
                }
                if (l10 != d.g && l10 != d.f) {
                    if (l10 == d.i || l10 == d.d || l10 == d.l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + l10).toString());
                }
            }
        }
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            b bVar = this.e;
            kotlin.jvm.internal.j.b(bVar);
            bVar.q((this.c * d.b) + i10);
        }
        i();
    }

    public final void n(int i10, l lVar) {
        this.f.set(i10 * 2, lVar);
    }

    public final void o(int i10, Object obj) {
        this.f.set((i10 * 2) + 1, obj);
    }
}
