package jf;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // jf.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // jf.a
    public final int b() {
        return -1;
    }

    @Override // jf.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // jf.a
    public final void d() {
        this.c = 0;
    }

    @Override // jf.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}
