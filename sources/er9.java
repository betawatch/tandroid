// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class er9 extends a2 {
    public er9() {
        super("stsd");
    }

    @Override // a2, pz0
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(8);
        kne.f(0, allocate);
        kne.e(0, allocate);
        allocate.putInt(this.b.size());
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // a2, pz0
    public final long getSize() {
        long b = b();
        return 8 + b + (b + 16 >= 4294967296L ? 16 : 8);
    }
}
