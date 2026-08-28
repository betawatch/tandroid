package com.google.android.exoplayer2.upstream;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class w0 {
    public static final a5.e h = new a5.e(11);
    public static final a5.e i = new a5.e(12);
    public final int a;
    public int e;
    public int f;
    public int g;
    public final v0[] c = new v0[5];
    public final ArrayList b = new ArrayList();
    public int d = -1;

    public w0(int i9) {
        this.a = i9;
    }

    public final void a(float f10, int i9) {
        v0 v0Var;
        int i10 = this.d;
        ArrayList arrayList = this.b;
        if (i10 != 1) {
            Collections.sort(arrayList, h);
            this.d = 1;
        }
        int i11 = this.g;
        v0[] v0VarArr = this.c;
        if (i11 > 0) {
            int i12 = i11 - 1;
            this.g = i12;
            v0Var = v0VarArr[i12];
        } else {
            v0Var = new v0();
        }
        int i13 = this.e;
        this.e = i13 + 1;
        v0Var.a = i13;
        v0Var.b = i9;
        v0Var.c = f10;
        arrayList.add(v0Var);
        this.f += i9;
        while (true) {
            int i14 = this.f;
            int i15 = this.a;
            if (i14 <= i15) {
                return;
            }
            int i16 = i14 - i15;
            v0 v0Var2 = (v0) arrayList.get(0);
            int i17 = v0Var2.b;
            if (i17 <= i16) {
                this.f -= i17;
                arrayList.remove(0);
                int i18 = this.g;
                if (i18 < 5) {
                    this.g = i18 + 1;
                    v0VarArr[i18] = v0Var2;
                }
            } else {
                v0Var2.b = i17 - i16;
                this.f -= i16;
            }
        }
    }

    public final float b() {
        int i9 = this.d;
        ArrayList arrayList = this.b;
        if (i9 != 0) {
            Collections.sort(arrayList, i);
            this.d = 0;
        }
        float f10 = 0.5f * this.f;
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            v0 v0Var = (v0) arrayList.get(i11);
            i10 += v0Var.b;
            if (i10 >= f10) {
                return v0Var.c;
            }
        }
        if (arrayList.isEmpty()) {
            return Float.NaN;
        }
        return ((v0) j3.r0.j(1, arrayList)).c;
    }
}
