package bg;

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final class b extends a {
    public final long b;
    public int c;

    public b(long j10) {
        this.b = j10;
    }

    @Override // bg.a
    public final short a() {
        if (!c()) {
            throw new RuntimeException("Audio input has no remaining value.");
        }
        this.c--;
        return (short) 0;
    }

    @Override // bg.a
    public final int b() {
        return -1;
    }

    @Override // bg.a
    public final boolean c() {
        return this.c > 0;
    }

    @Override // bg.a
    public final void d() {
        this.c = 0;
    }

    @Override // bg.a
    public final void e(int i10, int i11) {
        this.c = AudioConversions.usToShorts(this.b, i10, i11);
    }
}
