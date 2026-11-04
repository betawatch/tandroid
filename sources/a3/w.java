package a3;

import java.util.ArrayList;
import java.util.Collections;
import k2.p1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class w {
    public static final u g = new u(0);
    public static final u h = new u(1);
    public int d;
    public int e;
    public int f;
    public final v[] b = new v[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f10, int i3) {
        v vVar;
        int i10 = this.c;
        ArrayList arrayList = this.a;
        if (i10 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i11 = this.f;
        v[] vVarArr = this.b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f = i12;
            vVar = vVarArr[i12];
        } else {
            vVar = new v();
        }
        int i13 = this.d;
        this.d = i13 + 1;
        vVar.a = i13;
        vVar.b = i3;
        vVar.c = f10;
        arrayList.add(vVar);
        this.e += i3;
        while (true) {
            int i14 = this.e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            v vVar2 = (v) arrayList.get(0);
            int i16 = vVar2.b;
            if (i16 <= i15) {
                this.e -= i16;
                arrayList.remove(0);
                int i17 = this.f;
                if (i17 < 5) {
                    this.f = i17 + 1;
                    vVarArr[i17] = vVar2;
                }
            } else {
                vVar2.b = i16 - i15;
                this.e -= i15;
            }
        }
    }

    public final float b() {
        int i3 = this.c;
        ArrayList arrayList = this.a;
        if (i3 != 0) {
            Collections.sort(arrayList, h);
            this.c = 0;
        }
        float f10 = 0.5f * this.e;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            v vVar = (v) arrayList.get(i11);
            i10 += vVar.b;
            if (i10 >= f10) {
                return vVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((v) p1.h(1, arrayList)).c;
    }
}
