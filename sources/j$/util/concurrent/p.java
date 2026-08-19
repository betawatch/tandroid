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

    public p(l[] lVarArr, int i, int i2, int i3) {
        this.a = lVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    public final l a() {
        l[] lVarArr;
        int length;
        int i;
        o oVar;
        l lVar = this.b;
        if (lVar != null) {
            lVar = lVar.d;
        }
        while (lVar == null) {
            if (this.f >= this.g || (lVarArr = this.a) == null || (length = lVarArr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            l k = ConcurrentHashMap.k(lVarArr, i);
            if (k == null || k.a >= 0) {
                lVar = k;
            } else if (k instanceof g) {
                this.a = ((g) k).e;
                o oVar2 = this.d;
                if (oVar2 == null) {
                    oVar2 = new o();
                } else {
                    this.d = oVar2.d;
                }
                oVar2.c = lVarArr;
                oVar2.a = length;
                oVar2.b = i;
                oVar2.d = this.c;
                this.c = oVar2;
                lVar = null;
            } else {
                lVar = k instanceof q ? ((q) k).f : null;
            }
            if (this.c != null) {
                while (true) {
                    oVar = this.c;
                    if (oVar == null) {
                        break;
                    }
                    int i2 = this.e;
                    int i3 = oVar.a;
                    int i4 = i2 + i3;
                    this.e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.e = oVar.b;
                    this.a = oVar.c;
                    oVar.c = null;
                    o oVar3 = oVar.d;
                    oVar.d = this.d;
                    this.c = oVar3;
                    this.d = oVar;
                    length = i3;
                }
                if (oVar == null) {
                    int i5 = this.e + this.h;
                    this.e = i5;
                    if (i5 >= length) {
                        int i6 = this.f + 1;
                        this.f = i6;
                        this.e = i6;
                    }
                }
            } else {
                int i7 = i + this.h;
                this.e = i7;
                if (i7 >= length) {
                    int i8 = this.f + 1;
                    this.f = i8;
                    this.e = i8;
                }
            }
        }
        this.b = lVar;
        return lVar;
    }
}
