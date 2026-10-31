package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class l00 {
    public final String b;
    public int a = 0;
    public final ArrayList d = new ArrayList();
    public final long c = System.currentTimeMillis();

    public l00(String str) {
        this.b = str;
    }

    public static void a(k00 k00Var) {
        if (k00Var != null) {
            if (k00Var.b < 0) {
                l00 l00Var = k00Var.e;
                int i10 = l00Var.a;
                l00Var.a = i10 - 1;
                k00Var.d = i10;
            }
            k00Var.b = System.currentTimeMillis();
        }
    }

    public static void b(l00 l00Var) {
        if (l00Var != null) {
            ArrayList arrayList = l00Var.d;
            long currentTimeMillis = System.currentTimeMillis() - l00Var.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l00Var.b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) != null) {
                    sb2.append("#");
                    sb2.append(i10);
                    int i11 = ((k00) arrayList.get(i10)).d;
                    for (int i12 = 0; i12 < i11; i12++) {
                        sb2.append(" ");
                    }
                    sb2.append(" ");
                    sb2.append(arrayList.get(i10));
                    sb2.append("\n");
                }
            }
            f8.b(sb2.toString());
        }
    }

    public static void c(l00 l00Var, String str) {
        if (l00Var != null) {
            l00Var.d.add(new j00(l00Var, str));
        }
    }

    public static k00 d(l00 l00Var, String str) {
        if (l00Var == null) {
            return null;
        }
        k00 k00Var = new k00(l00Var, str);
        l00Var.d.add(k00Var);
        return k00Var;
    }
}
