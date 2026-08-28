package k3;

import h3.r0;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public class i extends a {
    public final d a = new d();
    public ByteBuffer b;
    public boolean c;
    public long d;
    public ByteBuffer e;
    public final int f;
    public final int h;

    static {
        r0.a("goog.exo.decoder");
    }

    public i(int i9, int i10) {
        this.f = i9;
        this.h = i10;
    }

    public final ByteBuffer a(int i9) {
        int i10 = this.f;
        if (i10 == 1) {
            return ByteBuffer.allocate(i9);
        }
        if (i10 == 2) {
            return ByteBuffer.allocateDirect(i9);
        }
        ByteBuffer byteBuffer = this.b;
        throw new h("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i9 + ")");
    }

    public final void c(int i9) {
        int i10 = i9 + this.h;
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer == null) {
            this.b = a(i10);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i11 = i10 + position;
        if (capacity >= i11) {
            this.b = byteBuffer;
            return;
        }
        ByteBuffer a2 = a(i11);
        a2.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a2.put(byteBuffer);
        }
        this.b = a2;
    }

    @Override // k3.a
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.c = false;
    }

    public final void d() {
        ByteBuffer byteBuffer = this.b;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.e;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
