// default package

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public abstract class ef0 implements q20 {
    public m20 b;
    public m20 c;
    public m20 d;
    public m20 e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public ef0() {
        ByteBuffer byteBuffer = q20.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        m20 m20Var = m20.e;
        this.d = m20Var;
        this.e = m20Var;
        this.b = m20Var;
        this.c = m20Var;
    }

    @Override // q20
    public boolean a() {
        return this.h && this.g == q20.a;
    }

    @Override // q20
    public ByteBuffer b() {
        ByteBuffer byteBuffer = this.g;
        this.g = q20.a;
        return byteBuffer;
    }

    @Override // q20
    public final void c(o20 o20Var) {
        this.g = q20.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // q20
    public final m20 e(m20 m20Var) {
        this.d = m20Var;
        this.e = h(m20Var);
        return isActive() ? this.e : m20.e;
    }

    @Override // q20
    public final void f() {
        this.h = true;
        j();
    }

    public m20 h(m20 m20Var) {
        if (m20Var.c == 2) {
            return m20Var.a == -1 ? m20.e : m20Var;
        }
        throw new p20(m20Var);
    }

    @Override // q20
    public boolean isActive() {
        return this.e != m20.e;
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

    @Override // q20
    public final void reset() {
        ByteBuffer byteBuffer = q20.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        m20 m20Var = m20.e;
        this.d = m20Var;
        this.e = m20Var;
        this.b = m20Var;
        this.c = m20Var;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }

    @Override // q20
    public long g(long j) {
        return j;
    }
}
