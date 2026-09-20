package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.a;
import h2.j;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends j {
    public final a a;
    public ByteBuffer b;

    public SimpleDecoderOutputBuffer(a aVar) {
        this.a = aVar;
    }

    @Override // h2.j, h2.a
    public final void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // h2.j
    public final void release() {
        this.a.g(this);
    }
}
