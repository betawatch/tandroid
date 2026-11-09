package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class a00 {
    public final String b;
    public int a = 0;
    public final ArrayList d = new ArrayList();
    public final long c = System.currentTimeMillis();

    public a00(String str) {
        this.b = str;
    }

    public static void a(zz zzVar) {
        if (zzVar != null) {
            if (zzVar.b < 0) {
                a00 a00Var = zzVar.e;
                int i7 = a00Var.a;
                a00Var.a = i7 - 1;
                zzVar.d = i7;
            }
            zzVar.b = System.currentTimeMillis();
        }
    }

    public static void b(a00 a00Var) {
        if (a00Var != null) {
            ArrayList arrayList = a00Var.d;
            long currentTimeMillis = System.currentTimeMillis() - a00Var.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a00Var.b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) != null) {
                    sb2.append("#");
                    sb2.append(i7);
                    int i10 = ((zz) arrayList.get(i7)).d;
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

    public static void c(a00 a00Var, String str) {
        if (a00Var != null) {
            a00Var.d.add(new yz(a00Var, str));
        }
    }

    public static zz d(a00 a00Var, String str) {
        if (a00Var == null) {
            return null;
        }
        zz zzVar = new zz(a00Var, str);
        a00Var.d.add(zzVar);
        return zzVar;
    }
}
