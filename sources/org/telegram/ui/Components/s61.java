package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class s61 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public s61(u61 u61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = u61Var.b;
        this.b = u61Var.i;
        this.c = u61Var.j;
        arrayList.add(u61Var);
    }

    public final u61 a() {
        ArrayList arrayList = this.d;
        u61 u61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            u61 u61Var2 = (u61) obj;
            if (u61Var2.b()) {
                return u61Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            u61 u61Var3 = (u61) arrayList.get(i11);
            if (u61Var3.k < j10 && v61.D0(u61Var3.m)) {
                j10 = u61Var3.k;
                u61Var = u61Var3;
            }
        }
        return u61Var != null ? u61Var : (u61) arrayList.get(0);
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
        return Math.abs(min + (-240)) < 55 ? org.telegram.messenger.at.P3 : Math.abs(min + (-144)) < 55 ? org.telegram.messenger.at.a2 : min;
    }

    public final String toString() {
        String str;
        boolean z10 = org.telegram.messenger.uz.R0;
        boolean z11 = this.a;
        String str2 = "";
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append("p");
            if (z11) {
                str2 = " (" + org.telegram.messenger.dd.L0(2131746465, null) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z11) {
            str = " (" + org.telegram.messenger.dd.L0(2131746465, null) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(org.telegram.messenger.i0.i0((long) ((u61) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb3.append("/s");
        if (((u61) arrayList.get(0)).m != null) {
            str2 = ", " + ((u61) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
