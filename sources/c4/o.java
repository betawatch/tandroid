package c4;

import a8.ia;
import e2.s0;
import e2.t;
import e2.u;
import f3.i0;
import f3.j0;
import h2.m0;
import h2.x;
import java.io.EOFException;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class o implements j0 {
    public final j0 a;
    public final k b;
    public m g;
    public u h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = m0.b;
    public final x c = new x();

    public o(j0 j0Var, k kVar) {
        this.a = j0Var;
        this.b = kVar;
    }

    @Override // f3.j0
    public final void a(x xVar, int i7, int i10) {
        if (this.g == null) {
            this.a.a(xVar, i7, i10);
            return;
        }
        h(i7);
        xVar.k(this.e, i7, this.f);
        this.e += i7;
    }

    @Override // f3.j0
    public final /* synthetic */ void b(int i7, x xVar) {
        com.google.android.recaptcha.internal.a.a(this, xVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    @Override // f3.j0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
        o oVar;
        int i12;
        int i13;
        m mVar;
        byte[] bArr;
        l lVar;
        n nVar;
        if (this.g == null) {
            this.a.c(j3, i7, i10, i11, i0Var);
            return;
        }
        int i14 = i10;
        ia.e("DRM on subtitles is not supported", i0Var == null);
        int i15 = (this.e - i11) - i14;
        try {
            mVar = this.g;
            bArr = this.f;
            lVar = l.c;
        } catch (RuntimeException e10) {
            e = e10;
            oVar = this;
        }
        try {
            nVar = new n(this, j3, i7, 0);
            oVar = this;
            i12 = i15;
        } catch (RuntimeException e11) {
            e = e11;
            oVar = this;
            i12 = i15;
            RuntimeException runtimeException = e;
            if (oVar.i) {
                throw runtimeException;
            }
            h2.a.m("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i13 = i12 + i14;
            oVar.d = i13;
            if (i13 != oVar.e) {
            }
        }
        try {
            mVar.z(bArr, i12, i14, lVar, nVar);
            i14 = i14;
        } catch (RuntimeException e12) {
            e = e12;
            i14 = i14;
            RuntimeException runtimeException2 = e;
            if (oVar.i) {
            }
        }
        i13 = i12 + i14;
        oVar.d = i13;
        if (i13 != oVar.e) {
            oVar.d = 0;
            oVar.e = 0;
        }
    }

    @Override // f3.j0
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override // f3.j0
    public final int f(e2.n nVar, int i7, boolean z9) {
        if (this.g == null) {
            return this.a.f(nVar, i7, z9);
        }
        h(i7);
        int read = nVar.read(this.f, this.e, i7);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z9) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // f3.j0
    public final void g(u uVar) {
        uVar.s.getClass();
        String str = uVar.s;
        ia.f(s0.h(str) == 3);
        boolean equals = uVar.equals(this.h);
        k kVar = this.b;
        if (!equals) {
            this.h = uVar;
            this.g = kVar.w(uVar) ? kVar.l(uVar) : null;
        }
        m mVar = this.g;
        j0 j0Var = this.a;
        if (mVar == null) {
            j0Var.g(uVar);
            return;
        }
        t a10 = uVar.a();
        a10.r = s0.n("application/x-media3-cues");
        a10.j = str;
        a10.w = Long.MAX_VALUE;
        a10.P = kVar.D(uVar);
        f1.s(a10, j0Var);
    }

    public final void h(int i7) {
        int length = this.f.length;
        int i10 = this.e;
        if (length - i10 >= i7) {
            return;
        }
        int i11 = i10 - this.d;
        int max = Math.max(i11 * 2, i7 + i11);
        byte[] bArr = this.f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.d, bArr2, 0, i11);
        this.d = 0;
        this.e = i11;
        this.f = bArr2;
    }

    @Override // f3.j0
    public final /* synthetic */ void d(long j3) {
    }
}
