// default package

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class cf0 implements p20 {
    public l20 b;
    public l20 c;
    public l20 d;
    public l20 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public cf0() {
        ByteBuffer byteBuffer = p20.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        l20 l20Var = l20.e;
        this.d = l20Var;
        this.e = l20Var;
        this.b = l20Var;
        this.c = l20Var;
    }

    @Override // p20
    public boolean a() {
        return this.h && this.g == p20.a;
    }

    @Override // p20
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = p20.a;
        return byteBuffer;
    }

    @Override // p20
    public final void c(n20 n20Var) {
        this.g = p20.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // p20
    public final l20 e(l20 l20Var) {
        this.d = l20Var;
        this.e = h(l20Var);
        return isActive() ? this.e : l20.e;
    }

    @Override // p20
    public final void f() {
        this.h = true;
        j();
    }

    public l20 h(l20 l20Var) {
        if (l20Var.c == 2) {
            return l20Var.a == -1 ? l20.e : l20Var;
        }
        throw new o20(l20Var);
    }

    @Override // p20
    public boolean isActive() {
        return this.e != l20.e;
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // p20
    public final void reset() {
        ByteBuffer byteBuffer = p20.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        l20 l20Var = l20.e;
        this.d = l20Var;
        this.e = l20Var;
        this.b = l20Var;
        this.c = l20Var;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // p20
    public long g(long j) {
        return j;
    }
}
