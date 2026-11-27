// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class gr4 {
    public final x1c a;
    public y1c d;
    public pc3 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ko4 l;
    public ko4 m;
    public boolean n;
    public final s1c b = new s1c();
    public final ey7 c = new ey7();
    public final ey7 j = new ey7(1);
    public final ey7 k = new ey7();

    public gr4(x1c x1cVar, y1c y1cVar, pc3 pc3Var, ko4 ko4Var) {
        this.a = x1cVar;
        this.d = y1cVar;
        this.e = pc3Var;
        this.m = ko4Var;
        if (s3d.e(ko4Var.t)) {
            this.l = ko4Var;
        }
        this.d = y1cVar;
        this.e = pc3Var;
        if (this.l == null) {
            x1cVar.g(this.m);
        }
        e();
    }

    public final int a() {
        int i = !this.n ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i | TLObject.FLAG_30 : i;
    }

    public final r1c b() {
        if (this.n) {
            s1c s1cVar = this.b;
            pc3 pc3Var = s1cVar.a;
            String str = gcc.a;
            int i = pc3Var.a;
            r1c r1cVar = s1cVar.m;
            if (r1cVar == null) {
                r1c[] r1cVarArr = this.d.a.n;
                r1cVar = r1cVarArr == null ? null : r1cVarArr[i];
            }
            if (r1cVar != null && r1cVar.a) {
                return r1cVar;
            }
        }
        return null;
    }

    public final boolean c() {
        this.f++;
        if (!this.n) {
            return false;
        }
        int i = this.g + 1;
        this.g = i;
        int[] iArr = this.b.g;
        int i2 = this.h;
        if (i != iArr[i2]) {
            return true;
        }
        this.h = i2 + 1;
        this.g = 0;
        return false;
    }

    public final int d(int i, int i2) {
        ey7 ey7Var;
        r1c b = b();
        if (b == null) {
            return 0;
        }
        int i3 = b.d;
        s1c s1cVar = this.b;
        if (i3 != 0) {
            ey7Var = s1cVar.n;
        } else {
            byte[] bArr = b.e;
            String str = gcc.a;
            int length = bArr.length;
            ey7 ey7Var2 = this.k;
            ey7Var2.L(length, bArr);
            i3 = bArr.length;
            ey7Var = ey7Var2;
        }
        boolean z = s1cVar.k && s1cVar.l[this.f];
        boolean z2 = z || i2 != 0;
        ey7 ey7Var3 = this.j;
        ey7Var3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        ey7Var3.N(0);
        x1c x1cVar = this.a;
        x1cVar.b(ey7Var3, 1, 1);
        x1cVar.b(ey7Var, i3, 1);
        if (!z2) {
            return i3 + 1;
        }
        ey7 ey7Var4 = this.c;
        if (!z) {
            ey7Var4.K(8);
            byte[] bArr2 = ey7Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & jn7.d4);
            bArr2[4] = (byte) ((i >> 24) & jn7.d4);
            bArr2[5] = (byte) ((i >> 16) & jn7.d4);
            bArr2[6] = (byte) ((i >> 8) & jn7.d4);
            bArr2[7] = (byte) (i & jn7.d4);
            x1cVar.b(ey7Var4, 8, 1);
            return i3 + 9;
        }
        ey7 ey7Var5 = s1cVar.n;
        int H = ey7Var5.H();
        ey7Var5.O(-2);
        int i4 = (H * 6) + 2;
        if (i2 != 0) {
            ey7Var4.K(i4);
            byte[] bArr3 = ey7Var4.a;
            ey7Var5.k(0, i4, bArr3);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & jn7.d4);
            bArr3[3] = (byte) (i5 & jn7.d4);
        } else {
            ey7Var4 = ey7Var5;
        }
        x1cVar.b(ey7Var4, i4, 1);
        return i3 + 1 + i4;
    }

    public final void e() {
        s1c s1cVar = this.b;
        s1cVar.d = 0;
        s1cVar.p = 0L;
        s1cVar.q = false;
        s1cVar.k = false;
        s1cVar.o = false;
        s1cVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.n = false;
    }
}
