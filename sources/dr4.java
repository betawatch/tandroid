// default package

import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class dr4 {
    public final yzb a;
    public zzb d;
    public id3 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public go4 l;
    public go4 m;
    public boolean n;
    public final tzb b = new tzb();
    public final yw7 c = new yw7();
    public final yw7 j = new yw7(1);
    public final yw7 k = new yw7();

    public dr4(yzb yzbVar, zzb zzbVar, id3 id3Var, go4 go4Var) {
        this.a = yzbVar;
        this.d = zzbVar;
        this.e = id3Var;
        this.m = go4Var;
        if (c1d.e(go4Var.t)) {
            this.l = go4Var;
        }
        this.d = zzbVar;
        this.e = id3Var;
        if (this.l == null) {
            yzbVar.g(this.m);
        }
        e();
    }

    public final int a() {
        int i = !this.n ? this.d.g[this.f] : this.b.j[this.f] ? 1 : 0;
        return b() != null ? i | TLObject.FLAG_30 : i;
    }

    public final szb b() {
        if (this.n) {
            tzb tzbVar = this.b;
            id3 id3Var = tzbVar.a;
            String str = hac.a;
            int i = id3Var.a;
            szb szbVar = tzbVar.m;
            if (szbVar == null) {
                szb[] szbVarArr = this.d.a.n;
                szbVar = szbVarArr == null ? null : szbVarArr[i];
            }
            if (szbVar != null && szbVar.a) {
                return szbVar;
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
        yw7 yw7Var;
        szb b = b();
        if (b == null) {
            return 0;
        }
        int i3 = b.d;
        tzb tzbVar = this.b;
        if (i3 != 0) {
            yw7Var = tzbVar.n;
        } else {
            byte[] bArr = b.e;
            String str = hac.a;
            int length = bArr.length;
            yw7 yw7Var2 = this.k;
            yw7Var2.L(length, bArr);
            i3 = bArr.length;
            yw7Var = yw7Var2;
        }
        boolean z = tzbVar.k && tzbVar.l[this.f];
        boolean z2 = z || i2 != 0;
        yw7 yw7Var3 = this.j;
        yw7Var3.a[0] = (byte) ((z2 ? 128 : 0) | i3);
        yw7Var3.N(0);
        yzb yzbVar = this.a;
        yzbVar.b(yw7Var3, 1, 1);
        yzbVar.b(yw7Var, i3, 1);
        if (!z2) {
            return i3 + 1;
        }
        yw7 yw7Var4 = this.c;
        if (!z) {
            yw7Var4.K(8);
            byte[] bArr2 = yw7Var4.a;
            bArr2[0] = 0;
            bArr2[1] = 1;
            bArr2[2] = 0;
            bArr2[3] = (byte) (i2 & nm7.d4);
            bArr2[4] = (byte) ((i >> 24) & nm7.d4);
            bArr2[5] = (byte) ((i >> 16) & nm7.d4);
            bArr2[6] = (byte) ((i >> 8) & nm7.d4);
            bArr2[7] = (byte) (i & nm7.d4);
            yzbVar.b(yw7Var4, 8, 1);
            return i3 + 9;
        }
        yw7 yw7Var5 = tzbVar.n;
        int H = yw7Var5.H();
        yw7Var5.O(-2);
        int i4 = (H * 6) + 2;
        if (i2 != 0) {
            yw7Var4.K(i4);
            byte[] bArr3 = yw7Var4.a;
            yw7Var5.k(0, i4, bArr3);
            int i5 = (((bArr3[2] & 255) << 8) | (bArr3[3] & 255)) + i2;
            bArr3[2] = (byte) ((i5 >> 8) & nm7.d4);
            bArr3[3] = (byte) (i5 & nm7.d4);
        } else {
            yw7Var4 = yw7Var5;
        }
        yzbVar.b(yw7Var4, i4, 1);
        return i3 + 1 + i4;
    }

    public final void e() {
        tzb tzbVar = this.b;
        tzbVar.d = 0;
        tzbVar.p = 0L;
        tzbVar.q = false;
        tzbVar.k = false;
        tzbVar.o = false;
        tzbVar.m = null;
        this.f = 0;
        this.h = 0;
        this.g = 0;
        this.i = 0;
        this.n = false;
    }
}
