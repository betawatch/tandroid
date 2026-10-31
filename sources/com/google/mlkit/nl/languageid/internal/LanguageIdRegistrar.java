package com.google.mlkit.nl.languageid.internal;

import android.content.Context;
import b2.n0;
import com.google.firebase.components.ComponentRegistrar;
import java.util.List;
import jb.d;
import nb.b;
import nb.e;
import r9.a;
import r9.j;
import v7.e9;
import v7.g9;
import v7.i9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public class LanguageIdRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        n0 a2 = a.a(e.class);
        a2.a(j.a(Context.class));
        a2.a(new j(2, 0, mb.a.class));
        a2.f = b.b;
        a b10 = a2.b();
        n0 a10 = a.a(nb.a.class);
        a10.a(j.a(e.class));
        a10.a(j.a(d.class));
        a10.f = b.c;
        Object[] objArr = {b10, a10.b()};
        for (int i10 = 0; i10 < 2; i10++) {
            e9 e9Var = g9.b;
            if (objArr[i10] == null) {
                throw new NullPointerException(i0.a.i(i10, "at index "));
            }
        }
        e9 e9Var2 = g9.b;
        return new i9(2, objArr);
    }
}
