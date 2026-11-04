package e2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // e2.m
    public boolean a() {
        return this.h && this.g == m.a;
    }

    @Override // e2.m
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = m.a;
        return byteBuffer;
    }

    @Override // e2.m
    public final j d(j jVar) {
        this.d = jVar;
        this.e = h(jVar);
        return isActive() ? this.e : j.e;
    }

    @Override // e2.m
    public final void e(k kVar) {
        this.g = m.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // e2.m
    public final void f() {
        this.h = true;
        j();
    }

    public abstract j h(j jVar);

    @Override // e2.m
    public boolean isActive() {
        return this.e != j.e;
    }

    public final ByteBuffer l(int i3) {
        if (this.f.capacity() < i3) {
            this.f = ByteBuffer.allocateDirect(i3).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // e2.m
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

    @Override // e2.m
    public long g(long j10) {
        return j10;
    }
}
