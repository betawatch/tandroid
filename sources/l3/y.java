package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
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

    @Override // l3.j
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.g;
        this.g = j.a;
        return byteBuffer;
    }

    @Override // l3.j
    public final void c() {
        this.h = true;
        h();
    }

    @Override // l3.j
    public boolean d() {
        return this.h && this.g == j.a;
    }

    @Override // l3.j
    public final h e(h hVar) {
        this.d = hVar;
        this.e = f(hVar);
        return isActive() ? this.e : h.e;
    }

    public abstract h f(h hVar);

    @Override // l3.j
    public final void flush() {
        this.g = j.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        g();
    }

    @Override // l3.j
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

    @Override // l3.j
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
