package l2;

import java.util.Locale;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class d {
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
        int i7 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        int i12 = this.d;
        int i13 = this.e;
        int i14 = this.f;
        int i15 = this.g;
        int i16 = this.h;
        int i17 = this.i;
        int i18 = this.j;
        long j3 = this.k;
        int i19 = this.l;
        String str = h2.m0.a;
        Locale locale = Locale.US;
        StringBuilder o4 = jg.g.o("DecoderCounters {\n decoderInits=", i7, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        jg.g.x(o4, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        jg.g.x(o4, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        jg.g.x(o4, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        jg.g.x(o4, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        o4.append(j3);
        o4.append("\n videoFrameProcessingOffsetCount=");
        o4.append(i19);
        o4.append("\n}");
        return o4.toString();
    }
}
