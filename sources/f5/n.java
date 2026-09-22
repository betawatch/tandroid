package f5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class n extends com.googlecode.mp4parser.b {
    public n() {
        super("stsd");
    }

    @Override // com.googlecode.mp4parser.b, f5.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        e5.b.r(0, allocate);
        e5.b.q(0, allocate);
        allocate.putInt(this.b.size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, f5.b
    public final long getSize() {
        long b10 = b();
        return 8 + b10 + (b10 + 16 >= 4294967296L ? 16 : 8);
    }
}
