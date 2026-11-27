// default package

import org.telegram.messenger.video.AudioConversions;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class fk0 extends i00 {
    public final long b;
    public int c;

    public fk0(long j) {
        this.b = j;
    }

    @Override // i00
    public final short a() {
        if (c()) {
            this.c--;
            return (short) 0;
        }
        xi4.l("Audio input has no remaining value.");
        return (short) 0;
    }

    @Override // i00
    public final boolean c() {
        return this.c > 0;
    }

    @Override // i00
    public final void d() {
        this.c = 0;
    }

    @Override // i00
    public final void e(int i, int i2) {
        this.c = AudioConversions.usToShorts(this.b, i, i2);
    }
}
