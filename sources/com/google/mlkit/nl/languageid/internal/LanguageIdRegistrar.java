package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import d2.l0;
import java.util.List;
import k2.p1;
import mb.d;
import qb.b;
import qb.e;
import t9.a;
import t9.j;
import x7.g9;
import x7.i9;
import x7.k9;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        l0 a10 = a.a(e.class);
        a10.a(j.a(Context.class));
        a10.a(new j(2, 0, pb.a.class));
        a10.f = b.b;
        a b10 = a10.b();
        l0 a11 = a.a(qb.a.class);
        a11.a(j.a(e.class));
        a11.a(j.a(d.class));
        a11.f = b.c;
        Object[] objArr = {b10, a11.b()};
        for (int i3 = 0; i3 < 2; i3++) {
            g9 g9Var = i9.b;
            if (objArr[i3] == null) {
                throw new NullPointerException(p1.i(i3, "at index "));
            }
        }
        g9 g9Var2 = i9.b;
        return new k9(2, objArr);
    }
}
