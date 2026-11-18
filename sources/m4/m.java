package m4;

import a8.la;
import f3.i0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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

    public final void b(int i7, long j3, boolean z10) {
        la.p(this.h != -9223372036854775807L);
        if (this.e == 182 && z10 && this.b) {
            this.a.c(this.h, this.d ? 1 : 0, (int) (j3 - this.g), i7, null);
        }
        if (this.e != 179) {
            this.g = j3;
        }
    }
}
