package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class j51 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public j51(l51 l51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = l51Var.b;
        this.b = l51Var.i;
        this.c = l51Var.j;
        arrayList.add(l51Var);
    }

    public final l51 a() {
        ArrayList arrayList = this.d;
        l51 l51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            l51 l51Var2 = (l51) obj;
            if (l51Var2.b()) {
                return l51Var2;
            }
        }
        long j10 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l51 l51Var3 = (l51) arrayList.get(i10);
            if (l51Var3.k < j10 && m51.D0(l51Var3.m)) {
                j10 = l51Var3.k;
                l51Var = l51Var3;
            }
        }
        return l51Var != null ? l51Var : (l51) arrayList.get(0);
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
        return Math.abs(min + (-240)) < 55 ? org.telegram.messenger.hs.P3 : Math.abs(min + (-144)) < 55 ? org.telegram.messenger.hs.a2 : min;
    }

    public final String toString() {
        String str;
        boolean z10 = org.telegram.messenger.az.R0;
        boolean z11 = this.a;
        String str2 = "";
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append("p");
            if (z11) {
                str2 = " (" + org.telegram.messenger.bd.M0(2131746458, null) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z11) {
            str = " (" + org.telegram.messenger.bd.M0(2131746458, null) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(org.telegram.messenger.g0.i0((long) ((l51) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb3.append("/s");
        if (((l51) arrayList.get(0)).m != null) {
            str2 = ", " + ((l51) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
