package j$.util.concurrent;

/* loaded from: classes2.dex */
public class o {
    public k[] a;
    public k b = null;
    public n c;
    public n d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public o(k[] kVarArr, int i7, int i10, int i11) {
        this.a = kVarArr;
        this.h = i7;
        this.e = i10;
        this.f = i10;
        this.g = i11;
    }

    public final k a() {
        k[] kVarArr;
        int length;
        int i7;
        n nVar;
        k kVar = this.b;
        if (kVar != null) {
            kVar = kVar.d;
        }
        while (kVar == null) {
            if (this.f >= this.g || (kVarArr = this.a) == null || (length = kVarArr.length) <= (i7 = this.e) || i7 < 0) {
                this.b = null;
                return null;
            }
            k k10 = ConcurrentHashMap.k(kVarArr, i7);
            if (k10 == null || k10.a >= 0) {
                kVar = k10;
            } else if (k10 instanceof g) {
                this.a = ((g) k10).e;
                n nVar2 = this.d;
                if (nVar2 == null) {
                    nVar2 = new n();
                } else {
                    this.d = nVar2.d;
                }
                nVar2.c = kVarArr;
                nVar2.a = length;
                nVar2.b = i7;
                nVar2.d = this.c;
                this.c = nVar2;
                kVar = null;
            } else {
                kVar = k10 instanceof p ? ((p) k10).f : null;
            }
            if (this.c != null) {
                while (true) {
                    nVar = this.c;
                    if (nVar == null) {
                        break;
                    }
                    int i10 = this.e;
                    int i11 = nVar.a;
                    int i12 = i10 + i11;
                    this.e = i12;
                    if (i12 < length) {
                        break;
                    }
                    this.e = nVar.b;
                    this.a = nVar.c;
                    nVar.c = null;
                    n nVar3 = nVar.d;
                    nVar.d = this.d;
                    this.c = nVar3;
                    this.d = nVar;
                    length = i11;
                }
                if (nVar == null) {
                    int i13 = this.e + this.h;
                    this.e = i13;
                    if (i13 >= length) {
                        int i14 = this.f + 1;
                        this.f = i14;
                        this.e = i14;
                    }
                }
            } else {
                int i15 = i7 + this.h;
                this.e = i15;
                if (i15 >= length) {
                    int i16 = this.f + 1;
                    this.f = i16;
                    this.e = i16;
                }
            }
        }
        this.b = kVar;
        return kVar;
    }
}
