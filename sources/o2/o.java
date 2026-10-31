package o2;

import b2.v0;
import b2.w;
import b2.x;
import c3.i0;
import c3.j0;
import c3.k0;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class o implements k0 {
    public static final x f;
    public static final x g;
    public final k0 a;
    public final x b;
    public x c;
    public byte[] d;
    public int e;

    static {
        w wVar = new w();
        wVar.r = v0.n("application/id3");
        f = new x(wVar);
        w wVar2 = new w();
        wVar2.r = v0.n("application/x-emsg");
        g = new x(wVar2);
    }

    public o(k0 k0Var, int i10) {
        this.a = k0Var;
        if (i10 == 1) {
            this.b = f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(i0.a.i(i10, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // c3.k0
    public final int a(b2.p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override // c3.k0
    public final void b(x xVar) {
        this.c = xVar;
        this.a.b(this.b);
    }

    @Override // c3.k0
    public final void c(long j10, int i10, int i11, int i12, j0 j0Var) {
        this.c.getClass();
        int i13 = this.e - i12;
        e2.x xVar = new e2.x(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.e = i12;
        String str = this.c.s;
        x xVar2 = this.b;
        String str2 = xVar2.s;
        String str3 = xVar2.s;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.s)) {
                e2.a.l("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.s);
                return;
            }
            n3.a c10 = m3.b.c(xVar);
            x a2 = c10.a();
            if (a2 == null || !Objects.equals(str3, a2.s)) {
                e2.a.l("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c10.a());
                return;
            }
            byte[] c11 = c10.c();
            c11.getClass();
            xVar = new e2.x(c11);
        }
        int a10 = xVar.a();
        k0 k0Var = this.a;
        k0Var.d(a10, xVar);
        k0Var.c(j10, i10, a10, 0, j0Var);
    }

    @Override // c3.k0
    public final /* synthetic */ void d(int i10, e2.x xVar) {
        i0.a(this, xVar, i10);
    }

    @Override // c3.k0
    public final int f(b2.p pVar, int i10, boolean z10) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = pVar.read(this.d, this.e, i10);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c3.k0
    public final void g(e2.x xVar, int i10, int i11) {
        int i12 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i12) {
            this.d = Arrays.copyOf(bArr, (i12 / 2) + i12);
        }
        xVar.k(this.e, i10, this.d);
        this.e += i10;
    }

    @Override // c3.k0
    public final /* synthetic */ void e(long j10) {
    }
}
