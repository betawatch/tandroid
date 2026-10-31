package h2;

import b2.q0;
import b2.x;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class h extends a {
    public x a;
    public final d b = new d();
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    public final int h;
    public final int n;

    static {
        q0.a("media3.decoder");
    }

    public h(int i10, int i11) {
        this.h = i10;
        this.n = i11;
    }

    public final ByteBuffer b(int i10) {
        int i11 = this.h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.c;
        throw new g("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i10 + ")");
    }

    public final void c(int i10) {
        int i11 = i10 + this.n;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = b(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer b10 = b(i12);
        b10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            b10.put(byteBuffer);
        }
        this.c = b10;
    }

    @Override // h2.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.d = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
