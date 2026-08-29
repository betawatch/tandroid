package com.google.android.exoplayer2.upstream;

import j7.l1;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class w0 {
    public static final c5.e h = new c5.e(3);
    public static final c5.e i = new c5.e(4);
    public final int a;
    public int e;
    public int f;
    public int g;
    public final v0[] c = new v0[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public w0(int i10) {
        this.a = i10;
    }

    public final void a(float f9, int i10) {
        v0 v0Var;
        int i11 = this.d;
        ArrayList arrayList = this.b;
        if (i11 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i12 = this.g;
        v0[] v0VarArr = this.c;
        if (i12 > 0) {
            int i13 = i12 - 1;
            this.g = i13;
            v0Var = v0VarArr[i13];
        } else {
            v0Var = new v0();
        }
        int i14 = this.e;
        this.e = i14 + 1;
        v0Var.a = i14;
        v0Var.b = i10;
        v0Var.c = f9;
        arrayList.add(v0Var);
        this.f += i10;
        while (true) {
            int i15 = this.f;
            int i16 = this.a;
            if (i15 <= i16) {
                return;
            }
            int i17 = i15 - i16;
            v0 v0Var2 = (v0) arrayList.get(0);
            int i18 = v0Var2.b;
            if (i18 <= i17) {
                this.f -= i18;
                arrayList.remove(0);
                int i19 = this.g;
                if (i19 < 5) {
                    this.g = i19 + 1;
                    v0VarArr[i19] = v0Var2;
                }
            } else {
                v0Var2.b = i18 - i17;
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
        float f9 = 0.5f * this.f;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            v0 v0Var = (v0) arrayList.get(i12);
            i11 += v0Var.b;
            if (i11 >= f9) {
                return v0Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((v0) l1.i(1, arrayList)).c;
    }
}
