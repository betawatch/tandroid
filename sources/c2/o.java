package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class o implements n {
    public k b;
    public k c;
    public k d;
    public k e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public o() {
        ByteBuffer byteBuffer = n.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.b = kVar;
        this.c = kVar;
    }

    @Override // c2.n
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = n.a;
        return byteBuffer;
    }

    @Override // c2.n
    public boolean b() {
        return this.h && this.g == n.a;
    }

    @Override // c2.n
    public final void d(l lVar) {
        this.g = n.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // c2.n
    public final k e(k kVar) {
        this.d = kVar;
        this.e = h(kVar);
        return isActive() ? this.e : k.e;
    }

    @Override // c2.n
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override // c2.n
    public boolean isActive() {
        return this.e != k.e;
    }

    public final ByteBuffer l(int i10) {
        if (this.f.capacity() < i10) {
            this.f = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // c2.n
    public final void reset() {
        ByteBuffer byteBuffer = n.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        k kVar = k.e;
        this.d = kVar;
        this.e = kVar;
        this.b = kVar;
        this.c = kVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // c2.n
    public long g(long j10) {
        return j10;
    }
}
