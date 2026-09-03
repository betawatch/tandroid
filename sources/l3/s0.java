package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class s0 implements n {
    public int b;
    public float c;
    public float d;
    public l e;
    public l f;
    public l g;
    public l h;
    public boolean i;
    public r0 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // l3.n
    public final ByteBuffer a() {
        r0 r0Var = this.j;
        if (r0Var != null) {
            int i10 = r0Var.b;
            int i11 = r0Var.m * i10 * 2;
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
                int min = Math.min(shortBuffer.remaining() / i10, r0Var.m);
                int i12 = min * i10;
                shortBuffer.put(r0Var.l, 0, i12);
                int i13 = r0Var.m - min;
                r0Var.m = i13;
                short[] sArr = r0Var.l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.o += i11;
                this.k.limit(i11);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = n.a;
        return byteBuffer;
    }

    @Override // l3.n
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r0 r0Var = this.j;
            r0Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i10 = r0Var.b;
            int i11 = remaining2 / i10;
            short[] c3 = r0Var.c(r0Var.j, r0Var.k, i11);
            r0Var.j = c3;
            asShortBuffer.get(c3, r0Var.k * i10, ((i11 * i10) * 2) / 2);
            r0Var.k += i11;
            r0Var.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // l3.n
    public final void c() {
        r0 r0Var = this.j;
        if (r0Var != null) {
            int i10 = r0Var.k;
            float f10 = r0Var.c;
            float f11 = r0Var.d;
            int b10 = r0Var.m + ((int) l.d.b(i10 / (f10 / f11), r0Var.o, r0Var.e * f11, 0.5f));
            short[] sArr = r0Var.j;
            int i11 = r0Var.h * 2;
            r0Var.j = r0Var.c(sArr, i10, i11 + i10);
            int i12 = 0;
            while (true) {
                int i13 = r0Var.b;
                if (i12 >= i11 * i13) {
                    break;
                }
                r0Var.j[(i13 * i10) + i12] = 0;
                i12++;
            }
            r0Var.k = i11 + r0Var.k;
            r0Var.f();
            if (r0Var.m > b10) {
                r0Var.m = b10;
            }
            r0Var.k = 0;
            r0Var.r = 0;
            r0Var.o = 0;
        }
        this.p = true;
    }

    @Override // l3.n
    public final boolean d() {
        if (!this.p) {
            return false;
        }
        r0 r0Var = this.j;
        return r0Var == null || (r0Var.m * r0Var.b) * 2 == 0;
    }

    @Override // l3.n
    public final l e(l lVar) {
        if (lVar.c != 2) {
            throw new m(lVar);
        }
        int i10 = this.b;
        if (i10 == -1) {
            i10 = lVar.a;
        }
        this.e = lVar;
        l lVar2 = new l(i10, lVar.b, 2);
        this.f = lVar2;
        this.i = true;
        return lVar2;
    }

    @Override // l3.n
    public final void flush() {
        if (isActive()) {
            l lVar = this.e;
            this.g = lVar;
            l lVar2 = this.f;
            this.h = lVar2;
            if (this.i) {
                this.j = new r0(lVar.a, this.c, lVar.b, this.d, lVar2.a);
            } else {
                r0 r0Var = this.j;
                if (r0Var != null) {
                    r0Var.k = 0;
                    r0Var.m = 0;
                    r0Var.o = 0;
                    r0Var.p = 0;
                    r0Var.q = 0;
                    r0Var.r = 0;
                    r0Var.s = 0;
                    r0Var.t = 0;
                    r0Var.u = 0;
                    r0Var.v = 0;
                }
            }
        }
        this.m = n.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // l3.n
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // l3.n
    public final void reset() {
        this.c = 1.0f;
        this.d = 1.0f;
        l lVar = l.e;
        this.e = lVar;
        this.f = lVar;
        this.g = lVar;
        this.h = lVar;
        ByteBuffer byteBuffer = n.a;
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
