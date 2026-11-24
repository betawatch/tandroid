package androidx.media3.decoder;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends na3 {
    public final yu3 a;
    public ByteBuffer b;

    public SimpleDecoderOutputBuffer(yu3 yu3Var) {
        this.a = yu3Var;
    }

    @Override // na3, v11
    public final void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // na3
    public final void release() {
        this.a.b(this);
    }
}
