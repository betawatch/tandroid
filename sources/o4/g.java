package o4;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class g extends b5.c {
    public int g;

    @Override // b5.s
    public final int d() {
        return this.g;
    }

    @Override // b5.s
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f(this.g, elapsedRealtime)) {
            for (int i10 = this.b - 1; i10 >= 0; i10--) {
                if (!f(i10, elapsedRealtime)) {
                    this.g = i10;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // b5.s
    public final int p() {
        return 0;
    }

    @Override // b5.s
    public final Object r() {
        return null;
    }
}
