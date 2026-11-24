package androidx.media3.decoder;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends b93 {
    public final kx3 a;
    public ByteBuffer b;

    public SimpleDecoderOutputBuffer(kx3 kx3Var) {
        this.a = kx3Var;
    }

    @Override // b93, n01
    public final void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // b93
    public final void release() {
        this.a.a(this);
    }
}
