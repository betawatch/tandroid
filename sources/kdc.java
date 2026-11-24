// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class kdc {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public kdc(mdc mdcVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = mdcVar.b;
        this.b = mdcVar.i;
        this.c = mdcVar.j;
        arrayList.add(mdcVar);
    }

    public final mdc a() {
        ArrayList arrayList = this.d;
        mdc mdcVar = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            mdc mdcVar2 = (mdc) obj;
            if (mdcVar2.b()) {
                return mdcVar2;
            }
        }
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            mdc mdcVar3 = (mdc) arrayList.get(i2);
            if (mdcVar3.k < j && ndc.C0(mdcVar3.m)) {
                j = mdcVar3.k;
                mdcVar = mdcVar3;
            }
        }
        return mdcVar != null ? mdcVar : (mdc) arrayList.get(0);
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
        return Math.abs(min + (-240)) < 55 ? nm7.O3 : Math.abs(min + (-144)) < 55 ? nm7.Z1 : min;
    }

    public final String toString() {
        String str;
        boolean z = gda.N0;
        boolean z2 = this.a;
        String str2 = "";
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(b());
            sb.append("p");
            if (z2) {
                str2 = " (" + jb6.M0(2131746183, null) + ")";
            }
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.b);
        sb2.append("x");
        sb2.append(this.c);
        if (z2) {
            str = " (" + jb6.M0(2131746183, null) + ")";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("\n");
        ArrayList arrayList = this.d;
        sb2.append(gm.i0((long) ((mdc) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb2.append("/s");
        if (((mdc) arrayList.get(0)).m != null) {
            str2 = ", " + ((mdc) arrayList.get(0)).m;
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
