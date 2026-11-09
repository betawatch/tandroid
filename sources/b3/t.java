package b3;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class t {
    public static final a3.c g = new a3.c(10);
    public static final a3.c h = new a3.c(11);
    public int d;
    public int e;
    public int f;
    public final s[] b = new s[5];
    public final ArrayList a = new ArrayList();
    public int c = -1;

    public final void a(float f10, int i7) {
        s sVar;
        int i10 = this.c;
        ArrayList arrayList = this.a;
        if (i10 != 1) {
            Collections.sort(arrayList, g);
            this.c = 1;
        }
        int i11 = this.f;
        s[] sVarArr = this.b;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.f = i12;
            sVar = sVarArr[i12];
        } else {
            sVar = new s();
        }
        int i13 = this.d;
        this.d = i13 + 1;
        sVar.a = i13;
        sVar.b = i7;
        sVar.c = f10;
        arrayList.add(sVar);
        this.e += i7;
        while (true) {
            int i14 = this.e;
            if (i14 <= 2000) {
                return;
            }
            int i15 = i14 - 2000;
            s sVar2 = (s) arrayList.get(0);
            int i16 = sVar2.b;
            if (i16 <= i15) {
                this.e -= i16;
                arrayList.remove(0);
                int i17 = this.f;
                if (i17 < 5) {
                    this.f = i17 + 1;
                    sVarArr[i17] = sVar2;
                }
            } else {
                sVar2.b = i16 - i15;
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
            s sVar = (s) arrayList.get(i11);
            i10 += sVar.b;
            if (i10 >= f10) {
                return sVar.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s) jg.g.i(1, arrayList)).c;
    }
}
