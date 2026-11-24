// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class jhc extends c4 {
    public int f;
    public int h;
    public String n;
    public final long[] r;

    public jhc(String str) {
        super(str);
        this.n = "";
        this.r = new long[3];
    }

    @Override // a2, pz0
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        kne.d(1, allocate);
        kne.d(0, allocate);
        kne.d(0, allocate);
        long[] jArr = this.r;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        kne.d(this.f, allocate);
        kne.d(this.h, allocate);
        kne.b(allocate, 72.0d);
        kne.b(allocate, 72.0d);
        allocate.putInt(0);
        kne.d(1, allocate);
        allocate.put((byte) (rze.b(this.n) & nm7.d4));
        allocate.put(rze.a(this.n));
        int b = rze.b(this.n);
        while (b < 31) {
            b++;
            allocate.put((byte) 0);
        }
        kne.d(24, allocate);
        kne.d(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // a2, pz0
    public final long getSize() {
        long b = b();
        return 78 + b + (b + 86 >= 4294967296L ? 16 : 8);
    }
}
