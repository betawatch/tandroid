package i2;

import java.util.Locale;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
        StringBuilder l4 = hg.k0.l("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        hg.k0.t(l4, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        hg.k0.t(l4, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        hg.k0.t(l4, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        hg.k0.t(l4, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        l4.append(j3);
        l4.append("\n videoFrameProcessingOffsetCount=");
        l4.append(i20);
        l4.append("\n}");
        return l4.toString();
    }
}
