// default package

import android.media.AudioTrack;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class c40 {
    public final b40 a;
    public final int b;
    public final wz4 c;
    public byte d;
    public long e;
    public int f;
    public long g;
    public long h;
    public long i;

    public c40(AudioTrack audioTrack, wz4 wz4Var) {
        this.a = new b40(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = wz4Var;
        a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000;
            return;
        }
        if (i == 1) {
            this.f = 10000;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000;
        } else if (i == 4) {
            this.f = 500000;
        } else {
            grb.g();
        }
    }
}
