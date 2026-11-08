package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class p51 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public p51(r51 r51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = r51Var.b;
        this.b = r51Var.i;
        this.c = r51Var.j;
        arrayList.add(r51Var);
    }

    public final r51 a() {
        ArrayList arrayList = this.d;
        r51 r51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            r51 r51Var2 = (r51) obj;
            if (r51Var2.b()) {
                return r51Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            r51 r51Var3 = (r51) arrayList.get(i10);
            if (r51Var3.k < j3 && t51.D0(r51Var3.m)) {
                j3 = r51Var3.k;
                r51Var = r51Var3;
            }
        }
        return r51Var != null ? r51Var : (r51) arrayList.get(0);
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
                str2 = " (" + org.telegram.messenger.id.M0(2131746451, null) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z10) {
            str = " (" + org.telegram.messenger.id.M0(2131746451, null) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(org.telegram.messenger.g0.i0((long) ((r51) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb3.append("/s");
        if (((r51) arrayList.get(0)).m != null) {
            str2 = ", " + ((r51) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
