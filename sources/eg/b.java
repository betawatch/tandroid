package eg;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // eg.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // eg.a
    public final int b() {
        return -1;
    }

    @Override // eg.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // eg.a
    public final void d() {
        this.c = 0;
    }

    @Override // eg.a
    public final void e(int i3, int i10) {
        this.c = AudioConversions.usToShorts(this.b, i3, i10);
    }
}
