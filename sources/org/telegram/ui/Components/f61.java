package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f61 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public f61(h61 h61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = h61Var.b;
        this.b = h61Var.i;
        this.c = h61Var.j;
        arrayList.add(h61Var);
    }

    public final h61 a() {
        ArrayList arrayList = this.d;
        h61 h61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            h61 h61Var2 = (h61) obj;
            if (h61Var2.b()) {
                return h61Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            h61 h61Var3 = (h61) arrayList.get(i10);
            if (h61Var3.k < j3 && i61.D0(h61Var3.m)) {
                j3 = h61Var3.k;
                h61Var = h61Var3;
            }
        }
        return h61Var != null ? h61Var : (h61) arrayList.get(0);
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
        return Math.abs(min + (-240)) < 55 ? org.telegram.messenger.ls.P3 : Math.abs(min + (-144)) < 55 ? org.telegram.messenger.ls.a2 : min;
    }

    public final String toString() {
        String str;
        boolean z10 = org.telegram.messenger.cz.R0;
        boolean z11 = this.a;
        String str2 = "";
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append("p");
            if (z11) {
                str2 = " (" + org.telegram.messenger.hd.N0(2131746254, null) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z11) {
            str = " (" + org.telegram.messenger.hd.N0(2131746254, null) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(org.telegram.messenger.g0.i0((long) ((h61) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb3.append("/s");
        if (((h61) arrayList.get(0)).m != null) {
            str2 = ", " + ((h61) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
