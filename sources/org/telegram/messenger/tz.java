package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class tz {
    public final String b;
    public int a = 0;
    public final ArrayList d = new ArrayList();
    public final long c = System.currentTimeMillis();

    public tz(String str) {
        this.b = str;
    }

    public static void a(sz szVar) {
        if (szVar != null) {
            if (szVar.b < 0) {
                tz tzVar = szVar.e;
                int i7 = tzVar.a;
                tzVar.a = i7 - 1;
                szVar.d = i7;
            }
            szVar.b = System.currentTimeMillis();
        }
    }

    public static void b(tz tzVar) {
        if (tzVar != null) {
            ArrayList arrayList = tzVar.d;
            long currentTimeMillis = System.currentTimeMillis() - tzVar.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tzVar.b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                if (arrayList.get(i7) != null) {
                    sb2.append("#");
                    sb2.append(i7);
                    int i10 = ((sz) arrayList.get(i7)).d;
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

    public static void c(tz tzVar, String str) {
        if (tzVar != null) {
            tzVar.d.add(new rz(tzVar, str));
        }
    }

    public static sz d(tz tzVar, String str) {
        if (tzVar == null) {
            return null;
        }
        sz szVar = new sz(tzVar, str);
        tzVar.d.add(szVar);
        return szVar;
    }
}
