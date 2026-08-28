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

    public p(l[] lVarArr, int i9, int i10, int i11) {
        this.a = lVarArr;
        this.h = i9;
        this.e = i10;
        this.f = i10;
        this.g = i11;
    }

    public final l a() {
        l[] lVarArr;
        int length;
        int i9;
        o oVar;
        l lVar = this.b;
        if (lVar != null) {
            lVar = lVar.d;
        }
        while (lVar == null) {
            if (this.f >= this.g || (lVarArr = this.a) == null || (length = lVarArr.length) <= (i9 = this.e) || i9 < 0) {
                this.b = null;
                return null;
            }
            l k10 = ConcurrentHashMap.k(lVarArr, i9);
            if (k10 == null || k10.a >= 0) {
                lVar = k10;
            } else if (k10 instanceof g) {
                this.a = ((g) k10).e;
                o oVar2 = this.d;
                if (oVar2 == null) {
                    oVar2 = new o();
                } else {
                    this.d = oVar2.d;
                }
                oVar2.c = lVarArr;
                oVar2.a = length;
                oVar2.b = i9;
                oVar2.d = this.c;
                this.c = oVar2;
                lVar = null;
            } else {
                lVar = k10 instanceof q ? ((q) k10).f : null;
            }
            if (this.c != null) {
                while (true) {
                    oVar = this.c;
                    if (oVar == null) {
                        break;
                    }
                    int i10 = this.e;
                    int i11 = oVar.a;
                    int i12 = i10 + i11;
                    this.e = i12;
                    if (i12 < length) {
                        break;
                    }
                    this.e = oVar.b;
                    this.a = oVar.c;
                    oVar.c = null;
                    o oVar3 = oVar.d;
                    oVar.d = this.d;
                    this.c = oVar3;
                    this.d = oVar;
                    length = i11;
                }
                if (oVar == null) {
                    int i13 = this.e + this.h;
                    this.e = i13;
                    if (i13 >= length) {
                        int i14 = this.f + 1;
                        this.f = i14;
                        this.e = i14;
                    }
                }
            } else {
                int i15 = i9 + this.h;
                this.e = i15;
                if (i15 >= length) {
                    int i16 = this.f + 1;
                    this.f = i16;
                    this.e = i16;
                }
            }
        }
        this.b = lVar;
        return lVar;
    }
}
