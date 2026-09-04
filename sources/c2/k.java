package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class k implements h {
    public int b;
    public float c;
    public float d;
    public f e;
    public f f;
    public f g;
    public f h;
    public boolean i;
    public j j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // c2.h
    public final ByteBuffer a() {
        j jVar = this.j;
        if (jVar != null) {
            int i10 = jVar.b;
            e2.d.g(jVar.m >= 0);
            int i11 = jVar.m * i10 * 2;
            if (i11 > 0) {
                if (this.k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                e2.d.g(jVar.m >= 0);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.m);
                int i12 = min * i10;
                shortBuffer.put(jVar.l, 0, i12);
                int i13 = jVar.m - min;
                jVar.m = i13;
                short[] sArr = jVar.l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.o += i11;
                this.k.limit(i11);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = h.a;
        return byteBuffer;
    }

    @Override // c2.h
    public final boolean b() {
        if (this.p) {
            j jVar = this.j;
            if (jVar != null) {
                e2.d.g(jVar.m >= 0);
                if (jVar.m * jVar.b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // c2.h
    public final void c(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            j jVar = this.j;
            jVar.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i10 = jVar.b;
            int i11 = remaining2 / i10;
            short[] c10 = jVar.c(jVar.j, jVar.k, i11);
            jVar.j = c10;
            asShortBuffer.get(c10, jVar.k * i10, ((i11 * i10) * 2) / 2);
            jVar.k += i11;
            jVar.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // c2.h
    public final f d(f fVar) {
        if (fVar.c != 2) {
            throw new g(fVar);
        }
        int i10 = this.b;
        if (i10 == -1) {
            i10 = fVar.a;
        }
        this.e = fVar;
        f fVar2 = new f(i10, fVar.b, 2);
        this.f = fVar2;
        this.i = true;
        return fVar2;
    }

    @Override // c2.h
    public final void e() {
        j jVar = this.j;
        if (jVar != null) {
            int i10 = jVar.k;
            float f7 = jVar.c;
            float f10 = jVar.d;
            double d = f7 / f10;
            int i11 = jVar.m + ((int) (((((((i10 - r6) / d) + jVar.r) + jVar.w) + jVar.o) / (jVar.e * f10)) + 0.5d));
            jVar.w = 0.0d;
            short[] sArr = jVar.j;
            int i12 = jVar.h * 2;
            jVar.j = jVar.c(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = jVar.b;
                if (i13 >= i12 * i14) {
                    break;
                }
                jVar.j[(i14 * i10) + i13] = 0;
                i13++;
            }
            jVar.k = i12 + jVar.k;
            jVar.f();
            if (jVar.m > i11) {
                jVar.m = Math.max(i11, 0);
            }
            jVar.k = 0;
            jVar.r = 0;
            jVar.o = 0;
        }
        this.p = true;
    }

    @Override // c2.h
    public final void flush() {
        if (isActive()) {
            f fVar = this.e;
            this.g = fVar;
            f fVar2 = this.f;
            this.h = fVar2;
            if (this.i) {
                this.j = new j(fVar.a, this.c, fVar.b, this.d, fVar2.a);
            } else {
                j jVar = this.j;
                if (jVar != null) {
                    jVar.k = 0;
                    jVar.m = 0;
                    jVar.o = 0;
                    jVar.p = 0;
                    jVar.q = 0;
                    jVar.r = 0;
                    jVar.s = 0;
                    jVar.t = 0;
                    jVar.u = 0;
                    jVar.v = 0;
                    jVar.w = 0.0d;
                }
            }
        }
        this.m = h.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // c2.h
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // c2.h
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        f fVar = f.e;
        this.e = fVar;
        this.f = fVar;
        this.g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.a;
        this.k = byteBuffer;
        this.l = byteBuffer.asShortBuffer();
        this.m = byteBuffer;
        this.b = -1;
        this.i = false;
        this.j = null;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }
}
