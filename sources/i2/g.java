package i2;

import java.util.Locale;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class g {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public int l;

    public final String toString() {
        int i10 = this.a;
        int i11 = this.b;
        int i12 = this.c;
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f;
        int i16 = this.g;
        int i17 = this.h;
        int i18 = this.i;
        int i19 = this.j;
        long j3 = this.k;
        int i20 = this.l;
        String str = e2.d0.a;
        Locale locale = Locale.US;
        StringBuilder m10 = hg.c.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.c.v(m10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.c.v(m10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.c.v(m10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.c.v(m10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j3);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i20);
        m10.append("\n}");
        return m10.toString();
    }
}
