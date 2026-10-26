package i2;

import java.util.Locale;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class e {
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
        long j10 = this.k;
        int i20 = this.l;
        String str = e2.n0.a;
        Locale locale = Locale.US;
        StringBuilder n10 = c3.h0.n("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        c3.h0.q(n10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        c3.h0.q(n10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        c3.h0.q(n10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        c3.h0.q(n10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        n10.append(j10);
        n10.append("\n videoFrameProcessingOffsetCount=");
        n10.append(i20);
        n10.append("\n}");
        return n10.toString();
    }
}
