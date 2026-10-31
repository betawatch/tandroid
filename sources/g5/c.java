package g5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class c extends a {
    public final long[] D;
    public int h;
    public int n;
    public double r;
    public double s;
    public int w;
    public String x;
    public int y;

    public c(String str) {
        super(str);
        this.r = 72.0d;
        this.s = 72.0d;
        this.w = 1;
        this.x = "";
        this.y = 24;
        this.D = new long[3];
    }

    @Override // com.googlecode.mp4parser.b, f5.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        e5.b.p(this.f, allocate);
        e5.b.p(0, allocate);
        e5.b.p(0, allocate);
        long[] jArr = this.D;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        e5.b.p(this.h, allocate);
        e5.b.p(this.n, allocate);
        e5.b.n(allocate, this.r);
        e5.b.n(allocate, this.s);
        allocate.putInt((int) 0);
        e5.b.p(this.w, allocate);
        allocate.put((byte) (e5.b.l(this.x) & zs.e4));
        allocate.put(e5.b.b(this.x));
        int l4 = e5.b.l(this.x);
        while (l4 < 31) {
            l4++;
            allocate.put((byte) 0);
        }
        e5.b.p(this.y, allocate);
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
