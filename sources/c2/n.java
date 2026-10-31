package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class n implements m {
    public j b;
    public j c;
    public j d;
    public j e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public n() {
        ByteBuffer byteBuffer = m.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        j jVar = j.e;
        this.d = jVar;
        this.e = jVar;
        this.b = jVar;
        this.c = jVar;
    }

    @Override // c2.m
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = m.a;
        return byteBuffer;
    }

    @Override // c2.m
    public boolean c() {
        return this.h && this.g == m.a;
    }

    @Override // c2.m
    public final void d(k kVar) {
        this.g = m.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // c2.m
    public final j e(j jVar) {
        this.d = jVar;
        this.e = h(jVar);
        return isActive() ? this.e : j.e;
    }

    @Override // c2.m
    public final void f() {
        this.h = true;
        j();
    }

    public abstract j h(j jVar);

    @Override // c2.m
    public boolean isActive() {
        return this.e != j.e;
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

    @Override // c2.m
    public final void reset() {
        ByteBuffer byteBuffer = m.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        j jVar = j.e;
        this.d = jVar;
        this.e = jVar;
        this.b = jVar;
        this.c = jVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // c2.m
    public long g(long j10) {
        return j10;
    }
}
