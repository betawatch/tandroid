package o2;

import b2.v;
import b2.v0;
import b2.w;
import c3.k0;
import c3.l0;
import e2.x;
import i2.o1;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final class o implements l0 {
    public static final w f;
    public static final w g;
    public final l0 a;
    public final w b;
    public w c;
    public byte[] d;
    public int e;

    static {
        v vVar = new v();
        vVar.r = v0.n("application/id3");
        f = new w(vVar);
        v vVar2 = new v();
        vVar2.r = v0.n("application/x-emsg");
        g = new w(vVar2);
    }

    public o(l0 l0Var, int i10) {
        this.a = l0Var;
        if (i10 == 1) {
            this.b = f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(o1.k(i10, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // c3.l0
    public final int a(b2.o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override // c3.l0
    public final void b(w wVar) {
        this.c = wVar;
        this.a.b(this.b);
    }

    @Override // c3.l0
    public final void c(long j10, int i10, int i11, int i12, k0 k0Var) {
        this.c.getClass();
        int i13 = this.e - i12;
        x xVar = new x(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.e = i12;
        String str = this.c.s;
        w wVar = this.b;
        String str2 = wVar.s;
        String str3 = wVar.s;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.s)) {
                e2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.s);
                return;
            }
            n3.a c10 = m3.b.c(xVar);
            w a2 = c10.a();
            if (a2 == null || !Objects.equals(str3, a2.s)) {
                e2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c10.a());
                return;
            }
            byte[] c11 = c10.c();
            c11.getClass();
            xVar = new x(c11);
        }
        int a10 = xVar.a();
        l0 l0Var = this.a;
        l0Var.d(a10, xVar);
        l0Var.c(j10, i10, a10, 0, k0Var);
    }

    @Override // c3.l0
    public final /* synthetic */ void d(int i10, x xVar) {
        a1.g.a(this, xVar, i10);
    }

    @Override // c3.l0
    public final int f(b2.o oVar, int i10, boolean z10) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = oVar.read(this.d, this.e, i10);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c3.l0
    public final void g(x xVar, int i10, int i11) {
        int i12 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i12) {
            this.d = Arrays.copyOf(bArr, (i12 / 2) + i12);
        }
        xVar.k(this.e, i10, this.d);
        this.e += i10;
    }

    @Override // c3.l0
    public final /* synthetic */ void e(long j10) {
    }
}
