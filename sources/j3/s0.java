package j3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class s0 implements j {
    public int b;
    public float c;
    public float d;
    public h e;
    public h f;
    public h g;
    public h h;
    public boolean i;
    public q0 j;
    public ByteBuffer k;
    public ShortBuffer l;
    public ByteBuffer m;
    public long n;
    public long o;
    public boolean p;

    @Override // j3.j
    public final ByteBuffer a() {
        q0 q0Var = this.j;
        if (q0Var != null) {
            int i9 = q0Var.b;
            int i10 = q0Var.m * i9 * 2;
            if (i10 > 0) {
                if (this.k.capacity() < i10) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                    this.k = order;
                    this.l = order.asShortBuffer();
                } else {
                    this.k.clear();
                    this.l.clear();
                }
                ShortBuffer shortBuffer = this.l;
                int min = Math.min(shortBuffer.remaining() / i9, q0Var.m);
                int i11 = min * i9;
                shortBuffer.put(q0Var.l, 0, i11);
                int i12 = q0Var.m - min;
                q0Var.m = i12;
                short[] sArr = q0Var.l;
                System.arraycopy(sArr, i11, sArr, 0, i12 * i9);
                this.o += i10;
                this.k.limit(i10);
                this.m = this.k;
            }
        }
        ByteBuffer byteBuffer = this.m;
        this.m = j.a;
        return byteBuffer;
    }

    @Override // j3.j
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            q0 q0Var = this.j;
            q0Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.n += remaining;
            int remaining2 = asShortBuffer.remaining();
            int i9 = q0Var.b;
            int i10 = remaining2 / i9;
            short[] c10 = q0Var.c(q0Var.j, q0Var.k, i10);
            q0Var.j = c10;
            asShortBuffer.get(c10, q0Var.k * i9, ((i10 * i9) * 2) / 2);
            q0Var.k += i10;
            q0Var.f();
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // j3.j
    public final void c() {
        q0 q0Var = this.j;
        if (q0Var != null) {
            int i9 = q0Var.k;
            float f10 = q0Var.c;
            float f11 = q0Var.d;
            int c10 = q0Var.m + ((int) r0.c(i9 / (f10 / f11), q0Var.o, q0Var.e * f11, 0.5f));
            short[] sArr = q0Var.j;
            int i10 = q0Var.h * 2;
            q0Var.j = q0Var.c(sArr, i9, i10 + i9);
            int i11 = 0;
            while (true) {
                int i12 = q0Var.b;
                if (i11 >= i10 * i12) {
                    break;
                }
                q0Var.j[(i12 * i9) + i11] = 0;
                i11++;
            }
            q0Var.k = i10 + q0Var.k;
            q0Var.f();
            if (q0Var.m > c10) {
                q0Var.m = c10;
            }
            q0Var.k = 0;
            q0Var.r = 0;
            q0Var.o = 0;
        }
        this.p = true;
    }

    @Override // j3.j
    public final boolean d() {
        if (!this.p) {
            return false;
        }
        q0 q0Var = this.j;
        return q0Var == null || (q0Var.m * q0Var.b) * 2 == 0;
    }

    @Override // j3.j
    public final h e(h hVar) {
        if (hVar.c != 2) {
            throw new i(hVar);
        }
        int i9 = this.b;
        if (i9 == -1) {
            i9 = hVar.a;
        }
        this.e = hVar;
        h hVar2 = new h(i9, hVar.b, 2);
        this.f = hVar2;
        this.i = true;
        return hVar2;
    }

    @Override // j3.j
    public final void flush() {
        if (isActive()) {
            h hVar = this.e;
            this.g = hVar;
            h hVar2 = this.f;
            this.h = hVar2;
            if (this.i) {
                this.j = new q0(hVar.a, this.c, hVar.b, this.d, hVar2.a);
            } else {
                q0 q0Var = this.j;
                if (q0Var != null) {
                    q0Var.k = 0;
                    q0Var.m = 0;
                    q0Var.o = 0;
                    q0Var.p = 0;
                    q0Var.q = 0;
                    q0Var.r = 0;
                    q0Var.s = 0;
                    q0Var.t = 0;
                    q0Var.u = 0;
                    q0Var.v = 0;
                }
            }
        }
        this.m = j.a;
        this.n = 0L;
        this.o = 0L;
        this.p = false;
    }

    @Override // j3.j
    public final boolean isActive() {
        if (this.f.a != -1) {
            return Math.abs(this.c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f.a != this.e.a;
        }
        return false;
    }

    @Override // j3.j
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
