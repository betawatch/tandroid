package a4;

import h5.d0;
import java.io.EOFException;
import java.io.IOException;
import r3.s;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
    public long v;
    public long w;

    public b(j jVar, long j10, long j11, long j12, long j13, boolean z4) {
        h5.a.f(j10 >= 0 && j11 > j10);
        this.d = jVar;
        this.b = j10;
        this.c = j11;
        if (j12 == j11 - j10 || z4) {
            this.f = j13;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.a = new g();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5  */
    @Override // a4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long c(r3.l lVar) {
        long j10;
        long j11;
        long i10;
        int i11 = this.e;
        long j12 = this.c;
        g gVar = this.a;
        if (i11 == 0) {
            j10 = 0;
            long position = lVar.getPosition();
            this.h = position;
            this.e = 1;
            long j13 = j12 - 65307;
            if (j13 > position) {
                return j13;
            }
        } else if (i11 != 1) {
            if (i11 == 2) {
                if (this.r == this.s) {
                    i10 = -1;
                } else {
                    long position2 = lVar.getPosition();
                    if (gVar.b(lVar, this.s)) {
                        gVar.a(lVar, false);
                        lVar.m();
                        long j14 = this.n;
                        long j15 = gVar.b;
                        long j16 = j14 - j15;
                        j11 = 2;
                        int i12 = gVar.d + gVar.e;
                        if (0 > j16 || j16 >= 72000) {
                            if (j16 < 0) {
                                this.s = position2;
                                this.w = j15;
                            } else {
                                this.r = lVar.getPosition() + i12;
                                this.v = gVar.b;
                            }
                            long j17 = this.s;
                            long j18 = this.r;
                            if (j17 - j18 < 100000) {
                                this.s = j18;
                                i10 = j18;
                            } else {
                                long position3 = lVar.getPosition() - (i12 * (j16 <= 0 ? 2L : 1L));
                                long j19 = this.s;
                                long j20 = this.r;
                                i10 = d0.i((((j19 - j20) * j16) / (this.w - this.v)) + position3, j20, j19 - 1);
                            }
                        } else {
                            i10 = -1;
                        }
                        if (i10 == -1) {
                            return i10;
                        }
                        this.e = 3;
                    } else {
                        i10 = this.r;
                        if (i10 == position2) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                }
                j11 = 2;
                if (i10 == -1) {
                }
            } else {
                if (i11 != 3) {
                    if (i11 == 4) {
                        return -1L;
                    }
                    throw new IllegalStateException();
                }
                j11 = 2;
            }
            while (true) {
                gVar.b(lVar, -1L);
                gVar.a(lVar, false);
                if (gVar.b > this.n) {
                    lVar.m();
                    this.e = 4;
                    return -(this.v + j11);
                }
                lVar.n(gVar.d + gVar.e);
                this.r = lVar.getPosition();
                this.v = gVar.b;
            }
        } else {
            j10 = 0;
        }
        gVar.a = 0;
        gVar.b = j10;
        gVar.c = 0;
        gVar.d = 0;
        gVar.e = 0;
        if (!gVar.b(lVar, -1L)) {
            throw new EOFException();
        }
        gVar.a(lVar, false);
        lVar.n(gVar.d + gVar.e);
        long j21 = gVar.b;
        while ((gVar.a & 4) != 4 && gVar.b(lVar, -1L) && lVar.getPosition() < j12 && gVar.a(lVar, true)) {
            try {
                lVar.n(gVar.d + gVar.e);
                j21 = gVar.b;
            } catch (EOFException unused) {
            }
        }
        this.f = j21;
        this.e = 4;
        return this.h;
    }

    @Override // a4.h
    public final s l() {
        if (this.f != 0) {
            return new a(this);
        }
        return null;
    }

    @Override // a4.h
    public final void p(long j10) {
        this.n = d0.i(j10, 0L, this.f - 1);
        this.e = 2;
        this.r = this.b;
        this.s = this.c;
        this.v = 0L;
        this.w = this.f;
    }
}
