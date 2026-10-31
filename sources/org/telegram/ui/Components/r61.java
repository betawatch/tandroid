package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r61 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public r61(t61 t61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = t61Var.b;
        this.b = t61Var.i;
        this.c = t61Var.j;
        arrayList.add(t61Var);
    }

    public final t61 a() {
        ArrayList arrayList = this.d;
        t61 t61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            t61 t61Var2 = (t61) obj;
            if (t61Var2.b()) {
                return t61Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            t61 t61Var3 = (t61) arrayList.get(i11);
            if (t61Var3.k < j10 && u61.D0(t61Var3.m)) {
                j10 = t61Var3.k;
                t61Var = t61Var3;
            }
        }
        return t61Var != null ? t61Var : (t61) arrayList.get(0);
    }

    public final int b() {
        int min = Math.min(this.b, this.c);
        if (Math.abs(min - 2160) < 55) {
            return 2160;
        }
        if (Math.abs(min - 1440) < 55) {
            return 1440;
        }
        if (Math.abs(min - 1080) < 55) {
            return 1080;
        }
        if (Math.abs(min - 720) < 55) {
            return 720;
        }
        if (Math.abs(min - 480) < 55) {
            return 480;
        }
        if (Math.abs(min - 360) < 55) {
            return 360;
        }
        return Math.abs(min + (-240)) < 55 ? org.telegram.messenger.zs.P3 : Math.abs(min + (-144)) < 55 ? org.telegram.messenger.zs.a2 : min;
    }

    public final String toString() {
        String str;
        boolean z10 = org.telegram.messenger.tz.R0;
        boolean z11 = this.a;
        String str2 = "";
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append("p");
            if (z11) {
                str2 = " (" + org.telegram.messenger.cd.L0(2131746465, null) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z11) {
            str = " (" + org.telegram.messenger.cd.L0(2131746465, null) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(org.telegram.messenger.i0.i0((long) ((t61) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb3.append("/s");
        if (((t61) arrayList.get(0)).m != null) {
            str2 = ", " + ((t61) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
