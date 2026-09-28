package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import hg.c;
import java.util.List;
import q9.a;
import q9.j;
import qb.d;
import ub.b;
import ub.e;
import v7.g9;
import v7.i9;
import v7.k9;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        i0 a2 = a.a(e.class);
        a2.a(j.a(Context.class));
        a2.a(new j(2, 0, tb.a.class));
        a2.f = b.b;
        a b10 = a2.b();
        i0 a10 = a.a(ub.a.class);
        a10.a(j.a(e.class));
        a10.a(j.a(d.class));
        a10.f = b.c;
        Object[] objArr = {b10, a10.b()};
        for (int i10 = 0; i10 < 2; i10++) {
            g9 g9Var = i9.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(c.h(i10, "at index "));
            }
        }
        g9 g9Var2 = i9.b;
        return new k9(2, objArr);
    }
}
