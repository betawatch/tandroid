package b3;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class u {
    public static final a3.c g = new a3.c(10);
    public static final a3.c h = new a3.c(11);
    public int d;
    public int e;
    public int f;
    public final t[] b = new t[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f10, int i7) {
        t tVar;
        int i10 = this.c;
        ArrayList arrayList = this.a;
        if (i10 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i11 = this.f;
        t[] tVarArr = this.b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f = i12;
            tVar = tVarArr[i12];
        } else {
            tVar = new t();
        }
        int i13 = this.d;
        this.d = i13 + 1;
        tVar.a = i13;
        tVar.b = i7;
        tVar.c = f10;
        arrayList.add(tVar);
        this.e += i7;
        while (true) {
            int i14 = this.e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            t tVar2 = (t) arrayList.get(0);
            int i16 = tVar2.b;
            if (i16 <= i15) {
                this.e -= i16;
                arrayList.remove(0);
                int i17 = this.f;
                if (i17 < 5) {
                    this.f = i17 + 1;
                    tVarArr[i17] = tVar2;
                }
            } else {
                tVar2.b = i16 - i15;
                this.e -= i15;
            }
        }
    }

    public final float b() {
        int i7 = this.c;
        ArrayList arrayList = this.a;
        if (i7 != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f10 = 0.5f * this.e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            t tVar = (t) arrayList.get(i11);
            i10 += tVar.b;
            if (i10 >= f10) {
                return tVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((t) i5.c.h(1, arrayList)).c;
    }
}
