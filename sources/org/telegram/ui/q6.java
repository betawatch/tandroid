package org.telegram.ui;

import android.util.SparseArray;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class q6 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public q6(long j10) {
        this.a = j10;
    }

    public final void a(kh.a aVar, int i10) {
        SparseArray sparseArray = this.d;
        r6 r6Var = (r6) sparseArray.get(i10, null);
        if (r6Var == null) {
            r6Var = new r6();
            sparseArray.put(i10, r6Var);
        }
        long j10 = aVar.c;
        r6Var.a += j10;
        this.c += j10;
        this.b++;
        r6Var.b.add(aVar);
    }

    public final void b(kh.a aVar) {
        r6 r6Var = (r6) this.d.get(aVar.d, null);
        if (r6Var != null && r6Var.b.remove(aVar)) {
            long j10 = r6Var.a;
            long j11 = aVar.c;
            r6Var.a = j10 - j11;
            this.c -= j11;
            this.b--;
        }
    }
}
