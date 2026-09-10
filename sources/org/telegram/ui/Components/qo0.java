package org.telegram.ui.Components;

import android.graphics.Paint;
import android.media.MediaCodec;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class qo0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public qo0(y2.d dVar) {
        this.c = dVar;
        int i10 = dVar.b;
        this.a = i10;
        this.d = new e2.v(32);
        u2.z0 z0Var = new u2.z0(0L, i10);
        this.e = z0Var;
        this.f = z0Var;
        this.g = z0Var;
    }

    public static u2.z0 d(u2.z0 z0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= z0Var.b) {
            z0Var = (u2.z0) z0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (z0Var.b - j3));
            y2.a aVar = (y2.a) z0Var.c;
            byteBuffer.put(aVar.a, ((int) (j3 - z0Var.a)) + aVar.b, min);
            i10 -= min;
            j3 += min;
            if (j3 == z0Var.b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 e(u2.z0 z0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= z0Var.b) {
            z0Var = (u2.z0) z0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (z0Var.b - j3));
            y2.a aVar = (y2.a) z0Var.c;
            System.arraycopy(aVar.a, ((int) (j3 - z0Var.a)) + aVar.b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == z0Var.b) {
                z0Var = (u2.z0) z0Var.d;
            }
        }
        return z0Var;
    }

    public static u2.z0 f(u2.z0 z0Var, h2.h hVar, hi.c0 c0Var, e2.v vVar) {
        if (hVar.getFlag(TLObject.FLAG_30)) {
            long j3 = c0Var.b;
            int i10 = 1;
            vVar.G(1);
            u2.z0 e = e(z0Var, j3, vVar.a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.a[0];
            boolean z10 = (b10 & 128) != 0;
            int i11 = b10 & Byte.MAX_VALUE;
            h2.d dVar = hVar.b;
            byte[] bArr = dVar.a;
            if (bArr == null) {
                dVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            z0Var = e(e, j10, dVar.a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                z0Var = e(z0Var, j11, vVar.a, 2);
                j11 += 2;
                i10 = vVar.D();
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
                vVar.G(i12);
                z0Var = e(z0Var, j11, vVar.a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = c0Var.a - ((int) (j11 - c0Var.b));
            }
            c3.g0 g0Var = (c3.g0) c0Var.c;
            String str = e2.d0.a;
            byte[] bArr2 = g0Var.b;
            byte[] bArr3 = dVar.a;
            int i14 = g0Var.a;
            int i15 = g0Var.c;
            int i16 = g0Var.d;
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
            long j12 = c0Var.b;
            int i17 = (int) (j11 - j12);
            c0Var.b = j12 + i17;
            c0Var.a -= i17;
        }
        if (!hVar.hasSupplementalData()) {
            hVar.b(c0Var.a);
            return d(z0Var, c0Var.b, hVar.c, c0Var.a);
        }
        vVar.G(4);
        u2.z0 e7 = e(z0Var, c0Var.b, vVar.a, 4);
        int B = vVar.B();
        c0Var.b += 4;
        c0Var.a -= 4;
        hVar.b(B);
        u2.z0 d = d(e7, c0Var.b, hVar.c, B);
        c0Var.b += B;
        int i18 = c0Var.a - B;
        c0Var.a = i18;
        ByteBuffer byteBuffer = hVar.f;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            hVar.f = ByteBuffer.allocate(i18);
        } else {
            hVar.f.clear();
        }
        return d(d, c0Var.b, hVar.f, c0Var.a);
    }

    public void a(u2.z0 z0Var) {
        if (((y2.a) z0Var.c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.c;
        synchronized (dVar) {
            u2.z0 z0Var2 = z0Var;
            while (z0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    y2.a aVar = (y2.a) z0Var2.c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    z0Var2 = (u2.z0) z0Var2.d;
                    if (z0Var2 == null || ((y2.a) z0Var2.c) == null) {
                        z0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        z0Var.c = null;
        z0Var.d = null;
    }

    public void b(long j3) {
        u2.z0 z0Var;
        if (j3 == -1) {
            return;
        }
        while (true) {
            z0Var = (u2.z0) this.e;
            if (j3 < z0Var.b) {
                break;
            }
            y2.d dVar = (y2.d) this.c;
            y2.a aVar = (y2.a) z0Var.c;
            synchronized (dVar) {
                y2.a[] aVarArr = dVar.f;
                int i10 = dVar.e;
                dVar.e = i10 + 1;
                aVarArr[i10] = aVar;
                dVar.d--;
                dVar.notifyAll();
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
        y2.a aVar;
        u2.z0 z0Var = (u2.z0) this.g;
        if (((y2.a) z0Var.c) == null) {
            y2.d dVar = (y2.d) this.c;
            synchronized (dVar) {
                try {
                    int i11 = dVar.d + 1;
                    dVar.d = i11;
                    int i12 = dVar.e;
                    if (i12 > 0) {
                        y2.a[] aVarArr = dVar.f;
                        int i13 = i12 - 1;
                        dVar.e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        dVar.f[dVar.e] = null;
                    } else {
                        y2.a aVar2 = new y2.a(new byte[dVar.b], 0);
                        y2.a[] aVarArr2 = dVar.f;
                        if (i11 > aVarArr2.length) {
                            dVar.f = (y2.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            u2.z0 z0Var2 = new u2.z0(((u2.z0) this.g).b, this.a);
            z0Var.c = aVar;
            z0Var.d = z0Var2;
        }
        return Math.min(i10, (int) (((u2.z0) this.g).b - this.b));
    }

    public qo0(kc0 kc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = MediaDataController.MAX_LINKS_COUNT;
        this.c = kc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
