package j$.util.concurrent;

/* loaded from: classes2.dex */
public class p {
    public l[] a;
    public l b = null;
    public o c;
    public o d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public p(l[] lVarArr, int i10, int i11, int i12) {
        this.a = lVarArr;
        this.h = i10;
        this.e = i11;
        this.f = i11;
        this.g = i12;
    }

    public final l a() {
        l[] lVarArr;
        int length;
        int i10;
        o oVar;
        l lVar = this.b;
        if (lVar != null) {
            lVar = lVar.d;
        }
        while (lVar == null) {
            if (this.f >= this.g || (lVarArr = this.a) == null || (length = lVarArr.length) <= (i10 = this.e) || i10 < 0) {
                this.b = null;
                return null;
            }
            l k9 = ConcurrentHashMap.k(lVarArr, i10);
            if (k9 == null || k9.a >= 0) {
                lVar = k9;
            } else if (k9 instanceof g) {
                this.a = ((g) k9).e;
                o oVar2 = this.d;
                if (oVar2 == null) {
                    oVar2 = new o();
                } else {
                    this.d = oVar2.d;
                }
                oVar2.c = lVarArr;
                oVar2.a = length;
                oVar2.b = i10;
                oVar2.d = this.c;
                this.c = oVar2;
                lVar = null;
            } else {
                lVar = k9 instanceof q ? ((q) k9).f : null;
            }
            if (this.c != null) {
                while (true) {
                    oVar = this.c;
                    if (oVar == null) {
                        break;
                    }
                    int i11 = this.e;
                    int i12 = oVar.a;
                    int i13 = i11 + i12;
                    this.e = i13;
                    if (i13 < length) {
                        break;
                    }
                    this.e = oVar.b;
                    this.a = oVar.c;
                    oVar.c = null;
                    o oVar3 = oVar.d;
                    oVar.d = this.d;
                    this.c = oVar3;
                    this.d = oVar;
                    length = i12;
                }
                if (oVar == null) {
                    int i14 = this.e + this.h;
                    this.e = i14;
                    if (i14 >= length) {
                        int i15 = this.f + 1;
                        this.f = i15;
                        this.e = i15;
                    }
                }
            } else {
                int i16 = i10 + this.h;
                this.e = i16;
                if (i16 >= length) {
                    int i17 = this.f + 1;
                    this.f = i17;
                    this.e = i17;
                }
            }
        }
        this.b = lVar;
        return lVar;
    }
}
