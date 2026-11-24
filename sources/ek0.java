// default package

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ek0 extends h00 {
    public final long b;
    public int c;

    public ek0(long j) {
        this.b = j;
    }

    @Override // h00
    public final short a() {
        if (c()) {
            this.c--;
            return (short) 0;
        }
        wn4.j("Audio input has no remaining value.");
        return (short) 0;
    }

    @Override // h00
    public final boolean c() {
        return this.c > 0;
    }

    @Override // h00
    public final void d() {
        this.c = 0;
    }

    @Override // h00
    public final void e(int i, int i2) {
        this.c = AudioConversions.usToShorts(this.b, i, i2);
    }
}
