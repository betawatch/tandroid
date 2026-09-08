package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import b2.i0;
import com.google.firebase.components.ComponentRegistrar;
import i2.g;
import java.util.List;
import q9.a;
import q9.j;
import qb.d;
import ub.b;
import ub.e;
import v7.f9;
import v7.h9;
import v7.j9;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
            f9 f9Var = h9.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(g.i(i10, "at index "));
            }
        }
        f9 f9Var2 = h9.b;
        return new j9(2, objArr);
    }
}
