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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ho0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public ho0(y2.d dVar) {
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

    public static u2.x0 f(u2.x0 x0Var, h2.g gVar, j5.b bVar, e2.v vVar) {
        if (gVar.c(TLObject.FLAG_30)) {
            long j3 = bVar.a;
            int i10 = 1;
            vVar.G(1);
            u2.x0 e7 = e(x0Var, j3, vVar.a, 1);
            long j10 = j3 + 1;
            byte b10 = vVar.a[0];
            boolean z10 = (b10 & 128) != 0;
            int i11 = b10 & Byte.MAX_VALUE;
            h2.c cVar = gVar.d;
            byte[] bArr = cVar.a;
            if (bArr == null) {
                cVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            x0Var = e(e7, j10, cVar.a, i11);
            long j11 = j10 + i11;
            if (z10) {
                vVar.G(2);
                x0Var = e(x0Var, j11, vVar.a, 2);
                j11 += 2;
                i10 = vVar.D();
            }
            int[] iArr = cVar.d;
            if (iArr == null || iArr.length < i10) {
                iArr = new int[i10];
            }
            int[] iArr2 = cVar.e;
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
                iArr2[0] = bVar.b - ((int) (j11 - bVar.a));
            }
            c3.g0 g0Var = (c3.g0) bVar.c;
            String str = e2.d0.a;
            byte[] bArr2 = g0Var.b;
            byte[] bArr3 = cVar.a;
            int i14 = g0Var.a;
            int i15 = g0Var.c;
            int i16 = g0Var.d;
            cVar.f = i10;
            cVar.d = iArr;
            cVar.e = iArr2;
            cVar.b = bArr2;
            cVar.a = bArr3;
            cVar.c = i14;
            cVar.g = i15;
            cVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = cVar.i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (Build.VERSION.SDK_INT >= 24) {
                h2.b bVar2 = cVar.j;
                bVar2.getClass();
                h2.b.a(bVar2, i15, i16);
            }
            long j12 = bVar.a;
            int i17 = (int) (j11 - j12);
            bVar.a = j12 + i17;
            bVar.b -= i17;
        }
        if (!gVar.c(TLObject.FLAG_28)) {
            gVar.l(bVar.b);
            return d(x0Var, bVar.a, gVar.e, bVar.b);
        }
        vVar.G(4);
        u2.x0 e10 = e(x0Var, bVar.a, vVar.a, 4);
        int B = vVar.B();
        bVar.a += 4;
        bVar.b -= 4;
        gVar.l(B);
        u2.x0 d = d(e10, bVar.a, gVar.e, B);
        bVar.a += B;
        int i18 = bVar.b - B;
        bVar.b = i18;
        ByteBuffer byteBuffer = gVar.n;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            gVar.n = ByteBuffer.allocate(i18);
        } else {
            gVar.n.clear();
        }
        return d(d, bVar.a, gVar.n, bVar.b);
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

    public ho0(cc0 cc0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = MediaDataController.MAX_LINKS_COUNT;
        this.c = cc0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
