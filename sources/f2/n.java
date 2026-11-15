package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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

    @Override // f2.m
    public boolean a() {
        return this.h && this.g == m.a;
    }

    @Override // f2.m
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = m.a;
        return byteBuffer;
    }

    @Override // f2.m
    public final void d(k kVar) {
        this.g = m.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // f2.m
    public final j e(j jVar) {
        this.d = jVar;
        this.e = h(jVar);
        return isActive() ? this.e : j.e;
    }

    @Override // f2.m
    public final void f() {
        this.h = true;
        j();
    }

    public abstract j h(j jVar);

    @Override // f2.m
    public boolean isActive() {
        return this.e != j.e;
    }

    public final ByteBuffer l(int i7) {
        if (this.f.capacity() < i7) {
            this.f = ByteBuffer.allocateDirect(i7).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // f2.m
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

    @Override // f2.m
    public long g(long j3) {
        return j3;
    }
}
