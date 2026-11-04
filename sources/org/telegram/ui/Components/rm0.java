package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rm0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public rm0(android.support.v4.media.session.a0 a0Var) {
        int i3;
        this.c = a0Var;
        synchronized (a0Var) {
            i3 = ((k2.h) a0Var.d).c.b;
        }
        this.a = i3;
        this.d = new g2.y(32);
        w2.z0 z0Var = new w2.z0(0L, i3);
        this.e = z0Var;
        this.f = z0Var;
        this.g = z0Var;
    }

    public static w2.z0 d(w2.z0 z0Var, long j10, ByteBuffer byteBuffer, int i3) {
        while (j10 >= z0Var.b) {
            z0Var = (w2.z0) z0Var.d;
        }
        while (i3 > 0) {
            int min = Math.min(i3, (int) (z0Var.b - j10));
            a3.a aVar = (a3.a) z0Var.c;
            byteBuffer.put(aVar.a, ((int) (j10 - z0Var.a)) + aVar.b, min);
            i3 -= min;
            j10 += min;
            if (j10 == z0Var.b) {
                z0Var = (w2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static w2.z0 e(w2.z0 z0Var, long j10, byte[] bArr, int i3) {
        while (j10 >= z0Var.b) {
            z0Var = (w2.z0) z0Var.d;
        }
        int i10 = i3;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.b - j10));
            a3.a aVar = (a3.a) z0Var.c;
            System.arraycopy(aVar.a, ((int) (j10 - z0Var.a)) + aVar.b, bArr, i3 - i10, min);
            i10 -= min;
            j10 += min;
            if (j10 == z0Var.b) {
                z0Var = (w2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static w2.z0 f(w2.z0 z0Var, j2.h hVar, l5.c cVar, g2.y yVar) {
        if (hVar.getFlag(TLObject.FLAG_30)) {
            long j10 = cVar.a;
            int i3 = 1;
            yVar.K(1);
            w2.z0 e10 = e(z0Var, j10, yVar.a, 1);
            long j11 = j10 + 1;
            byte b10 = yVar.a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & Byte.MAX_VALUE;
            j2.d dVar = hVar.b;
            byte[] bArr = dVar.a;
            if (bArr == null) {
                dVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e10, j11, dVar.a, i10);
            long j12 = j11 + i10;
            if (z10) {
                yVar.K(2);
                z0Var = e(z0Var, j12, yVar.a, 2);
                j12 += 2;
                i3 = yVar.H();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i3) {
                iArr = new int[i3];
            }
            int[] iArr2 = dVar.e;
            if (iArr2 == null || iArr2.length < i3) {
                iArr2 = new int[i3];
            }
            if (z10) {
                int i11 = i3 * 6;
                yVar.K(i11);
                z0Var = e(z0Var, j12, yVar.a, i11);
                j12 += i11;
                yVar.N(0);
                for (int i12 = 0; i12 < i3; i12++) {
                    iArr[i12] = yVar.H();
                    iArr2[i12] = yVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cVar.b - ((int) (j12 - cVar.a));
            }
            e3.h0 h0Var = (e3.h0) cVar.c;
            String str = g2.n0.a;
            byte[] bArr2 = h0Var.b;
            byte[] bArr3 = dVar.a;
            int i13 = h0Var.a;
            int i14 = h0Var.c;
            int i15 = h0Var.d;
            dVar.f = i3;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.b = bArr2;
            dVar.a = bArr3;
            dVar.c = i13;
            dVar.g = i14;
            dVar.h = i15;
            MediaCodec.CryptoInfo cryptoInfo = dVar.i;
            cryptoInfo.numSubSamples = i3;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Build.VERSION.SDK_INT >= 24) {
                j2.c cVar2 = dVar.j;
                cVar2.getClass();
                j2.c.a(cVar2, i14, i15);
            }
            long j13 = cVar.a;
            int i16 = (int) (j12 - j13);
            cVar.a = j13 + i16;
            cVar.b -= i16;
        }
        if (!hVar.hasSupplementalData()) {
            hVar.b(cVar.b);
            return d(z0Var, cVar.a, hVar.c, cVar.b);
        }
        yVar.K(4);
        w2.z0 e11 = e(z0Var, cVar.a, yVar.a, 4);
        int E = yVar.E();
        cVar.a += 4;
        cVar.b -= 4;
        hVar.b(E);
        w2.z0 d = d(e11, cVar.a, hVar.c, E);
        cVar.a += E;
        int i17 = cVar.b - E;
        cVar.b = i17;
        ByteBuffer byteBuffer = hVar.f;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            hVar.f = ByteBuffer.allocate(i17);
        } else {
            hVar.f.clear();
        }
        return d(d, cVar.a, hVar.f, cVar.b);
    }

    public void a(w2.z0 z0Var) {
        if (((a3.a) z0Var.c) == null) {
            return;
        }
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.c;
        synchronized (a0Var) {
            ((k2.h) a0Var.d).c.c(z0Var);
            w2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                a3.a aVar = (a3.a) z0Var2.c;
                aVar.getClass();
                a0Var.p(aVar);
                z0Var2 = (w2.z0) z0Var2.d;
                if (z0Var2 == null || ((a3.a) z0Var2.c) == null) {
                    z0Var2 = null;
                }
            }
        }
        z0Var.c = null;
        z0Var.d = null;
    }

    public void b(long j10) {
        w2.z0 z0Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            z0Var = (w2.z0) this.e;
            if (j10 < z0Var.b) {
                break;
            }
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.c;
            a3.a aVar = (a3.a) z0Var.c;
            synchronized (a0Var) {
                ((k2.h) a0Var.d).c.b(aVar);
                a0Var.p(aVar);
            }
            w2.z0 z0Var2 = (w2.z0) this.e;
            z0Var2.c = null;
            w2.z0 z0Var3 = (w2.z0) z0Var2.d;
            z0Var2.d = null;
            this.e = z0Var3;
        }
        if (((w2.z0) this.f).a < z0Var.a) {
            this.f = z0Var;
        }
    }

    public int c(int i3) {
        a3.a a10;
        w2.z0 z0Var = (w2.z0) this.g;
        if (((a3.a) z0Var.c) == null) {
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.c;
            synchronized (a0Var) {
                a10 = ((k2.h) a0Var.d).c.a();
                ((HashMap) a0Var.b).put(a10, (l2.k) a0Var.c);
                k2.g gVar = (k2.g) ((k2.h) a0Var.d).p.get((l2.k) a0Var.c);
                if (gVar != null) {
                    gVar.a();
                }
            }
            w2.z0 z0Var2 = new w2.z0(((w2.z0) this.g).b, this.a);
            z0Var.c = a10;
            z0Var.d = z0Var2;
        }
        return Math.min(i3, (int) (((w2.z0) this.g).b - this.b));
    }

    public rm0(jb0 jb0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = org.telegram.messenger.hs.Z3;
        this.c = jb0Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
    }
}
