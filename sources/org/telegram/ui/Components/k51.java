package org.telegram.ui.Components;

import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class k51 {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public k51(m51 m51Var) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = m51Var.b;
        this.b = m51Var.i;
        this.c = m51Var.j;
        arrayList.add(m51Var);
    }

    public final m51 a() {
        ArrayList arrayList = this.d;
        m51 m51Var = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            m51 m51Var2 = (m51) obj;
            if (m51Var2.b()) {
                return m51Var2;
            }
        }
        long j3 = Long.MAX_VALUE;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            m51 m51Var3 = (m51) arrayList.get(i10);
            if (m51Var3.k < j3 && n51.D0(m51Var3.m)) {
                j3 = m51Var3.k;
                m51Var = m51Var3;
            }
        }
        return m51Var != null ? m51Var : (m51) arrayList.get(0);
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
                str2 = " (" + org.telegram.messenger.hd.M0(2131746449, null) + ")";
            }
            sb2.append(str2);
            return sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.b);
        sb3.append("x");
        sb3.append(this.c);
        if (z10) {
            str = " (" + org.telegram.messenger.hd.M0(2131746449, null) + ")";
        } else {
            str = "";
        }
        sb3.append(str);
        sb3.append("\n");
        ArrayList arrayList = this.d;
        sb3.append(org.telegram.messenger.g0.i0((long) ((m51) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb3.append("/s");
        if (((m51) arrayList.get(0)).m != null) {
            str2 = ", " + ((m51) arrayList.get(0)).m;
        }
        sb3.append(str2);
        return sb3.toString();
    }
}
