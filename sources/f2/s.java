package f2;

import a8.ia;
import h2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class s implements n {
    public int b;
    public float c;
    public float d;
    public k e;
    public k f;
    public k g;
    public k h;
    public boolean i;
    public r j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // f2.n
    public final boolean a() {
        if (this.o) {
            r rVar = this.j;
            if (rVar != null) {
                ia.p(rVar.k >= 0);
                if (rVar.i.o() * rVar.k * rVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // f2.n
    public final ByteBuffer b() {
        r rVar = this.j;
        if (rVar != null) {
            q qVar = rVar.i;
            int i7 = rVar.b;
            ia.p(rVar.k >= 0);
            int o4 = qVar.o() * rVar.k * i7;
            if (o4 > 0) {
                if (this.k.capacity() < o4) {
                    this.k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                ia.p(rVar.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i7), rVar.k);
                qVar.b(min, byteBuffer);
                rVar.k -= min;
                System.arraycopy(qVar.h(), min * i7, qVar.h(), 0, rVar.k * i7);
                this.k.flip();
                this.n += o4;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = n.a;
        return byteBuffer2;
    }

    @Override // f2.n
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r rVar = this.j;
            rVar.getClass();
            this.m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i7 = rVar.b;
            q qVar = rVar.i;
            int o4 = remaining / (qVar.o() * i7);
            qVar.p(o4);
            qVar.a(remaining, byteBuffer);
            rVar.j += o4;
            rVar.b();
        }
    }

    @Override // f2.n
    public final void d(l lVar) {
        if (isActive()) {
            k kVar = this.e;
            this.g = kVar;
            k kVar2 = this.f;
            this.h = kVar2;
            if (this.i) {
                this.j = new r(kVar.a, kVar.b, this.c, this.d, kVar2.a, kVar.c == 4);
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
        this.l = n.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // f2.n
    public final k e(k kVar) {
        int i7 = kVar.c;
        if (i7 != 2 && i7 != 4) {
            throw new m(kVar);
        }
        int i10 = this.b;
        if (i10 == -1) {
            i10 = kVar.a;
        }
        this.e = kVar;
        k kVar2 = new k(i10, kVar.b, i7);
        this.f = kVar2;
        this.i = true;
        return kVar2;
    }

    @Override // f2.n
    public final void f() {
        r rVar = this.j;
        if (rVar != null) {
            int i7 = rVar.j;
            float f10 = rVar.c;
            float f11 = rVar.d;
            double d = f10 / f11;
            int i10 = rVar.k + ((int) (((((((i7 - r6) / d) + rVar.o) + rVar.q) + rVar.l) / (rVar.e * f11)) + 0.5d));
            rVar.q = 0.0d;
            q qVar = rVar.i;
            int i11 = rVar.h * 2;
            qVar.p(i11 + i7);
            qVar.c(i7 * rVar.b, i11);
            rVar.j = i11 + rVar.j;
            rVar.b();
            if (rVar.k > i10) {
                rVar.k = Math.max(i10, 0);
            }
            rVar.j = 0;
            rVar.o = 0;
            rVar.l = 0;
        }
        this.o = true;
    }

    @Override // f2.n
    public final long g(long j3) {
        if (this.n < 1024) {
            return (long) (j3 / this.c);
        }
        long j10 = this.m;
        this.j.getClass();
        long o4 = j10 - (r2.i.o() * (r2.j * r2.b));
        int i7 = this.h.a;
        int i10 = this.g.a;
        return i7 == i10 ? m0.a0(j3, this.n, o4, RoundingMode.DOWN) : m0.a0(j3, this.n * i10, o4 * i7, RoundingMode.DOWN);
    }

    @Override // f2.n
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // f2.n
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        k kVar = k.e;
        this.e = kVar;
        this.f = kVar;
        this.g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.a;
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
