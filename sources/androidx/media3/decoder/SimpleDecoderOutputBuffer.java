package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.a;
import h2.j;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
