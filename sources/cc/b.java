package cc;

import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class b implements ByteChannel {
    public ByteBuffer a;

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.a;
        if (byteBuffer2.remaining() <= 0) {
            return -1;
        }
        byteBuffer.put((ByteBuffer) byteBuffer2.duplicate().limit(byteBuffer.remaining() + byteBuffer2.position()));
        byteBuffer2.position(byteBuffer2.position() + remaining);
        return remaining;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        this.a.put(byteBuffer);
        return remaining;
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
