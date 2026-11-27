package androidx.media3.decoder;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends u93 {
    public final lu3 a;
    public ByteBuffer b;

    public SimpleDecoderOutputBuffer(lu3 lu3Var) {
        this.a = lu3Var;
    }

    @Override // u93, w01
    public final void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // u93
    public final void release() {
        this.a.b(this);
    }
}
