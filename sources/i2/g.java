package i2;

import java.util.Locale;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        StringBuilder n10 = hc.b.n("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hc.b.w(n10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hc.b.w(n10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hc.b.w(n10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hc.b.w(n10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        n10.append(j3);
        n10.append("\n videoFrameProcessingOffsetCount=");
        n10.append(i20);
        n10.append("\n}");
        return n10.toString();
    }
}
