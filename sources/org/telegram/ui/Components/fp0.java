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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class fp0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public fp0(androidx.biometric.e eVar) {
        int i10;
        this.c = eVar;
        synchronized (eVar) {
            i10 = ((i2.j) eVar.d).c.b;
        }
        this.a = i10;
        this.d = new e2.x(32);
        u2.a1 a1Var = new u2.a1(0L, i10);
        this.e = a1Var;
        this.f = a1Var;
        this.g = a1Var;
    }

    public static u2.a1 d(u2.a1 a1Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= a1Var.b) {
            a1Var = (u2.a1) a1Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (a1Var.b - j10));
            y2.a aVar = (y2.a) a1Var.c;
            byteBuffer.put(aVar.a, ((int) (j10 - a1Var.a)) + aVar.b, min);
            i10 -= min;
            j10 += min;
            if (j10 == a1Var.b) {
                a1Var = (u2.a1) a1Var.d;
            }
        }
        return a1Var;
    }

    public static u2.a1 e(u2.a1 a1Var, long j10, byte[] bArr, int i10) {
        while (j10 >= a1Var.b) {
            a1Var = (u2.a1) a1Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (a1Var.b - j10));
            y2.a aVar = (y2.a) a1Var.c;
            System.arraycopy(aVar.a, ((int) (j10 - a1Var.a)) + aVar.b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == a1Var.b) {
                a1Var = (u2.a1) a1Var.d;
            }
        }
        return a1Var;
    }

    public static u2.a1 f(u2.a1 a1Var, h2.h hVar, j5.c cVar, e2.x xVar) {
        if (hVar.getFlag(TLObject.FLAG_30)) {
            long j10 = cVar.a;
            int i10 = 1;
            xVar.K(1);
            u2.a1 e = e(a1Var, j10, xVar.a, 1);
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
            a1Var = e(e, j11, dVar.a, i11);
            long j12 = j11 + i11;
            if (z10) {
                xVar.K(2);
                a1Var = e(a1Var, j12, xVar.a, 2);
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
                a1Var = e(a1Var, j12, xVar.a, i12);
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
            c3.i0 i0Var = (c3.i0) cVar.c;
            String str = e2.m0.a;
            byte[] bArr2 = i0Var.b;
            byte[] bArr3 = dVar.a;
            int i14 = i0Var.a;
            int i15 = i0Var.c;
            int i16 = i0Var.d;
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
            return d(a1Var, cVar.a, hVar.c, cVar.b);
        }
        xVar.K(4);
        u2.a1 e7 = e(a1Var, cVar.a, xVar.a, 4);
        int E = xVar.E();
        cVar.a += 4;
        cVar.b -= 4;
        hVar.b(E);
        u2.a1 d = d(e7, cVar.a, hVar.c, E);
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

    public void a(u2.a1 a1Var) {
        if (((y2.a) a1Var.c) == null) {
            return;
        }
        androidx.biometric.e eVar = (androidx.biometric.e) this.c;
        synchronized (eVar) {
            ((i2.j) eVar.d).c.b(a1Var);
            u2.a1 a1Var2 = a1Var;
            while (a1Var2 != null) {
                y2.a aVar = (y2.a) a1Var2.c;
                aVar.getClass();
                eVar.t(aVar);
                a1Var2 = (u2.a1) a1Var2.d;
                if (a1Var2 == null || ((y2.a) a1Var2.c) == null) {
                    a1Var2 = null;
                }
            }
        }
        a1Var.c = null;
        a1Var.d = null;
    }

    public void b(long j10) {
        u2.a1 a1Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            a1Var = (u2.a1) this.e;
            if (j10 < a1Var.b) {
                break;
            }
            androidx.biometric.e eVar = (androidx.biometric.e) this.c;
            y2.a aVar = (y2.a) a1Var.c;
            synchronized (eVar) {
                ((i2.j) eVar.d).c.c(aVar);
                eVar.t(aVar);
            }
            u2.a1 a1Var2 = (u2.a1) this.e;
            a1Var2.c = null;
            u2.a1 a1Var3 = (u2.a1) a1Var2.d;
            a1Var2.d = null;
            this.e = a1Var3;
        }
        if (((u2.a1) this.f).a < a1Var.a) {
            this.f = a1Var;
        }
    }

    public int c(int i10) {
        y2.a a2;
        u2.a1 a1Var = (u2.a1) this.g;
        if (((y2.a) a1Var.c) == null) {
            androidx.biometric.e eVar = (androidx.biometric.e) this.c;
            synchronized (eVar) {
                a2 = ((i2.j) eVar.d).c.a();
                ((HashMap) eVar.b).put(a2, (j2.k) eVar.c);
                i2.i iVar = (i2.i) ((i2.j) eVar.d).p.get((j2.k) eVar.c);
                if (iVar != null) {
                    iVar.a();
                }
            }
            u2.a1 a1Var2 = new u2.a1(((u2.a1) this.g).b, this.a);
            a1Var.c = a2;
            a1Var.d = a1Var2;
        }
        return Math.min(i10, (int) (((u2.a1) this.g).b - this.b));
    }

    public fp0(rc0 rc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = MediaDataController.MAX_LINKS_COUNT;
        this.c = rc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
