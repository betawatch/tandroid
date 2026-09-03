package mf;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // mf.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // mf.a
    public final int b() {
        return -1;
    }

    @Override // mf.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // mf.a
    public final void d() {
        this.c = 0;
    }

    @Override // mf.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}
