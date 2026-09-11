package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public abstract class i implements h {
    public f b;
    public f c;
    public f d;
    public f e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public i() {
        ByteBuffer byteBuffer = h.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.b = fVar;
        this.c = fVar;
    }

    @Override // c2.h
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = h.a;
        return byteBuffer;
    }

    @Override // c2.h
    public boolean b() {
        return this.h && this.g == h.a;
    }

    @Override // c2.h
    public final f d(f fVar) {
        this.d = fVar;
        this.e = f(fVar);
        return isActive() ? this.e : f.e;
    }

    @Override // c2.h
    public final void e() {
        this.h = true;
        h();
    }

    public abstract f f(f fVar);

    @Override // c2.h
    public final void flush() {
        this.g = h.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // c2.h
    public boolean isActive() {
        return this.e != f.e;
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

    @Override // c2.h
    public final void reset() {
        ByteBuffer byteBuffer = h.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        f fVar = f.e;
        this.d = fVar;
        this.e = fVar;
        this.b = fVar;
        this.c = fVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
