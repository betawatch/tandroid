package f2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    @Override // f2.n
    public boolean a() {
        return this.h && this.g == n.a;
    }

    @Override // f2.n
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = n.a;
        return byteBuffer;
    }

    @Override // f2.n
    public final void d(l lVar) {
        this.g = n.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // f2.n
    public final k e(k kVar) {
        this.d = kVar;
        this.e = h(kVar);
        return isActive() ? this.e : k.e;
    }

    @Override // f2.n
    public final void f() {
        this.h = true;
        j();
    }

    public abstract k h(k kVar);

    @Override // f2.n
    public boolean isActive() {
        return this.e != k.e;
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

    @Override // f2.n
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

    @Override // f2.n
    public long g(long j3) {
        return j3;
    }
}
