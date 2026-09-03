package nf;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // nf.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // nf.a
    public final int b() {
        return -1;
    }

    @Override // nf.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // nf.a
    public final void d() {
        this.c = 0;
    }

    @Override // nf.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}
