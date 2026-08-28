package o4;

import d5.f0;
import d5.y;
import h3.s0;
import h3.t0;
import j3.r0;
import java.io.EOFException;
import java.util.Arrays;
import m3.w;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    public p(w wVar, int i9) {
        this.a = wVar;
        if (i9 == 1) {
            this.b = f;
        } else {
            if (i9 != 3) {
                throw new IllegalArgumentException(r0.l(i9, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // m3.w
    public final /* synthetic */ void a(int i9, y yVar) {
        r0.a(this, yVar, i9);
    }

    @Override // m3.w
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        int i10 = this.e + i9;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        int read = jVar.read(this.d, this.e, i9);
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
    public final void d(int i9, y yVar) {
        int i10 = this.e + i9;
        byte[] bArr = this.d;
        if (bArr.length < i10) {
            this.d = Arrays.copyOf(bArr, (i10 / 2) + i10);
        }
        yVar.c(this.e, i9, this.d);
        this.e += i9;
    }

    @Override // m3.w
    public final void e(long j10, int i9, int i10, int i11, m3.v vVar) {
        this.c.getClass();
        int i12 = this.e - i11;
        y yVar = new y(Arrays.copyOfRange(this.d, i12 - i10, i12));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i12, bArr, 0, i11);
        this.e = i11;
        String str = this.c.B;
        t0 t0Var = this.b;
        String str2 = t0Var.B;
        String str3 = t0Var.B;
        if (!f0.a(str, str2)) {
            if (!"application/x-emsg".equals(this.c.B)) {
                d5.a.K("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.B);
                return;
            }
            b4.a c10 = a4.b.c(yVar);
            t0 wrappedMetadataFormat = c10.getWrappedMetadataFormat();
            if (wrappedMetadataFormat == null || !f0.a(str3, wrappedMetadataFormat.B)) {
                d5.a.K("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c10.getWrappedMetadataFormat());
                return;
            }
            byte[] wrappedMetadataBytes = c10.getWrappedMetadataBytes();
            wrappedMetadataBytes.getClass();
            yVar = new y(wrappedMetadataBytes);
        }
        int a2 = yVar.a();
        w wVar = this.a;
        wVar.a(a2, yVar);
        wVar.e(j10, i9, a2, i11, vVar);
    }
}
