package n3;

import j3.l0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public class i extends a {
    public final d c = new d();
    public ByteBuffer d;
    public boolean e;
    public long f;
    public ByteBuffer h;
    public final int n;
    public final int r;

    static {
        l0.a("goog.exo.decoder");
    }

    public i(int i10, int i11) {
        this.n = i10;
        this.r = i11;
    }

    @Override // n3.a
    public void b() {
        this.b = 0;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.e = false;
    }

    public final ByteBuffer j(int i10) {
        int i11 = this.n;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.d;
        throw new h("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }

    public final void k(int i10) {
        int i11 = i10 + this.r;
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer == null) {
            this.d = j(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.d = byteBuffer;
            return;
        }
        ByteBuffer j10 = j(i12);
        j10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            j10.put(byteBuffer);
        }
        this.d = j10;
    }

    public final void l() {
        ByteBuffer byteBuffer = this.d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.h;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
