// default package

import android.os.SystemClock;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ea4 implements eo4 {
    @Override // eo4
    public final void a() {
        ia4.b = SystemClock.elapsedRealtime();
    }

    @Override // eo4
    public final void b() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = ia4.b;
        if (j != 0 && elapsedRealtime - j > 300000) {
            qa4 qa4Var = ia4.a;
        }
        ia4.b = 0L;
    }
}
