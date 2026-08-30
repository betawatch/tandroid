package n3;

import h5.d0;
import java.util.Locale;
import kh.a2;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
        int i21 = d0.a;
        Locale locale = Locale.US;
        StringBuilder m9 = e2.c.m("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        a2.w(m9, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        a2.w(m9, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        a2.w(m9, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        a2.w(m9, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        m9.append(j10);
        m9.append("\n videoFrameProcessingOffsetCount=");
        m9.append(i20);
        m9.append("\n}");
        return m9.toString();
    }
}
