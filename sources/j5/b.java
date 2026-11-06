package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class b extends a {
    public int h;
    public int n;
    public long r;

    @Override // com.googlecode.mp4parser.b, i5.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(28);
        allocate.position(6);
        h5.b.p(this.f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        allocate.putInt((int) 0);
        h5.b.p(this.h, allocate);
        h5.b.p(this.n, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        if (this.e.equals("mlpa")) {
            allocate.putInt((int) this.r);
        } else {
            allocate.putInt((int) (this.r << 16));
        }
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, i5.b
    public final long getSize() {
        long b10 = b() + 28;
        return b10 + (8 + b10 >= 4294967296L ? 16 : 8);
    }

    @Override // com.googlecode.mp4parser.e
    public final String toString() {
        return "AudioSampleEntry{bytesPerSample=0, bytesPerFrame=0, bytesPerPacket=0, samplesPerPacket=0, packetSize=0, compressionId=0, soundVersion=0, sampleRate=" + this.r + ", sampleSize=" + this.n + ", channelCount=" + this.h + ", boxes=" + this.b + '}';
    }
}
