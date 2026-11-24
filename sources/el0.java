// default package

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class el0 extends h10 {
    public final long b;
    public int c;

    public el0(long j) {
        this.b = j;
    }

    @Override // h10
    public final short a() {
        if (c()) {
            this.c--;
            return (short) 0;
        }
        zo4.k("Audio input has no remaining value.");
        return (short) 0;
    }

    @Override // h10
    public final boolean c() {
        return this.c > 0;
    }

    @Override // h10
    public final void d() {
        this.c = 0;
    }

    @Override // h10
    public final void e(int i, int i2) {
        this.c = AudioConversions.usToShorts(this.b, i, i2);
    }
}
