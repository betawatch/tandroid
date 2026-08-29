package l3;

import j7.l1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class t0 implements j {
    public int b;
    public float c;
    public float d;
    public h e;
    public h f;
    public h g;
    public h h;
    public boolean i;
    public s0 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // l3.j
    public final ByteBuffer a() {
        s0 s0Var = this.j;
        if (s0Var != null) {
            int i10 = s0Var.b;
            int i11 = s0Var.m * i10 * 2;
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
                int min = Math.min(shortBuffer.remaining() / i10, s0Var.m);
                int i12 = min * i10;
                shortBuffer.put(s0Var.l, 0, i12);
                int i13 = s0Var.m - min;
                s0Var.m = i13;
                short[] sArr = s0Var.l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.o += i11;
                this.k.limit(i11);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = j.a;
        return byteBuffer;
    }

    @Override // l3.j
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            s0 s0Var = this.j;
            s0Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i10 = s0Var.b;
            int i11 = remaining2 / i10;
            short[] c3 = s0Var.c(s0Var.j, s0Var.k, i11);
            s0Var.j = c3;
            asShortBuffer.get(c3, s0Var.k * i10, ((i11 * i10) * 2) / 2);
            s0Var.k += i11;
            s0Var.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // l3.j
    public final void c() {
        s0 s0Var = this.j;
        if (s0Var != null) {
            int i10 = s0Var.k;
            float f9 = s0Var.c;
            float f10 = s0Var.d;
            int c3 = s0Var.m + ((int) l1.c(i10 / (f9 / f10), s0Var.o, s0Var.e * f10, 0.5f));
            short[] sArr = s0Var.j;
            int i11 = s0Var.h * 2;
            s0Var.j = s0Var.c(sArr, i10, i11 + i10);
            int i12 = 0;
            while (true) {
                int i13 = s0Var.b;
                if (i12 >= i11 * i13) {
                    break;
                }
                s0Var.j[(i13 * i10) + i12] = 0;
                i12++;
            }
            s0Var.k = i11 + s0Var.k;
            s0Var.f();
            if (s0Var.m > c3) {
                s0Var.m = c3;
            }
            s0Var.k = 0;
            s0Var.r = 0;
            s0Var.o = 0;
        }
        this.p = true;
    }

    @Override // l3.j
    public final boolean d() {
        if (!this.p) {
            return false;
        }
        s0 s0Var = this.j;
        return s0Var == null || (s0Var.m * s0Var.b) * 2 == 0;
    }

    @Override // l3.j
    public final h e(h hVar) {
        if (hVar.c != 2) {
            throw new i(hVar);
        }
        int i10 = this.b;
        if (i10 == -1) {
            i10 = hVar.a;
        }
        this.e = hVar;
        h hVar2 = new h(i10, hVar.b, 2);
        this.f = hVar2;
        this.i = true;
        return hVar2;
    }

    @Override // l3.j
    public final void flush() {
        if (isActive()) {
            h hVar = this.e;
            this.g = hVar;
            h hVar2 = this.f;
            this.h = hVar2;
            if (this.i) {
                this.j = new s0(hVar.a, this.c, hVar.b, this.d, hVar2.a);
            } else {
                s0 s0Var = this.j;
                if (s0Var != null) {
                    s0Var.k = 0;
                    s0Var.m = 0;
                    s0Var.o = 0;
                    s0Var.p = 0;
                    s0Var.q = 0;
                    s0Var.r = 0;
                    s0Var.s = 0;
                    s0Var.t = 0;
                    s0Var.u = 0;
                    s0Var.v = 0;
                }
            }
        }
        this.m = j.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // l3.j
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // l3.j
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        h hVar = h.e;
        this.e = hVar;
        this.f = hVar;
        this.g = hVar;
        this.h = hVar;
        ByteBuffer byteBuffer = j.a;
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
