package o2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g extends x2.c {
    public int g;

    @Override // x2.r
    public final int c() {
        return this.g;
    }

    @Override // x2.r
    public final void k(long j3, long j10, long j11, List list, v2.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.g, elapsedRealtime)) {
            for (int i10 = this.b - 1; i10 >= 0; i10--) {
                if (!a(i10, elapsedRealtime)) {
                    this.g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // x2.r
    public final int n() {
        return 0;
    }

    @Override // x2.r
    public final Object q() {
        return null;
    }
}
