package f2;

import a8.ja;
import h2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class r implements m {
    public int b;
    public float c;
    public float d;
    public j e;
    public j f;
    public j g;
    public j h;
    public boolean i;
    public q j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // f2.m
    public final boolean a() {
        if (this.o) {
            q qVar = this.j;
            if (qVar != null) {
                ja.p(qVar.k >= 0);
                if (qVar.i.o() * qVar.k * qVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // f2.m
    public final ByteBuffer b() {
        q qVar = this.j;
        if (qVar != null) {
            p pVar = qVar.i;
            int i7 = qVar.b;
            ja.p(qVar.k >= 0);
            int o4 = pVar.o() * qVar.k * i7;
            if (o4 > 0) {
                if (this.k.capacity() < o4) {
                    this.k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                ja.p(qVar.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (pVar.o() * i7), qVar.k);
                pVar.b(min, byteBuffer);
                qVar.k -= min;
                System.arraycopy(pVar.h(), min * i7, pVar.h(), 0, qVar.k * i7);
                this.k.flip();
                this.n += o4;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = m.a;
        return byteBuffer2;
    }

    @Override // f2.m
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            q qVar = this.j;
            qVar.getClass();
            this.m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i7 = qVar.b;
            p pVar = qVar.i;
            int o4 = remaining / (pVar.o() * i7);
            pVar.p(o4);
            pVar.a(remaining, byteBuffer);
            qVar.j += o4;
            qVar.b();
        }
    }

    @Override // f2.m
    public final void d(k kVar) {
        if (isActive()) {
            j jVar = this.e;
            this.g = jVar;
            j jVar2 = this.f;
            this.h = jVar2;
            if (this.i) {
                this.j = new q(jVar.a, jVar.b, this.c, this.d, jVar2.a, jVar.c == 4);
            } else {
                q qVar = this.j;
                if (qVar != null) {
                    qVar.j = 0;
                    qVar.k = 0;
                    qVar.l = 0;
                    qVar.m = 0;
                    qVar.n = 0;
                    qVar.o = 0;
                    qVar.p = 0;
                    qVar.q = 0.0d;
                    qVar.i.flush();
                }
            }
        }
        this.l = m.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // f2.m
    public final j e(j jVar) {
        int i7 = jVar.c;
        if (i7 != 2 && i7 != 4) {
            throw new l(jVar);
        }
        int i10 = this.b;
        if (i10 == -1) {
            i10 = jVar.a;
        }
        this.e = jVar;
        j jVar2 = new j(i10, jVar.b, i7);
        this.f = jVar2;
        this.i = true;
        return jVar2;
    }

    @Override // f2.m
    public final void f() {
        q qVar = this.j;
        if (qVar != null) {
            int i7 = qVar.j;
            float f10 = qVar.c;
            float f11 = qVar.d;
            double d = f10 / f11;
            int i10 = qVar.k + ((int) (((((((i7 - r6) / d) + qVar.o) + qVar.q) + qVar.l) / (qVar.e * f11)) + 0.5d));
            qVar.q = 0.0d;
            p pVar = qVar.i;
            int i11 = qVar.h * 2;
            pVar.p(i11 + i7);
            pVar.c(i7 * qVar.b, i11);
            qVar.j = i11 + qVar.j;
            qVar.b();
            if (qVar.k > i10) {
                qVar.k = Math.max(i10, 0);
            }
            qVar.j = 0;
            qVar.o = 0;
            qVar.l = 0;
        }
        this.o = true;
    }

    @Override // f2.m
    public final long g(long j3) {
        if (this.n < 1024) {
            return (long) (j3 / this.c);
        }
        long j10 = this.m;
        this.j.getClass();
        long o4 = j10 - (r2.i.o() * (r2.j * r2.b));
        int i7 = this.h.a;
        int i10 = this.g.a;
        return i7 == i10 ? l0.a0(j3, this.n, o4, RoundingMode.DOWN) : l0.a0(j3, this.n * i10, o4 * i7, RoundingMode.DOWN);
    }

    @Override // f2.m
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // f2.m
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
