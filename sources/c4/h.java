package c4;

import a8.ia;
import c8.e1;
import e2.s0;
import e2.t;
import e2.u;
import f3.j0;
import f3.p;
import f3.q;
import f3.s;
import f3.z;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class h implements f3.o {
    public final m a;
    public final u b;
    public final ArrayList c;
    public j0 f;
    public int g;
    public int h;
    public long[] i;
    public long j;
    public byte[] e = m0.b;
    public final x d = new x();

    public h(m mVar, u uVar) {
        u uVar2;
        this.a = mVar;
        if (uVar != null) {
            t a10 = uVar.a();
            a10.r = s0.n("application/x-media3-cues");
            a10.j = uVar.s;
            a10.P = mVar.P();
            uVar2 = new u(a10);
        } else {
            uVar2 = null;
        }
        this.b = uVar2;
        this.c = new ArrayList();
        this.h = 0;
        this.i = m0.c;
        this.j = -9223372036854775807L;
    }

    @Override // f3.o
    public final boolean b(p pVar) {
        return true;
    }

    @Override // f3.o
    public final void c(q qVar) {
        ia.p(this.h == 0);
        j0 O1 = qVar.O1(0, 3);
        this.f = O1;
        u uVar = this.b;
        if (uVar != null) {
            O1.g(uVar);
            qVar.U0();
            qVar.f(new z(-9223372036854775807L, new long[]{0}, new long[]{0}));
        }
        this.h = 1;
    }

    @Override // f3.o
    public final void d(long j3, long j10) {
        int i7 = this.h;
        ia.p((i7 == 0 || i7 == 5) ? false : true);
        this.j = j10;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    @Override // f3.o
    public final List e() {
        g0 g0Var = i0.b;
        return t1.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0077, code lost:
    
        if (r20.g != r14) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r2 == (-1)) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x007e, code lost:
    
        r4 = r20.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0082, code lost:
    
        if (r4 == (-9223372036854775807L)) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0084, code lost:
    
        r2 = new c4.l(r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x008f, code lost:
    
        r20.a.z(r20.e, 0, r20.g, r2, new a1.c(r20, 21));
        java.util.Collections.sort(r11);
        r20.i = new long[r11.size()];
        r2 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
    
        if (r2 >= r11.size()) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
    
        r20.i[r2] = ((c4.g) r11.get(r2)).a;
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00c9, code lost:
    
        r20.e = h2.m0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cd, code lost:
    
        r20.h = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008c, code lost:
    
        r2 = c4.l.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        throw e2.t0.a(r0, "SubtitleParser failed.");
     */
    @Override // f3.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(p pVar, s sVar) {
        int i7;
        int i10 = this.h;
        ia.p((i10 == 0 || i10 == 5) ? false : true);
        if (this.h == 1) {
            int b10 = pVar.getLength() != -1 ? e1.b(pVar.getLength()) : 1024;
            if (b10 > this.e.length) {
                this.e = new byte[b10];
            }
            this.g = 0;
            this.h = 2;
        }
        int i11 = this.h;
        ArrayList arrayList = this.c;
        if (i11 == 2) {
            byte[] bArr = this.e;
            if (bArr.length == this.g) {
                this.e = Arrays.copyOf(bArr, bArr.length + 1024);
            }
            byte[] bArr2 = this.e;
            int i12 = this.g;
            int read = pVar.read(bArr2, i12, bArr2.length - i12);
            if (read != -1) {
                this.g += read;
            }
            long length = pVar.getLength();
            if (length != -1) {
                i7 = 0;
            } else {
                i7 = 0;
            }
        } else {
            i7 = 0;
        }
        if (this.h == 3) {
            if (pVar.skip(pVar.getLength() != -1 ? e1.b(pVar.getLength()) : 1024) == -1) {
                long j3 = this.j;
                for (int f10 = j3 == -9223372036854775807L ? i7 : m0.f(this.i, j3, true); f10 < arrayList.size(); f10++) {
                    g((g) arrayList.get(f10));
                }
                this.h = 4;
            }
        }
        if (this.h == 4) {
            return -1;
        }
        return i7;
    }

    public final void g(g gVar) {
        this.f.getClass();
        byte[] bArr = gVar.b;
        int length = bArr.length;
        x xVar = this.d;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
        this.f.b(length, xVar);
        this.f.c(gVar.a, 1, length, 0, null);
    }

    @Override // f3.o
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.a.reset();
        this.h = 5;
    }

    @Override // f3.o
    public final f3.o a() {
        return this;
    }
}
