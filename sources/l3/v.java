package l3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class v {
    public final u a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public v(AudioTrack audioTrack) {
        if (f5.d0.a >= 19) {
            this.a = new u(audioTrack);
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

    public final void b(int i10) {
        this.b = i10;
        if (i10 == 0) {
            this.e = 0L;
            this.f = -1L;
            this.c = System.nanoTime() / 1000;
            this.d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.d = 500000L;
        }
    }
}
