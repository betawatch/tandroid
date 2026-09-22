package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.a;
import h2.j;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
        this.a.h(this);
    }
}
