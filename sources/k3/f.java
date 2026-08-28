package k3;

import d5.f0;
import j3.r0;
import java.util.Locale;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f {
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
        int i9 = this.a;
        int i10 = this.b;
        int i11 = this.c;
        int i12 = this.d;
        int i13 = this.e;
        int i14 = this.f;
        int i15 = this.g;
        int i16 = this.h;
        int i17 = this.i;
        int i18 = this.j;
        long j10 = this.k;
        int i19 = this.l;
        int i20 = f0.a;
        Locale locale = Locale.US;
        StringBuilder o6 = e2.c.o("DecoderCounters {\n decoderInits=", i9, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        r0.y(o6, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        r0.y(o6, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        r0.y(o6, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        r0.y(o6, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        o6.append(j10);
        o6.append("\n videoFrameProcessingOffsetCount=");
        o6.append(i19);
        o6.append("\n}");
        return o6.toString();
    }
}
