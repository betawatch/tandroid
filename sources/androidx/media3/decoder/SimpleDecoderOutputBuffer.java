package androidx.media3.decoder;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
