package m4;

import a8.ia;
import f3.j0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class m {
    public final j0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public m(j0 j0Var) {
        this.a = j0Var;
    }

    public final void a(int i7, int i10, byte[] bArr) {
        if (this.c) {
            int i11 = this.f;
            int i12 = (i7 + 1) - i11;
            if (i12 >= i10) {
                this.f = (i10 - i7) + i11;
            } else {
                this.d = ((bArr[i12] & 192) >> 6) == 0;
                this.c = false;
            }
        }
    }

    public final void b(int i7, long j3, boolean z9) {
        ia.p(this.h != -9223372036854775807L);
        if (this.e == 182 && z9 && this.b) {
            this.a.c(this.h, this.d ? 1 : 0, (int) (j3 - this.g), i7, null);
        }
        if (this.e != 179) {
            this.g = j3;
        }
    }
}
