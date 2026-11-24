// default package

import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class nma implements p30 {
    public float b;
    public float c;
    public l30 d;
    public l30 e;
    public l30 f;
    public l30 g;
    public boolean h;
    public mma i;
    public ByteBuffer j;
    public ByteBuffer k;
    public long l;
    public long m;
    public boolean n;

    @Override // p30
    public final boolean a() {
        if (this.n) {
            mma mmaVar = this.i;
            if (mmaVar != null) {
                jte.p(mmaVar.k >= 0);
                if (mmaVar.i.o() * mmaVar.k * mmaVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // p30
    public final ByteBuffer b() {
        mma mmaVar = this.i;
        if (mmaVar != null) {
            kma kmaVar = mmaVar.i;
            int i = mmaVar.b;
            jte.p(mmaVar.k >= 0);
            int o = kmaVar.o() * mmaVar.k * i;
            if (o > 0) {
                if (this.j.capacity() < o) {
                    this.j = ByteBuffer.allocateDirect(o).order(ByteOrder.nativeOrder());
                } else {
                    this.j.clear();
                }
                ByteBuffer byteBuffer = this.j;
                jte.p(mmaVar.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (kmaVar.o() * i), mmaVar.k);
                kmaVar.b(min, byteBuffer);
                mmaVar.k -= min;
                System.arraycopy(kmaVar.h(), min * i, kmaVar.h(), 0, mmaVar.k * i);
                this.j.flip();
                this.m += o;
                this.k = this.j;
            }
        }
        ByteBuffer byteBuffer2 = this.k;
        this.k = p30.a;
        return byteBuffer2;
    }

    @Override // p30
    public final void c(n30 n30Var) {
        if (isActive()) {
            l30 l30Var = this.d;
            this.f = l30Var;
            l30 l30Var2 = this.e;
            this.g = l30Var2;
            if (this.h) {
                this.i = new mma(l30Var.a, l30Var.b, this.b, this.c, l30Var2.a, l30Var.c == 4);
            } else {
                mma mmaVar = this.i;
                if (mmaVar != null) {
                    mmaVar.j = 0;
                    mmaVar.k = 0;
                    mmaVar.l = 0;
                    mmaVar.m = 0;
                    mmaVar.n = 0;
                    mmaVar.o = 0;
                    mmaVar.p = 0;
                    mmaVar.q = 0.0d;
                    mmaVar.i.flush();
                }
            }
        }
        this.k = p30.a;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }

    @Override // p30
    public final void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            mma mmaVar = this.i;
            mmaVar.getClass();
            this.l += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i = mmaVar.b;
            kma kmaVar = mmaVar.i;
            int o = remaining / (kmaVar.o() * i);
            kmaVar.p(o);
            kmaVar.a(remaining, byteBuffer);
            mmaVar.j += o;
            mmaVar.b();
        }
    }

    @Override // p30
    public final l30 e(l30 l30Var) {
        int i = l30Var.c;
        if (i != 2 && i != 4) {
            throw new o30(l30Var);
        }
        int i2 = l30Var.a;
        this.d = l30Var;
        l30 l30Var2 = new l30(i2, l30Var.b, i);
        this.e = l30Var2;
        this.h = true;
        return l30Var2;
    }

    @Override // p30
    public final void f() {
        mma mmaVar = this.i;
        if (mmaVar != null) {
            int i = mmaVar.j;
            float f = mmaVar.c;
            float f2 = mmaVar.d;
            double d = f / f2;
            int i2 = mmaVar.k + ((int) (((((((i - r7) / d) + mmaVar.o) + mmaVar.q) + mmaVar.l) / (mmaVar.e * f2)) + 0.5d));
            mmaVar.q = 0.0d;
            kma kmaVar = mmaVar.i;
            int i3 = mmaVar.h << 1;
            kmaVar.p(i + i3);
            kmaVar.c(i * mmaVar.b, i3);
            mmaVar.j += i3;
            mmaVar.b();
            if (mmaVar.k > i2) {
                mmaVar.k = Math.max(i2, 0);
            }
            mmaVar.j = 0;
            mmaVar.o = 0;
            mmaVar.l = 0;
        }
        this.n = true;
    }

    @Override // p30
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
        return i == i2 ? hac.b0(j, j3, o, RoundingMode.DOWN) : hac.b0(j, j3 * i2, o * i, RoundingMode.DOWN);
    }

    @Override // p30
    public final boolean isActive() {
        if (this.e.a != -1) {
            return Math.abs(this.b - 1.0f) >= 1.0E-4f || Math.abs(this.c - 1.0f) >= 1.0E-4f || this.e.a != this.d.a;
        }
        return false;
    }

    @Override // p30
    public final void reset() {
        this.b = 1.0f;
        this.c = 1.0f;
        l30 l30Var = l30.e;
        this.d = l30Var;
        this.e = l30Var;
        this.f = l30Var;
        this.g = l30Var;
        ByteBuffer byteBuffer = p30.a;
        this.j = byteBuffer;
        this.k = byteBuffer;
        this.h = false;
        this.i = null;
        this.l = 0L;
        this.m = 0L;
        this.n = false;
    }
}
