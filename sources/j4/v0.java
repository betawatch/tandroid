package j4;

import android.graphics.Paint;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mb0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class v0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public v0(com.google.android.exoplayer2.upstream.r rVar) {
        this.c = rVar;
        int i10 = rVar.b;
        this.a = i10;
        this.d = new d5.z(32);
        u0 u0Var = new u0(0L, i10);
        this.e = u0Var;
        this.f = u0Var;
        this.g = u0Var;
    }

    public static u0 d(u0 u0Var, long j10, ByteBuffer byteBuffer, int i10) {
        while (j10 >= u0Var.b) {
            u0Var = (u0) u0Var.d;
        }
        while (i10 > 0) {
            int min = Math.min(i10, (int) (u0Var.b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var.c;
            byteBuffer.put(aVar.a, ((int) (j10 - u0Var.a)) + aVar.b, min);
            i10 -= min;
            j10 += min;
            if (j10 == u0Var.b) {
                u0Var = (u0) u0Var.d;
            }
        }
        return u0Var;
    }

    public static u0 e(u0 u0Var, long j10, byte[] bArr, int i10) {
        while (j10 >= u0Var.b) {
            u0Var = (u0) u0Var.d;
        }
        int i11 = i10;
        while (i11 > 0) {
            int min = Math.min(i11, (int) (u0Var.b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var.c;
            System.arraycopy(aVar.a, ((int) (j10 - u0Var.a)) + aVar.b, bArr, i10 - i11, min);
            i11 -= min;
            j10 += min;
            if (j10 == u0Var.b) {
                u0Var = (u0) u0Var.d;
            }
        }
        return u0Var;
    }

    public static u0 f(u0 u0Var, k3.i iVar, x0 x0Var, d5.z zVar) {
        if (iVar.getFlag(TLObject.FLAG_30)) {
            long j10 = x0Var.a;
            int i10 = 1;
            zVar.z(1);
            u0 e9 = e(u0Var, j10, zVar.a, 1);
            long j11 = j10 + 1;
            byte b10 = zVar.a[0];
            boolean z10 = (b10 & 128) != 0;
            int i11 = b10 & Byte.MAX_VALUE;
            k3.d dVar = iVar.a;
            byte[] bArr = dVar.a;
            if (bArr == null) {
                dVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            u0Var = e(e9, j11, dVar.a, i11);
            long j12 = j11 + i11;
            if (z10) {
                zVar.z(2);
                u0Var = e(u0Var, j12, zVar.a, 2);
                j12 += 2;
                i10 = zVar.w();
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
                zVar.z(i12);
                u0Var = e(u0Var, j12, zVar.a, i12);
                j12 += i12;
                zVar.C(0);
                for (int i13 = 0; i13 < i10; i13++) {
                    iArr[i13] = zVar.w();
                    iArr2[i13] = zVar.u();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = x0Var.b - ((int) (j12 - x0Var.a));
            }
            m3.v vVar = (m3.v) x0Var.c;
            int i14 = d5.g0.a;
            byte[] bArr2 = vVar.b;
            byte[] bArr3 = dVar.a;
            int i15 = vVar.a;
            int i16 = vVar.c;
            int i17 = vVar.d;
            dVar.f = i10;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.b = bArr2;
            dVar.a = bArr3;
            dVar.c = i15;
            dVar.g = i16;
            dVar.h = i17;
            MediaCodec.CryptoInfo cryptoInfo = dVar.i;
            cryptoInfo.numSubSamples = i10;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i15;
            if (d5.g0.a >= 24) {
                k3.c cVar = dVar.j;
                cVar.getClass();
                k3.c.a(cVar, i16, i17);
            }
            long j13 = x0Var.a;
            int i18 = (int) (j12 - j13);
            x0Var.a = j13 + i18;
            x0Var.b -= i18;
        }
        if (!iVar.hasSupplementalData()) {
            iVar.b(x0Var.b);
            return d(u0Var, x0Var.a, iVar.b, x0Var.b);
        }
        zVar.z(4);
        u0 e10 = e(u0Var, x0Var.a, zVar.a, 4);
        int u10 = zVar.u();
        x0Var.a += 4;
        x0Var.b -= 4;
        iVar.b(u10);
        u0 d = d(e10, x0Var.a, iVar.b, u10);
        x0Var.a += u10;
        int i19 = x0Var.b - u10;
        x0Var.b = i19;
        ByteBuffer byteBuffer = iVar.e;
        if (byteBuffer == null || byteBuffer.capacity() < i19) {
            iVar.e = ByteBuffer.allocate(i19);
        } else {
            iVar.e.clear();
        }
        return d(d, x0Var.a, iVar.e, x0Var.b);
    }

    public void a(u0 u0Var) {
        if (((com.google.android.exoplayer2.upstream.a) u0Var.c) == null) {
            return;
        }
        com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.c;
        synchronized (rVar) {
            u0 u0Var2 = u0Var;
            while (u0Var2 != null) {
                try {
                    com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f;
                    int i10 = rVar.e;
                    rVar.e = i10 + 1;
                    com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var2.c;
                    aVar.getClass();
                    aVarArr[i10] = aVar;
                    rVar.d--;
                    u0Var2 = (u0) u0Var2.d;
                    if (u0Var2 == null || ((com.google.android.exoplayer2.upstream.a) u0Var2.c) == null) {
                        u0Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.notifyAll();
        }
        u0Var.c = null;
        u0Var.d = null;
    }

    public void b(long j10) {
        u0 u0Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            u0Var = (u0) this.e;
            if (j10 < u0Var.b) {
                break;
            }
            com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.c;
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) u0Var.c;
            synchronized (rVar) {
                com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f;
                int i10 = rVar.e;
                rVar.e = i10 + 1;
                aVarArr[i10] = aVar;
                rVar.d--;
                rVar.notifyAll();
            }
            u0 u0Var2 = (u0) this.e;
            u0Var2.c = null;
            u0 u0Var3 = (u0) u0Var2.d;
            u0Var2.d = null;
            this.e = u0Var3;
        }
        if (((u0) this.f).a < u0Var.a) {
            this.f = u0Var;
        }
    }

    public int c(int i10) {
        com.google.android.exoplayer2.upstream.a aVar;
        u0 u0Var = (u0) this.g;
        if (((com.google.android.exoplayer2.upstream.a) u0Var.c) == null) {
            com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.c;
            synchronized (rVar) {
                try {
                    int i11 = rVar.d + 1;
                    rVar.d = i11;
                    int i12 = rVar.e;
                    if (i12 > 0) {
                        com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f;
                        int i13 = i12 - 1;
                        rVar.e = i13;
                        aVar = aVarArr[i13];
                        aVar.getClass();
                        rVar.f[rVar.e] = null;
                    } else {
                        com.google.android.exoplayer2.upstream.a aVar2 = new com.google.android.exoplayer2.upstream.a(new byte[rVar.b], 0);
                        com.google.android.exoplayer2.upstream.a[] aVarArr2 = rVar.f;
                        if (i11 > aVarArr2.length) {
                            rVar.f = (com.google.android.exoplayer2.upstream.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            u0 u0Var2 = new u0(((u0) this.g).b, this.a);
            u0Var.c = aVar;
            u0Var.d = u0Var2;
        }
        return Math.min(i10, (int) (((u0) this.g).b - this.b));
    }

    public v0(mb0 mb0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = MediaDataController.MAX_LINKS_COUNT;
        this.c = mb0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
