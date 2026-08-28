package hf;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // hf.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // hf.a
    public final int b() {
        return -1;
    }

    @Override // hf.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // hf.a
    public final void d() {
        this.c = 0;
    }

    @Override // hf.a
    public final void e(int i9, int i10) {
        this.c = AudioConversions.usToShorts(this.b, i9, i10);
    }
}
