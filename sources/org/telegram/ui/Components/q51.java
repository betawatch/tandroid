package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class q51 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public q51(s51 s51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = s51Var.b;
        this.b = s51Var.i;
        this.c = s51Var.j;
        arrayList.add(s51Var);
    }

    public final s51 a() {
        ArrayList arrayList = this.d;
        s51 s51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            s51 s51Var2 = (s51) obj;
            if (s51Var2.b()) {
                return s51Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            s51 s51Var3 = (s51) arrayList.get(i10);
            if (s51Var3.k < j3 && u51.D0(s51Var3.m)) {
                j3 = s51Var3.k;
                s51Var = s51Var3;
            }
        }
        return s51Var != null ? s51Var : (s51) arrayList.get(0);
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
        return Math.abs(min + (-240)) < 55 ? org.telegram.messenger.qs.P3 : Math.abs(min + (-144)) < 55 ? org.telegram.messenger.qs.a2 : min;
    }

    public final String toString() {
        String str;
        boolean z9 = org.telegram.messenger.iz.R0;
        boolean z10 = this.a;
        String str2 = "";
        if (!z9) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append("p");
            if (z10) {
                str2 = " (" + org.telegram.messenger.id.M0(2131746450, null) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z10) {
            str = " (" + org.telegram.messenger.id.M0(2131746450, null) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(org.telegram.messenger.g0.i0((long) ((s51) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb3.append("/s");
        if (((s51) arrayList.get(0)).m != null) {
            str2 = ", " + ((s51) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
