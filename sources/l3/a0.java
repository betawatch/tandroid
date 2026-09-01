package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class a0 implements n {
    public l b;
    public l c;
    public l d;
    public l e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public a0() {
        ByteBuffer byteBuffer = n.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.b = lVar;
        this.c = lVar;
    }

    @Override // l3.n
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = n.a;
        return byteBuffer;
    }

    @Override // l3.n
    public final void c() {
        this.h = true;
        h();
    }

    @Override // l3.n
    public boolean d() {
        return this.h && this.g == n.a;
    }

    @Override // l3.n
    public final l e(l lVar) {
        this.d = lVar;
        this.e = f(lVar);
        return isActive() ? this.e : l.e;
    }

    public abstract l f(l lVar);

    @Override // l3.n
    public final void flush() {
        this.g = n.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // l3.n
    public boolean isActive() {
        return this.e != l.e;
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

    @Override // l3.n
    public final void reset() {
        flush();
        this.f = n.a;
        l lVar = l.e;
        this.d = lVar;
        this.e = lVar;
        this.b = lVar;
        this.c = lVar;
        i();
    }

    public void g() {
    }

    public void h() {
    }

    public void i() {
    }
}
