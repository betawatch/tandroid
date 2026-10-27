package cg;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // cg.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // cg.a
    public final int b() {
        return -1;
    }

    @Override // cg.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // cg.a
    public final void d() {
        this.c = 0;
    }

    @Override // cg.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}
