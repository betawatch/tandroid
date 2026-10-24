package android.support.v4.media.session;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
