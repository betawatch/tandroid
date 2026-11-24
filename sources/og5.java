// default package

import android.os.SystemClock;
import java.util.List;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class og5 extends vh0 {
    public int h;

    @Override // t74
    public final void b(long j, long j2, long j3, List list, em6[] em6VarArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (a(this.h, elapsedRealtime)) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (!a(i, elapsedRealtime)) {
                    this.h = i;
                    return;
                }
            }
            rjb.h();
        }
    }

    @Override // t74
    public final int d() {
        return this.h;
    }

    @Override // t74
    public final int p() {
        return 0;
    }

    @Override // t74
    public final Object s() {
        return null;
    }
}
