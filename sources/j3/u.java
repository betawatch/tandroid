package j3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class u {
    public final t a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public u(AudioTrack audioTrack) {
        if (d5.f0.a >= 19) {
            this.a = new t(audioTrack);
            a();
        } else {
            this.a = null;
            b(3);
        }
    }

    public final void a() {
        if (this.a != null) {
            b(0);
        }
    }

    public final void b(int i9) {
        this.b = i9;
        if (i9 == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i9 == 1) {
            this.d = 10000L;
            return;
        }
        if (i9 == 2 || i9 == 3) {
            this.d = 10000000L;
        } else {
            if (i9 != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
