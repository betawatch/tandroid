// default package

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class mka implements p20 {
    public float b;
    public float c;
    public l20 d;
    public l20 e;
    public l20 f;
    public l20 g;
    public boolean h;
    public lka i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override // p20
    public final boolean a() {
        if (this.n) {
            lka lkaVar = this.i;
            if (lkaVar != null) {
                gre.p(lkaVar.k >= 0);
                if (lkaVar.i.o() * lkaVar.k * lkaVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p20
    public final ByteBuffer b() {
        lka lkaVar = this.i;
        if (lkaVar != null) {
            jka jkaVar = lkaVar.i;
            int i = lkaVar.b;
            gre.p(lkaVar.k >= 0);
            int o = jkaVar.o() * lkaVar.k * i;
            if (o > 0) {
                if (this.j.capacity() < o) {
                    this.j = ByteBuffer.allocateDirect(o).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                gre.p(lkaVar.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (jkaVar.o() * i), lkaVar.k);
                jkaVar.b(min, byteBuffer);
                lkaVar.k -= min;
                System.arraycopy(jkaVar.h(), min * i, jkaVar.h(), 0, lkaVar.k * i);
                this.j.flip();
                this.m += o;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = p20.a;
        return byteBuffer2;
    }

    @Override // p20
    public final void c(n20 n20Var) {
        if (isActive()) {
            l20 l20Var = this.d;
            this.f = l20Var;
            l20 l20Var2 = this.e;
            this.g = l20Var2;
            if (this.h) {
                this.i = new lka(l20Var.a, l20Var.b, this.b, this.c, l20Var2.a, l20Var.c == 4);
            } else {
                lka lkaVar = this.i;
                if (lkaVar != null) {
                    lkaVar.j = 0;
                    lkaVar.k = 0;
                    lkaVar.l = 0;
                    lkaVar.m = 0;
                    lkaVar.n = 0;
                    lkaVar.o = 0;
                    lkaVar.p = 0;
                    lkaVar.q = 0.0d;
                    lkaVar.i.flush();
                }
            }
        }
        this.k = p20.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // p20
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            lka lkaVar = this.i;
            lkaVar.getClass();
            this.l += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i = lkaVar.b;
            jka jkaVar = lkaVar.i;
            int o = remaining / (jkaVar.o() * i);
            jkaVar.p(o);
            jkaVar.a(remaining, byteBuffer);
            lkaVar.j += o;
            lkaVar.b();
        }
    }

    @Override // p20
    public final l20 e(l20 l20Var) {
        int i = l20Var.c;
        if (i != 2 && i != 4) {
            throw new o20(l20Var);
        }
        int i2 = l20Var.a;
        this.d = l20Var;
        l20 l20Var2 = new l20(i2, l20Var.b, i);
        this.e = l20Var2;
        this.h = true;
        return l20Var2;
    }

    @Override // p20
    public final void f() {
        lka lkaVar = this.i;
        if (lkaVar != null) {
            int i = lkaVar.j;
            float f = lkaVar.c;
            float f2 = lkaVar.d;
            double d = f / f2;
            int i2 = lkaVar.k + ((int) (((((((i - r7) / d) + lkaVar.o) + lkaVar.q) + lkaVar.l) / (lkaVar.e * f2)) + 0.5d));
            lkaVar.q = 0.0d;
            jka jkaVar = lkaVar.i;
            int i3 = lkaVar.h << 1;
            jkaVar.p(i + i3);
            jkaVar.c(i * lkaVar.b, i3);
            lkaVar.j += i3;
            lkaVar.b();
            if (lkaVar.k > i2) {
                lkaVar.k = Math.max(i2, 0);
            }
            lkaVar.j = 0;
            lkaVar.o = 0;
            lkaVar.l = 0;
        }
        this.n = true;
    }

    @Override // p20
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
        return i == i2 ? g8c.b0(j, j3, o, RoundingMode.DOWN) : g8c.b0(j, j3 * i2, o * i, RoundingMode.DOWN);
    }

    @Override // p20
    public final boolean isActive() {
        if (this.e.a != -1) {
            return Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.a != this.d.a;
        }
        return false;
    }

    @Override // p20
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        l20 l20Var = l20.e;
        this.d = l20Var;
        this.e = l20Var;
        this.f = l20Var;
        this.g = l20Var;
        ByteBuffer byteBuffer = p20.a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
