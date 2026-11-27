// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class hfc {
    public final boolean a;
    public final int b;
    public final int c;
    public final ArrayList d;

    public hfc(jfc jfcVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = jfcVar.b;
        this.b = jfcVar.i;
        this.c = jfcVar.j;
        arrayList.add(jfcVar);
    }

    public final jfc a() {
        ArrayList arrayList = this.d;
        jfc jfcVar = null;
        if (arrayList.isEmpty()) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jfc jfcVar2 = (jfc) obj;
            if (jfcVar2.b()) {
                return jfcVar2;
            }
        }
        long j = Long.MAX_VALUE;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            jfc jfcVar3 = (jfc) arrayList.get(i2);
            if (jfcVar3.k < j && kfc.C0(jfcVar3.m)) {
                j = jfcVar3.k;
                jfcVar = jfcVar3;
            }
        }
        return jfcVar != null ? jfcVar : (jfc) arrayList.get(0);
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
        return Math.abs(min + (-240)) < 55 ? jn7.O3 : Math.abs(min + (-144)) < 55 ? jn7.Z1 : min;
    }

    public final String toString() {
        String str;
        boolean z = xea.N0;
        boolean z2 = this.a;
        String str2 = "";
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append(b());
            sb.append("p");
            if (z2) {
                str2 = " (" + ob6.M0(2131746177, null) + ")";
            }
            sb.append(str2);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.b);
        sb2.append("x");
        sb2.append(this.c);
        if (z2) {
            str = " (" + ob6.M0(2131746177, null) + ")";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("\n");
        ArrayList arrayList = this.d;
        sb2.append(hl.i0((long) ((jfc) arrayList.get(0)).l, false, false).replace(" ", ""));
        sb2.append("/s");
        if (((jfc) arrayList.get(0)).m != null) {
            str2 = ", " + ((jfc) arrayList.get(0)).m;
        }
        sb2.append(str2);
        return sb2.toString();
    }
}
