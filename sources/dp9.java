// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class dp9 extends a2 {
    public dp9() {
        super("stsd");
    }

    @Override // a2, iy0
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        ile.f(0, allocate);
        ile.e(0, allocate);
        allocate.putInt(this.b.size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // a2, iy0
    public final long getSize() {
        long b = b();
        return 8 + b + (b + 16 >= 4294967296L ? 16 : 8);
    }
}
