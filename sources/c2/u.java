package c2;

import a8.yb;
import e2.n0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class u implements o {
    public int b;
    public float c;
    public float d;
    public l e;
    public l f;
    public l g;
    public l h;
    public boolean i;
    public t j;
    public ByteBuffer k;
    public ByteBuffer l;
    public long m;
    public long n;
    public boolean o;

    @Override // c2.o
    public final ByteBuffer a() {
        t tVar = this.j;
        if (tVar != null) {
            r rVar = tVar.i;
            int i10 = tVar.b;
            yb.p(tVar.k >= 0);
            int o10 = rVar.o() * tVar.k * i10;
            if (o10 > 0) {
                if (this.k.capacity() < o10) {
                    this.k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                yb.p(tVar.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (rVar.o() * i10), tVar.k);
                rVar.b(min, byteBuffer);
                tVar.k -= min;
                System.arraycopy(rVar.i(), min * i10, rVar.i(), 0, tVar.k * i10);
                this.k.flip();
                this.n += o10;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = o.a;
        return byteBuffer2;
    }

    @Override // c2.o
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            t tVar = this.j;
            tVar.getClass();
            this.m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i10 = tVar.b;
            r rVar = tVar.i;
            int o10 = remaining / (rVar.o() * i10);
            rVar.p(o10);
            rVar.a(remaining, byteBuffer);
            tVar.j += o10;
            tVar.b();
        }
    }

    @Override // c2.o
    public final boolean c() {
        if (this.o) {
            t tVar = this.j;
            if (tVar != null) {
                yb.p(tVar.k >= 0);
                if (tVar.i.o() * tVar.k * tVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // c2.o
    public final void d(m mVar) {
        if (isActive()) {
            l lVar = this.e;
            this.g = lVar;
            l lVar2 = this.f;
            this.h = lVar2;
            if (this.i) {
                this.j = new t(lVar.a, lVar.b, this.c, this.d, lVar2.a, lVar.c == 4);
            } else {
                t tVar = this.j;
                if (tVar != null) {
                    tVar.j = 0;
                    tVar.k = 0;
                    tVar.l = 0;
                    tVar.m = 0;
                    tVar.n = 0;
                    tVar.o = 0;
                    tVar.p = 0;
                    tVar.q = 0.0d;
                    tVar.i.flush();
                }
            }
        }
        this.l = o.a;
        this.m = 0L;
        this.n = 0L;
        this.o = false;
    }

    @Override // c2.o
    public final l e(l lVar) {
        int i10 = lVar.c;
        if (i10 != 2 && i10 != 4) {
            throw new n(lVar);
        }
        int i11 = this.b;
        if (i11 == -1) {
            i11 = lVar.a;
        }
        this.e = lVar;
        l lVar2 = new l(i11, lVar.b, i10);
        this.f = lVar2;
        this.i = true;
        return lVar2;
    }

    @Override // c2.o
    public final void f() {
        t tVar = this.j;
        if (tVar != null) {
            int i10 = tVar.j;
            float f7 = tVar.c;
            float f10 = tVar.d;
            double d = f7 / f10;
            int i11 = tVar.k + ((int) (((((((i10 - r6) / d) + tVar.o) + tVar.q) + tVar.l) / (tVar.e * f10)) + 0.5d));
            tVar.q = 0.0d;
            r rVar = tVar.i;
            int i12 = tVar.h * 2;
            rVar.p(i12 + i10);
            rVar.d(i10 * tVar.b, i12);
            tVar.j = i12 + tVar.j;
            tVar.b();
            if (tVar.k > i11) {
                tVar.k = Math.max(i11, 0);
            }
            tVar.j = 0;
            tVar.o = 0;
            tVar.l = 0;
        }
        this.o = true;
    }

    @Override // c2.o
    public final long g(long j10) {
        if (this.n < 1024) {
            return (long) (j10 / this.c);
        }
        long j11 = this.m;
        this.j.getClass();
        long o10 = j11 - (r2.i.o() * (r2.j * r2.b));
        int i10 = this.h.a;
        int i11 = this.g.a;
        return i10 == i11 ? n0.a0(j10, this.n, o10, RoundingMode.DOWN) : n0.a0(j10, this.n * i11, o10 * i10, RoundingMode.DOWN);
    }

    @Override // c2.o
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // c2.o
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        l lVar = l.e;
        this.e = lVar;
        this.f = lVar;
        this.g = lVar;
        this.h = lVar;
        ByteBuffer byteBuffer = o.a;
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
