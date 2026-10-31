package c2;

import e2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class s implements m {
    public int b;
    public float c;
    public float d;
    public j e;
    public j f;
    public j g;
    public j h;
    public boolean i;
    public r j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // c2.m
    public final ByteBuffer a() {
        r rVar = this.j;
        if (rVar != null) {
            p pVar = rVar.i;
            int i10 = rVar.b;
            t6.p(rVar.k >= 0);
            int o10 = pVar.o() * rVar.k * i10;
            if (o10 > 0) {
                if (this.k.capacity() < o10) {
                    this.k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                t6.p(rVar.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (pVar.o() * i10), rVar.k);
                pVar.b(min, byteBuffer);
                rVar.k -= min;
                System.arraycopy(pVar.h(), min * i10, pVar.h(), 0, rVar.k * i10);
                this.k.flip();
                this.n += o10;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = m.a;
        return byteBuffer2;
    }

    @Override // c2.m
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r rVar = this.j;
            rVar.getClass();
            this.m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i10 = rVar.b;
            p pVar = rVar.i;
            int o10 = remaining / (pVar.o() * i10);
            pVar.p(o10);
            pVar.a(remaining, byteBuffer);
            rVar.j += o10;
            rVar.b();
        }
    }

    @Override // c2.m
    public final boolean c() {
        if (this.o) {
            r rVar = this.j;
            if (rVar != null) {
                t6.p(rVar.k >= 0);
                if (rVar.i.o() * rVar.k * rVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // c2.m
    public final void d(k kVar) {
        if (isActive()) {
            j jVar = this.e;
            this.g = jVar;
            j jVar2 = this.f;
            this.h = jVar2;
            if (this.i) {
                this.j = new r(jVar.a, jVar.b, this.c, this.d, jVar2.a, jVar.c == 4);
            } else {
                r rVar = this.j;
                if (rVar != null) {
                    rVar.j = 0;
                    rVar.k = 0;
                    rVar.l = 0;
                    rVar.m = 0;
                    rVar.n = 0;
                    rVar.o = 0;
                    rVar.p = 0;
                    rVar.q = 0.0d;
                    rVar.i.flush();
                }
            }
        }
        this.l = m.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // c2.m
    public final j e(j jVar) {
        int i10 = jVar.c;
        if (i10 != 2 && i10 != 4) {
            throw new l(jVar);
        }
        int i11 = this.b;
        if (i11 == -1) {
            i11 = jVar.a;
        }
        this.e = jVar;
        j jVar2 = new j(i11, jVar.b, i10);
        this.f = jVar2;
        this.i = true;
        return jVar2;
    }

    @Override // c2.m
    public final void f() {
        r rVar = this.j;
        if (rVar != null) {
            int i10 = rVar.j;
            float f7 = rVar.c;
            float f10 = rVar.d;
            double d = f7 / f10;
            int i11 = rVar.k + ((int) (((((((i10 - r6) / d) + rVar.o) + rVar.q) + rVar.l) / (rVar.e * f10)) + 0.5d));
            rVar.q = 0.0d;
            p pVar = rVar.i;
            int i12 = rVar.h * 2;
            pVar.p(i12 + i10);
            pVar.c(i10 * rVar.b, i12);
            rVar.j = i12 + rVar.j;
            rVar.b();
            if (rVar.k > i11) {
                rVar.k = Math.max(i11, 0);
            }
            rVar.j = 0;
            rVar.o = 0;
            rVar.l = 0;
        }
        this.o = true;
    }

    @Override // c2.m
    public final long g(long j10) {
        if (this.n < 1024) {
            return (long) (j10 / this.c);
        }
        long j11 = this.m;
        this.j.getClass();
        long o10 = j11 - (r2.i.o() * (r2.j * r2.b));
        int i10 = this.h.a;
        int i11 = this.g.a;
        return i10 == i11 ? l0.a0(j10, this.n, o10, RoundingMode.DOWN) : l0.a0(j10, this.n * i11, o10 * i10, RoundingMode.DOWN);
    }

    @Override // c2.m
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // c2.m
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        j jVar = j.e;
        this.e = jVar;
        this.f = jVar;
        this.g = jVar;
        this.h = jVar;
        ByteBuffer byteBuffer = m.a;
        this.k = byteBuffer;
        this.l = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }
}
