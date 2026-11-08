package android.support.v4.media.session;

import android.os.SystemClock;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.ArrayList;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class d0 {
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

    public final void c(int i7, long j3, float f10) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.b = i7;
        this.c = j3;
        this.f = elapsedRealtime;
        this.d = f10;
    }
}
