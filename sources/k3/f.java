package k3;

import d5.g0;
import java.util.Locale;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
        int i21 = g0.a;
        Locale locale = Locale.US;
        StringBuilder p6 = com.google.android.recaptcha.internal.a.p("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        i0.a.x(p6, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        i0.a.x(p6, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        i0.a.x(p6, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        i0.a.x(p6, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        p6.append(j10);
        p6.append("\n videoFrameProcessingOffsetCount=");
        p6.append(i20);
        p6.append("\n}");
        return p6.toString();
    }
}
