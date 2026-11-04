package me;

import ba.i;
import e0.e0;
import ed.e;
import g2.q0;
import gi.w5;
import kotlin.jvm.internal.j;
import ne.f;
import ne.h;
import v7.s;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b {
    public static final b d = new b();
    public final q0 a = new q0();
    public final s b = oe.a.a;
    public final w5 c = new w5(18);

    public final Object a(he.a deserializer, String str) {
        byte b10;
        j.e(deserializer, "deserializer");
        this.a.getClass();
        e0 e0Var = new e0(str);
        Object l10 = new g2.d(this, ne.j.c, e0Var, deserializer.d()).l(deserializer);
        String str2 = (String) e0Var.f;
        int i3 = e0Var.b;
        while (true) {
            b10 = 10;
            if (i3 != -1 && i3 < str2.length()) {
                int i10 = i3 + 1;
                char charAt = str2.charAt(i3);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    e0Var.b = i10;
                    b10 = f.b(charAt);
                    break;
                }
                i3 = i10;
            } else {
                break;
            }
        }
        e0Var.b = str2.length();
        if (b10 == 10) {
            return l10;
        }
        e0.n(e0Var, "Expected EOF after parsing, but had " + str.charAt(e0Var.b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(he.a serializer, Object obj) {
        char[] cArr;
        j.e(serializer, "serializer");
        jc.a aVar = new jc.a(1);
        ne.b bVar = ne.b.c;
        synchronized (bVar) {
            e eVar = (e) bVar.b;
            cArr = null;
            char[] cArr2 = (char[]) (eVar.isEmpty() ? null : eVar.removeLast());
            if (cArr2 != null) {
                bVar.a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        aVar.b = cArr;
        try {
            ne.j jVar = ne.j.c;
            h[] hVarArr = new h[ne.j.n.h()];
            this.a.getClass();
            new h(new i(aVar, 5), this, jVar, hVarArr).i(serializer, obj);
            return aVar.toString();
        } finally {
            aVar.b();
        }
    }
}
