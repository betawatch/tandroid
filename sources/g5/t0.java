package g5;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class t0 {
    public static final e5.f h = new e5.f(11);
    public static final e5.f i = new e5.f(12);
    public final int a;
    public int e;
    public int f;
    public int g;
    public final s0[] c = new s0[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public t0(int i10) {
        this.a = i10;
    }

    public final void a(float f10, int i10) {
        s0 s0Var;
        int i11 = this.d;
        ArrayList arrayList = this.b;
        if (i11 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i12 = this.g;
        s0[] s0VarArr = this.c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.g = i13;
            s0Var = s0VarArr[i13];
        } else {
            s0Var = new s0();
        }
        int i14 = this.e;
        this.e = i14 + 1;
        s0Var.a = i14;
        s0Var.b = i10;
        s0Var.c = f10;
        arrayList.add(s0Var);
        this.f += i10;
        while (true) {
            int i15 = this.f;
            int i16 = this.a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            s0 s0Var2 = (s0) arrayList.get(0);
            int i18 = s0Var2.b;
            if (i18 <= i17) {
                this.f -= i18;
                arrayList.remove(0);
                int i19 = this.g;
                if (i19 < 5) {
                    this.g = i19 + 1;
                    s0VarArr[i19] = s0Var2;
                }
            } else {
                s0Var2.b = i18 - i17;
                this.f -= i17;
            }
        }
    }

    public final float b() {
        int i10 = this.d;
        ArrayList arrayList = this.b;
        if (i10 != 0) {
            Collections.sort(arrayList, i);
            this.d = 0;
        }
        float f10 = 0.5f * this.f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            s0 s0Var = (s0) arrayList.get(i12);
            i11 += s0Var.b;
            if (i11 >= f10) {
                return s0Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((s0) l.d.i(1, arrayList)).c;
    }
}
