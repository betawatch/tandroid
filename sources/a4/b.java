package a4;

import a8.ia;
import f3.c0;
import f3.p;
import h2.m0;
import java.io.EOFException;
import java.io.IOException;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class b implements h {
    public final g a;
    public final long b;
    public final long c;
    public final j d;
    public int e;
    public long f;
    public long h;
    public long n;
    public long r;
    public long s;
    public long w;
    public long x;

    public b(j jVar, long j3, long j10, long j11, long j12, boolean z9) {
        ia.f(j3 >= 0 && j10 > j3);
        this.d = jVar;
        this.b = j3;
        this.c = j10;
        if (j11 == j10 - j3 || z9) {
            this.f = j12;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new g();
    }

    @Override // a4.h
    public final c0 M() {
        if (this.f != 0) {
            return new a(this);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    @Override // a4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long r0(p pVar) {
        long j3;
        long j10;
        long j11;
        int i7 = this.e;
        long j12 = this.c;
        g gVar = this.a;
        if (i7 == 0) {
            j3 = 0;
            long position = pVar.getPosition();
            this.h = position;
            this.e = 1;
            long j13 = j12 - 65307;
            if (j13 > position) {
                return j13;
            }
        } else if (i7 != 1) {
            if (i7 == 2) {
                if (this.r == this.s) {
                    j11 = -1;
                } else {
                    long position2 = pVar.getPosition();
                    if (gVar.b(pVar, this.s)) {
                        gVar.a(pVar, false);
                        pVar.q();
                        long j14 = this.n;
                        long j15 = gVar.b;
                        long j16 = j14 - j15;
                        j10 = 2;
                        int i10 = gVar.d + gVar.e;
                        if (0 > j16 || j16 >= 72000) {
                            if (j16 < 0) {
                                this.s = position2;
                                this.x = j15;
                            } else {
                                this.r = pVar.getPosition() + i10;
                                this.w = gVar.b;
                            }
                            long j17 = this.s;
                            long j18 = this.r;
                            if (j17 - j18 < 100000) {
                                this.s = j18;
                                j11 = j18;
                            } else {
                                long position3 = pVar.getPosition() - (i10 * (j16 <= 0 ? 2L : 1L));
                                long j19 = this.s;
                                long j20 = this.r;
                                j11 = m0.j((((j19 - j20) * j16) / (this.x - this.w)) + position3, j20, j19 - 1);
                            }
                        } else {
                            j11 = -1;
                        }
                        if (j11 == -1) {
                            return j11;
                        }
                        this.e = 3;
                    } else {
                        j11 = this.r;
                        if (j11 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j10 = 2;
                if (j11 == -1) {
                }
            } else {
                if (i7 != 3) {
                    if (i7 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j10 = 2;
            }
            while (true) {
                gVar.b(pVar, -1L);
                gVar.a(pVar, false);
                if (gVar.b > this.n) {
                    pVar.q();
                    this.e = 4;
                    return -(this.w + j10);
                }
                pVar.s(gVar.d + gVar.e);
                this.r = pVar.getPosition();
                this.w = gVar.b;
            }
        } else {
            j3 = 0;
        }
        gVar.a = 0;
        gVar.b = j3;
        gVar.c = 0;
        gVar.d = 0;
        gVar.e = 0;
        if (!gVar.b(pVar, -1L)) {
            throw new EOFException();
        }
        gVar.a(pVar, false);
        pVar.s(gVar.d + gVar.e);
        long j21 = gVar.b;
        while ((gVar.a & 4) != 4 && gVar.b(pVar, -1L) && pVar.getPosition() < j12 && gVar.a(pVar, true)) {
            try {
                pVar.s(gVar.d + gVar.e);
                j21 = gVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j21;
        this.e = 4;
        return this.h;
    }

    @Override // a4.h
    public final void v0(long j3) {
        this.n = m0.j(j3, 0L, this.f - 1);
        this.e = 2;
        this.r = this.b;
        this.s = this.c;
        this.w = 0L;
        this.x = this.f;
    }
}
