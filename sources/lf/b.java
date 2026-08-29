package lf;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // lf.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // lf.a
    public final int b() {
        return -1;
    }

    @Override // lf.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // lf.a
    public final void d() {
        this.c = 0;
    }

    @Override // lf.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}
