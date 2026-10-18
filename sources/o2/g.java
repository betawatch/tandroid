package o2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class g extends x2.c {
    public int g;

    @Override // x2.p
    public final int c() {
        return this.g;
    }

    @Override // x2.p
    public final void k(long j10, long j11, long j12, List list, v2.m[] mVarArr) {
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

    @Override // x2.p
    public final int n() {
        return 0;
    }

    @Override // x2.p
    public final Object q() {
        return null;
    }
}
