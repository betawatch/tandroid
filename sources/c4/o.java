package c4;

import a8.la;
import com.google.android.gms.internal.vision.e2;
import e2.s0;
import e2.t;
import e2.u;
import f3.h0;
import f3.i0;
import h2.l0;
import h2.x;
import java.io.EOFException;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class o implements i0 {
    public final i0 a;
    public final k b;
    public m g;
    public u h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = l0.b;
    public final x c = new x();

    public o(i0 i0Var, k kVar) {
        this.a = i0Var;
        this.b = kVar;
    }

    @Override // f3.i0
    public final void a(x xVar, int i7, int i10) {
        if (this.g == null) {
            this.a.a(xVar, i7, i10);
            return;
        }
        h(i7);
        xVar.k(this.e, i7, this.f);
        this.e += i7;
    }

    @Override // f3.i0
    public final /* synthetic */ void b(int i7, x xVar) {
        e2.a(this, xVar, i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    @Override // f3.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
        o oVar;
        int i12;
        int i13;
        m mVar;
        byte[] bArr;
        l lVar;
        n nVar;
        if (this.g == null) {
            this.a.c(j3, i7, i10, i11, h0Var);
            return;
        }
        int i14 = i10;
        la.e("DRM on subtitles is not supported", h0Var == null);
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
            mVar.v(bArr, i12, i14, lVar, nVar);
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

    @Override // f3.i0
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override // f3.i0
    public final int f(e2.n nVar, int i7, boolean z10) {
        if (this.g == null) {
            return this.a.f(nVar, i7, z10);
        }
        h(i7);
        int read = nVar.read(this.f, this.e, i7);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // f3.i0
    public final void g(u uVar) {
        uVar.s.getClass();
        String str = uVar.s;
        la.f(s0.h(str) == 3);
        boolean equals = uVar.equals(this.h);
        k kVar = this.b;
        if (!equals) {
            this.h = uVar;
            this.g = kVar.H(uVar) ? kVar.j(uVar) : null;
        }
        m mVar = this.g;
        i0 i0Var = this.a;
        if (mVar == null) {
            i0Var.g(uVar);
            return;
        }
        t a10 = uVar.a();
        a10.r = s0.n("application/x-media3-cues");
        a10.j = str;
        a10.w = Long.MAX_VALUE;
        a10.P = kVar.O(uVar);
        p5.c.r(a10, i0Var);
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

    @Override // f3.i0
    public final /* synthetic */ void d(long j3) {
    }
}
