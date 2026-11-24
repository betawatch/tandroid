// default package

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class la3 extends v11 {
    public go4 a;
    public final z43 b = new z43();
    public ByteBuffer c;
    public boolean d;
    public long e;
    public ByteBuffer f;
    public final byte h;
    public final int n;

    static {
        ct6.a("media3.decoder");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public la3(int i, int i2) {
        this.h = i;
        this.n = i2;
    }

    public final ByteBuffer a(int i) {
        byte b = this.h;
        if (b == 1) {
            return ByteBuffer.allocate(i);
        }
        if (b == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.c;
        throw new ka3("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    public final void c(int i) {
        int i2 = i + this.n;
        ByteBuffer byteBuffer = this.c;
        if (byteBuffer == null) {
            this.c = a(i2);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i3 = i2 + position;
        if (capacity >= i3) {
            this.c = byteBuffer;
            return;
        }
        ByteBuffer a = a(i3);
        a.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            a.put(byteBuffer);
        }
        this.c = a;
    }

    @Override // v11
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
