package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class n extends com.googlecode.mp4parser.b {
    public n() {
        super("stsd");
    }

    @Override // com.googlecode.mp4parser.b, g5.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        f5.b.r(0, allocate);
        f5.b.q(0, allocate);
        allocate.putInt(this.b.size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, g5.b
    public final long getSize() {
        long b10 = b();
        return 8 + b10 + (b10 + 16 >= 4294967296L ? 16 : 8);
    }
}
