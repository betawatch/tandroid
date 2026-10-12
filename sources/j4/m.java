package j4;

import c3.i0;
import v7.u6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class m {
    public final i0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public m(i0 i0Var) {
        this.a = i0Var;
    }

    public final void a(int i10, int i11, byte[] bArr) {
        if (this.c) {
            int i12 = this.f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f = (i11 - i10) + i12;
            } else {
                this.d = ((bArr[i13] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }

    public final void b(int i10, long j10, boolean z10) {
        u6.p(this.h != -9223372036854775807L);
        if (this.e == 182 && z10 && this.b) {
            this.a.c(this.h, this.d ? 1 : 0, (int) (j10 - this.g), i10, null);
        }
        if (this.e != 179) {
            this.g = j10;
        }
    }
}
