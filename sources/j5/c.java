package j5;

import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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

    @Override // com.googlecode.mp4parser.b, i5.b
    public final void getBox(WritableByteChannel writableByteChannel) {
        writableByteChannel.write(d());
        ByteBuffer allocate = ByteBuffer.allocate(78);
        allocate.position(6);
        h5.b.p(this.f, allocate);
        h5.b.p(0, allocate);
        h5.b.p(0, allocate);
        long[] jArr = this.D;
        allocate.putInt((int) jArr[0]);
        allocate.putInt((int) jArr[1]);
        allocate.putInt((int) jArr[2]);
        h5.b.p(this.h, allocate);
        h5.b.p(this.n, allocate);
        h5.b.n(allocate, this.r);
        h5.b.n(allocate, this.s);
        allocate.putInt((int) 0);
        h5.b.p(this.w, allocate);
        allocate.put((byte) (h5.b.l(this.x) & qs.e4));
        allocate.put(h5.b.b(this.x));
        int l10 = h5.b.l(this.x);
        while (l10 < 31) {
            l10++;
            allocate.put((byte) 0);
        }
        h5.b.p(this.y, allocate);
        h5.b.p(65535, allocate);
        writableByteChannel.write((ByteBuffer) allocate.rewind());
        c(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.b, i5.b
    public final long getSize() {
        long b10 = b();
        return 78 + b10 + (b10 + 86 >= 4294967296L ? 16 : 8);
    }
}
