// default package

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class jfc extends c4 {
    public int f;
    public int h;
    public String n;
    public final long[] r;

    public jfc(String str) {
        super(str);
        this.n = "";
        this.r = new long[3];
    }

    @Override // a2, iy0
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        ile.d(1, allocate);
        ile.d(0, allocate);
        ile.d(0, allocate);
        long[] jArr = this.r;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        ile.d(this.f, allocate);
        ile.d(this.h, allocate);
        ile.b(allocate, 72.0d);
        ile.b(allocate, 72.0d);
        allocate.putInt(0);
        ile.d(1, allocate);
        allocate.put((byte) (pxe.b(this.n) & kk7.d4));
        allocate.put(pxe.a(this.n));
        int b = pxe.b(this.n);
        while (b < 31) {
            b++;
            allocate.put((byte) 0);
        }
        ile.d(24, allocate);
        ile.d(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // a2, iy0
    public final long getSize() {
        long b = b();
        return 78 + b + (b + 86 >= 4294967296L ? 16 : 8);
    }
}
