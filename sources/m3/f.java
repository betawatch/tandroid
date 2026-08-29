package m3;

import f5.d0;
import j7.l1;
import java.util.Locale;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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
        StringBuilder o10 = com.google.android.recaptcha.internal.a.o("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        l1.w(o10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        l1.w(o10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        l1.w(o10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        l1.w(o10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        o10.append(j10);
        o10.append("\n videoFrameProcessingOffsetCount=");
        o10.append(i20);
        o10.append("\n}");
        return o10.toString();
    }
}
