package org.telegram.messenger;

import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class m00 {
    public final String b;
    public int a = 0;
    public final ArrayList d = new ArrayList();
    public final long c = System.currentTimeMillis();

    public m00(String str) {
        this.b = str;
    }

    public static void a(l00 l00Var) {
        if (l00Var != null) {
            if (l00Var.b < 0) {
                m00 m00Var = l00Var.e;
                int i10 = m00Var.a;
                m00Var.a = i10 - 1;
                l00Var.d = i10;
            }
            l00Var.b = System.currentTimeMillis();
        }
    }

    public static void b(m00 m00Var) {
        if (m00Var != null) {
            ArrayList arrayList = m00Var.d;
            long currentTimeMillis = System.currentTimeMillis() - m00Var.c;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m00Var.b);
            sb2.append(" total=");
            sb2.append(currentTimeMillis);
            sb2.append("ms\n");
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (arrayList.get(i10) != null) {
                    sb2.append("#");
                    sb2.append(i10);
                    int i11 = ((l00) arrayList.get(i10)).d;
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

    public static void c(m00 m00Var, String str) {
        if (m00Var != null) {
            m00Var.d.add(new k00(m00Var, str));
        }
    }

    public static l00 d(m00 m00Var, String str) {
        if (m00Var == null) {
            return null;
        }
        l00 l00Var = new l00(m00Var, str);
        m00Var.d.add(l00Var);
        return l00Var;
    }
}
