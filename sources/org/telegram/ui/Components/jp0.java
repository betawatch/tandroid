package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class jp0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public jp0(androidx.biometric.e eVar) {
        int i10;
        this.c = eVar;
        synchronized (eVar) {
            i10 = ((i2.i) eVar.d).c.b;
        }
        this.a = i10;
        this.d = new e2.x(32);
        u2.b1 b1Var = new u2.b1(0L, i10);
        this.e = b1Var;
        this.f = b1Var;
        this.g = b1Var;
    }

    public static u2.b1 d(u2.b1 b1Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= b1Var.b) {
            b1Var = (u2.b1) b1Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (b1Var.b - j10));
            y2.a aVar = (y2.a) b1Var.c;
            byteBuffer.put(aVar.a, ((int) (j10 - b1Var.a)) + aVar.b, min);
            i10 -= min;
            j10 += min;
            if (j10 == b1Var.b) {
                b1Var = (u2.b1) b1Var.d;
            }
        }
        return b1Var;
    }

    public static u2.b1 e(u2.b1 b1Var, long j10, byte[] bArr, int i10) {
        while (j10 >= b1Var.b) {
            b1Var = (u2.b1) b1Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (b1Var.b - j10));
            y2.a aVar = (y2.a) b1Var.c;
            System.arraycopy(aVar.a, ((int) (j10 - b1Var.a)) + aVar.b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == b1Var.b) {
                b1Var = (u2.b1) b1Var.d;
            }
        }
        return b1Var;
    }

    public static u2.b1 f(u2.b1 b1Var, h2.h hVar, j5.c cVar, e2.x xVar) {
        if (hVar.getFlag(TLObject.FLAG_30)) {
            long j10 = cVar.a;
            int i10 = 1;
            xVar.K(1);
            u2.b1 e = e(b1Var, j10, xVar.a, 1);
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
            b1Var = e(e, j11, dVar.a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                b1Var = e(b1Var, j12, xVar.a, 2);
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
                b1Var = e(b1Var, j12, xVar.a, i12);
                j12 += i12;
                xVar.N(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = xVar.H();
                    iArr2[i13] = xVar.E();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = cVar.b - ((int) (j12 - cVar.a));
            }
            c3.k0 k0Var = (c3.k0) cVar.c;
            String str = e2.m0.a;
            byte[] bArr2 = k0Var.b;
            byte[] bArr3 = dVar.a;
            int i14 = k0Var.a;
            int i15 = k0Var.c;
            int i16 = k0Var.d;
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
                h2.c cVar2 = dVar.j;
                cVar2.getClass();
                h2.c.a(cVar2, i15, i16);
            }
            long j13 = cVar.a;
            int i17 = (int) (j12 - j13);
            cVar.a = j13 + i17;
            cVar.b -= i17;
        }
        if (!hVar.hasSupplementalData()) {
            hVar.b(cVar.b);
            return d(b1Var, cVar.a, hVar.c, cVar.b);
        }
        xVar.K(4);
        u2.b1 e7 = e(b1Var, cVar.a, xVar.a, 4);
        int E = xVar.E();
        cVar.a += 4;
        cVar.b -= 4;
        hVar.b(E);
        u2.b1 d = d(e7, cVar.a, hVar.c, E);
        cVar.a += E;
        int i18 = cVar.b - E;
        cVar.b = i18;
        ByteBuffer byteBuffer = hVar.f;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            hVar.f = ByteBuffer.allocate(i18);
        } else {
            hVar.f.clear();
        }
        return d(d, cVar.a, hVar.f, cVar.b);
    }

    public void a(u2.b1 b1Var) {
        if (((y2.a) b1Var.c) == null) {
            return;
        }
        androidx.biometric.e eVar = (androidx.biometric.e) this.c;
        synchronized (eVar) {
            ((i2.i) eVar.d).c.b(b1Var);
            u2.b1 b1Var2 = b1Var;
            while (b1Var2 != null) {
                y2.a aVar = (y2.a) b1Var2.c;
                aVar.getClass();
                eVar.t(aVar);
                b1Var2 = (u2.b1) b1Var2.d;
                if (b1Var2 == null || ((y2.a) b1Var2.c) == null) {
                    b1Var2 = null;
                }
            }
        }
        b1Var.c = null;
        b1Var.d = null;
    }

    public void b(long j10) {
        u2.b1 b1Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            b1Var = (u2.b1) this.e;
            if (j10 < b1Var.b) {
                break;
            }
            androidx.biometric.e eVar = (androidx.biometric.e) this.c;
            y2.a aVar = (y2.a) b1Var.c;
            synchronized (eVar) {
                ((i2.i) eVar.d).c.c(aVar);
                eVar.t(aVar);
            }
            u2.b1 b1Var2 = (u2.b1) this.e;
            b1Var2.c = null;
            u2.b1 b1Var3 = (u2.b1) b1Var2.d;
            b1Var2.d = null;
            this.e = b1Var3;
        }
        if (((u2.b1) this.f).a < b1Var.a) {
            this.f = b1Var;
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.b1 b1Var = (u2.b1) this.g;
        if (((y2.a) b1Var.c) == null) {
            androidx.biometric.e eVar = (androidx.biometric.e) this.c;
            synchronized (eVar) {
                a2 = ((i2.i) eVar.d).c.a();
                ((HashMap) eVar.b).put(a2, (j2.j) eVar.c);
                i2.h hVar = (i2.h) ((i2.i) eVar.d).p.get((j2.j) eVar.c);
                if (hVar != null) {
                    hVar.a();
                }
            }
            u2.b1 b1Var2 = new u2.b1(((u2.b1) this.g).b, this.a);
            b1Var.c = a2;
            b1Var.d = b1Var2;
        }
        return Math.min(i10, (int) (((u2.b1) this.g).b - this.b));
    }

    public jp0(yb0 yb0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = MediaDataController.MAX_LINKS_COUNT;
        this.c = yb0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
