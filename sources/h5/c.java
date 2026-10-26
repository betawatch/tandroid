package h5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class c extends a {
    public int h;
    public int n;
    public double r;
    public double s;
    public int v;
    public String w;
    public int x;
    public final long[] y;

    public c(String str) {
        super(str);
        this.r = 72.0d;
        this.s = 72.0d;
        this.v = 1;
        this.w = "";
        this.x = 24;
        this.y = new long[3];
    }

    @Override // com.googlecode.mp4parser.b, g5.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        f5.b.p(this.f, allocate);
        f5.b.p(0, allocate);
        f5.b.p(0, allocate);
        long[] jArr = this.y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        f5.b.p(this.h, allocate);
        f5.b.p(this.n, allocate);
        f5.b.n(allocate, this.r);
        f5.b.n(allocate, this.s);
        allocate.putInt((int) 0);
        f5.b.p(this.v, allocate);
        allocate.put((byte) (f5.b.l(this.w) & 255));
        allocate.put(f5.b.b(this.w));
        int l4 = f5.b.l(this.w);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        f5.b.p(this.x, allocate);
        f5.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, g5.b
    public final long getSize() {
        long b10 = b();
        return 78 + b10 + (b10 + 86 >= 4294967296L ? 16 : 8);
    }
}
