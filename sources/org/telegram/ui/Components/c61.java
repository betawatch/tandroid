package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c61 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public c61(e61 e61Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = e61Var.b;
        this.b = e61Var.i;
        this.c = e61Var.j;
        arrayList.add(e61Var);
    }

    public final e61 a() {
        ArrayList arrayList = this.d;
        e61 e61Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            e61 e61Var2 = (e61) obj;
            if (e61Var2.b()) {
                return e61Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e61 e61Var3 = (e61) arrayList.get(i10);
            if (e61Var3.k < j3 && f61.D0(e61Var3.m)) {
                j3 = e61Var3.k;
                e61Var = e61Var3;
            }
        }
        return e61Var != null ? e61Var : (e61) arrayList.get(0);
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
        return Math.abs(min + (-240)) < 55 ? org.telegram.messenger.ks.P3 : Math.abs(min + (-144)) < 55 ? org.telegram.messenger.ks.a2 : min;
    }

    public final String toString() {
        String str;
        boolean z10 = org.telegram.messenger.bz.R0;
        boolean z11 = this.a;
        String str2 = "";
        if (!z10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b());
            sb2.append("p");
            if (z11) {
                str2 = " (" + org.telegram.messenger.gd.M0(2131746255, null) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z11) {
            str = " (" + org.telegram.messenger.gd.M0(2131746255, null) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(org.telegram.messenger.g0.i0((long) ((e61) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb3.append("/s");
        if (((e61) arrayList.get(0)).m != null) {
            str2 = ", " + ((e61) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
