package ag;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
