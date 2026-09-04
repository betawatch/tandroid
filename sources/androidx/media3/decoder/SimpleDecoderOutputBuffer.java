package androidx.media3.decoder;

import androidx.media3.decoder.ffmpeg.a;
import h2.h;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class SimpleDecoderOutputBuffer extends h {
    public final a f;
    public ByteBuffer h;

    public SimpleDecoderOutputBuffer(a aVar) {
        this.f = aVar;
    }

    @Override // h2.h
    public final void i() {
        this.b = 0;
        this.c = 0L;
        this.d = 0;
        this.e = false;
        ByteBuffer byteBuffer = this.h;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    @Override // h2.h
    public final void j() {
        this.f.a.n(this);
    }
}
