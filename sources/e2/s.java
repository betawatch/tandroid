package e2;

import b8.zb;
import g2.n0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    @Override // e2.m
    public final boolean a() {
        if (this.o) {
            r rVar = this.j;
            if (rVar != null) {
                zb.p(rVar.k >= 0);
                if (rVar.i.o() * rVar.k * rVar.b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // e2.m
    public final ByteBuffer b() {
        r rVar = this.j;
        if (rVar != null) {
            p pVar = rVar.i;
            int i3 = rVar.b;
            zb.p(rVar.k >= 0);
            int o10 = pVar.o() * rVar.k * i3;
            if (o10 > 0) {
                if (this.k.capacity() < o10) {
                    this.k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.k.clear();
                }
                ByteBuffer byteBuffer = this.k;
                zb.p(rVar.k >= 0);
                int min = Math.min(byteBuffer.remaining() / (pVar.o() * i3), rVar.k);
                pVar.b(min, byteBuffer);
                rVar.k -= min;
                System.arraycopy(pVar.h(), min * i3, pVar.h(), 0, rVar.k * i3);
                this.k.flip();
                this.n += o10;
                this.l = this.k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = m.a;
        return byteBuffer2;
    }

    @Override // e2.m
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r rVar = this.j;
            rVar.getClass();
            this.m += byteBuffer.remaining();
            int remaining = byteBuffer.remaining();
            int i3 = rVar.b;
            p pVar = rVar.i;
            int o10 = remaining / (pVar.o() * i3);
            pVar.p(o10);
            pVar.a(remaining, byteBuffer);
            rVar.j += o10;
            rVar.b();
        }
    }

    @Override // e2.m
    public final j d(j jVar) {
        int i3 = jVar.c;
        if (i3 != 2 && i3 != 4) {
            throw new l(jVar);
        }
        int i10 = this.b;
        if (i10 == -1) {
            i10 = jVar.a;
        }
        this.e = jVar;
        j jVar2 = new j(i10, jVar.b, i3);
        this.f = jVar2;
        this.i = true;
        return jVar2;
    }

    @Override // e2.m
    public final void e(k kVar) {
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

    @Override // e2.m
    public final void f() {
        r rVar = this.j;
        if (rVar != null) {
            int i3 = rVar.j;
            float f10 = rVar.c;
            float f11 = rVar.d;
            double d = f10 / f11;
            int i10 = rVar.k + ((int) (((((((i3 - r6) / d) + rVar.o) + rVar.q) + rVar.l) / (rVar.e * f11)) + 0.5d));
            rVar.q = 0.0d;
            p pVar = rVar.i;
            int i11 = rVar.h * 2;
            pVar.p(i11 + i3);
            pVar.c(i3 * rVar.b, i11);
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

    @Override // e2.m
    public final long g(long j10) {
        if (this.n < 1024) {
            return (long) (j10 / this.c);
        }
        long j11 = this.m;
        this.j.getClass();
        long o10 = j11 - (r2.i.o() * (r2.j * r2.b));
        int i3 = this.h.a;
        int i10 = this.g.a;
        return i3 == i10 ? n0.a0(j10, this.n, o10, RoundingMode.DOWN) : n0.a0(j10, this.n * i10, o10 * i3, RoundingMode.DOWN);
    }

    @Override // e2.m
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // e2.m
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
