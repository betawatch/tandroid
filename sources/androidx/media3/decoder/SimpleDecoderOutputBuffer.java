package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.a;
import h2.j;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
        this.a.i(this);
    }
}
