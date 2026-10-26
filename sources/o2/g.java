package o2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class g extends x2.c {
    public int g;

    @Override // x2.q
    public final int c() {
        return this.g;
    }

    @Override // x2.q
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

    @Override // x2.q
    public final int n() {
        return 0;
    }

    @Override // x2.q
    public final Object q() {
        return null;
    }
}
