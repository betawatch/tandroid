package o4;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g extends b5.c {
    public int g;

    @Override // b5.t
    public final int d() {
        return this.g;
    }

    @Override // b5.t
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (f(this.g, elapsedRealtime)) {
            for (int i9 = this.b - 1; i9 >= 0; i9--) {
                if (!f(i9, elapsedRealtime)) {
                    this.g = i9;
                    return;
                }
            }
            throw new IllegalStateException();
        }
    }

    @Override // b5.t
    public final int p() {
        return 0;
    }

    @Override // b5.t
    public final Object r() {
        return null;
    }
}
