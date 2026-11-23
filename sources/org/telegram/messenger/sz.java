package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
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
                int i7 = szVar.a;
                szVar.a = i7 - 1;
                rzVar.d = i7;
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
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) != null) {
                    sb2.append("#");
                    sb2.append(i7);
                    int i10 = ((rz) arrayList.get(i7)).d;
                    for (int i11 = 0; i11 < i10; i11++) {
                        sb2.append(" ");
                    }
                    sb2.append(" ");
                    sb2.append(arrayList.get(i7));
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
