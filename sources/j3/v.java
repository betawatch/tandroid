package j3;

import android.media.AudioTrack;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v {
    public final u a;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;

    public v(AudioTrack audioTrack) {
        if (d5.g0.a >= 19) {
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
