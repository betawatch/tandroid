package i2;

import com.google.android.gms.internal.vision.e2;
import java.util.Locale;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class h {
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
        StringBuilder k10 = e2.k("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        g.v(k10, i12, "\n skippedInputBuffers=", i13, "\n renderedOutputBuffers=");
        g.v(k10, i14, "\n skippedOutputBuffers=", i15, "\n droppedBuffers=");
        g.v(k10, i16, "\n droppedInputBuffers=", i17, "\n maxConsecutiveDroppedBuffers=");
        g.v(k10, i18, "\n droppedToKeyframeEvents=", i19, "\n totalVideoFrameProcessingOffsetUs=");
        k10.append(j3);
        k10.append("\n videoFrameProcessingOffsetCount=");
        k10.append(i20);
        k10.append("\n}");
        return k10.toString();
    }
}
