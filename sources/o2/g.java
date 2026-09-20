package o2;

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class g extends x2.c {
    public int g;

    @Override // x2.s
    public final int c() {
        return this.g;
    }

    @Override // x2.s
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

    @Override // x2.s
    public final int n() {
        return 0;
    }

    @Override // x2.s
    public final Object q() {
        return null;
    }
}
