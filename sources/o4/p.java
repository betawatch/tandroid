package o4;

import d5.g0;
import d5.z;
import h3.s0;
import h3.t0;
import java.io.EOFException;
import java.util.Arrays;
import m3.w;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class p implements w {
    public static final t0 f;
    public static final t0 g;
    public final w a;
    public final t0 b;
    public t0 c;
    public byte[] d;
    public int e;

    static {
        s0 s0Var = new s0();
        s0Var.o = "application/id3";
        f = new t0(s0Var);
        s0 s0Var2 = new s0();
        s0Var2.o = "application/x-emsg";
        g = new t0(s0Var2);
    }

    public p(w wVar, int i10) {
        this.a = wVar;
        if (i10 == 1) {
            this.b = f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(i0.a.k(i10, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // m3.w
    public final /* synthetic */ void a(int i10, z zVar) {
        i0.a.a(this, zVar, i10);
    }

    @Override // m3.w
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = jVar.read(this.d, this.e, i10);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // m3.w
    public final void c(t0 t0Var) {
        this.c = t0Var;
        this.a.c(this.b);
    }

    @Override // m3.w
    public final void d(int i10, z zVar) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        zVar.c(this.e, i10, this.d);
        this.e += i10;
    }

    @Override // m3.w
    public final void e(long j10, int i10, int i11, int i12, m3.v vVar) {
        this.c.getClass();
        int i13 = this.e - i12;
        z zVar = new z(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.e = i12;
        String str = this.c.B;
        t0 t0Var = this.b;
        String str2 = t0Var.B;
        String str3 = t0Var.B;
        if (!g0.a(str, str2)) {
            if (!"application/x-emsg".equals(this.c.B)) {
                d5.a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.B);
                return;
            }
            b4.a c10 = a4.b.c(zVar);
            t0 wrappedMetadataFormat = c10.getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !g0.a(str3, wrappedMetadataFormat.B)) {
                d5.a.K("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c10.getWrappedMetadataFormat());
                return;
            }
            byte[] wrappedMetadataBytes = c10.getWrappedMetadataBytes();
            wrappedMetadataBytes.getClass();
            zVar = new z(wrappedMetadataBytes);
        }
        int a2 = zVar.a();
        w wVar = this.a;
        wVar.a(a2, zVar);
        wVar.e(j10, i10, a2, i12, vVar);
    }
}
