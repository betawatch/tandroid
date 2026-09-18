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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class vo0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public vo0(y2.d dVar) {
        this.c = dVar;
        int i10 = dVar.b;
        this.a = i10;
        this.d = new e2.v(32);
        u2.x0 x0Var = new u2.x0(0L, i10);
        this.e = x0Var;
        this.f = x0Var;
        this.g = x0Var;
    }

    public static u2.x0 d(u2.x0 x0Var, long j3, ByteBuffer byteBuffer, int i10) {
        while (j3 >= x0Var.b) {
            x0Var = (u2.x0) x0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (x0Var.b - j3));
            y2.a aVar = (y2.a) x0Var.c;
            byteBuffer.put(aVar.a, ((int) (j3 - x0Var.a)) + aVar.b, min);
            i10 -= min;
            j3 += min;
            if (j3 == x0Var.b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 e(u2.x0 x0Var, long j3, byte[] bArr, int i10) {
        while (j3 >= x0Var.b) {
            x0Var = (u2.x0) x0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (x0Var.b - j3));
            y2.a aVar = (y2.a) x0Var.c;
            System.arraycopy(aVar.a, ((int) (j3 - x0Var.a)) + aVar.b, bArr, i10 - i11, min);
            i11 -= min;
            j3 += min;
            if (j3 == x0Var.b) {
                x0Var = (u2.x0) x0Var.d;
            }
        }
        return x0Var;
    }

    public static u2.x0 f(u2.x0 x0Var, h2.h hVar, ii.b0 b0Var, e2.v vVar) {
        if (hVar.getFlag(TLObject.FLAG_30)) {
            long j3 = b0Var.b;
            int i10 = 1;
            vVar.G(1);
            u2.x0 e = e(x0Var, j3, vVar.a, 1);
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
            x0Var = e(e, j10, dVar.a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                x0Var = e(x0Var, j11, vVar.a, 2);
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
                x0Var = e(x0Var, j11, vVar.a, i12);
                j11 += i12;
                vVar.J(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = vVar.D();
                    iArr2[i13] = vVar.B();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = b0Var.a - ((int) (j11 - b0Var.b));
            }
            c3.g0 g0Var = (c3.g0) b0Var.c;
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
            long j12 = b0Var.b;
            int i17 = (int) (j11 - j12);
            b0Var.b = j12 + i17;
            b0Var.a -= i17;
        }
        if (!hVar.hasSupplementalData()) {
            hVar.b(b0Var.a);
            return d(x0Var, b0Var.b, hVar.c, b0Var.a);
        }
        vVar.G(4);
        u2.x0 e7 = e(x0Var, b0Var.b, vVar.a, 4);
        int B = vVar.B();
        b0Var.b += 4;
        b0Var.a -= 4;
        hVar.b(B);
        u2.x0 d = d(e7, b0Var.b, hVar.c, B);
        b0Var.b += B;
        int i18 = b0Var.a - B;
        b0Var.a = i18;
        ByteBuffer byteBuffer = hVar.f;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            hVar.f = ByteBuffer.allocate(i18);
        } else {
            hVar.f.clear();
        }
        return d(d, b0Var.b, hVar.f, b0Var.a);
    }

    public void a(u2.x0 x0Var) {
        if (((y2.a) x0Var.c) == null) {
            return;
        }
        y2.d dVar = (y2.d) this.c;
        synchronized (dVar) {
            u2.x0 x0Var2 = x0Var;
            while (x0Var2 != null) {
                try {
                    y2.a[] aVarArr = dVar.f;
                    int i10 = dVar.e;
                    dVar.e = i10 + 1;
                    y2.a aVar = (y2.a) x0Var2.c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    dVar.d--;
                    x0Var2 = (u2.x0) x0Var2.d;
                    if (x0Var2 == null || ((y2.a) x0Var2.c) == null) {
                        x0Var2 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            dVar.notifyAll();
        }
        x0Var.c = null;
        x0Var.d = null;
    }

    public void b(long j3) {
        u2.x0 x0Var;
        if (j3 == -1) {
            return;
        }
        while (true) {
            x0Var = (u2.x0) this.e;
            if (j3 < x0Var.b) {
                break;
            }
            y2.d dVar = (y2.d) this.c;
            y2.a aVar = (y2.a) x0Var.c;
            synchronized (dVar) {
                y2.a[] aVarArr = dVar.f;
                int i10 = dVar.e;
                dVar.e = i10 + 1;
                aVarArr[i10] = aVar;
                dVar.d--;
                dVar.notifyAll();
            }
            u2.x0 x0Var2 = (u2.x0) this.e;
            x0Var2.c = null;
            u2.x0 x0Var3 = (u2.x0) x0Var2.d;
            x0Var2.d = null;
            this.e = x0Var3;
        }
        if (((u2.x0) this.f).a < x0Var.a) {
            this.f = x0Var;
        }
    }

    public int c(int i10) {
        y2.a aVar;
        u2.x0 x0Var = (u2.x0) this.g;
        if (((y2.a) x0Var.c) == null) {
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
            u2.x0 x0Var2 = new u2.x0(((u2.x0) this.g).b, this.a);
            x0Var.c = aVar;
            x0Var.d = x0Var2;
        }
        return Math.min(i10, (int) (((u2.x0) this.g).b - this.b));
    }

    public vo0(kc0 kc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = MediaDataController.MAX_LINKS_COUNT;
        this.c = kc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
