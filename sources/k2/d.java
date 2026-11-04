package k2;

import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
        int i3 = this.a;
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
        String str = g2.n0.a;
        Locale locale = Locale.US;
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m("DecoderCounters {\n decoderInits=", i3, ",\n decoderReleases=", i10, "\n queuedInputBuffers=");
        com.google.android.recaptcha.internal.a.r(m10, i11, "\n skippedInputBuffers=", i12, "\n renderedOutputBuffers=");
        com.google.android.recaptcha.internal.a.r(m10, i13, "\n skippedOutputBuffers=", i14, "\n droppedBuffers=");
        com.google.android.recaptcha.internal.a.r(m10, i15, "\n droppedInputBuffers=", i16, "\n maxConsecutiveDroppedBuffers=");
        com.google.android.recaptcha.internal.a.r(m10, i17, "\n droppedToKeyframeEvents=", i18, "\n totalVideoFrameProcessingOffsetUs=");
        m10.append(j10);
        m10.append("\n videoFrameProcessingOffsetCount=");
        m10.append(i19);
        m10.append("\n}");
        return m10.toString();
    }
}
