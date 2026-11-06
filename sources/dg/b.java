package dg;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j3) {
        this.b = j3;
    }

    @Override // dg.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // dg.a
    public final int b() {
        return -1;
    }

    @Override // dg.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // dg.a
    public final void d() {
        this.c = 0;
    }

    @Override // dg.a
    public final void e(int i7, int i10) {
        this.c = AudioConversions.usToShorts(this.b, i7, i10);
    }
}
