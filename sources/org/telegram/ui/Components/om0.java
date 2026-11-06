package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class om0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public om0(h6.m mVar) {
        int i7;
        this.c = mVar;
        synchronized (mVar) {
            i7 = ((l2.h) mVar.d).c.b;
        }
        this.a = i7;
        this.d = new h2.x(32);
        a4.c cVar = new a4.c(0L, i7);
        this.e = cVar;
        this.f = cVar;
        this.g = cVar;
    }

    public static a4.c d(a4.c cVar, long j3, ByteBuffer byteBuffer, int i7) {
        while (j3 >= cVar.b) {
            cVar = (a4.c) cVar.d;
        }
        while (i7 > 0) {
            int min = Math.min(i7, (int) (cVar.b - j3));
            b3.a aVar = (b3.a) cVar.c;
            byteBuffer.put(aVar.a, ((int) (j3 - cVar.a)) + aVar.b, min);
            i7 -= min;
            j3 += min;
            if (j3 == cVar.b) {
                cVar = (a4.c) cVar.d;
            }
        }
        return cVar;
    }

    public static a4.c e(a4.c cVar, long j3, byte[] bArr, int i7) {
        while (j3 >= cVar.b) {
            cVar = (a4.c) cVar.d;
        }
        int i10 = i7;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (cVar.b - j3));
            b3.a aVar = (b3.a) cVar.c;
            System.arraycopy(aVar.a, ((int) (j3 - cVar.a)) + aVar.b, bArr, i7 - i10, min);
            i10 -= min;
            j3 += min;
            if (j3 == cVar.b) {
                cVar = (a4.c) cVar.d;
            }
        }
        return cVar;
    }

    public static a4.c f(a4.c cVar, k2.h hVar, li.z zVar, h2.x xVar) {
        if (hVar.getFlag(TLObject.FLAG_30)) {
            long j3 = zVar.b;
            int i7 = 1;
            xVar.K(1);
            a4.c e10 = e(cVar, j3, xVar.a, 1);
            long j10 = j3 + 1;
            byte b10 = xVar.a[0];
            boolean z9 = (b10 & 128) != 0;
            int i10 = b10 & Byte.MAX_VALUE;
            k2.d dVar = hVar.b;
            byte[] bArr = dVar.a;
            if (bArr == null) {
                dVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            cVar = e(e10, j10, dVar.a, i10);
            long j11 = j10 + i10;
            if (z9) {
                xVar.K(2);
                cVar = e(cVar, j11, xVar.a, 2);
                j11 += 2;
                i7 = xVar.H();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = dVar.e;
            if (iArr2 == null || iArr2.length < i7) {
                iArr2 = new int[i7];
            }
            if (z9) {
                int i11 = i7 * 6;
                xVar.K(i11);
                cVar = e(cVar, j11, xVar.a, i11);
                j11 += i11;
                xVar.N(0);
                for (int i12 = 0; i12 < i7; i12++) {
                    iArr[i12] = xVar.H();
                    iArr2[i12] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = zVar.a - ((int) (j11 - zVar.b));
            }
            f3.i0 i0Var = (f3.i0) zVar.c;
            String str = h2.m0.a;
            byte[] bArr2 = i0Var.b;
            byte[] bArr3 = dVar.a;
            int i13 = i0Var.a;
            int i14 = i0Var.c;
            int i15 = i0Var.d;
            dVar.f = i7;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.b = bArr2;
            dVar.a = bArr3;
            dVar.c = i13;
            dVar.g = i14;
            dVar.h = i15;
            MediaCodec.CryptoInfo cryptoInfo = dVar.i;
            cryptoInfo.numSubSamples = i7;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i13;
            if (Build.VERSION.SDK_INT >= 24) {
                k2.c cVar2 = dVar.j;
                cVar2.getClass();
                k2.c.a(cVar2, i14, i15);
            }
            long j12 = zVar.b;
            int i16 = (int) (j11 - j12);
            zVar.b = j12 + i16;
            zVar.a -= i16;
        }
        if (!hVar.hasSupplementalData()) {
            hVar.b(zVar.a);
            return d(cVar, zVar.b, hVar.c, zVar.a);
        }
        xVar.K(4);
        a4.c e11 = e(cVar, zVar.b, xVar.a, 4);
        int E = xVar.E();
        zVar.b += 4;
        zVar.a -= 4;
        hVar.b(E);
        a4.c d = d(e11, zVar.b, hVar.c, E);
        zVar.b += E;
        int i17 = zVar.a - E;
        zVar.a = i17;
        ByteBuffer byteBuffer = hVar.f;
        if (byteBuffer == null || byteBuffer.capacity() < i17) {
            hVar.f = ByteBuffer.allocate(i17);
        } else {
            hVar.f.clear();
        }
        return d(d, zVar.b, hVar.f, zVar.a);
    }

    public void a(a4.c cVar) {
        if (((b3.a) cVar.c) == null) {
            return;
        }
        h6.m mVar = (h6.m) this.c;
        synchronized (mVar) {
            ((l2.h) mVar.d).c.b(cVar);
            a4.c cVar2 = cVar;
            while (cVar2 != null) {
                b3.a aVar = (b3.a) cVar2.c;
                aVar.getClass();
                mVar.D(aVar);
                cVar2 = (a4.c) cVar2.d;
                if (cVar2 == null || ((b3.a) cVar2.c) == null) {
                    cVar2 = null;
                }
            }
        }
        cVar.c = null;
        cVar.d = null;
    }

    public void b(long j3) {
        a4.c cVar;
        if (j3 == -1) {
            return;
        }
        while (true) {
            cVar = (a4.c) this.e;
            if (j3 < cVar.b) {
                break;
            }
            h6.m mVar = (h6.m) this.c;
            b3.a aVar = (b3.a) cVar.c;
            synchronized (mVar) {
                ((l2.h) mVar.d).c.c(aVar);
                mVar.D(aVar);
            }
            a4.c cVar2 = (a4.c) this.e;
            cVar2.c = null;
            a4.c cVar3 = (a4.c) cVar2.d;
            cVar2.d = null;
            this.e = cVar3;
        }
        if (((a4.c) this.f).a < cVar.a) {
            this.f = cVar;
        }
    }

    public int c(int i7) {
        b3.a a10;
        a4.c cVar = (a4.c) this.g;
        if (((b3.a) cVar.c) == null) {
            h6.m mVar = (h6.m) this.c;
            synchronized (mVar) {
                a10 = ((l2.h) mVar.d).c.a();
                ((HashMap) mVar.b).put(a10, (m2.j) mVar.c);
                l2.g gVar = (l2.g) ((l2.h) mVar.d).p.get((m2.j) mVar.c);
                if (gVar != null) {
                    gVar.a();
                }
            }
            a4.c cVar2 = new a4.c(((a4.c) this.g).b, this.a);
            cVar.c = a10;
            cVar.d = cVar2;
        }
        return Math.min(i7, (int) (((a4.c) this.g).b - this.b));
    }

    public om0(ob0 ob0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = org.telegram.messenger.qs.Z3;
        this.c = ob0Var;
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.33f));
    }
}
