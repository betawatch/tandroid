package i2;

import java.util.Locale;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
        String str = e2.m0.a;
        Locale locale = Locale.US;
        StringBuilder l4 = d.l("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        d.u(l4, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        d.u(l4, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        d.u(l4, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        d.u(l4, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        l4.append(j10);
        l4.append("\n videoFrameProcessingOffsetCount=");
        l4.append(i20);
        l4.append("\n}");
        return l4.toString();
    }
}
