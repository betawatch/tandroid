// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class ijc extends d4 {
    public int f;
    public int h;
    public String n;
    public final long[] r;

    public ijc(String str) {
        super(str);
        this.n = "";
        this.r = new long[3];
    }

    @Override // b2, qy0
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        aqe.d(1, allocate);
        aqe.d(0, allocate);
        aqe.d(0, allocate);
        long[] jArr = this.r;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        aqe.d(this.f, allocate);
        aqe.d(this.h, allocate);
        aqe.b(allocate, 72.0d);
        aqe.b(allocate, 72.0d);
        allocate.putInt(0);
        aqe.d(1, allocate);
        allocate.put((byte) (h2f.b(this.n) & jn7.d4));
        allocate.put(h2f.a(this.n));
        int b = h2f.b(this.n);
        while (b < 31) {
            b++;
            allocate.put((byte) 0);
        }
        aqe.d(24, allocate);
        aqe.d(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // b2, qy0
    public final long getSize() {
        long b = b();
        return 78 + b + (b + 86 >= 4294967296L ? 16 : 8);
    }
}
