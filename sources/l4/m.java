package l4;

import b8.zb;
import e3.i0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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

    public final void a(int i3, int i10, byte[] bArr) {
        if (this.c) {
            int i11 = this.f;
            int i12 = (i3 + 1) - i11;
            if (i12 >= i10) {
                this.f = (i10 - i3) + i11;
            } else {
                this.d = ((bArr[i12] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }

    public final void b(int i3, long j10, boolean z10) {
        zb.p(this.h != -9223372036854775807L);
        if (this.e == 182 && z10 && this.b) {
            this.a.d(this.h, this.d ? 1 : 0, (int) (j10 - this.g), i3, null);
        }
        if (this.e != 179) {
            this.g = j10;
        }
    }
}
