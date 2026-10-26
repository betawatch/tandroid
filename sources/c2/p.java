package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public abstract class p implements o {
    public l b;
    public l c;
    public l d;
    public l e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public p() {
        ByteBuffer byteBuffer = o.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.b = lVar;
        this.c = lVar;
    }

    @Override // c2.o
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = o.a;
        return byteBuffer;
    }

    @Override // c2.o
    public boolean c() {
        return this.h && this.g == o.a;
    }

    @Override // c2.o
    public final void d(m mVar) {
        this.g = o.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // c2.o
    public final l e(l lVar) {
        this.d = lVar;
        this.e = h(lVar);
        return isActive() ? this.e : l.e;
    }

    @Override // c2.o
    public final void f() {
        this.h = true;
        j();
    }

    public abstract l h(l lVar);

    @Override // c2.o
    public boolean isActive() {
        return this.e != l.e;
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

    @Override // c2.o
    public final void reset() {
        ByteBuffer byteBuffer = o.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.b = lVar;
        this.c = lVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // c2.o
    public long g(long j10) {
        return j10;
    }
}
