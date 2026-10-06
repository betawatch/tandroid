package ag;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j3) {
        this.b = j3;
    }

    @Override // ag.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // ag.a
    public final int b() {
        return -1;
    }

    @Override // ag.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // ag.a
    public final void d() {
        this.c = 0;
    }

    @Override // ag.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}
