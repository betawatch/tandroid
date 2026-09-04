package h2;

import b2.l0;
import b2.s;
import dd.k;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public class g extends k {
    public s c;
    public final c d = new c();
    public ByteBuffer e;
    public boolean f;
    public long h;
    public ByteBuffer n;
    public final int r;
    public final int s;

    static {
        l0.a("media3.decoder");
    }

    public g(int i10, int i11) {
        this.r = i10;
        this.s = i11;
    }

    public void i() {
        this.b = 0;
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.n;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f = false;
    }

    public final ByteBuffer j(int i10) {
        int i11 = this.r;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.e;
        throw new f("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }

    public final void l(int i10) {
        int i11 = i10 + this.s;
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer == null) {
            this.e = j(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.e = byteBuffer;
            return;
        }
        ByteBuffer j3 = j(i12);
        j3.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            j3.put(byteBuffer);
        }
        this.e = j3;
    }

    public final void m() {
        ByteBuffer byteBuffer = this.e;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.n;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
