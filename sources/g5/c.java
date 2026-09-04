package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
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

    @Override // com.googlecode.mp4parser.b, f5.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e5.b.p(this.f, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        long[] jArr = this.y;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        e5.b.p(this.h, allocate);
        e5.b.p(this.n, allocate);
        e5.b.n(allocate, this.r);
        e5.b.n(allocate, this.s);
        allocate.putInt((int) 0);
        e5.b.p(this.v, allocate);
        allocate.put((byte) (e5.b.l(this.w) & 255));
        allocate.put(e5.b.b(this.w));
        int l4 = e5.b.l(this.w);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        e5.b.p(this.x, allocate);
        e5.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, f5.b
    public final long getSize() {
        long b10 = b();
        return 78 + b10 + (b10 + 86 >= 4294967296L ? 16 : 8);
    }
}
