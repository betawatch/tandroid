package c2;

import e2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.u6;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class t implements n {
    public int b;
    public float c;
    public float d;
    public k e;
    public k f;
    public k g;
    public k h;
    public boolean i;
    public s j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // c2.n
    public final ByteBuffer a() {
        s sVar = this.j;
        if (sVar != null) {
            q qVar = sVar.i;
            int i10 = sVar.b;
            u6.p(sVar.k >= 0);
            int o10 = qVar.o() * sVar.k * i10;
            if (o10 > 0) {
                if (this.k.capacity() < o10) {
                    this.k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                u6.p(sVar.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i10), sVar.k);
                qVar.b(min, byteBuffer);
                sVar.k -= min;
                System.arraycopy(qVar.i(), min * i10, qVar.i(), 0, sVar.k * i10);
                this.k.flip();
                this.n += o10;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = n.a;
        return byteBuffer2;
    }

    @Override // c2.n
    public final boolean b() {
        if (this.o) {
            s sVar = this.j;
            if (sVar != null) {
                u6.p(sVar.k >= 0);
                if (sVar.i.o() * sVar.k * sVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // c2.n
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            s sVar = this.j;
            sVar.getClass();
            this.m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i10 = sVar.b;
            q qVar = sVar.i;
            int o10 = remaining / (qVar.o() * i10);
            qVar.p(o10);
            qVar.a(remaining, byteBuffer);
            sVar.j += o10;
            sVar.b();
        }
    }

    @Override // c2.n
    public final void d(l lVar) {
        if (isActive()) {
            k kVar = this.e;
            this.g = kVar;
            k kVar2 = this.f;
            this.h = kVar2;
            if (this.i) {
                this.j = new s(kVar.a, kVar.b, this.c, this.d, kVar2.a, kVar.c == 4);
            } else {
                s sVar = this.j;
                if (sVar != null) {
                    sVar.j = 0;
                    sVar.k = 0;
                    sVar.l = 0;
                    sVar.m = 0;
                    sVar.n = 0;
                    sVar.o = 0;
                    sVar.p = 0;
                    sVar.q = 0.0d;
                    sVar.i.flush();
                }
            }
        }
        this.l = n.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // c2.n
    public final k e(k kVar) {
        int i10 = kVar.c;
        if (i10 != 2 && i10 != 4) {
            throw new m(kVar);
        }
        int i11 = this.b;
        if (i11 == -1) {
            i11 = kVar.a;
        }
        this.e = kVar;
        k kVar2 = new k(i11, kVar.b, i10);
        this.f = kVar2;
        this.i = true;
        return kVar2;
    }

    @Override // c2.n
    public final void f() {
        s sVar = this.j;
        if (sVar != null) {
            int i10 = sVar.j;
            float f7 = sVar.c;
            float f10 = sVar.d;
            double d = f7 / f10;
            int i11 = sVar.k + ((int) (((((((i10 - r6) / d) + sVar.o) + sVar.q) + sVar.l) / (sVar.e * f10)) + 0.5d));
            sVar.q = 0.0d;
            q qVar = sVar.i;
            int i12 = sVar.h * 2;
            qVar.p(i12 + i10);
            qVar.d(i10 * sVar.b, i12);
            sVar.j = i12 + sVar.j;
            sVar.b();
            if (sVar.k > i11) {
                sVar.k = Math.max(i11, 0);
            }
            sVar.j = 0;
            sVar.o = 0;
            sVar.l = 0;
        }
        this.o = true;
    }

    @Override // c2.n
    public final long g(long j10) {
        if (this.n < 1024) {
            return (long) (j10 / this.c);
        }
        long j11 = this.m;
        this.j.getClass();
        long o10 = j11 - (r2.i.o() * (r2.j * r2.b));
        int i10 = this.h.a;
        int i11 = this.g.a;
        return i10 == i11 ? m0.a0(j10, this.n, o10, RoundingMode.DOWN) : m0.a0(j10, this.n * i11, o10 * i10, RoundingMode.DOWN);
    }

    @Override // c2.n
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // c2.n
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
