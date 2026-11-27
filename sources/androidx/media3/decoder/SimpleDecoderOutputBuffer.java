package androidx.media3.decoder;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
