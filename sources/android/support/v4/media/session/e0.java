package android.support.v4.media.session;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class e0 {
    public int b;
    public long c;
    public float d;
    public long e;
    public long f;
    public final ArrayList a = new ArrayList();
    public final long g = -1;

    public final void a(PlaybackStateCompat.CustomAction customAction) {
        this.a.add(customAction);
    }

    public final PlaybackStateCompat b() {
        return new PlaybackStateCompat(this.b, this.c, 0L, this.d, this.e, 0, null, this.f, this.a, this.g, null);
    }

    public final void c(int i10, long j10, float f7) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = i10;
        this.c = j10;
        this.f = elapsedRealtime;
        this.d = f7;
    }
}
