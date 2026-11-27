// default package

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class goa implements q20 {
    public float b;
    public float c;
    public m20 d;
    public m20 e;
    public m20 f;
    public m20 g;
    public boolean h;
    public foa i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override // q20
    public final boolean a() {
        if (this.n) {
            foa foaVar = this.i;
            if (foaVar != null) {
                yve.p(foaVar.k >= 0);
                if (foaVar.i.o() * foaVar.k * foaVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // q20
    public final ByteBuffer b() {
        foa foaVar = this.i;
        if (foaVar != null) {
            doa doaVar = foaVar.i;
            int i = foaVar.b;
            yve.p(foaVar.k >= 0);
            int o = doaVar.o() * foaVar.k * i;
            if (o > 0) {
                if (this.j.capacity() < o) {
                    this.j = ByteBuffer.allocateDirect(o).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                yve.p(foaVar.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (doaVar.o() * i), foaVar.k);
                doaVar.b(min, byteBuffer);
                foaVar.k -= min;
                System.arraycopy(doaVar.h(), min * i, doaVar.h(), 0, foaVar.k * i);
                this.j.flip();
                this.m += o;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = q20.a;
        return byteBuffer2;
    }

    @Override // q20
    public final void c(o20 o20Var) {
        if (isActive()) {
            m20 m20Var = this.d;
            this.f = m20Var;
            m20 m20Var2 = this.e;
            this.g = m20Var2;
            if (this.h) {
                this.i = new foa(m20Var.a, m20Var.b, this.b, this.c, m20Var2.a, m20Var.c == 4);
            } else {
                foa foaVar = this.i;
                if (foaVar != null) {
                    foaVar.j = 0;
                    foaVar.k = 0;
                    foaVar.l = 0;
                    foaVar.m = 0;
                    foaVar.n = 0;
                    foaVar.o = 0;
                    foaVar.p = 0;
                    foaVar.q = 0.0d;
                    foaVar.i.flush();
                }
            }
        }
        this.k = q20.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // q20
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            foa foaVar = this.i;
            foaVar.getClass();
            this.l += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i = foaVar.b;
            doa doaVar = foaVar.i;
            int o = remaining / (doaVar.o() * i);
            doaVar.p(o);
            doaVar.a(remaining, byteBuffer);
            foaVar.j += o;
            foaVar.b();
        }
    }

    @Override // q20
    public final m20 e(m20 m20Var) {
        int i = m20Var.c;
        if (i != 2 && i != 4) {
            throw new p20(m20Var);
        }
        int i2 = m20Var.a;
        this.d = m20Var;
        m20 m20Var2 = new m20(i2, m20Var.b, i);
        this.e = m20Var2;
        this.h = true;
        return m20Var2;
    }

    @Override // q20
    public final void f() {
        foa foaVar = this.i;
        if (foaVar != null) {
            int i = foaVar.j;
            float f = foaVar.c;
            float f2 = foaVar.d;
            double d = f / f2;
            int i2 = foaVar.k + ((int) (((((((i - r7) / d) + foaVar.o) + foaVar.q) + foaVar.l) / (foaVar.e * f2)) + 0.5d));
            foaVar.q = 0.0d;
            doa doaVar = foaVar.i;
            int i3 = foaVar.h << 1;
            doaVar.p(i + i3);
            doaVar.c(i * foaVar.b, i3);
            foaVar.j += i3;
            foaVar.b();
            if (foaVar.k > i2) {
                foaVar.k = Math.max(i2, 0);
            }
            foaVar.j = 0;
            foaVar.o = 0;
            foaVar.l = 0;
        }
        this.n = true;
    }

    @Override // q20
    public final long g(long j) {
        if (this.m < 1024) {
            return (long) (j / this.b);
        }
        long j2 = this.l;
        this.i.getClass();
        long o = j2 - (r2.i.o() * (r2.j * r2.b));
        int i = this.g.a;
        int i2 = this.f.a;
        long j3 = this.m;
        return i == i2 ? gcc.b0(j, j3, o, RoundingMode.DOWN) : gcc.b0(j, j3 * i2, o * i, RoundingMode.DOWN);
    }

    @Override // q20
    public final boolean isActive() {
        if (this.e.a != -1) {
            return Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.a != this.d.a;
        }
        return false;
    }

    @Override // q20
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        m20 m20Var = m20.e;
        this.d = m20Var;
        this.e = m20Var;
        this.f = m20Var;
        this.g = m20Var;
        ByteBuffer byteBuffer = q20.a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
