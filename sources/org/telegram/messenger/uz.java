package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final class uz {
    public final String b;
    public int a = 0;
    public final ArrayList d = new ArrayList();
    public final long c = System.currentTimeMillis();

    public uz(String str) {
        this.b = str;
    }

    public static void a(tz tzVar) {
        if (tzVar != null) {
            if (tzVar.b < 0) {
                uz uzVar = tzVar.e;
                int i7 = uzVar.a;
                uzVar.a = i7 - 1;
                tzVar.d = i7;
            }
            tzVar.b = System.currentTimeMillis();
        }
    }

    public static void b(uz uzVar) {
        if (uzVar != null) {
            ArrayList arrayList = uzVar.d;
            long currentTimeMillis = System.currentTimeMillis() - uzVar.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uzVar.b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) != null) {
                    sb2.append("#");
                    sb2.append(i7);
                    int i10 = ((tz) arrayList.get(i7)).d;
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

    public static void c(uz uzVar, String str) {
        if (uzVar != null) {
            uzVar.d.add(new sz(uzVar, str));
        }
    }

    public static tz d(uz uzVar, String str) {
        if (uzVar == null) {
            return null;
        }
        tz tzVar = new tz(uzVar, str);
        uzVar.d.add(tzVar);
        return tzVar;
    }
}
