package dg;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
