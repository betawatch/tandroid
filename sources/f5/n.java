package f5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
