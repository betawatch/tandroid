package nf;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
