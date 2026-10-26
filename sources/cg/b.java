package cg;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
