package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class r51 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public r51(t51 t51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = t51Var.b;
        this.b = t51Var.i;
        this.c = t51Var.j;
        arrayList.add(t51Var);
    }

    public final t51 a() {
        ArrayList arrayList = this.d;
        t51 t51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            t51 t51Var2 = (t51) obj;
            if (t51Var2.b()) {
                return t51Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            t51 t51Var3 = (t51) arrayList.get(i10);
            if (t51Var3.k < j3 && u51.D0(t51Var3.m)) {
                j3 = t51Var3.k;
                t51Var = t51Var3;
            }
        }
        return t51Var != null ? t51Var : (t51) arrayList.get(0);
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
        return Math.abs(min + (-240)) < 55 ? org.telegram.messenger.ns.P3 : Math.abs(min + (-144)) < 55 ? org.telegram.messenger.ns.a2 : min;
    }

    public final String toString() {
        String str;
        boolean z10 = org.telegram.messenger.gz.R0;
        boolean z11 = this.a;
        String str2 = "";
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append("p");
            if (z11) {
                str2 = " (" + org.telegram.messenger.hd.M0(2131746450, null) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z11) {
            str = " (" + org.telegram.messenger.hd.M0(2131746450, null) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(org.telegram.messenger.g0.i0((long) ((t51) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb3.append("/s");
        if (((t51) arrayList.get(0)).m != null) {
            str2 = ", " + ((t51) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
