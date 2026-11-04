package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class sz {
    public final String b;
    public int a = 0;
    public final ArrayList d = new ArrayList();
    public final long c = System.currentTimeMillis();

    public sz(String str) {
        this.b = str;
    }

    public static void a(rz rzVar) {
        if (rzVar != null) {
            if (rzVar.b < 0) {
                sz szVar = rzVar.e;
                int i3 = szVar.a;
                szVar.a = i3 - 1;
                rzVar.d = i3;
            }
            rzVar.b = System.currentTimeMillis();
        }
    }

    public static void b(sz szVar) {
        if (szVar != null) {
            ArrayList arrayList = szVar.d;
            long currentTimeMillis = System.currentTimeMillis() - szVar.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(szVar.b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                if (arrayList.get(i3) != null) {
                    sb2.append("#");
                    sb2.append(i3);
                    int i10 = ((rz) arrayList.get(i3)).d;
                    for (int i11 = 0; i11 < i10; i11++) {
                        sb2.append(" ");
                    }
                    sb2.append(" ");
                    sb2.append(arrayList.get(i3));
                    sb2.append("\n");
                }
            }
            a8.b(sb2.toString());
        }
    }

    public static void c(sz szVar, String str) {
        if (szVar != null) {
            szVar.d.add(new qz(szVar, str));
        }
    }

    public static rz d(sz szVar, String str) {
        if (szVar == null) {
            return null;
        }
        rz rzVar = new rz(szVar, str);
        szVar.d.add(rzVar);
        return rzVar;
    }
}
