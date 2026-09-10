package o2;

import b2.r0;
import c3.g0;
import c3.h0;
import e2.v;
import j$.util.Objects;
import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class o implements h0 {
    public static final b2.s f;
    public static final b2.s g;
    public final h0 a;
    public final b2.s b;
    public b2.s c;
    public byte[] d;
    public int e;

    static {
        b2.r rVar = new b2.r();
        rVar.q = r0.n("application/id3");
        f = new b2.s(rVar);
        b2.r rVar2 = new b2.r();
        rVar2.q = r0.n("application/x-emsg");
        g = new b2.s(rVar2);
    }

    public o(h0 h0Var, int i10) {
        this.a = h0Var;
        if (i10 == 1) {
            this.b = f;
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(hc.b.j(i10, "Unknown metadataType: "));
            }
            this.b = g;
        }
        this.d = new byte[0];
        this.e = 0;
    }

    @Override // c3.h0
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override // c3.h0
    public final void b(b2.s sVar) {
        this.c = sVar;
        this.a.b(this.b);
    }

    @Override // c3.h0
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        this.c.getClass();
        int i13 = this.e - i12;
        v vVar = new v(Arrays.copyOfRange(this.d, i13 - i11, i13));
        byte[] bArr = this.d;
        System.arraycopy(bArr, i13, bArr, 0, i12);
        this.e = i12;
        String str = this.c.r;
        b2.s sVar = this.b;
        String str2 = sVar.r;
        String str3 = sVar.r;
        if (!Objects.equals(str, str2)) {
            if (!"application/x-emsg".equals(this.c.r)) {
                e2.a.n("HlsSampleStreamWrapper", "Ignoring sample for unsupported format: " + this.c.r);
                return;
            }
            n3.a c10 = m3.b.c(vVar);
            b2.s a2 = c10.a();
            if (a2 == null || !Objects.equals(str3, a2.r)) {
                e2.a.n("HlsSampleStreamWrapper", "Ignoring EMSG. Expected it to contain wrapped " + str3 + " but actual wrapped format: " + c10.a());
                return;
            }
            byte[] c11 = c10.c();
            c11.getClass();
            vVar = new v(c11);
        }
        int a10 = vVar.a();
        h0 h0Var = this.a;
        h0Var.d(a10, vVar);
        h0Var.c(j3, i10, a10, 0, g0Var);
    }

    @Override // c3.h0
    public final /* synthetic */ void d(int i10, v vVar) {
        a4.a.a(this, vVar, i10);
    }

    @Override // c3.h0
    public final int e(b2.k kVar, int i10, boolean z10) {
        int i11 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i11) {
            this.d = Arrays.copyOf(bArr, (i11 / 2) + i11);
        }
        int read = kVar.read(this.d, this.e, i10);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // c3.h0
    public final void f(v vVar, int i10, int i11) {
        int i12 = this.e + i10;
        byte[] bArr = this.d;
        if (bArr.length < i12) {
            this.d = Arrays.copyOf(bArr, (i12 / 2) + i12);
        }
        vVar.h(this.e, i10, this.d);
        this.e += i10;
    }
}
