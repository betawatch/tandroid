package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.a;
import h2.j;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
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
        this.a.k(this);
    }
}
