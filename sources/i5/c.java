package i5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.telegram.messenger.hs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class c extends a {
    public final long[] E;
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
        this.E = new long[3];
    }

    @Override // com.googlecode.mp4parser.b, h5.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        g5.b.p(this.f, allocate);
        g5.b.p(0, allocate);
        g5.b.p(0, allocate);
        long[] jArr = this.E;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        g5.b.p(this.h, allocate);
        g5.b.p(this.n, allocate);
        g5.b.n(allocate, this.r);
        g5.b.n(allocate, this.s);
        allocate.putInt((int) 0);
        g5.b.p(this.w, allocate);
        allocate.put((byte) (g5.b.l(this.x) & hs.e4));
        allocate.put(g5.b.b(this.x));
        int l10 = g5.b.l(this.x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        g5.b.p(this.y, allocate);
        g5.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, h5.b
    public final long getSize() {
        long b10 = b();
        return 78 + b10 + (b10 + 86 >= 4294967296L ? 16 : 8);
    }
}
