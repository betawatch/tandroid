package jd;

import hd.j2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.k;
import md.t;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h extends t {
    public final b e;
    public final /* synthetic */ AtomicReferenceArray f;

    public h(long j10, h hVar, b bVar, int i9) {
        super(j10, hVar, i9);
        this.e = bVar;
        this.f = new AtomicReferenceArray(d.b * 2);
    }

    @Override // md.t
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
    
        kotlin.jvm.internal.i.b(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0062, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // md.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i9, qc.h hVar) {
        int i10 = d.b;
        boolean z10 = i9 >= i10;
        if (z10) {
            i9 -= i10;
        }
        this.f.get(i9 * 2);
        while (true) {
            Object l10 = l(i9);
            boolean z11 = l10 instanceof j2;
            b bVar = this.e;
            if (z11 || (l10 instanceof j)) {
                if (k(i9, l10, z10 ? d.j : d.k)) {
                    n(i9, null);
                    m(i9, !z10);
                    if (z10) {
                        kotlin.jvm.internal.i.b(bVar);
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

    public final boolean k(int i9, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i9 * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i9) {
        return this.f.get((i9 * 2) + 1);
    }

    public final void m(int i9, boolean z10) {
        if (z10) {
            b bVar = this.e;
            kotlin.jvm.internal.i.b(bVar);
            bVar.q((this.c * d.b) + i9);
        }
        i();
    }

    public final void n(int i9, k kVar) {
        this.f.set(i9 * 2, kVar);
    }

    public final void o(int i9, Object obj) {
        this.f.set((i9 * 2) + 1, obj);
    }
}
