package j4;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class m {
    public final c3.h0 a;
    public boolean b;
    public boolean c;
    public boolean d;
    public int e;
    public int f;
    public long g;
    public long h;

    public m(c3.h0 h0Var) {
        this.a = h0Var;
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

    public final void b(int i10, long j3, boolean z10) {
        e2.d.g(this.h != -9223372036854775807L);
        if (this.e == 182 && z10 && this.b) {
            this.a.c(this.h, this.d ? 1 : 0, (int) (j3 - this.g), i10, null);
        }
        if (this.e != 179) {
            this.g = j3;
        }
    }
}
