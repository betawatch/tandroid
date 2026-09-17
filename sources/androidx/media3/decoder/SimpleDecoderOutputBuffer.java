package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.a;
import h2.h;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends h {
    public final a f;
    public ByteBuffer h;

    public SimpleDecoderOutputBuffer(a aVar) {
        this.f = aVar;
    }

    @Override // h2.h
    public final void i() {
        this.b = 0;
        this.c = 0L;
        this.d = 0;
        this.e = false;
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // h2.h
    public final void j() {
        this.f.a.n(this);
    }
}
