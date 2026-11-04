package b4;

import b8.zb;
import d2.u;
import d2.u0;
import d2.v;
import e3.h0;
import e3.i0;
import g2.n0;
import g2.y;
import java.io.EOFException;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class p implements i0 {
    public final i0 a;
    public final k b;
    public m g;
    public v h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = n0.b;
    public final y c = new y();

    public p(i0 i0Var, k kVar) {
        this.a = i0Var;
        this.b = kVar;
    }

    @Override // e3.i0
    public final int a(d2.o oVar, int i3, boolean z10) {
        return c(oVar, i3, z10);
    }

    @Override // e3.i0
    public final int c(d2.o oVar, int i3, boolean z10) {
        if (this.g == null) {
            return this.a.c(oVar, i3, z10);
        }
        h(i3);
        int read = oVar.read(this.f, this.e, i3);
        if (read != -1) {
            this.e += read;
            return read;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0060  */
    @Override // e3.i0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j10, int i3, int i10, int i11, h0 h0Var) {
        p pVar;
        int i12;
        int i13;
        m mVar;
        byte[] bArr;
        l lVar;
        o oVar;
        if (this.g == null) {
            this.a.d(j10, i3, i10, i11, h0Var);
            return;
        }
        int i14 = i10;
        zb.e("DRM on subtitles is not supported", h0Var == null);
        int i15 = (this.e - i11) - i14;
        try {
            mVar = this.g;
            bArr = this.f;
            lVar = l.c;
        } catch (RuntimeException e10) {
            e = e10;
            pVar = this;
        }
        try {
            oVar = new o(this, j10, i3, 0);
            pVar = this;
            i12 = i15;
        } catch (RuntimeException e11) {
            e = e11;
            pVar = this;
            i12 = i15;
            RuntimeException runtimeException = e;
            if (pVar.i) {
                throw runtimeException;
            }
            g2.a.m("SubtitleTranscodingTO", "Parsing subtitles failed, ignoring sample.", runtimeException);
            i13 = i12 + i14;
            pVar.d = i13;
            if (i13 != pVar.e) {
            }
        }
        try {
            mVar.F(bArr, i12, i14, lVar, oVar);
            i14 = i14;
        } catch (RuntimeException e12) {
            e = e12;
            i14 = i14;
            RuntimeException runtimeException2 = e;
            if (pVar.i) {
            }
        }
        i13 = i12 + i14;
        pVar.d = i13;
        if (i13 != pVar.e) {
            pVar.d = 0;
            pVar.e = 0;
        }
    }

    @Override // e3.i0
    public final /* synthetic */ void e(int i3, y yVar) {
        com.google.android.recaptcha.internal.a.a(this, yVar, i3);
    }

    @Override // e3.i0
    public final void f(y yVar, int i3, int i10) {
        if (this.g == null) {
            this.a.f(yVar, i3, i10);
            return;
        }
        h(i3);
        yVar.k(this.e, i3, this.f);
        this.e += i3;
    }

    @Override // e3.i0
    public final void g(v vVar) {
        vVar.s.getClass();
        String str = vVar.s;
        zb.f(u0.h(str) == 3);
        boolean equals = vVar.equals(this.h);
        k kVar = this.b;
        if (!equals) {
            this.h = vVar;
            this.g = kVar.l(vVar) ? kVar.h(vVar) : null;
        }
        m mVar = this.g;
        i0 i0Var = this.a;
        if (mVar == null) {
            i0Var.g(vVar);
            return;
        }
        u a10 = vVar.a();
        a10.r = u0.n("application/x-media3-cues");
        a10.j = str;
        a10.w = Long.MAX_VALUE;
        a10.P = kVar.q0(vVar);
        f1.w(a10, i0Var);
    }

    public final void h(int i3) {
        int length = this.f.length;
        int i10 = this.e;
        if (length - i10 >= i3) {
            return;
        }
        int i11 = i10 - this.d;
        int max = Math.max(i11 * 2, i3 + i11);
        byte[] bArr = this.f;
        byte[] bArr2 = max <= bArr.length ? bArr : new byte[max];
        System.arraycopy(bArr, this.d, bArr2, 0, i11);
        this.d = 0;
        this.e = i11;
        this.f = bArr2;
    }

    @Override // e3.i0
    public final /* synthetic */ void b(long j10) {
    }
}
