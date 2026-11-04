package j2;

import d2.o0;
import d2.v;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class h extends a {
    public v a;
    public final d b = new d();
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    public final int h;
    public final int n;

    static {
        o0.a("media3.decoder");
    }

    public h(int i3, int i10) {
        this.h = i3;
        this.n = i10;
    }

    public final ByteBuffer a(int i3) {
        int i10 = this.h;
        if (i10 == 1) {
            return ByteBuffer.allocate(i3);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i3);
        }
        ByteBuffer byteBuffer = this.c;
        throw new g("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i3 + ")");
    }

    public final void b(int i3) {
        int i10 = i3 + this.n;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = a(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer a10 = a(i11);
        a10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a10.put(byteBuffer);
        }
        this.c = a10;
    }

    public final void c() {
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }

    @Override // j2.a
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
}
