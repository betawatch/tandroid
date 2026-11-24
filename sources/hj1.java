// default package

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hj1 extends nv9 {
    public final q01 g;
    public final /* synthetic */ AtomicReferenceArray h;

    public hj1(long j, hj1 hj1Var, q01 q01Var, int i) {
        super(j, hj1Var, i);
        this.g = q01Var;
        this.h = new AtomicReferenceArray(s01.b << 1);
    }

    @Override // nv9
    public final int g() {
        return s01.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0042, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0045, code lost:
    
        if (r0 == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0047, code lost:
    
        r2.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x004a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:?, code lost:
    
        return;
     */
    @Override // nv9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(int i, sw2 sw2Var) {
        int i2 = s01.b;
        boolean z = i >= i2;
        if (z) {
            i -= i2;
        }
        this.h.get(i << 1);
        while (true) {
            Object l = l(i);
            boolean z2 = l instanceof akc;
            q01 q01Var = this.g;
            if (z2 || (l instanceof bkc)) {
                if (k(i, l, z ? s01.j : s01.k)) {
                    n(i, null);
                    m(i, !z);
                    if (z) {
                        q01Var.getClass();
                        return;
                    }
                    return;
                }
            } else {
                if (l == s01.j || l == s01.k) {
                    break;
                }
                if (l != s01.g && l != s01.f) {
                    if (l == s01.i || l == s01.d || l == s01.l) {
                        return;
                    }
                    wn4.n(l, "unexpected state: ");
                    return;
                }
            }
        }
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i << 1) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.h.get((i << 1) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            q01 q01Var = this.g;
            q01Var.getClass();
            q01Var.F((this.d * s01.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.h.set(i << 1, obj);
    }

    public final void o(int i, lo5 lo5Var) {
        this.h.set((i << 1) + 1, lo5Var);
    }
}
