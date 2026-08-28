package j4;

import android.graphics.Paint;
import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ib0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w0 {
    public final int a;
    public long b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;

    public w0(com.google.android.exoplayer2.upstream.r rVar) {
        this.c = rVar;
        int i9 = rVar.b;
        this.a = i9;
        this.d = new d5.y(32);
        v0 v0Var = new v0(0L, i9);
        this.e = v0Var;
        this.f = v0Var;
        this.g = v0Var;
    }

    public static v0 d(v0 v0Var, long j10, ByteBuffer byteBuffer, int i9) {
        while (j10 >= v0Var.b) {
            v0Var = (v0) v0Var.d;
        }
        while (i9 > 0) {
            int min = Math.min(i9, (int) (v0Var.b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.c;
            byteBuffer.put(aVar.a, ((int) (j10 - v0Var.a)) + aVar.b, min);
            i9 -= min;
            j10 += min;
            if (j10 == v0Var.b) {
                v0Var = (v0) v0Var.d;
            }
        }
        return v0Var;
    }

    public static v0 e(v0 v0Var, long j10, byte[] bArr, int i9) {
        while (j10 >= v0Var.b) {
            v0Var = (v0) v0Var.d;
        }
        int i10 = i9;
        while (i10 > 0) {
            int min = Math.min(i10, (int) (v0Var.b - j10));
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.c;
            System.arraycopy(aVar.a, ((int) (j10 - v0Var.a)) + aVar.b, bArr, i9 - i10, min);
            i10 -= min;
            j10 += min;
            if (j10 == v0Var.b) {
                v0Var = (v0) v0Var.d;
            }
        }
        return v0Var;
    }

    public static v0 f(v0 v0Var, k3.i iVar, x0 x0Var, d5.y yVar) {
        if (iVar.getFlag(TLObject.FLAG_30)) {
            long j10 = x0Var.a;
            int i9 = 1;
            yVar.z(1);
            v0 e10 = e(v0Var, j10, yVar.a, 1);
            long j11 = j10 + 1;
            byte b10 = yVar.a[0];
            boolean z10 = (b10 & 128) != 0;
            int i10 = b10 & Byte.MAX_VALUE;
            k3.d dVar = iVar.a;
            byte[] bArr = dVar.a;
            if (bArr == null) {
                dVar.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            v0Var = e(e10, j11, dVar.a, i10);
            long j12 = j11 + i10;
            if (z10) {
                yVar.z(2);
                v0Var = e(v0Var, j12, yVar.a, 2);
                j12 += 2;
                i9 = yVar.w();
            }
            int[] iArr = dVar.d;
            if (iArr == null || iArr.length < i9) {
                iArr = new int[i9];
            }
            int[] iArr2 = dVar.e;
            if (iArr2 == null || iArr2.length < i9) {
                iArr2 = new int[i9];
            }
            if (z10) {
                int i11 = i9 * 6;
                yVar.z(i11);
                v0Var = e(v0Var, j12, yVar.a, i11);
                j12 += i11;
                yVar.C(0);
                for (int i12 = 0; i12 < i9; i12++) {
                    iArr[i12] = yVar.w();
                    iArr2[i12] = yVar.u();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = x0Var.b - ((int) (j12 - x0Var.a));
            }
            m3.v vVar = (m3.v) x0Var.c;
            int i13 = d5.f0.a;
            byte[] bArr2 = vVar.b;
            byte[] bArr3 = dVar.a;
            int i14 = vVar.a;
            int i15 = vVar.c;
            int i16 = vVar.d;
            dVar.f = i9;
            dVar.d = iArr;
            dVar.e = iArr2;
            dVar.b = bArr2;
            dVar.a = bArr3;
            dVar.c = i14;
            dVar.g = i15;
            dVar.h = i16;
            MediaCodec.CryptoInfo cryptoInfo = dVar.i;
            cryptoInfo.numSubSamples = i9;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i14;
            if (d5.f0.a >= 24) {
                k3.c cVar = dVar.j;
                cVar.getClass();
                k3.c.a(cVar, i15, i16);
            }
            long j13 = x0Var.a;
            int i17 = (int) (j12 - j13);
            x0Var.a = j13 + i17;
            x0Var.b -= i17;
        }
        if (!iVar.hasSupplementalData()) {
            iVar.c(x0Var.b);
            return d(v0Var, x0Var.a, iVar.b, x0Var.b);
        }
        yVar.z(4);
        v0 e11 = e(v0Var, x0Var.a, yVar.a, 4);
        int u10 = yVar.u();
        x0Var.a += 4;
        x0Var.b -= 4;
        iVar.c(u10);
        v0 d = d(e11, x0Var.a, iVar.b, u10);
        x0Var.a += u10;
        int i18 = x0Var.b - u10;
        x0Var.b = i18;
        ByteBuffer byteBuffer = iVar.e;
        if (byteBuffer == null || byteBuffer.capacity() < i18) {
            iVar.e = ByteBuffer.allocate(i18);
        } else {
            iVar.e.clear();
        }
        return d(d, x0Var.a, iVar.e, x0Var.b);
    }

    public void a(v0 v0Var) {
        if (((com.google.android.exoplayer2.upstream.a) v0Var.c) == null) {
            return;
        }
        com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.c;
        synchronized (rVar) {
            v0 v0Var2 = v0Var;
            while (v0Var2 != null) {
                try {
                    com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f;
                    int i9 = rVar.e;
                    rVar.e = i9 + 1;
                    com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var2.c;
                    aVar.getClass();
                    aVarArr[i9] = aVar;
                    rVar.d--;
                    v0Var2 = (v0) v0Var2.d;
                    if (v0Var2 == null || ((com.google.android.exoplayer2.upstream.a) v0Var2.c) == null) {
                        v0Var2 = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            rVar.notifyAll();
        }
        v0Var.c = null;
        v0Var.d = null;
    }

    public void b(long j10) {
        v0 v0Var;
        if (j10 == -1) {
            return;
        }
        while (true) {
            v0Var = (v0) this.e;
            if (j10 < v0Var.b) {
                break;
            }
            com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.c;
            com.google.android.exoplayer2.upstream.a aVar = (com.google.android.exoplayer2.upstream.a) v0Var.c;
            synchronized (rVar) {
                com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f;
                int i9 = rVar.e;
                rVar.e = i9 + 1;
                aVarArr[i9] = aVar;
                rVar.d--;
                rVar.notifyAll();
            }
            v0 v0Var2 = (v0) this.e;
            v0Var2.c = null;
            v0 v0Var3 = (v0) v0Var2.d;
            v0Var2.d = null;
            this.e = v0Var3;
        }
        if (((v0) this.f).a < v0Var.a) {
            this.f = v0Var;
        }
    }

    public int c(int i9) {
        com.google.android.exoplayer2.upstream.a aVar;
        v0 v0Var = (v0) this.g;
        if (((com.google.android.exoplayer2.upstream.a) v0Var.c) == null) {
            com.google.android.exoplayer2.upstream.r rVar = (com.google.android.exoplayer2.upstream.r) this.c;
            synchronized (rVar) {
                try {
                    int i10 = rVar.d + 1;
                    rVar.d = i10;
                    int i11 = rVar.e;
                    if (i11 > 0) {
                        com.google.android.exoplayer2.upstream.a[] aVarArr = rVar.f;
                        int i12 = i11 - 1;
                        rVar.e = i12;
                        aVar = aVarArr[i12];
                        aVar.getClass();
                        rVar.f[rVar.e] = null;
                    } else {
                        com.google.android.exoplayer2.upstream.a aVar2 = new com.google.android.exoplayer2.upstream.a(new byte[rVar.b], 0);
                        com.google.android.exoplayer2.upstream.a[] aVarArr2 = rVar.f;
                        if (i10 > aVarArr2.length) {
                            rVar.f = (com.google.android.exoplayer2.upstream.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                        }
                        aVar = aVar2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            v0 v0Var2 = new v0(((v0) this.g).b, this.a);
            v0Var.c = aVar;
            v0Var.d = v0Var2;
        }
        return Math.min(i9, (int) (((v0) this.g).b - this.b));
    }

    public w0(ib0 ib0Var) {
        this.d = new ArrayList(50);
        this.e = new ArrayList(50);
        Paint paint = new Paint(1);
        this.f = paint;
        this.a = MediaDataController.MAX_LINKS_COUNT;
        this.c = ib0Var;
        paint.setStrokeWidth(AndroidUtilities.dp(1.33f));
    }
}
