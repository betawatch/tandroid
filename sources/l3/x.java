package l3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class x {
    public final w a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public x(AudioTrack audioTrack) {
        if (h5.d0.a >= 19) {
            this.a = new w(audioTrack);
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
