package j$.util.concurrent;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes4.dex */
public class o {
    public k[] a;
    public k b = null;
    public n c;
    public n d;
    public int e;
    public int f;
    public int g;
    public final int h;

    public o(k[] kVarArr, int i, int i2, int i3) {
        this.a = kVarArr;
        this.h = i;
        this.e = i2;
        this.f = i2;
        this.g = i3;
    }

    public final k a() {
        k[] kVarArr;
        int length;
        int i;
        k kVar = this.b;
        if (kVar != null) {
            kVar = kVar.d;
        }
        while (kVar == null) {
            if (this.f >= this.g || (kVarArr = this.a) == null || (length = kVarArr.length) <= (i = this.e) || i < 0) {
                this.b = null;
                return null;
            }
            k k = ConcurrentHashMap.k(kVarArr, i);
            if (k == null || k.a >= 0) {
                kVar = k;
            } else if (k instanceof g) {
                this.a = ((g) k).e;
                n nVar = this.d;
                if (nVar != null) {
                    this.d = nVar.d;
                } else {
                    nVar = new n();
                }
                nVar.c = kVarArr;
                nVar.a = length;
                nVar.b = i;
                nVar.d = this.c;
                this.c = nVar;
                kVar = null;
            } else {
                kVar = k instanceof p ? ((p) k).f : null;
            }
            if (this.c != null) {
                while (true) {
                    n nVar2 = this.c;
                    int i2 = this.e;
                    if (nVar2 != null) {
                        int i3 = nVar2.a;
                        int i4 = i2 + i3;
                        this.e = i4;
                        if (i4 >= length) {
                            this.e = nVar2.b;
                            this.a = nVar2.c;
                            nVar2.c = null;
                            n nVar3 = nVar2.d;
                            nVar2.d = this.d;
                            this.c = nVar3;
                            this.d = nVar2;
                            length = i3;
                        }
                    } else {
                        int i5 = i2 + this.h;
                        this.e = i5;
                        if (i5 >= length) {
                            int i6 = this.f + 1;
                            this.f = i6;
                            this.e = i6;
                        }
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
        this.b = kVar;
        return kVar;
    }
}
