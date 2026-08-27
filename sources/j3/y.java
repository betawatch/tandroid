package j3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class y implements j {
    public h b;
    public h c;
    public h d;
    public h e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public y() {
        ByteBuffer byteBuffer = j.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        h hVar = h.e;
        this.d = hVar;
        this.e = hVar;
        this.b = hVar;
        this.c = hVar;
    }

    @Override // j3.j
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = j.a;
        return byteBuffer;
    }

    @Override // j3.j
    public final void c() {
        this.h = true;
        h();
    }

    @Override // j3.j
    public boolean d() {
        return this.h && this.g == j.a;
    }

    @Override // j3.j
    public final h e(h hVar) {
        this.d = hVar;
        this.e = f(hVar);
        return isActive() ? this.e : h.e;
    }

    public abstract h f(h hVar);

    @Override // j3.j
    public final void flush() {
        this.g = j.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // j3.j
    public boolean isActive() {
        return this.e != h.e;
    }

    public final ByteBuffer j(int i10) {
        if (this.f.capacity() < i10) {
            this.f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // j3.j
    public final void reset() {
        flush();
        this.f = j.a;
        h hVar = h.e;
        this.d = hVar;
        this.e = hVar;
        this.b = hVar;
        this.c = hVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
