package android.support.v4.media.session;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class g0 {
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

    public final void c(int i9, long j10, float f10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = i9;
        this.c = j10;
        this.f = elapsedRealtime;
        this.d = f10;
    }
}
