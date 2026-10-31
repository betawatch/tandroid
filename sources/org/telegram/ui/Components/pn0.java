package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class pn0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public pn0(android.support.v4.media.session.a0 a0Var) {
        int i10;
        this.c = a0Var;
        synchronized (a0Var) {
            i10 = ((i2.h) a0Var.d).c.b;
        }
        this.a = i10;
        this.d = new e2.x(32);
        u2.z0 z0Var = new u2.z0(0L, i10);
        this.e = z0Var;
        this.f = z0Var;
        this.g = z0Var;
    }

    public static u2.z0 d(u2.z0 z0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= z0Var.b) {
            z0Var = (u2.z0) z0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.b - j10));
            y2.a aVar = (y2.a) z0Var.c;
            byteBuffer.put(aVar.a, ((int) (j10 - z0Var.a)) + aVar.b, min);
            i10 -= min;
            j10 += min;
            if (j10 == z0Var.b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 e(u2.z0 z0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= z0Var.b) {
            z0Var = (u2.z0) z0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (z0Var.b - j10));
            y2.a aVar = (y2.a) z0Var.c;
            System.arraycopy(aVar.a, ((int) (j10 - z0Var.a)) + aVar.b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == z0Var.b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 f(u2.z0 z0Var, h2.h hVar, bi.d0 d0Var, e2.x xVar) {
        if (hVar.getFlag(TLObject.FLAG_30)) {
            long j10 = d0Var.b;
            int i10 = 1;
            xVar.K(1);
            u2.z0 e = e(z0Var, j10, xVar.a, 1);
            long j11 = j10 + 1;
            byte b10 = xVar.a[0];
            boolean z10 = (b10 & 128) != 0;
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.b;
            byte[] bArr = dVar.a;
            if (bArr == null) {
                dVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e, j11, dVar.a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                z0Var = e(z0Var, j12, xVar.a, 2);
                j12 += 2;
                i10 = xVar.H();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = dVar.e;
            if (iArr2 == null || iArr2.length < i10) {
                iArr2 = new int[i10];
            }
            if (z10) {
                int i12 = i10 * 6;
                xVar.K(i12);
                z0Var = e(z0Var, j12, xVar.a, i12);
                j12 += i12;
                xVar.N(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.H();
                    iArr2[i13] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = d0Var.a - ((int) (j12 - d0Var.b));
            }
            c3.j0 j0Var = (c3.j0) d0Var.c;
            String str = e2.l0.a;
            byte[] bArr2 = j0Var.b;
            byte[] bArr3 = dVar.a;
            int i14 = j0Var.a;
            int i15 = j0Var.c;
            int i16 = j0Var.d;
            dVar.f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.b = bArr2;
            dVar.a = bArr3;
            dVar.c = i14;
            dVar.g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.c cVar = dVar.j;
                cVar.getClass();
                h2.c.a(cVar, i15, i16);
            }
            long j13 = d0Var.b;
            int i17 = (int) (j12 - j13);
            d0Var.b = j13 + i17;
            d0Var.a -= i17;
        }
        if (!hVar.hasSupplementalData()) {
            hVar.c(d0Var.a);
            return d(z0Var, d0Var.b, hVar.c, d0Var.a);
        }
        xVar.K(4);
        u2.z0 e7 = e(z0Var, d0Var.b, xVar.a, 4);
        int E = xVar.E();
        d0Var.b += 4;
        d0Var.a -= 4;
        hVar.c(E);
        u2.z0 d = d(e7, d0Var.b, hVar.c, E);
        d0Var.b += E;
        int i18 = d0Var.a - E;
        d0Var.a = i18;
        ByteBuffer byteBuffer = hVar.f;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            hVar.f = ByteBuffer.allocate(i18);
        } else {
            hVar.f.clear();
        }
        return d(d, d0Var.b, hVar.f, d0Var.a);
    }

    public void a(u2.z0 z0Var) {
        if (((y2.a) z0Var.c) == null) {
            return;
        }
        android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.c;
        synchronized (a0Var) {
            ((i2.h) a0Var.d).c.b(z0Var);
            u2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                y2.a aVar = (y2.a) z0Var2.c;
                aVar.getClass();
                a0Var.v(aVar);
                z0Var2 = (u2.z0) z0Var2.d;
                if (z0Var2 == null || ((y2.a) z0Var2.c) == null) {
                    z0Var2 = null;
                }
            }
        }
        z0Var.c = null;
        z0Var.d = null;
    }

    public void b(long j10) {
        u2.z0 z0Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            z0Var = (u2.z0) this.e;
            if (j10 < z0Var.b) {
                break;
            }
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.c;
            y2.a aVar = (y2.a) z0Var.c;
            synchronized (a0Var) {
                ((i2.h) a0Var.d).c.c(aVar);
                a0Var.v(aVar);
            }
            u2.z0 z0Var2 = (u2.z0) this.e;
            z0Var2.c = null;
            u2.z0 z0Var3 = (u2.z0) z0Var2.d;
            z0Var2.d = null;
            this.e = z0Var3;
        }
        if (((u2.z0) this.f).a < z0Var.a) {
            this.f = z0Var;
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.z0 z0Var = (u2.z0) this.g;
        if (((y2.a) z0Var.c) == null) {
            android.support.v4.media.session.a0 a0Var = (android.support.v4.media.session.a0) this.c;
            synchronized (a0Var) {
                a2 = ((i2.h) a0Var.d).c.a();
                ((HashMap) a0Var.b).put(a2, (j2.l) a0Var.c);
                i2.g gVar = (i2.g) ((i2.h) a0Var.d).p.get((j2.l) a0Var.c);
                if (gVar != null) {
                    gVar.a();
                }
            }
            u2.z0 z0Var2 = new u2.z0(((u2.z0) this.g).b, this.a);
            z0Var.c = a2;
            z0Var.d = z0Var2;
        }
        return Math.min(i10, (int) (((u2.z0) this.g).b - this.b));
    }

    public pn0(eb0 eb0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = org.telegram.messenger.zs.Z3;
        this.c = eb0Var;
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.33f));
    }
}
